package com.nrg948;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nrg948.data.AtlasDatabase;
import com.nrg948.data.AtlasEntry;
import com.nrg948.data.ChronosDatabase;
import com.nrg948.data.ChronosEntry;
import com.nrg948.data.HPDatabase;
import com.nrg948.data.HPEntry;
import com.nrg948.data.PitDatabase;
import com.nrg948.data.PitEntry;

@RestController
public class SiteAPI {
	@Autowired AtlasDatabase atlas;
	@Autowired ChronosDatabase chronos;
	@Autowired PitDatabase pit;
	@Autowired HPDatabase hp;
	
	public SiteAPI() {
		
	}
	
	@GetMapping("/api/atlas")
	public List<AtlasEntry> getAtlas() {
		return atlas.findAll();
	}
	
	@GetMapping("/api/chronos")
	public List<ChronosEntry> getChronos() {
		return chronos.findAll();
	}
	
	@GetMapping("/api/pit")
	public List<PitEntry> getPit() {
		return pit.findAll();
	}
	
	@GetMapping("/api/hp")
	public List<HPEntry> getHP() {
		return hp.findAll();
	}
	
	@PostMapping("/api/atlas")
	public ResponseEntity<String> postAtlas(@RequestBody List<AtlasEntry> entries) {
		for(AtlasEntry entry : entries) {
			Optional<AtlasEntry> pulled = atlas.findByScouterNameAndTeamNumberAndDriverStationAndMatchTypeAndMatchNumberAndReplay
				(entry.getScouterName(), entry.getTeamNumber(), entry.getDriverStation(), entry.getMatchType(), entry.getMatchNumber(),entry.getReplay());
			if(pulled.isPresent()) {
				entry.setId(pulled.get().getId());
			}
			atlas.save(entry);
		}
		return ResponseEntity.ok("OK");
	}
	
	@PostMapping("/api/chronos")
	public ResponseEntity<String> postChronos(@RequestBody List<ChronosEntry> entries) {
		for(ChronosEntry entry : entries) {
			Optional<ChronosEntry> pulled = chronos.findByScouterNameAndMatchTypeAndMatchNumberAndReplayAndDriverStationAndTeamNumber
				(entry.getScouterName(), entry.getMatchType(), entry.getMatchNumber(), entry.getReplay(), entry.getDriverStation(), entry.getTeamNumber());
			if(pulled.isPresent()) {
				entry.setId(pulled.get().getId());
			}
			chronos.save(entry);
		}
		return ResponseEntity.ok("OK");
	}
	
	@PostMapping("/api/pit")
	public ResponseEntity<String> postPit(@RequestBody List<PitEntry> entries) {
		for(PitEntry entry : entries) {
			Optional<PitEntry> pulled = pit.findByTeamNameAndInterviewerNameAndIntervieweeName
				(entry.getTeamName(), entry.getInterviewerName(), entry.getIntervieweeName());
			if(pulled.isPresent()) {
				entry.setId(pulled.get().getId());
			}
			pit.save(entry);
		}
		return ResponseEntity.ok("OK");
	}
	
	@PostMapping("/api/hp")
	public ResponseEntity<String> postHP(@RequestBody List<HPEntry> entries) {
		for(HPEntry entry : entries) {
			Optional<HPEntry> pulled = hp.findByMatchTypeAndReplayAndMatchNumberAndScouterName
				(entry.getMatchType(), entry.getReplay(), entry.getMatchNumber(), entry.getScouterName());
			if(pulled.isPresent()) {
				entry.setId(pulled.get().getId());
			}
			hp.save(entry);
		}
		return ResponseEntity.ok("OK");
	}
}
