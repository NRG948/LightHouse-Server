package com.nrg948.data;

import java.util.ArrayList;
import java.util.List;

import com.nrg948.tba.Match;
import com.nrg948.tba.MatchEntry;

public class DTOMapper {
	public static AtlasDTO fromEntry(AtlasEntry entry) {
	    if (entry == null) {
	        return null;
	    }

	    AtlasDTO dto = new AtlasDTO();

	    dto.setScouterName(entry.getScouterName());
	    dto.setTeamNumber(entry.getTeamNumber());
	    dto.setDriverStation(entry.getDriverStation());
	    dto.setMatchType(entry.getMatchType());
	    dto.setMatchNumber(entry.getMatchNumber());
	    dto.setReplay(entry.getReplay());

	    dto.setAutoPath(entry.getAutoPath());
	    
	    CycleDataList autoCycles = entry.getAutoCycles();
	    if (autoCycles != null) {
	        autoCycles.setKeyPrefix("autoCycles");
	    }
	    dto.setAutoCycles(autoCycles);

	    dto.setTransitionOnshiftIsFeeding(entry.isTransitionOnshiftIsFeeding());
	    dto.setTransitionOnshiftIsDisabled(entry.isTransitionOnshiftIsDisabled());
	    dto.setTransitionOnshiftIsDefending(entry.isTransitionOnshiftIsDefending());
	    dto.setFirstOnshiftIsFeeding(entry.isFirstOnshiftIsFeeding());
	    dto.setFirstOnshiftIsDisabled(entry.isFirstOnshiftIsDisabled());
	    dto.setFirstOnshiftIsDefending(entry.isFirstOnshiftIsDefending());
	    dto.setSecondOnshiftIsFeeding(entry.isSecondOnshiftIsFeeding());
	    dto.setSecondOnshiftIsDisabled(entry.isSecondOnshiftIsDisabled());
	    dto.setSecondOnshiftIsDefending(entry.isSecondOnshiftIsDefending());

	    CycleDataList transitionOnshiftCycles = entry.getTransitionOnshiftCycles();
	    if (transitionOnshiftCycles != null) {
	        transitionOnshiftCycles.setKeyPrefix("transitionOnshiftCycles");
	    }
	    dto.setTransitionOnshiftCycles(transitionOnshiftCycles);
	    
	    CycleDataList firstOnshiftCycles = entry.getFirstOnshiftCycles();
	    if (firstOnshiftCycles != null) {
	        firstOnshiftCycles.setKeyPrefix("firstOnshiftCycles");
	    }
	    dto.setFirstOnshiftCycles(firstOnshiftCycles);
	    
	    CycleDataList secondOnshiftCycles = entry.getSecondOnshiftCycles();
	    if (secondOnshiftCycles != null) {
	        secondOnshiftCycles.setKeyPrefix("secondOnshiftCycles");
	    }
	    dto.setSecondOnshiftCycles(secondOnshiftCycles);

	    dto.setTransitionOffshiftIsDisabled(entry.isTransitionOffshiftIsDisabled());
	    dto.setFirstOffshiftIsDisabled(entry.isFirstOffshiftIsDisabled());
	    dto.setSecondOffshiftIsDisabled(entry.isSecondOffshiftIsDisabled());

	    dto.setDataQuality(entry.getDataQuality());
	    dto.setComments(entry.getComments());

	    dto.setTransitionOffshiftIsDefending(entry.getTransitionOffshiftIsDefending());
	    dto.setTransitionOffshiftIsFeeding(entry.getTransitionOffshiftIsFeeding());
	    dto.setTransitionOffshiftIsStealing(entry.getTransitionOffshiftIsStealing());
	    dto.setFirstOffshiftIsDefending(entry.getFirstOffshiftIsDefending());
	    dto.setFirstOffshiftIsStealing(entry.getFirstOffshiftIsStealing());
	    dto.setSecondOffshiftIsDefending(entry.getSecondOffshiftIsDefending());
	    dto.setSecondOffshiftIsStealing(entry.getSecondOffshiftIsStealing());

	    dto.setTags(entry.getTags());
	    dto.setClimb(entry.getClimb());

	    dto.setLayout(entry.getLayout());
	    dto.setExportName(entry.getExportName());
	    dto.setTimestamp(entry.getTimestamp());

	    return dto;
	}
	
	public static AtlasEntry fromDTO(AtlasDTO dto) {
	    if (dto == null) {
	        return null;
	    }

	    AtlasEntry entry = new AtlasEntry();

	    entry.setScouterName(dto.getScouterName());
	    entry.setTeamNumber(dto.getTeamNumber());
	    entry.setDriverStation(dto.getDriverStation());
	    entry.setMatchType(dto.getMatchType());
	    entry.setMatchNumber(dto.getMatchNumber());
	    entry.setReplay(dto.getReplay());

	    entry.setAutoPath(dto.getAutoPath());
	    
	    CycleDataList autoCycles = dto.getAutoCycles();
	    if (autoCycles != null) {
	        autoCycles.setKeyPrefix("autoCycles");
	    }
	    entry.setAutoCycles(autoCycles);

	    entry.setTransitionOnshiftIsFeeding(dto.isTransitionOnshiftIsFeeding());
	    entry.setTransitionOnshiftIsDisabled(dto.isTransitionOnshiftIsDisabled());
	    entry.setTransitionOnshiftIsDefending(dto.isTransitionOnshiftIsDefending());
	    entry.setFirstOnshiftIsFeeding(dto.isFirstOnshiftIsFeeding());
	    entry.setFirstOnshiftIsDisabled(dto.isFirstOnshiftIsDisabled());
	    entry.setFirstOnshiftIsDefending(dto.isFirstOnshiftIsDefending());
	    entry.setSecondOnshiftIsFeeding(dto.isSecondOnshiftIsFeeding());
	    entry.setSecondOnshiftIsDisabled(dto.isSecondOnshiftIsDisabled());
	    entry.setSecondOnshiftIsDefending(dto.isSecondOnshiftIsDefending());

	    CycleDataList transitionOnshiftCycles = dto.getTransitionOnshiftCycles();
	    if (transitionOnshiftCycles != null) {
	        transitionOnshiftCycles.setKeyPrefix("transitionOnshiftCycles");
	    }
	    entry.setTransitionOnshiftCycles(transitionOnshiftCycles);
	    
	    CycleDataList firstOnshiftCycles = dto.getFirstOnshiftCycles();
	    if (firstOnshiftCycles != null) {
	        firstOnshiftCycles.setKeyPrefix("firstOnshiftCycles");
	    }
	    entry.setFirstOnshiftCycles(firstOnshiftCycles);
	    
	    CycleDataList secondOnshiftCycles = dto.getSecondOnshiftCycles();
	    if (secondOnshiftCycles != null) {
	        secondOnshiftCycles.setKeyPrefix("secondOnshiftCycles");
	    }
	    entry.setSecondOnshiftCycles(secondOnshiftCycles);

	    entry.setTransitionOffshiftIsDisabled(dto.isTransitionOffshiftIsDisabled());
	    entry.setFirstOffshiftIsDisabled(dto.isFirstOffshiftIsDisabled());
	    entry.setSecondOffshiftIsDisabled(dto.isSecondOffshiftIsDisabled());

	    entry.setDataQuality(dto.getDataQuality());
	    entry.setComments(dto.getComments());

	    entry.setTransitionOffshiftIsDefending(dto.getTransitionOffshiftIsDefending());
	    entry.setTransitionOffshiftIsFeeding(dto.getTransitionOffshiftIsFeeding());
	    entry.setTransitionOffshiftIsStealing(dto.getTransitionOffshiftIsStealing());
	    entry.setFirstOffshiftIsDefending(dto.getFirstOffshiftIsDefending());
	    entry.setFirstOffshiftIsStealing(dto.getFirstOffshiftIsStealing());
	    entry.setSecondOffshiftIsDefending(dto.getSecondOffshiftIsDefending());
	    entry.setSecondOffshiftIsStealing(dto.getSecondOffshiftIsStealing());

	    entry.setTags(dto.getTags());
	    entry.setClimb(dto.getClimb());

	    entry.setLayout(dto.getLayout());
	    entry.setExportName(dto.getExportName());
	    entry.setTimestamp(dto.getTimestamp());

	    return entry;
	}
	
	public static PitDTO fromEntry(PitEntry entry) {
	    if (entry == null) {
	        return null;
	    }
	    PitDTO dto = new PitDTO();
	    dto.setTeamNumber(entry.getTeamNumber());
	    dto.setTeamName(entry.getTeamName());
	    dto.setIntervieweeName(entry.getIntervieweeName());
	    dto.setInterviewerName(entry.getInterviewerName());
	    dto.setRobotHeight(entry.getRobotHeight());
	    dto.setRobotLength(entry.getRobotLength());
	    dto.setRobotWidth(entry.getRobotWidth());
	    dto.setRobotWeight(entry.getRobotWeight());
	    dto.setRobotDrivetrain(entry.getRobotDrivetrain());
	    dto.setRobotMechanisms(entry.getRobotMechanisms());
	    dto.setCoralScoringAbilityL1(entry.getCoralScoringAbilityL1());
	    dto.setCoralScoringAbilityL2(entry.getCoralScoringAbilityL2());
	    dto.setCoralScoringAbilityL3(entry.getCoralScoringAbilityL3());
	    dto.setCoralScoringAbilityL4(entry.getCoralScoringAbilityL4());
	    dto.setCanIntakeStation(entry.getCanIntakeStation());
	    dto.setCanIntakeGround(entry.getCanIntakeGround());
	    dto.setCanRemoveAlgaeL2(entry.getCanRemoveAlgaeL2());
	    dto.setCanRemoveAlgaeL3(entry.getCanRemoveAlgaeL3());
	    dto.setCanScoreProcessor(entry.getCanScoreProcessor());
	    dto.setCanScorenet(entry.getCanScorenet());
	    dto.setCanClimbShallow(entry.getCanClimbShallow());
	    dto.setCanClimbDeep(entry.getCanClimbDeep());
	    dto.setAverageClimbTime(entry.getAverageClimbTime());
	    dto.setDriveExperience(entry.getDriveExperience());
	    dto.setHumanPlayerPreference(entry.getHumanPlayerPreference());
	    dto.setAverageCoralCycles(entry.getAverageCoralCycles());
	    dto.setAverageAlgaeCycles(entry.getAverageAlgaeCycles());
	    dto.setIdealAlliancePartnerQualities(entry.getIdealAlliancePartnerQualities());
		dto.setGeneralStrategyPreference(entry.getGeneralStrategyPreference());
	    dto.setOtherComments(entry.getOtherComments());
	    dto.setLayout(entry.getLayout());
	    dto.setExportName(entry.getExportName());
	    dto.setTimestamp(entry.getTimestamp());
	    dto.setAuto(entry.getAuto());
	    return dto;
	}

	
	public static PitEntry fromDTO(PitDTO dto) {
	    if (dto == null) {
	        return null;
	    }
	    PitEntry entry = new PitEntry();
	    entry.setTeamNumber(dto.getTeamNumber());
	    entry.setTeamName(dto.getTeamName());
	    entry.setIntervieweeName(dto.getIntervieweeName());
	    entry.setInterviewerName(dto.getInterviewerName());
	    entry.setRobotHeight(dto.getRobotHeight());
	    entry.setRobotLength(dto.getRobotLength());
	    entry.setRobotWidth(dto.getRobotWidth());
	    entry.setRobotWeight(dto.getRobotWeight());
	    entry.setRobotDrivetrain(dto.getRobotDrivetrain());
	    entry.setRobotMechanisms(dto.getRobotMechanisms());
	    entry.setCoralScoringAbilityL1(dto.getCoralScoringAbilityL1());
	    entry.setCoralScoringAbilityL2(dto.getCoralScoringAbilityL2());
	    entry.setCoralScoringAbilityL3(dto.getCoralScoringAbilityL3());
	    entry.setCoralScoringAbilityL4(dto.getCoralScoringAbilityL4());
	    entry.setCanIntakeStation(dto.getCanIntakeStation());
	    entry.setCanIntakeGround(dto.getCanIntakeGround());
	    entry.setCanRemoveAlgaeL2(dto.getCanRemoveAlgaeL2());
	    entry.setCanRemoveAlgaeL3(dto.getCanRemoveAlgaeL3());
	    entry.setCanScoreProcessor(dto.getCanScoreProcessor());
	    entry.setCanScorenet(dto.getCanScorenet());
	    entry.setCanClimbShallow(dto.getCanClimbShallow());
	    entry.setCanClimbDeep(dto.getCanClimbDeep());
	    entry.setAverageClimbTime(dto.getAverageClimbTime());
	    entry.setDriveExperience(dto.getDriveExperience());
	    entry.setHumanPlayerPreference(dto.getHumanPlayerPreference());
	    entry.setAverageCoralCycles(dto.getAverageCoralCycles());
	    entry.setAverageAlgaeCycles(dto.getAverageAlgaeCycles());
	    entry.setIdealAlliancePartnerQualities(dto.getIdealAlliancePartnerQualities());
		entry.setGeneralStrategyPreference(dto.getGeneralStrategyPreference());
	    entry.setOtherComments(dto.getOtherComments());
	    entry.setLayout(dto.getLayout());
	    entry.setExportName(dto.getExportName());
	    entry.setTimestamp(dto.getTimestamp());
	    entry.setAuto(dto.getAuto());
	    return entry;
	}
	
	public static PatchEntry fromDTO(PatchDTO dto) {
		if (dto == null) {
	        return null;
	    }
		PatchEntry entry = new PatchEntry();
		entry.setComments(dto.getComments());
		entry.setDataType(dto.getDataType());
		entry.setDriverStation(dto.getDriverStation());
		entry.setMatchNumber(dto.getMatchNumber());
		entry.setMatchType(dto.getMatchType());
		entry.setPatcher(dto.getPatcher());
		entry.setReplay(dto.isReplay());
		entry.setTeamNumber(dto.getTeamNumber());
		return entry;
	}
	
	public static PatchDTO fromEntry(PatchEntry entry) {
		if (entry == null) {
	        return null;
	    }
		PatchDTO dto = new PatchDTO();
		entry.setComments(dto.getComments());
		entry.setDataType(dto.getDataType());
		entry.setDriverStation(dto.getDriverStation());
		entry.setMatchNumber(dto.getMatchNumber());
		entry.setMatchType(dto.getMatchType());
		entry.setPatcher(dto.getPatcher());
		entry.setReplay(dto.isReplay());
		entry.setTeamNumber(dto.getTeamNumber());
		return dto;
	}
	
	public static Match fromEntry(MatchEntry entry) {
		if(entry == null) return null;
		Match dto = new Match();
		dto.setActual_time(entry.getActual_time());
		dto.setAlliances(entry.getAlliances());
		dto.setComp_level(entry.getComp_level());
		dto.setEvent_key(entry.getEvent_key());
		dto.setKey(entry.getKey());
		dto.setMatch_number(entry.getMatch_number());
		dto.setPost_result_time(entry.getPost_result_time());
		dto.setPredicted_time(entry.getPredicted_time());
		dto.setScore_breakdown(entry.getScore_breakdown());
		dto.setSet_number(entry.getSet_number());;
		dto.setTime(entry.getTime());
		dto.setVideos(entry.getVideos());
		dto.setWinning_alliances(entry.getWinning_alliance());
		return dto;
	}
	
	public static MatchEntry fromDTO(Match dto) {
		if(dto == null) return null;
		MatchEntry entry = new MatchEntry();
		entry.setActual_time(dto.getActual_time());
		entry.setAlliances(dto.getAlliances());
		entry.setComp_level(dto.getComp_level());
		entry.setEvent_key(dto.getEvent_key());
		entry.setKey(dto.getKey());
		entry.setMatch_number(dto.getMatch_number());
		entry.setPost_result_time(dto.getPost_result_time());
		entry.setPredicted_time(dto.getPredicted_time());
		entry.setScore_breakdown(dto.getScore_breakdown());
		entry.setSet_number(dto.getSet_number());;
		entry.setTime(dto.getTime());
		entry.setVideos(dto.getVideos());
		entry.setWinning_alliance(dto.getWinning_alliance());
		return entry;
	}
}
