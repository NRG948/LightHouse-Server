package com.nrg948.data;

import java.util.List;

import jakarta.persistence.ElementCollection;

public class PitDTO {

    private String teamNumber;
    private String teamName;
    private String intervieweeName;
    private String interviewerName;
    private int robotHeight;
    private int robotLength;
    private int robotWidth;
    private int robotWeight;
    private String robotDrivetrain;
    private String robotMechanisms;
    private String coralScoringAbilityL1;
    private String coralScoringAbilityL2;
    private String coralScoringAbilityL3;
    private String coralScoringAbilityL4;
    private String canIntakeStation;
    private String canIntakeGround;
    private String canRemoveAlgaeL2;
    private String canRemoveAlgaeL3;
    private String canScoreProcessor;
    private String canScorenet;
    private String canClimbShallow;
    private String canClimbDeep;
    private String averageClimbTime;
    private String driveExperience;
    private String humanPlayerPreference;
    private int averageCoralCycles;
    private int averageAlgaeCycles;
    private String idealAlliancePartnerQualities;
    private String otherComments;
    private String layout;
    private String exportName;
    private String timestamp;
    @ElementCollection
    private PitAuto[] auto;

    // Getters and setters
    public String getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(String teamNumber) {
        this.teamNumber = teamNumber;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getIntervieweeName() {
        return intervieweeName;
    }

    public void setIntervieweeName(String intervieweeName) {
        this.intervieweeName = intervieweeName;
    }

    public String getInterviewerName() {
        return interviewerName;
    }

    public void setInterviewerName(String interviewerName) {
        this.interviewerName = interviewerName;
    }

    public int getRobotHeight() {
        return robotHeight;
    }

    public void setRobotHeight(int robotHeight) {
        this.robotHeight = robotHeight;
    }

    public int getRobotLength() {
        return robotLength;
    }

    public void setRobotLength(int robotLength) {
        this.robotLength = robotLength;
    }

    public int getRobotWidth() {
        return robotWidth;
    }

    public void setRobotWidth(int robotWidth) {
        this.robotWidth = robotWidth;
    }

    public int getRobotWeight() {
        return robotWeight;
    }

    public void setRobotWeight(int robotWeight) {
        this.robotWeight = robotWeight;
    }

    public String getRobotDrivetrain() {
        return robotDrivetrain;
    }

    public void setRobotDrivetrain(String robotDrivetrain) {
        this.robotDrivetrain = robotDrivetrain;
    }

    public String getRobotMechanisms() {
        return robotMechanisms;
    }

    public void setRobotMechanisms(String robotMechanisms) {
        this.robotMechanisms = robotMechanisms;
    }

    public String getCoralScoringAbilityL1() {
        return coralScoringAbilityL1;
    }

    public void setCoralScoringAbilityL1(String coralScoringAbilityL1) {
        this.coralScoringAbilityL1 = coralScoringAbilityL1;
    }

    public String getCoralScoringAbilityL2() {
        return coralScoringAbilityL2;
    }

    public void setCoralScoringAbilityL2(String coralScoringAbilityL2) {
        this.coralScoringAbilityL2 = coralScoringAbilityL2;
    }

    public String getCoralScoringAbilityL3() {
        return coralScoringAbilityL3;
    }

    public void setCoralScoringAbilityL3(String coralScoringAbilityL3) {
        this.coralScoringAbilityL3 = coralScoringAbilityL3;
    }

    public String getCoralScoringAbilityL4() {
        return coralScoringAbilityL4;
    }

    public void setCoralScoringAbilityL4(String coralScoringAbilityL4) {
        this.coralScoringAbilityL4 = coralScoringAbilityL4;
    }

    public String getCanIntakeStation() {
        return canIntakeStation;
    }

    public void setCanIntakeStation(String canIntakeStation) {
        this.canIntakeStation = canIntakeStation;
    }

    public String getCanIntakeGround() {
        return canIntakeGround;
    }

    public void setCanIntakeGround(String canIntakeGround) {
        this.canIntakeGround = canIntakeGround;
    }

    public String getCanRemoveAlgaeL2() {
        return canRemoveAlgaeL2;
    }

    public void setCanRemoveAlgaeL2(String canRemoveAlgaeL2) {
        this.canRemoveAlgaeL2 = canRemoveAlgaeL2;
    }

    public String getCanRemoveAlgaeL3() {
        return canRemoveAlgaeL3;
    }

    public void setCanRemoveAlgaeL3(String canRemoveAlgaeL3) {
        this.canRemoveAlgaeL3 = canRemoveAlgaeL3;
    }

    public String getCanScoreProcessor() {
        return canScoreProcessor;
    }

    public void setCanScoreProcessor(String canScoreProcessor) {
        this.canScoreProcessor = canScoreProcessor;
    }

    public String getCanScorenet() {
        return canScorenet;
    }

    public void setCanScorenet(String canScorenet) {
        this.canScorenet = canScorenet;
    }

    public String getCanClimbShallow() {
        return canClimbShallow;
    }

    public void setCanClimbShallow(String canClimbShallow) {
        this.canClimbShallow = canClimbShallow;
    }

    public String getCanClimbDeep() {
        return canClimbDeep;
    }

    public void setCanClimbDeep(String canClimbDeep) {
        this.canClimbDeep = canClimbDeep;
    }

    public String getAverageClimbTime() {
        return averageClimbTime;
    }

    public void setAverageClimbTime(String averageClimbTime) {
        this.averageClimbTime = averageClimbTime;
    }

    public String getDriveExperience() {
        return driveExperience;
    }

    public void setDriveExperience(String driveExperience) {
        this.driveExperience = driveExperience;
    }

    public String getHumanPlayerPreference() {
        return humanPlayerPreference;
    }

    public void setHumanPlayerPreference(String humanPlayerPreference) {
        this.humanPlayerPreference = humanPlayerPreference;
    }

    public int getAverageCoralCycles() {
        return averageCoralCycles;
    }

    public void setAverageCoralCycles(int averageCoralCycles) {
        this.averageCoralCycles = averageCoralCycles;
    }

    public int getAverageAlgaeCycles() {
        return averageAlgaeCycles;
    }

    public void setAverageAlgaeCycles(int averageAlgaeCycles) {
        this.averageAlgaeCycles = averageAlgaeCycles;
    }

    public String getIdealAlliancePartnerQualities() {
        return idealAlliancePartnerQualities;
    }

    public void setIdealAlliancePartnerQualities(String idealAlliancePartnerQualities) {
        this.idealAlliancePartnerQualities = idealAlliancePartnerQualities;
    }

    public String getOtherComments() {
        return otherComments;
    }

    public void setOtherComments(String otherComments) {
        this.otherComments = otherComments;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getExportName() {
        return exportName;
    }

    public void setExportName(String exportName) {
        this.exportName = exportName;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

	public PitAuto[] getAuto() {
		return auto;
	}

	public void setAuto(PitAuto[] auto) {
		this.auto = auto;
	}
}
