package com.nrg948.data;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PitDatabase extends JpaRepository<PitEntry, Long> {
	Optional<PitEntry> findByTeamNumber(int teamNumber);
}
