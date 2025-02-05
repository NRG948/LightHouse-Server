package com.nrg948.data;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HPDatabase extends JpaRepository<HPEntry, Long> {
	Optional<HPEntry> findByMatchTypeAndReplayAndMatchNumberAndScouterName(
		    String matchType, boolean replay, int matchNumber, String scouterName);
}
