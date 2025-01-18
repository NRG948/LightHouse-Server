package com.nrg948.data;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChronosDatabase extends JpaRepository<ChronosEntry, Long> {
	Optional<ChronosEntry> findByScouterNameAndMatchTypeAndMatchNumberAndReplayAndDriverStationAndTeamNumber(
		    String scouterName, String matchType, String matchNumber, String replay, String driverStation, String teamNumber);
}
