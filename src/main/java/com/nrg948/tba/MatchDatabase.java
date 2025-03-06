package com.nrg948.tba;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchDatabase extends JpaRepository<MatchEntry, Long> {
	Optional<MatchEntry> findByKeyyAndMatchNumberAndCompLevel(
	    String keyy, 
	    int matchNumber, 
	    String compLevel);

}
