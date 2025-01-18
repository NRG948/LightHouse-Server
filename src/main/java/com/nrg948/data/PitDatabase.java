package com.nrg948.data;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PitDatabase extends JpaRepository<PitEntry, Long> {
	Optional<PitEntry> findByTeamNameAndInterviewerNameAndIntervieweeName(
		    String teamName, String interviewerName, String intervieweeName);
}
