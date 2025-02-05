package com.nrg948.data;

import java.util.ArrayList;
import java.util.List;

public class DTOMapper {
	public static AtlasDTO fromEntry(AtlasEntry entry) {
	    if (entry == null) {
	        return null;
	    }

	    AtlasDTO dto = new AtlasDTO();

	    // Mapping scalar values
	    dto.setScouterName(entry.getScouterName());
	    dto.setTeamNumber(entry.getTeamNumber());
	    dto.setDriverStation(entry.getDriverStation());
	    dto.setMatchType(entry.getMatchType());
	    dto.setMatchNumber(entry.getMatchNumber());
	    dto.setReplay(entry.getReplay());
	    dto.setStartingPosition(entry.getStartingPosition());
	    dto.setPreload(entry.getPreload());

	    // Mapping arrays
	    dto.setAutoCoralScored(entry.getAutoCoralScored()); // Assuming AtlasEntry has a method getAutoCoralScored()
	    dto.setAutoAlgaeRemoved(entry.getAutoAlgaeRemoved()); // Assuming AtlasEntry has a method getAutoAlgaeRemoved()

	    // Mapping other numeric fields
	    dto.setCoralPickupsStation(entry.getCoralPickupsStation());
	    dto.setCoralPickupsGround(entry.getCoralPickupsGround());
	    dto.setCoralScoredL1(entry.getCoralScoredL1());
	    dto.setCoralScoredL2(entry.getCoralScoredL2());
	    dto.setCoralScoredL3(entry.getCoralScoredL3());
	    dto.setCoralScoredL4(entry.getCoralScoredL4());
	    dto.setAlgaeremoveL2(entry.getAlgaeremoveL2());
	    dto.setAlgaeremoveL3(entry.getAlgaeremoveL3());
	    dto.setAlgaescoreProcessor(entry.getAlgaescoreProcessor());
	    dto.setAlgaescoreNet(entry.getAlgaescoreNet());
	    dto.setAlgaemissProcessor(entry.getAlgaemissProcessor());
	    dto.setAlgaemissNet(entry.getAlgaemissNet());

	    // Mapping other string fields
	    dto.setEndLocation(entry.getEndLocation());
	    dto.setAttemptedClimb(entry.getAttemptedClimb());
	    dto.setClimbStartTime(entry.getClimbStartTime());
	    dto.setRobotDisabled(entry.getRobotDisabled());
	    dto.setRobotDisableReason(entry.getRobotDisableReason());
	    dto.setDataQuality(entry.getDataQuality());
	    dto.setComments(entry.getComments());
	    dto.setCrossedMidline(entry.getCrossedMidline());
	    dto.setAutoBargeCS(entry.getAutoBargeCS());
	    dto.setAutoProcessorCS(entry.getAutoProcessorCS());
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

	    // Mapping scalar values
	    entry.setScouterName(dto.getScouterName());
	    entry.setTeamNumber(dto.getTeamNumber());
	    entry.setDriverStation(dto.getDriverStation());
	    entry.setMatchType(dto.getMatchType());
	    entry.setMatchNumber(dto.getMatchNumber());
	    entry.setReplay(dto.getReplay());
	    entry.setStartingPosition(dto.getStartingPosition());
	    entry.setPreload(dto.getPreload());

	    // Mapping arrays
	    entry.setAutoCoralScored(dto.getAutoCoralScored()); // Assuming AtlasDTO has getAutoCoralScored()
	    entry.setAutoAlgaeRemoved(dto.getAutoAlgaeRemoved()); // Assuming AtlasDTO has getAutoAlgaeRemoved()

	    // Mapping other numeric fields
	    entry.setCoralPickupsStation(dto.getCoralPickupsStation());
	    entry.setCoralPickupsGround(dto.getCoralPickupsGround());
	    entry.setCoralScoredL1(dto.getCoralScoredL1());
	    entry.setCoralScoredL2(dto.getCoralScoredL2());
	    entry.setCoralScoredL3(dto.getCoralScoredL3());
	    entry.setCoralScoredL4(dto.getCoralScoredL4());
	    entry.setAlgaeremoveL2(dto.getAlgaeremoveL2());
	    entry.setAlgaeremoveL3(dto.getAlgaeremoveL3());
	    entry.setAlgaescoreProcessor(dto.getAlgaescoreProcessor());
	    entry.setAlgaescoreNet(dto.getAlgaescoreNet());
	    entry.setAlgaemissProcessor(dto.getAlgaemissProcessor());
	    entry.setAlgaemissNet(dto.getAlgaemissNet());

	    // Mapping other string fields
	    entry.setEndLocation(dto.getEndLocation());
	    entry.setAttemptedClimb(dto.getAttemptedClimb());
	    entry.setClimbStartTime(dto.getClimbStartTime());
	    entry.setRobotDisabled(dto.getRobotDisabled());
	    entry.setRobotDisableReason(dto.getRobotDisableReason());
	    entry.setDataQuality(dto.getDataQuality());
	    entry.setComments(dto.getComments());
	    entry.setCrossedMidline(dto.getCrossedMidline());
	    entry.setAutoBargeCS(dto.getAutoBargeCS());
	    entry.setAutoProcessorCS(dto.getAutoProcessorCS());
	    entry.setLayout(dto.getLayout());
	    entry.setExportName(dto.getExportName());
	    entry.setTimestamp(dto.getTimestamp());

	    return entry;
	}
	
	public static ChronosDTO fromEntry(ChronosEntry entry) {
	    if (entry == null) {
	        return null;
	    }

	    ChronosDTO dto = new ChronosDTO();

	    // Mapping scalar values
	    dto.setScouterName(entry.getScouterName());
	    dto.setTeamNumber(entry.getTeamNumber());
	    dto.setDriverStation(entry.getDriverStation());
	    dto.setMatchType(entry.getMatchType());
	    dto.setMatchNumber(entry.getMatchNumber());
	    dto.setReplay(entry.getReplay());
	    dto.setStartingPosition(entry.getStartingPosition());

	    // Mapping event lists
	    dto.setAutoEventList(entry.getAutoEventList()); // Assuming ChronosEntry has getAutoEventList()
	    dto.setTeleopEventList(entry.getTeleopEventList()); // Assuming ChronosEntry has getTeleopEventList()

	    // Mapping other fields
	    dto.setGeneralStrategy(entry.getGeneralStrategy());
	    dto.setDataQuality(entry.getDataQuality());
	    dto.setComments(entry.getComments());
	    dto.setLayout(entry.getLayout());
	    dto.setExportName(entry.getExportName());
	    dto.setTimestamp(entry.getTimestamp());

	    return dto;
	}


	public static ChronosEntry fromDTO(ChronosDTO dto) {
	    if (dto == null) {
	        return null;
	    }

	    ChronosEntry entry = new ChronosEntry();

	    // Mapping scalar values
	    entry.setScouterName(dto.getScouterName());
	    entry.setTeamNumber(dto.getTeamNumber());
	    entry.setDriverStation(dto.getDriverStation());
	    entry.setMatchType(dto.getMatchType());
	    entry.setMatchNumber(dto.getMatchNumber());
	    entry.setReplay(dto.getReplay());
	    entry.setStartingPosition(dto.getStartingPosition());

	    // Mapping event lists
	    entry.setAutoEventList(dto.getAutoEventList()); // Assuming ChronosEntry has a method setAutoEventList()
	    entry.setTeleopEventList(dto.getTeleopEventList()); // Assuming ChronosEntry has a method setTeleopEventList()

	    // Mapping other fields
	    entry.setGeneralStrategy(dto.getGeneralStrategy());
	    entry.setDataQuality(dto.getDataQuality());
	    entry.setComments(dto.getComments());
	    entry.setLayout(dto.getLayout());
	    entry.setExportName(dto.getExportName());
	    entry.setTimestamp(dto.getTimestamp());

	    return entry;
	}

	
	public static HPDTO fromEntry(HPEntry entry) {
	    if (entry == null) {
	        return null;
	    }
	    HPDTO dto = new HPDTO();
	    dto.setScouterName(entry.getScouterName());
	    dto.setMatchNumber(entry.getMatchNumber());
	    dto.setRedHPTeam(entry.getRedHPTeam());
	    dto.setBlueHPTeam(entry.getBlueHPTeam());
	    dto.setReplay(entry.isReplay());
	    dto.setMatchType(entry.getMatchType());
	    dto.setRedScore(entry.getRedScore());
	    dto.setBlueScore(entry.getBlueScore());
	    dto.setRedMiss(entry.getRedMiss());
	    dto.setBlueMiss(entry.getBlueMiss());
	    dto.setRedNetAlgae(entry.getRedNetAlgae());
	    dto.setBlueNetAlgae(entry.getBlueNetAlgae());
	    dto.setDataQuality(entry.getDataQuality());
	    dto.setLayout(entry.getLayout());
	    dto.setExportName(entry.getExportName());
	    dto.setTimestamp(entry.getTimestamp());
	    return dto;
	}


	public static HPEntry fromDTO(HPDTO dto) {
	    if (dto == null) {
	        return null;
	    }
	    HPEntry entry = new HPEntry();
	    entry.setScouterName(dto.getScouterName());
	    entry.setMatchNumber(dto.getMatchNumber());
	    entry.setRedHPTeam(dto.getRedHPTeam());
	    entry.setBlueHPTeam(dto.getBlueHPTeam());
	    entry.setReplay(dto.getReplay());
	    entry.setMatchType(dto.getMatchType());
	    entry.setRedScore(dto.getRedScore());
	    entry.setBlueScore(dto.getBlueScore());
	    entry.setRedMiss(dto.getRedMiss());
	    entry.setBlueMiss(dto.getBlueMiss());
	    entry.setRedNetAlgae(dto.getRedNetAlgae());
	    entry.setBlueNetAlgae(dto.getBlueNetAlgae());
	    entry.setDataQuality(dto.getDataQuality());
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
	    dto.setAutoCoralScored(entry.getAutoCoralScored());
	    dto.setAutoAlgaeRemoved(entry.getAutoAlgaeRemoved());
	    dto.setDropsAlgaeAuto(entry.isDropsAlgaeAuto());
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
	    dto.setOtherComments(entry.getOtherComments());
	    dto.setCoralScoredL1(entry.getCoralScoredL1());
	    dto.setLayout(entry.getLayout());
	    dto.setExportName(entry.getExportName());
	    dto.setTimestamp(entry.getTimestamp());
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
	    entry.setAutoCoralScored(dto.getAutoCoralScored());
	    entry.setAutoAlgaeRemoved(dto.getAutoAlgaeRemoved());
	    entry.setDropsAlgaeAuto(dto.isDropsAlgaeAuto());
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
	    entry.setOtherComments(dto.getOtherComments());
	    entry.setCoralScoredL1(dto.getCoralScoredL1());
	    entry.setLayout(dto.getLayout());
	    entry.setExportName(dto.getExportName());
	    entry.setTimestamp(dto.getTimestamp());
	    return entry;
	}

}
