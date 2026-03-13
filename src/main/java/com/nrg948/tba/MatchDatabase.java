package com.nrg948.tba;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MatchDatabase extends JpaRepository<MatchEntry, String> {
	Optional<MatchEntry> findByEventKeyAndMatchNumberAndCompLevel(
		String keyy, 
		int matchNumber, 
		String compLevel);
}
