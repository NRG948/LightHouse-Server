package com.nrg948.tba;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchDatabase extends JpaRepository<MatchEntry, String> {
	Optional<MatchEntry> findByEventKeyAndMatchNumberAndCompLevel(
		String key, 
		int matchNumber, 
		String compLevel);
}
