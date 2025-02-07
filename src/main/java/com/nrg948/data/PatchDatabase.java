package com.nrg948.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PatchDatabase extends JpaRepository<PatchEntry, Long> {
	List<PatchEntry> findByTeamNumberAndMatchNumberAndReplayAndMatchTypeAndDriverStationAndDataType(
		    int teamNumber, int matchNumber, boolean replay, String matchType, String driverStation, String dataType);
}
