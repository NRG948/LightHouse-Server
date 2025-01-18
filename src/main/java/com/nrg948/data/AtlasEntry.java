package com.nrg948.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.transaction.Transactional;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"scouterName", "teamNumber", "driverStation", "matchType", "matchNumber", "replay"}))
@Transactional
/*
 * FYI if you modify any variables here, make sure to modify the findBy function in the database.
 */
public class AtlasEntry {
	private @Id @GeneratedValue Long id;

    /**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	// Setup Page
    private String scouterName;
    private String teamNumber;
    private String driverStation;
    private String matchType;
    private String matchNumber;
    private String replay;
    private String startingPosition;
    private String preload;

    // Auto Page
    private String autoQuantitative;

    // Teleop Page
    private String coralPickupsStation;
    private String coralPickupsGround;
    private String coralScoredL1;
    private String coralScoredL2;
    private String coralScoredL3;
    private String coralScoredL4;
    private String algaeremoveL2;
    private String algaeremoveL3;
    private String algaescoreProcessor;
    private String algaescoreNet;
    private String algaemissProcessor;
    private String algaemissNet;

    // Endgame Page
    private String endLocation;
    private String attemptedClimb;
    private String climbStartTime;
    private String robotDisabled;
    private String robotDisableReason;
    private String dataQuality;
    private String comments;
    private String crossedMidline;

    // Getters and Setters
    public String getScouterName() {
        return scouterName;
    }

    public void setScouterName(String scouterName) {
        this.scouterName = scouterName;
    }

    public String getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(String teamNumber) {
        this.teamNumber = teamNumber;
    }

    public String getDriverStation() {
        return driverStation;
    }

    public void setDriverStation(String driverStation) {
        this.driverStation = driverStation;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getMatchNumber() {
        return matchNumber;
    }

    public void setMatchNumber(String matchNumber) {
        this.matchNumber = matchNumber;
    }

    public String getReplay() {
        return replay;
    }

    public void setReplay(String replay) {
        this.replay = replay;
    }

    public String getStartingPosition() {
        return startingPosition;
    }

    public void setStartingPosition(String startingPosition) {
        this.startingPosition = startingPosition;
    }

    public String getPreload() {
        return preload;
    }

    public void setPreload(String preload) {
        this.preload = preload;
    }

    public String getAutoQuantitative() {
        return autoQuantitative;
    }

    public void setAutoQuantitative(String autoQuantitative) {
        this.autoQuantitative = autoQuantitative;
    }

    public String getCoralPickupsStation() {
        return coralPickupsStation;
    }

    public void setCoralPickupsStation(String coralPickupsStation) {
        this.coralPickupsStation = coralPickupsStation;
    }

    public String getCoralPickupsGround() {
        return coralPickupsGround;
    }

    public void setCoralPickupsGround(String coralPickupsGround) {
        this.coralPickupsGround = coralPickupsGround;
    }

    public String getCoralScoredL1() {
        return coralScoredL1;
    }

    public void setCoralScoredL1(String coralScoredL1) {
        this.coralScoredL1 = coralScoredL1;
    }

    public String getCoralScoredL2() {
        return coralScoredL2;
    }

    public void setCoralScoredL2(String coralScoredL2) {
        this.coralScoredL2 = coralScoredL2;
    }

    public String getCoralScoredL3() {
        return coralScoredL3;
    }

    public void setCoralScoredL3(String coralScoredL3) {
        this.coralScoredL3 = coralScoredL3;
    }

    public String getCoralScoredL4() {
        return coralScoredL4;
    }

    public void setCoralScoredL4(String coralScoredL4) {
        this.coralScoredL4 = coralScoredL4;
    }

    public String getAlgaeremoveL2() {
        return algaeremoveL2;
    }

    public void setAlgaeremoveL2(String algaeremoveL2) {
        this.algaeremoveL2 = algaeremoveL2;
    }

    public String getAlgaeremoveL3() {
        return algaeremoveL3;
    }

    public void setAlgaeremoveL3(String algaeremoveL3) {
        this.algaeremoveL3 = algaeremoveL3;
    }

    public String getAlgaescoreProcessor() {
        return algaescoreProcessor;
    }

    public void setAlgaescoreProcessor(String algaescoreProcessor) {
        this.algaescoreProcessor = algaescoreProcessor;
    }

    public String getAlgaescoreNet() {
        return algaescoreNet;
    }

    public void setAlgaescoreNet(String algaescoreNet) {
        this.algaescoreNet = algaescoreNet;
    }

    public String getAlgaemissProcessor() {
        return algaemissProcessor;
    }

    public void setAlgaemissProcessor(String algaemissProcessor) {
        this.algaemissProcessor = algaemissProcessor;
    }

    public String getAlgaemissNet() {
        return algaemissNet;
    }

    public void setAlgaemissNet(String algaemissNet) {
        this.algaemissNet = algaemissNet;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public String getAttemptedClimb() {
        return attemptedClimb;
    }

    public void setAttemptedClimb(String attemptedClimb) {
        this.attemptedClimb = attemptedClimb;
    }

    public String getClimbStartTime() {
        return climbStartTime;
    }

    public void setClimbStartTime(String climbStartTime) {
        this.climbStartTime = climbStartTime;
    }

    public String getRobotDisabled() {
        return robotDisabled;
    }

    public void setRobotDisabled(String robotDisabled) {
        this.robotDisabled = robotDisabled;
    }

    public String getRobotDisableReason() {
        return robotDisableReason;
    }

    public void setRobotDisableReason(String robotDisableReason) {
        this.robotDisableReason = robotDisableReason;
    }

    public String getDataQuality() {
        return dataQuality;
    }

    public void setDataQuality(String dataQuality) {
        this.dataQuality = dataQuality;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCrossedMidline() {
        return crossedMidline;
    }

    public void setCrossedMidline(String crossedMidline) {
        this.crossedMidline = crossedMidline;
    }
}

