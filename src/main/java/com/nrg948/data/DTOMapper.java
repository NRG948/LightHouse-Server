package com.nrg948.data;

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
		dto.setStartingPosition(entry.getStartingPosition());
		dto.setPreload(entry.getPreload());
		dto.setAutoQuantitative(entry.getAutoQuantitative());
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
		dto.setEndLocation(entry.getEndLocation());
		dto.setAttemptedClimb(entry.getAttemptedClimb());
		dto.setClimbStartTime(entry.getClimbStartTime());
		dto.setRobotDisabled(entry.getRobotDisabled());
		dto.setRobotDisableReason(entry.getRobotDisableReason());
		dto.setDataQuality(entry.getDataQuality());
		dto.setComments(entry.getComments());
		dto.setCrossedMidline(entry.getCrossedMidline());
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
		entry.setStartingPosition(dto.getStartingPosition());
		entry.setPreload(dto.getPreload());
		entry.setAutoQuantitative(dto.getAutoQuantitative());
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
		entry.setEndLocation(dto.getEndLocation());
		entry.setAttemptedClimb(dto.getAttemptedClimb());
		entry.setClimbStartTime(dto.getClimbStartTime());
		entry.setRobotDisabled(dto.getRobotDisabled());
		entry.setRobotDisableReason(dto.getRobotDisableReason());
		entry.setDataQuality(dto.getDataQuality());
		entry.setComments(dto.getComments());
		entry.setCrossedMidline(dto.getCrossedMidline());
		return entry;
	}
	
	public static ChronosDTO fromEntry(ChronosEntry entry) {
		if(entry == null) return null;
		
	    ChronosDTO dto = new ChronosDTO();
	    dto.setRandom(entry.getRandom());
	    dto.setScouterName(entry.getScouterName());
	    dto.setTeamNumber(entry.getTeamNumber());
	    dto.setDriverStation(entry.getDriverStation());
	    dto.setMatchType(entry.getMatchType());
	    dto.setMatchNumber(entry.getMatchNumber());
	    dto.setReplay(entry.getReplay());
	    dto.setStartingPosition(entry.getStartingPosition());
	    dto.setStartMatchGuided(entry.getStartMatchGuided());
	    dto.setIdkYetAuto(entry.getIdkYetAuto());
	    dto.setShouldThisBeSeparateAuto(entry.getShouldThisBeSeparateAuto());
	    dto.setIdkYetTeleop(entry.getIdkYetTeleop());
	    dto.setShouldThisBeSeparateTeleop(entry.getShouldThisBeSeparateTeleop());
	    dto.setGeneralStrategy(entry.getGeneralStrategy());
	    dto.setDataQuality(entry.getDataQuality());
	    dto.setComments(entry.getComments());
	    return dto;
	}

	public static ChronosEntry fromDTO(ChronosDTO dto) {
		if(dto == null) return null;
		
	    ChronosEntry entry = new ChronosEntry();
	    entry.setRandom(dto.getRandom());
	    entry.setScouterName(dto.getScouterName());
	    entry.setTeamNumber(dto.getTeamNumber());
	    entry.setDriverStation(dto.getDriverStation());
	    entry.setMatchType(dto.getMatchType());
	    entry.setMatchNumber(dto.getMatchNumber());
	    entry.setReplay(dto.getReplay());
	    entry.setStartingPosition(dto.getStartingPosition());
	    entry.setStartMatchGuided(dto.getStartMatchGuided());
	    entry.setIdkYetAuto(dto.getIdkYetAuto());
	    entry.setShouldThisBeSeparateAuto(dto.getShouldThisBeSeparateAuto());
	    entry.setIdkYetTeleop(dto.getIdkYetTeleop());
	    entry.setShouldThisBeSeparateTeleop(dto.getShouldThisBeSeparateTeleop());
	    entry.setGeneralStrategy(dto.getGeneralStrategy());
	    entry.setDataQuality(dto.getDataQuality());
	    entry.setComments(dto.getComments());
	    return entry;
	}
	
	public static HPDTO fromEntry(HPEntry entry) {
		if(entry == null) return null;
		
	    HPDTO dto = new HPDTO();
	    dto.setScouterName(entry.getScouterName());
	    dto.setRedHPTeam(entry.getRedHPTeam());
	    dto.setBlueHPTeam(entry.getBlueHPTeam());
	    dto.setMatchType(entry.getMatchType());
	    dto.setMatchNumber(entry.getMatchNumber());
	    dto.setReplay(entry.getReplay());
	    dto.setRedScore(entry.getRedScore());
	    dto.setBlueScore(entry.getBlueScore());
	    dto.setRedMiss(entry.getRedMiss());
	    dto.setBlueMiss(entry.getBlueMiss());
	    dto.setRedNetAlgae(entry.getRedNetAlgae());
	    dto.setBlueNetAlgae(entry.getBlueNetAlgae());
	    return dto;
	}

	public static HPEntry fromDTO(HPDTO dto) {
		if(dto == null) return null;
		
	    HPEntry entry = new HPEntry();
	    entry.setScouterName(dto.getScouterName());
	    entry.setRedHPTeam(dto.getRedHPTeam());
	    entry.setBlueHPTeam(dto.getBlueHPTeam());
	    entry.setMatchType(dto.getMatchType());
	    entry.setMatchNumber(dto.getMatchNumber());
	    entry.setReplay(dto.getReplay());
	    entry.setRedScore(dto.getRedScore());
	    entry.setBlueScore(dto.getBlueScore());
	    entry.setRedMiss(dto.getRedMiss());
	    entry.setBlueMiss(dto.getBlueMiss());
	    entry.setRedNetAlgae(dto.getRedNetAlgae());
	    entry.setBlueNetAlgae(dto.getBlueNetAlgae());
	    return entry;
	}
	
	public static PitDTO fromEntry(PitEntry entry) {
		if(entry == null) return null;
		
	    PitDTO dto = new PitDTO();
	    dto.setTeamNumber(entry.getTeamNumber());
	    dto.setTeamName(entry.getTeamName());
	    dto.setIntervieweeName(entry.getIntervieweeName());
	    dto.setInterviewerName(entry.getInterviewerName());
	    dto.setRobotTeamNumber(entry.getRobotTeamNumber());
	    dto.setAutoRoutine(entry.getAutoRoutine());
	    dto.setDropsAlgaeAuto(entry.getDropsAlgaeAuto());
	    dto.setCoralScoringAbility(entry.getCoralScoringAbility());
	    dto.setCoralIntakeAbility(entry.getCoralIntakeAbility());
	    dto.setAlgaeRemovalAbility(entry.getAlgaeRemovalAbility());
	    dto.setAlgaeScoringAbility(entry.getAlgaeScoringAbility());
	    dto.setClimbingAbilityAndPreference(entry.getClimbingAbilityAndPreference());
	    dto.setAverageClimbTime(entry.getAverageClimbTime());
	    dto.setDriveExperience(entry.getDriveExperience());
	    dto.setHumanPlayerPreference(entry.getHumanPlayerPreference());
	    dto.setAverageCoralCycles(entry.getAverageCoralCycles());
	    dto.setAverageAlgaeCycles(entry.getAverageAlgaeCycles());
	    dto.setIdealAlliancePartnerQualities(entry.getIdealAlliancePartnerQualities());
	    dto.setOtherComments(entry.getOtherComments());
	    return dto;
	}

	public static PitEntry fromDTO(PitDTO dto) {
		if(dto == null) return null;
		
	    PitEntry entry = new PitEntry();
	    entry.setTeamNumber(dto.getTeamNumber());
	    entry.setTeamName(dto.getTeamName());
	    entry.setIntervieweeName(dto.getIntervieweeName());
	    entry.setInterviewerName(dto.getInterviewerName());
	    entry.setRobotTeamNumber(dto.getRobotTeamNumber());
	    entry.setAutoRoutine(dto.getAutoRoutine());
	    entry.setDropsAlgaeAuto(dto.getDropsAlgaeAuto());
	    entry.setCoralScoringAbility(dto.getCoralScoringAbility());
	    entry.setCoralIntakeAbility(dto.getCoralIntakeAbility());
	    entry.setAlgaeRemovalAbility(dto.getAlgaeRemovalAbility());
	    entry.setAlgaeScoringAbility(dto.getAlgaeScoringAbility());
	    entry.setClimbingAbilityAndPreference(dto.getClimbingAbilityAndPreference());
	    entry.setAverageClimbTime(dto.getAverageClimbTime());
	    entry.setDriveExperience(dto.getDriveExperience());
	    entry.setHumanPlayerPreference(dto.getHumanPlayerPreference());
	    entry.setAverageCoralCycles(dto.getAverageCoralCycles());
	    entry.setAverageAlgaeCycles(dto.getAverageAlgaeCycles());
	    entry.setIdealAlliancePartnerQualities(dto.getIdealAlliancePartnerQualities());
	    entry.setOtherComments(dto.getOtherComments());
	    return entry;
	}

}
