package com.nrg948.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nrg948.SiteAPI;
import com.nrg948.data.AtlasDatabase;
import com.nrg948.data.AtlasEntry;
import com.nrg948.data.DTOMapper;
import com.nrg948.security.SecureAPI;
import com.nrg948.tba.Match;
import com.nrg948.tba.MatchDatabase;
import com.nrg948.tba.MatchEntry;

import java.util.List;
import java.util.Optional;

@Component
public class TBAService {
	private boolean enabled = false;
	private boolean updateClimb = false;
	private String gameKey = "";
	
	@Autowired AtlasDatabase atlas;
	@Autowired MatchDatabase tba;
	@Autowired RestTemplate restTemplate;
	
	@Value("${tbakey}")
	private String TBAKey;
	private String returnKey = null;

    // Run every 10 minute
    @Scheduled(fixedRate = 60000 * 10)
    public void loadTBA() throws JsonMappingException, JsonProcessingException {
    	System.out.println("Running TBA service");
        if(!enabled) return;
        refreshTBA();
        if(!updateClimb) return;
        List<AtlasEntry> allEntries = atlas.findAllByAccurateClimbFalse();
        int climbs = 0;
        for(AtlasEntry entry : allEntries) {
        	int matchNum = entry.getMatchNumber();
        	Optional<MatchEntry> match = tba.findByEventKeyAndMatchNumberAndCompLevel(gameKey, matchNum, "qm");
        	if(match.isEmpty()) continue;
        	MatchEntry me = match.get();
        	String[] parts = entry.getDriverStation().split(" ");
        	Integer dN = Integer.parseInt(parts[1]);
        	entry.setAccurateClimb(true);
        	climbs++;
        	switch(entry.getDriverStation()) {
        		case "Red 1":
        			entry.setEndLocation(convertEndLocation(me.getScore_breakdown().getRed().getEndGameRobot1()));
        			break;
        		case "Red 2":
        			entry.setEndLocation(convertEndLocation(me.getScore_breakdown().getRed().getEndGameRobot2()));
        			break;
        		case "Red 3":
        			entry.setEndLocation(convertEndLocation(me.getScore_breakdown().getRed().getEndGameRobot3()));
        			break;
        		case "Blue 1":
        			entry.setEndLocation(convertEndLocation(me.getScore_breakdown().getBlue().getEndGameRobot1()));
        			break;
        		case "Blue 2":
        			entry.setEndLocation(convertEndLocation(me.getScore_breakdown().getBlue().getEndGameRobot2()));
        			break;
        		case "Blue 3":
        			entry.setEndLocation(convertEndLocation(me.getScore_breakdown().getBlue().getEndGameRobot3()));
        			break;
        		default:
        			climbs--;
        			entry.setAccurateClimb(false);
        	}
        	atlas.save(entry);
        }
        System.out.println("Updated " + climbs + " Climbs");
    }
    
    public void refreshTBA() throws JsonMappingException, JsonProcessingException {
    	String url = "https://www.thebluealliance.com/api/v3/event/" + gameKey + "/matches?eventKey=" + gameKey + "&" + "X-TBA-Auth-Key=" + TBAKey;
		
		if(returnKey != null) {
			url += "&If-None-Match=" + returnKey;
		}
		
		ResponseEntity<String> result = restTemplate.getForEntity(url, String.class);
		switch(result.getStatusCode().value()) {
			case 401: // broken
			case 304: // already cached
			case 404: // broken
				System.out.println(result.getStatusCode().value());
				return;
		}
		//returnKey = result.getHeaders().getETag().split("\\\"")[1];
		ObjectMapper mapper = new ObjectMapper();
		Match[] matches = mapper.readValue(result.getBody(), Match[].class);
		for(Match match : matches) {
			MatchEntry toPush = DTOMapper.fromDTO(match);
			tba.save(toPush);
		}
    }
    
    public void setEnabled(boolean enabled) {
    	this.enabled = enabled;
    }
    
    public void setClimb(boolean enabled) {
    	updateClimb = enabled;
    }
    
    public void setGamekey(String key) {
    	gameKey = key;
    }
    
    private String convertEndLocation(String str) {
    	switch(str) {
    		case "DeepClimb":
    			return "Deep Climb";
    		case "Parked":
    			return "Park";
    		case "Shallow":
    			return "Shallow Climb";
    		case "None":
    			return "None";
    	}
    	return "";
    }
}
