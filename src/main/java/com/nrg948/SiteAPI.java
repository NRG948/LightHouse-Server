package com.nrg948;

import java.beans.Statement;
import java.net.URI;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
import com.nrg948.data.DataFlagDTO;
import com.nrg948.data.DataFlagEntry;
import com.nrg948.data.FlagDatabase;
import com.nrg948.data.HPDTO;
import com.nrg948.data.HPDatabase;
import com.nrg948.data.HPEntry;
import com.nrg948.data.PatchDTO;
import com.nrg948.data.PatchDatabase;
import com.nrg948.data.PatchEntry;
import com.nrg948.data.PitDTO;
import com.nrg948.data.PitDatabase;
import com.nrg948.data.PitEntry;
import com.nrg948.services.TBAService;
import com.nrg948.services.TempCodeCleanupService;
import com.nrg948.tba.Match;
import com.nrg948.tba.MatchDatabase;
import com.nrg948.tba.MatchEntry;
import com.nrg948.tba.ScoreBreakdown2025;

@RestController
public class SiteAPI {
	@Autowired AtlasDatabase atlas;
	@Autowired ChronosDatabase chronos;
	@Autowired PitDatabase pit;
	@Autowired HPDatabase hp;
	@Autowired PatchDatabase patch;
	@Autowired MatchDatabase localTBA;
	@Autowired RestTemplate restTemplate;
	@Autowired FlagDatabase flags;
	@Autowired TempCodeCleanupService cleanupService;
	@Autowired TBAService tbaService;
	
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
	@GetMapping("/int/patch")
	public List<PatchEntry> intPatch() {
		return patch.findAll();
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
	public ResponseEntity<String> postAtlas(@RequestBody AtlasDTO entry, @RequestParam Optional<String> override) {
		Optional<AtlasEntry> pulled = atlas.findByScouterNameAndTeamNumberAndDriverStationAndMatchTypeAndMatchNumberAndReplay
			(entry.getScouterName(), entry.getTeamNumber(), entry.getDriverStation(), entry.getMatchType(), entry.getMatchNumber(),entry.getReplay());
		AtlasEntry toSave = DTOMapper.fromDTO(entry);
		if(pulled.isPresent()) {
			if(override.isEmpty() || !override.get().equals("true")) return ResponseEntity.ok("ALREADY EXISTS");
			toSave.setId(pulled.get().getId());
		}
		atlas.save(toSave);
		
		return ResponseEntity.ok("OK");
	}
	
	@PostMapping("/api/chronos")
	public ResponseEntity<String> postChronos(@RequestBody ChronosDTO entry, @RequestParam Optional<String> override) {
		Optional<ChronosEntry> pulled = chronos.findByScouterNameAndMatchTypeAndMatchNumberAndReplayAndDriverStationAndTeamNumber
			(entry.getScouterName(), entry.getMatchType(), entry.getMatchNumber(), entry.getReplay(), entry.getDriverStation(), entry.getTeamNumber());
		ChronosEntry toSave = DTOMapper.fromDTO(entry);
		if(pulled.isPresent()) {
			if(override.isEmpty() || !override.get().equals("true")) return ResponseEntity.ok("ALREADY EXISTS");
			toSave.setId(pulled.get().getId());
		}
		chronos.save(toSave);
		return ResponseEntity.ok("OK");
	}
	
	@PostMapping("/api/pit")
	public ResponseEntity<String> postPit(@RequestBody PitDTO entry, @RequestParam Optional<String> override) {
		Optional<PitEntry> pulled = pit.findByTeamNameAndInterviewerNameAndIntervieweeName
			(entry.getTeamName(), entry.getInterviewerName(), entry.getIntervieweeName());
		PitEntry toSave = DTOMapper.fromDTO(entry);
		if(pulled.isPresent()) {
			if(override.isEmpty() || !override.get().equals("true")) return ResponseEntity.ok("ALREADY EXISTS");
			toSave.setId(pulled.get().getId());
		}
		pit.save(toSave);
		return ResponseEntity.ok("OK");
	}
	
	@PostMapping("/api/hp")
	public ResponseEntity<String> postHP(@RequestBody HPDTO entry, @RequestParam Optional<String> override) {
		Optional<HPEntry> pulled = hp.findByMatchTypeAndReplayAndMatchNumberAndScouterName
			(entry.getMatchType(), entry.getReplay(), entry.getMatchNumber(), entry.getScouterName());
		HPEntry toSave = DTOMapper.fromDTO(entry);
		if(pulled.isPresent()) {
			if(override.isEmpty() || !override.get().equals("true")) return ResponseEntity.ok("ALREADY EXISTS");
			toSave.setId(pulled.get().getId());
		}
		hp.save(toSave);
		return ResponseEntity.ok("OK");
	}
	
	@PostMapping("/api/patch")
	public ResponseEntity<String> postPatch(@ModelAttribute PatchDTO entry) {
		patch.save(DTOMapper.fromDTO(entry));
		return ResponseEntity.ok("OK");
	}
	
	@GetMapping("/api/tba")
	public List<Match> getTBA() {
		return localTBA.findAll().stream().map(DTOMapper::fromEntry).toList();
	}
	
	@GetMapping("/int/flags")
	public List<DataFlagEntry> getFlags() {
		return flags.findAll();
	}
	
	@PostMapping("/int/flags")
	public ResponseEntity<String> postFlag(@RequestBody DataFlagDTO flag) {
		DataFlagEntry entry = new DataFlagEntry();
		entry.driverStation = flag.driverStation;
		entry.flag = flag.flag;
		entry.flagType = flag.flagType;
		entry.layout = flag.layout;
		entry.matchNumber = flag.matchNumber;
		entry.matchType = flag.matchType;
		entry.replay = flag.replay;
		
		return ResponseEntity.ok("OK");
	}
	
	@GetMapping("/int/deleteTBA")
	public ResponseEntity<String> deleteTBA() {
		localTBA.deleteAll();
		return ResponseEntity.ok("ok");
	}
	
	@GetMapping("/int/climbs")
	public ResponseEntity<String> climbs() {
		List<AtlasEntry> entries = atlas.findAll();
		List<ChronosEntry> entries2 = chronos.findAll();
		double total = entries.size() + entries2.size();
		double numerator = 0;
		HashMap<String, Integer> BADSCOUTERS = new HashMap<>();
		HashMap<String, Integer> GOODSCOUTERS = new HashMap<>();
		HashMap<String, Double> percentages = new HashMap<>();
		int matchesSorted = 0;
		for(AtlasEntry entry : entries) {
			String match = "qm";
			Optional<MatchEntry> TBA = localTBA.findByEventKeyAndMatchNumberAndCompLevel("2025wasam", entry.getMatchNumber(), "qm");
			if(TBA.isPresent()) {
				MatchEntry entrytba = TBA.get();
				String[] parts = entry.getDriverStation().split(" ");
				Integer dsn = Integer.parseInt(parts[1]);
				ScoreBreakdown2025 breakdown = entrytba.getScore_breakdown();
				String answer = "";
				switch(parts[0]) {
					case "Red":
						switch(dsn) {
							case 1:
								answer = breakdown.getRed().getEndGameRobot1();
								break;
							case 2:
								answer = breakdown.getRed().getEndGameRobot2();
								break;
							case 3:
								answer = breakdown.getRed().getEndGameRobot3();
								break;
						}
						break;
					case "Blue":
						switch(dsn) {
							case 1:
								answer = breakdown.getBlue().getEndGameRobot1();
								break;
							case 2:
								answer = breakdown.getBlue().getEndGameRobot2();
								break;
							case 3:
								answer = breakdown.getBlue().getEndGameRobot3();
								break;
						}
						break;
				}
				if(answer.substring(0,2).equals(entry.getEndLocation().substring(0,2))) {
					numerator++;
					GOODSCOUTERS.putIfAbsent(entry.getScouterName(), 0);
					GOODSCOUTERS.put(entry.getScouterName(), GOODSCOUTERS.get(entry.getScouterName())+1);
					percentages.putIfAbsent(entry.getScouterName(), 0.0);
				} else {
					BADSCOUTERS.putIfAbsent(entry.getScouterName(), 0);
					BADSCOUTERS.put(entry.getScouterName(), BADSCOUTERS.get(entry.getScouterName())+1);
					percentages.putIfAbsent(entry.getScouterName(), 0.0);
				}
			} else {
				System.out.println("NO TBA?");
			}
			matchesSorted++;
		}
		for(ChronosEntry entry : entries2) {
			String match = "qm";
			Optional<MatchEntry> TBA = localTBA.findByEventKeyAndMatchNumberAndCompLevel("2025wasam", entry.getMatchNumber(), "qm");
			if(TBA.isPresent() && TBA.get().getScore_breakdown() != null) {
				MatchEntry entrytba = TBA.get();
				String[] parts = entry.getDriverStation().split(" ");
				Integer dsn = Integer.parseInt(parts[1]);
				ScoreBreakdown2025 breakdown = entrytba.getScore_breakdown();
				String answer = "";
				switch(parts[0]) {
					case "Red":
						switch(dsn) {
							case 1:
								answer = breakdown.getRed().getEndGameRobot1();
								break;
							case 2:
								answer = breakdown.getRed().getEndGameRobot2();
								break;
							case 3:
								answer = breakdown.getRed().getEndGameRobot3();
								break;
						}
						break;
					case "Blue":
						switch(dsn) {
							case 1:
								answer = breakdown.getBlue().getEndGameRobot1();
								break;
							case 2:
								answer = breakdown.getBlue().getEndGameRobot2();
								break;
							case 3:
								answer = breakdown.getBlue().getEndGameRobot3();
								break;
						}
						break;
				}
				if(answer.substring(0,2).equals(entry.getEndLocation().substring(0,2))) {
					numerator++;
					GOODSCOUTERS.putIfAbsent(entry.getScouterName(), 0);
					GOODSCOUTERS.put(entry.getScouterName(), GOODSCOUTERS.get(entry.getScouterName())+1);
					
					percentages.putIfAbsent(entry.getScouterName(), 0.0);
				} else {
					BADSCOUTERS.putIfAbsent(entry.getScouterName(), 0);
					BADSCOUTERS.put(entry.getScouterName(), BADSCOUTERS.get(entry.getScouterName())+1);
					
					percentages.putIfAbsent(entry.getScouterName(), 0.0);
				}
			} else {
				System.out.println("NO TBA?");
			}
			matchesSorted++;
		}
		
		for(String name : percentages.keySet()) {
			int goodvalue = GOODSCOUTERS.getOrDefault(name, 0);
			int badvalue = BADSCOUTERS.getOrDefault(name, 0);
			
			percentages.put(name, (goodvalue)/(goodvalue+badvalue+0.0));
		}
		TreeMap<String, Double> map = new TreeMap<>(percentages);
		System.out.println(Arrays.toString(map.descendingKeySet().toArray()));
		System.out.println((map.descendingMap().toString()));
		System.out.println(matchesSorted);
		
		return ResponseEntity.ok("" + (numerator / total));
	}
	
	@GetMapping("/int/matchPercentage")
	public List<String> matchPercentage() {
		LinkedList<String> output = new LinkedList<>();
		List<AtlasEntry> allEntries = atlas.findAll();
		HashSet<Integer> matches = new HashSet<>();
		for(AtlasEntry entry : allEntries) {
			matches.add(entry.getMatchNumber());
		}
		System.out.println("searching through matches, " + matches.size());
		for(int match : matches) {
			Optional<MatchEntry> opt = localTBA.findByEventKeyAndMatchNumberAndCompLevel("2025wabon", match, "qm");
			if(opt.isEmpty() || opt.get().getScore_breakdown() == null) {
				System.out.println("empty in tba");
				continue;
			}
			MatchEntry tbaEntry = opt.get();
			
			List<AtlasEntry> entries = atlas.findAllByMatchNumberAndMatchType(match, "Qualifications");
			AtlasEntry[] reds = new AtlasEntry[3];
			AtlasEntry[] blues = new AtlasEntry[3];
			for(AtlasEntry entry : entries) {
				switch(entry.getDriverStation()) {
					case "Red 1":
						reds[0] = entry;
						break;
					case "Red 2":
						reds[1] = entry;
						break;
					case "Red 3":
						reds[2] = entry;
						break;
						
					case "Blue 1":
						blues[0] = entry;
						break;
					case "Blue 2":
						blues[1] = entry;
						break;
					case "Blue 3":
						blues[2] = entry;
						break;
				}
			}
			if(reds[0] == null || reds[1] == null || reds[2] == null || blues[0] == null || blues[1] == null || blues[2] == null) {
				System.out.println("#" + match + ": not all are full: " + 
						(reds[0] == null) + ", " + 
						(reds[1] == null) + ", " + 
						(reds[2] == null) + ", " + 
						(blues[0] == null) + ", " + 
						(blues[1] == null) + ", " + 
						(blues[2] == null)
				);
				continue;
			}
			
			double R_teleStatusAccuracy = 0;
			double R_endStatusAccuracy = 0;
			double B_teleStatusAccuracy = 0;
			double B_endStatusAccuracy = 0;
			String interout = "#" + match;
			
			{
				int L4 = reds[0].getCoralScoredL4() + reds[1].getCoralScoredL4() + reds[2].getCoralScoredL4();
				int L3 = reds[0].getCoralScoredL3() + reds[1].getCoralScoredL3() + reds[2].getCoralScoredL3();
				int L2 = reds[0].getCoralScoredL2() + reds[1].getCoralScoredL2() + reds[2].getCoralScoredL2();
				int L1 = reds[0].getCoralScoredL1() + reds[1].getCoralScoredL1() + reds[2].getCoralScoredL1();
				
				int T4 = tbaEntry.getScore_breakdown().getRed().getTeleopReef().getTba_topRowCount();
				int T3 = tbaEntry.getScore_breakdown().getRed().getTeleopReef().getTba_midRowCount();
				int T2 = tbaEntry.getScore_breakdown().getRed().getTeleopReef().getTba_botRowCount();
				int T1 = tbaEntry.getScore_breakdown().getRed().getTeleopReef().getTrough();
				
				double A1 = T4 == 0? 0 : Math.abs((T4-L4)/(double)T4);
				double A2 = T3 == 0? 0 : Math.abs((T3-L3)/(double)T3);
				double A3 = T2 == 0? 0 : Math.abs((T2-L2)/(double)T2);
				double A4 = T1 == 0? 0 : Math.abs((T1-L1)/(double)T1);
				R_teleStatusAccuracy = 1 - ((A1 + A2 + A3 + A4) / 4);
				R_endStatusAccuracy = 0 + 
						(((reds[0].getEndLocation().substring(0,2).equals(tbaEntry.getScore_breakdown().getRed().getEndGameRobot1().substring(0,2))? 1 : 0) + 
						(reds[1].getEndLocation().substring(0,2).equals(tbaEntry.getScore_breakdown().getRed().getEndGameRobot2().substring(0,2))? 1 : 0) +
						(reds[2].getEndLocation().substring(0,2).equals(tbaEntry.getScore_breakdown().getRed().getEndGameRobot3().substring(0,2))? 1 : 0)
				) / 3.0);
			}
			{
				int L4 = blues[0].getCoralScoredL4() + blues[1].getCoralScoredL4() + blues[2].getCoralScoredL4();
				int L3 = blues[0].getCoralScoredL3() + blues[1].getCoralScoredL3() + blues[2].getCoralScoredL3();
				int L2 = blues[0].getCoralScoredL2() + blues[1].getCoralScoredL2() + blues[2].getCoralScoredL2();
				int L1 = blues[0].getCoralScoredL1() + blues[1].getCoralScoredL1() + blues[2].getCoralScoredL1();
				
				int T4 = tbaEntry.getScore_breakdown().getBlue().getTeleopReef().getTba_topRowCount();
				int T3 = tbaEntry.getScore_breakdown().getBlue().getTeleopReef().getTba_midRowCount();
				int T2 = tbaEntry.getScore_breakdown().getBlue().getTeleopReef().getTba_botRowCount();
				int T1 = tbaEntry.getScore_breakdown().getBlue().getTeleopReef().getTrough();
				
				double A1 = T4 == 0? 0 : Math.abs((T4-L4)/(double)T4);
				double A2 = T3 == 0? 0 : Math.abs((T3-L3)/(double)T3);
				double A3 = T2 == 0? 0 : Math.abs((T2-L2)/(double)T2);
				double A4 = T1 == 0? 0 : Math.abs((T1-L1)/(double)T1);
				B_teleStatusAccuracy = 1 - ((A1 + A2 + A3 + A4) / 4);
				B_endStatusAccuracy =
						(((blues[0].getEndLocation().substring(0,2).equals(tbaEntry.getScore_breakdown().getBlue().getEndGameRobot1().substring(0,2))? 1 : 0) + 
						(blues[1].getEndLocation().substring(0,2).equals(tbaEntry.getScore_breakdown().getBlue().getEndGameRobot2().substring(0,2))? 1 : 0) +
						(blues[2].getEndLocation().substring(0,2).equals(tbaEntry.getScore_breakdown().getBlue().getEndGameRobot3().substring(0,2))? 1 : 0))
				) / 3.0;
			}
			
			output.add("#" + match + "; BT: " + B_teleStatusAccuracy + ", BE: " + B_endStatusAccuracy + ", RT: " + R_teleStatusAccuracy + ", RE: " + R_endStatusAccuracy);
		}
		return output;
		
	}
	
	@GetMapping("/int/copyFromAnotherSource")
	public ResponseEntity<String> copy(@RequestParam String site) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(site);
		
		ResponseEntity<String> result = restTemplate.getForEntity((site + "/int/atlas"), String.class);
		AtlasEntry[] aE = mapper.readValue(result.getBody(), AtlasEntry[].class);
		
		result = restTemplate.getForEntity((site + "/int/pit"), String.class);
		PitEntry[] pE = mapper.readValue(result.getBody(), PitEntry[].class);
		
		atlas.deleteAll();
		atlas.flush();
		for(AtlasEntry entry : aE) {
			entry.setId(null);
			atlas.save(entry);
		}
		
		pit.deleteAll();
		pit.flush();
		for(PitEntry entry : pE) {
			entry.setId(null);
			pit.save(entry);
		}
		
		return ResponseEntity.ok("OK");
	}
	
	@GetMapping("/int/tbaService")
	public ResponseEntity<String> tbaService(@RequestParam Optional<Boolean> enabled, @RequestParam Optional<Boolean> climb, @RequestParam Optional<String> key) {
		if(enabled.isPresent()) tbaService.setEnabled(enabled.get());
		if(climb.isPresent()) tbaService.setClimb(climb.get());
		if(key.isPresent()) tbaService.setGamekey(key.get());
		return ResponseEntity.ok("OK + " + enabled.isPresent() + " " + climb.isPresent() + " " + key.isPresent());
	}
	
	@GetMapping("/int/forceTBAService")
	public ResponseEntity<String> forceTBAService() throws JsonMappingException, JsonProcessingException {
		tbaService.loadTBA();
		return ResponseEntity.ok("OK");
	}
	
	@GetMapping("/int/forceCleanupService")
	public ResponseEntity<String> forceCleanupService() {
		cleanupService.deleteExpiredKeys();
		return ResponseEntity.ok("OK");
	}
}
