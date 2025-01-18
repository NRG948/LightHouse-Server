package com.nrg948.data;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AtlasDatabase extends JpaRepository<AtlasEntry, Long>{
	public Optional<AtlasEntry> findByScouterNameAndTeamNumberAndDriverStationAndMatchTypeAndMatchNumberAndReplay
		(String scouterName, String teamNumber, String driverStation, String matchType, String matchNumber, String replay);
}
