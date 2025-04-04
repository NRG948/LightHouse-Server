package com.nrg948.data;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AtlasDatabase extends JpaRepository<AtlasEntry, Long>{
	public Optional<AtlasEntry> findByScouterNameAndTeamNumberAndDriverStationAndMatchTypeAndMatchNumberAndReplay
		(String scouterName, int teamNumber, String driverStation, String matchType, int matchNumber, boolean replay);

	public List<AtlasEntry> findAllByMatchNumberAndMatchType(int match, String string);
	public List<AtlasEntry> findAllByAccurateClimbFalse();
}
