package com.nrg948;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.nrg948.data.DTOMapper;
import com.nrg948.data.DataFlagDTO;
import com.nrg948.data.DataFlagEntry;
import com.nrg948.data.FlagDatabase;
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

/*
 * REST API Controller for ScoutServer
 * 
 * Provides endpoints for:
 * - Atlas/Pit/Patch data CRUD operations (internal and external)
 * - TBA (The Blue Alliance) sync and match data
 * - Data flag management for scouters
 * - Cross-site data copying for multi-event support
 * - Service control endpoints (TBA sync, cleanup)
 */
@RestController
public class SiteAPI {
	@Autowired AtlasDatabase atlas;
	@Autowired PitDatabase pit;
	@Autowired PatchDatabase patch;
	@Autowired MatchDatabase localTBA;
	@Autowired RestTemplate restTemplate;
	@Autowired FlagDatabase flags;
	@Autowired TempCodeCleanupService cleanupService;
	@Autowired TBAService tbaService;
	
	public SiteAPI() {
		
	}
	
	/*
	 * Internal endpoints for direct database access
	 * Used by database manager tools
	 */
	@GetMapping("/int/atlas")
	public List<AtlasEntry> intAtlas() {
		return atlas.findAll();
	}
	@GetMapping("/int/pit")
	public List<PitEntry> intPit() {
		return pit.findAll();
	}
	@GetMapping("/int/patch")
	public List<PatchEntry> intPatch() {
		return patch.findAll();
	}
	
	/*
	 * External API endpoints for mobile app data transfer
	 * Used by scouters on phones
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
	@GetMapping("/api/pit")
	public List<PitDTO> getPit() {
		return pit.findAll().stream().map(DTOMapper::fromEntry).toList();
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
	
	@PostMapping("/api/pit")
	public ResponseEntity<String> postPit(@RequestBody PitDTO entry, @RequestParam Optional<String> override) {
		Optional<PitEntry> pulled = pit.findByTeamNumber(entry.getTeamNumber());
		PitEntry toSave = DTOMapper.fromDTO(entry);
		if(pulled.isPresent()) {
			if(override.isEmpty() || !override.get().equals("true")) return ResponseEntity.ok("ALREADY EXISTS");
			toSave.setId(pulled.get().getId());
		}
		pit.save(toSave);
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
	
	/*
	 * Data flag management
	 * Used for marking entries that need review or correction
	 */
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
	
	/*
	 * Copy all Atlas and Pit data from another ScoutServer instance
	 * Used for aggregating data from multiple competition sites
	 */
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
	
	/*
	 * TBA Service control endpoints
	 * Controls automatic sync with The Blue Alliance
	 */
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
	
	/*
	 * Cleanup service control
	 * Manages temporary keys and expired data
	 */
	@GetMapping("/int/forceCleanupService")
	public ResponseEntity<String> forceCleanupService() {
		cleanupService.deleteExpiredKeys();
		return ResponseEntity.ok("OK");
	}
}
