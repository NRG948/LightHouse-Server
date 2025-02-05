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
import com.nrg948.data.PitDTO;
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
		return atlas.findAll().stream().map(DTOMapper::fromEntry).toList();
	}
	@GetMapping("/api/chronos")
	public List<ChronosDTO> getChronos() {
		return chronos.findAll().stream().map(DTOMapper::fromEntry).toList();
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
}
