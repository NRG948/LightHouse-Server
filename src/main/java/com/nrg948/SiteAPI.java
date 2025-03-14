package com.nrg948;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nrg948.data.AtlasDTO;
import com.nrg948.data.AtlasDatabase;
import com.nrg948.data.AtlasEntry;
import com.nrg948.data.ChronosDTO;
import com.nrg948.data.ChronosDatabase;
import com.nrg948.data.ChronosEntry;
import com.nrg948.data.DTOMapper;
import com.nrg948.data.HPDTO;
import com.nrg948.data.HPDatabase;
import com.nrg948.data.HPEntry;
import com.nrg948.data.PatchDTO;
import com.nrg948.data.PatchDatabase;
import com.nrg948.data.PatchEntry;
import com.nrg948.data.PitDTO;
import com.nrg948.data.PitDatabase;
import com.nrg948.data.PitEntry;
import com.nrg948.tba.Match;
import com.nrg948.tba.MatchDatabase;
import com.nrg948.tba.MatchEntry;

@RestController
public class SiteAPI {
	@Autowired AtlasDatabase atlas;
	@Autowired ChronosDatabase chronos;
	@Autowired PitDatabase pit;
	@Autowired HPDatabase hp;
	@Autowired PatchDatabase patch;
	@Autowired MatchDatabase localTBA;
	@Autowired RestTemplate restTemplate;
	
	@Value("${tbakey}")
	private String TBAKey;
	private String returnKey = null;
	
	public SiteAPI() {
		
	}
	
	/*
	 * use these for database manager operations
	 */
	@GetMapping("/int/atlas")
	public List<AtlasEntry> intAtlas() {
		return atlas.findAll();
	}
	@GetMapping("/int/chronos")
	public List<ChronosEntry> intChronos() {
		return chronos.findAll();
	}
	@GetMapping("/int/pit")
	public List<PitEntry> intPit() {
		return pit.findAll();
	}
	@GetMapping("/int/hp")
	public List<HPEntry> intHP() {
		return hp.findAll();
	}
	
	/*
	 * use these for transferring on/off phones
	 */
	@GetMapping("/api/atlas")
	public List<AtlasDTO> getAtlas() {
		List<AtlasDTO> out = atlas.findAll().stream().map(DTOMapper::fromEntry).toList();
		for(AtlasDTO entry : out) {
			List<PatchEntry> patches = patch.findByTeamNumberAndMatchNumberAndReplayAndMatchTypeAndDriverStationAndDataType
				(entry.getTeamNumber(), entry.getMatchNumber(), entry.getReplay(), entry.getMatchType(), entry.getDriverStation(), "Atlas");
			String comments = entry.getComments();
			comments += "\n";
			for(PatchEntry patch : patches) {
				comments += "---PATCH--- (by " + patch.getPatcher() + ")\n";
				comments += patch.getComments();
				comments += "\n";
			}
			entry.setComments(comments.trim());
		}
		return out;
	}
	@GetMapping("/api/chronos")
	public List<ChronosDTO> getChronos() {
		List<ChronosDTO> out = chronos.findAll().stream().map(DTOMapper::fromEntry).toList();
		for(ChronosDTO entry : out) {
			List<PatchEntry> patches = patch.findByTeamNumberAndMatchNumberAndReplayAndMatchTypeAndDriverStationAndDataType
				(entry.getTeamNumber(), entry.getMatchNumber(), entry.getReplay(), entry.getMatchType(), entry.getDriverStation(), "Chronos");
			String comments = entry.getComments();
			comments += "\n";
			for(PatchEntry patch : patches) {
				comments += "---PATCH--- (by " + patch.getPatcher() + ")\n";
				comments += patch.getComments();
				comments += "\n";
			}
			entry.setComments(comments.trim());
		}
		return out;
	}
	@GetMapping("/api/pit")
	public List<PitDTO> getPit() {
		return pit.findAll().stream().map(DTOMapper::fromEntry).toList();
	}
	@GetMapping("/api/hp")
	public List<HPDTO> getHP() {
		return hp.findAll().stream().map(DTOMapper::fromEntry).toList();
	}
	
	@PostMapping("/api/atlas")
	public ResponseEntity<String> postAtlas(@RequestBody AtlasDTO entry) {
		Optional<AtlasEntry> pulled = atlas.findByScouterNameAndTeamNumberAndDriverStationAndMatchTypeAndMatchNumberAndReplay
			(entry.getScouterName(), entry.getTeamNumber(), entry.getDriverStation(), entry.getMatchType(), entry.getMatchNumber(),entry.getReplay());
		AtlasEntry toSave = DTOMapper.fromDTO(entry);
		if(pulled.isPresent()) {
			toSave.setId(pulled.get().getId());
		}
		atlas.save(toSave);
		
		return ResponseEntity.ok("OK");
	}
	
	@PostMapping("/api/chronos")
	public ResponseEntity<String> postChronos(@RequestBody ChronosDTO entry) {
		Optional<ChronosEntry> pulled = chronos.findByScouterNameAndMatchTypeAndMatchNumberAndReplayAndDriverStationAndTeamNumber
			(entry.getScouterName(), entry.getMatchType(), entry.getMatchNumber(), entry.getReplay(), entry.getDriverStation(), entry.getTeamNumber());
		ChronosEntry toSave = DTOMapper.fromDTO(entry);
		if(pulled.isPresent()) {
			toSave.setId(pulled.get().getId());
		}
		chronos.save(toSave);
		return ResponseEntity.ok("OK");
	}
	
	@PostMapping("/api/pit")
	public ResponseEntity<String> postPit(@RequestBody PitDTO entry) {
		Optional<PitEntry> pulled = pit.findByTeamNameAndInterviewerNameAndIntervieweeName
			(entry.getTeamName(), entry.getInterviewerName(), entry.getIntervieweeName());
		PitEntry toSave = DTOMapper.fromDTO(entry);
		if(pulled.isPresent()) {
			toSave.setId(pulled.get().getId());
		}
		pit.save(toSave);
		return ResponseEntity.ok("OK");
	}
	
	@PostMapping("/api/hp")
	public ResponseEntity<String> postHP(@RequestBody HPDTO entry) {
		Optional<HPEntry> pulled = hp.findByMatchTypeAndReplayAndMatchNumberAndScouterName
			(entry.getMatchType(), entry.getReplay(), entry.getMatchNumber(), entry.getScouterName());
		HPEntry toSave = DTOMapper.fromDTO(entry);
		if(pulled.isPresent()) {
			toSave.setId(pulled.get().getId());
		}
		hp.save(toSave);
		return ResponseEntity.ok("OK");
	}
	
	@PostMapping("/api/patch")
	public ResponseEntity<String> postPatch(@RequestBody PatchDTO entry) {
		patch.save(DTOMapper.fromDTO(entry));
		return ResponseEntity.ok("OK");
	}
	
	@GetMapping("/api/tba")
	public List<Match> getTBA() {
		return localTBA.findAll().stream().map(DTOMapper::fromEntry).toList();
	}
	
	@GetMapping("/api/refreshTBA")
	public ResponseEntity<String> refreshTBA(@RequestParam String gameKey) throws JsonMappingException, JsonProcessingException {
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
				return result;
		}
		//returnKey = result.getHeaders().getETag().split("\\\"")[1];
		ObjectMapper mapper = new ObjectMapper();
		Match[] matches = mapper.readValue(result.getBody(), Match[].class);
		for(Match match : matches) {
			MatchEntry toPush = DTOMapper.fromDTO(match);
			Optional<MatchEntry> pulled = localTBA.findByKeyyAndMatchNumberAndCompLevel(gameKey, 0, url);
			if(pulled.isPresent()) {
				toPush.setId(pulled.get().getId());
			}
			localTBA.save(toPush);
		}
		return ResponseEntity.ok("OKAY");
	}
}
