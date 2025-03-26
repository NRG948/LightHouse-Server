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
	 * 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	private String scouterName;
    private int matchNumber;
    private int teamNumber;
    private boolean replay;
    private String matchType;
    private String driverStation;
    private String startingPosition;
    private boolean preload;
    private String autoCoralScoredL1;
    private int algaeRemove;
    private int coralScoredL1;
    private int coralPickupsStation;
    private int coralPickupsGround;
    private int coralScoredL2;
    private int coralScoredL3;
    private int coralScoredL4;
    private int algaeremoveL2;
    private int algaeremoveL3;
    private int algaeScoreProcessor;
    private int algaeMissProcessor;
    private int algaeMissNet;
    private boolean bargeCS;
	private boolean processorCS;
	private boolean hasNoAuto;
	private boolean groundIntake;
    private String endLocation;
    private boolean attemptedClimb;
    private int climbStartTime;
    private boolean robotDisabled;
    private String robotDisableReason;
    private int dataQuality;
    private String comments;
    private boolean crossedMidline;
	private String defenseRating;
    private String layout;
    private String exportName;
    private String timestamp;
    private String[] autoCoralScored;
    private String[] autoAlgaeRemoved;
    private int algaeScoreNet;
    private int algaePickups;
    private int coralPickups;
    
	/**
	 * @return the algaeScoreNet
	 */
	public int getAlgaeScoreNet() {
		return algaeScoreNet;
	}
	/**
	 * @param algaeScoreNet the algaeScoreNet to set
	 */
	public void setAlgaeScoreNet(int algaeScoreNet) {
		this.algaeScoreNet = algaeScoreNet;
	}
	/**
	 * @return the autoCoralScored
	 */
	public String[] getAutoCoralScored() {
		return autoCoralScored;
	}
	/**
	 * @param autoCoralScored the autoCoralScored to set
	 */
	public void setAutoCoralScored(String[] autoCoralScored) {
		this.autoCoralScored = autoCoralScored;
	}
	/**
	 * @return the autoAlgaeRemoved
	 */
	public String[] getAutoAlgaeRemoved() {
		return autoAlgaeRemoved;
	}
	/**
	 * @param autoAlgaeRemoved the autoAlgaeRemoved to set
	 */
	public void setAutoAlgaeRemoved(String[] autoAlgaeRemoved) {
		this.autoAlgaeRemoved = autoAlgaeRemoved;
	}
	/**
	 * @return the scouterName
	 */
	public String getScouterName() {
		return scouterName;
	}
	/**
	 * @param scouterName the scouterName to set
	 */
	public void setScouterName(String scouterName) {
		this.scouterName = scouterName;
	}
	/**
	 * @return the matchNumber
	 */
	public int getMatchNumber() {
		return matchNumber;
	}
	/**
	 * @param matchNumber the matchNumber to set
	 */
	public void setMatchNumber(int matchNumber) {
		this.matchNumber = matchNumber;
	}
	/**
	 * @return the teamNumber
	 */
	public int getTeamNumber() {
		return teamNumber;
	}
	/**
	 * @param teamNumber the teamNumber to set
	 */
	public void setTeamNumber(int teamNumber) {
		this.teamNumber = teamNumber;
	}
	/**
	 * @return the replay
	 */
	public boolean getReplay() {
		return replay;
	}
	/**
	 * @param replay the replay to set
	 */
	public void setReplay(boolean replay) {
		this.replay = replay;
	}
	/**
	 * @return the matchType
	 */
	public String getMatchType() {
		return matchType;
	}
	/**
	 * @param matchType the matchType to set
	 */
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	/**
	 * @return the driverStation
	 */
	public String getDriverStation() {
		return driverStation;
	}
	/**
	 * @param driverStation the driverStation to set
	 */
	public void setDriverStation(String driverStation) {
		this.driverStation = driverStation;
	}
	/**
	 * @return the startingPosition
	 */
	public String getStartingPosition() {
		return startingPosition;
	}
	/**
	 * @param startingPosition the startingPosition to set
	 */
	public void setStartingPosition(String startingPosition) {
		this.startingPosition = startingPosition;
	}
	/**
	 * @return the preload
	 */
	public boolean getPreload() {
		return preload;
	}
	/**
	 * @param preload the preload to set
	 */
	public void setPreload(boolean preload) {
		this.preload = preload;
	}
	/**
	 * @return the autoCoralScoredL1
	 */
	public String getAutoCoralScoredL1() {
		return autoCoralScoredL1;
	}
	/**
	 * @param autoCoralScoredL1 the autoCoralScoredL1 to set
	 */
	public void setAutoCoralScoredL1(String autoCoralScoredL1) {
		this.autoCoralScoredL1 = autoCoralScoredL1;
	}
	/**
	 * @return the coralScoredL1
	 */
	public int getCoralScoredL1() {
		return coralScoredL1;
	}
	/**
	 * @param coralScoredL1 the coralScoredL1 to set
	 */
	public void setCoralScoredL1(int coralScoredL1) {
		this.coralScoredL1 = coralScoredL1;
	}
	/**
	 * @return the coralPickupsStation
	 */
	public int getCoralPickupsStation() {
		return coralPickupsStation;
	}
	/**
	 * @param coralPickupsStation the coralPickupsStation to set
	 */
	public void setCoralPickupsStation(int coralPickupsStation) {
		this.coralPickupsStation = coralPickupsStation;
	}
	/**
	 * @return the coralPickupsGround
	 */
	public int getCoralPickupsGround() {
		return coralPickupsGround;
	}
	/**
	 * @param coralPickupsGround the coralPickupsGround to set
	 */
	public void setCoralPickupsGround(int coralPickupsGround) {
		this.coralPickupsGround = coralPickupsGround;
	}
	/**
	 * @return the coralScoredL2
	 */
	public int getCoralScoredL2() {
		return coralScoredL2;
	}
	/**
	 * @param coralScoredL2 the coralScoredL2 to set
	 */
	public void setCoralScoredL2(int coralScoredL2) {
		this.coralScoredL2 = coralScoredL2;
	}
	/**
	 * @return the coralScoredL3
	 */
	public int getCoralScoredL3() {
		return coralScoredL3;
	}
	/**
	 * @param coralScoredL3 the coralScoredL3 to set
	 */
	public void setCoralScoredL3(int coralScoredL3) {
		this.coralScoredL3 = coralScoredL3;
	}
	/**
	 * @return the coralScoredL4
	 */
	public int getCoralScoredL4() {
		return coralScoredL4;
	}
	/**
	 * @param coralScoredL4 the coralScoredL4 to set
	 */
	public void setCoralScoredL4(int coralScoredL4) {
		this.coralScoredL4 = coralScoredL4;
	}
	/**
	 * @return the algaeremoveL2
	 */
	public int getAlgaeremoveL2() {
		return algaeremoveL2;
	}
	/**
	 * @param algaeremoveL2 the algaeremoveL2 to set
	 */
	public void setAlgaeremoveL2(int algaeremoveL2) {
		this.algaeremoveL2 = algaeremoveL2;
	}
	/**
	 * @return the algaeremoveL3
	 */
	public int getAlgaeremoveL3() {
		return algaeremoveL3;
	}
	/**
	 * @param algaeremoveL3 the algaeremoveL3 to set
	 */
	public void setAlgaeremoveL3(int algaeremoveL3) {
		this.algaeremoveL3 = algaeremoveL3;
	}
	/**
	 * @return the algaescoreProcessor
	 */
	public int getAlgaeScoreProcessor() {
		return algaeScoreProcessor;
	}
	/**
	 * @param algaescoreProcessor the algaescoreProcessor to set
	 */
	public void setAlgaeScoreProcessor(int algaescoreProcessor) {
		this.algaeScoreProcessor = algaescoreProcessor;
	}
	/**
	 * @return the algaemissProcessor
	 */
	public int getAlgaeMissProcessor() {
		return algaeMissProcessor;
	}
	/**
	 * @param algaemissProcessor the algaemissProcessor to set
	 */
	public void setAlgaeMissProcessor(int algaemissProcessor) {
		this.algaeMissProcessor = algaemissProcessor;
	}
	/**
	 * @return the algaemissNet
	 */
	public int getAlgaeMissNet() {
		return algaeMissNet;
	}
	/**
	 * @param algaemissNet the algaemissNet to set
	 */
	public void setAlgaeMissNet(int algaemissNet) {
		this.algaeMissNet = algaemissNet;
	}
	/**
	 * @return the bargeCS
	 */
	public boolean getBargeCS() {
		return bargeCS;
	}

	/**
	 * @param bargeCS the bargeCS to set
	 */
	public void setBargeCS(boolean bargeCS) {
		this.bargeCS = bargeCS;
	}

	/**
	 * @return the processorCS
	 */
	public boolean getProcessorCS() {
		return processorCS;
	}

	/**
	 * @param processorCS the processorCS to set
	 */
	public void setProcessorCS(boolean processorCS) {
		this.processorCS = processorCS;
	}


	/**
	 * @return the hasNoAuto
	 */
	public boolean getHasNoAuto() {
		return hasNoAuto;
	}

	/**
	 * @param hasNoAuto the hasNoAuto to set
	 */
	public void setHasNoAuto(boolean hasNoAuto) {
		this.hasNoAuto = hasNoAuto;
	}
	/**
	 * @return the groundIntake
	 */
	public boolean getGroundIntake() {
		return groundIntake;
	}

	/**
	 * @param groundIntake the groundIntake to set
	 */
	public void setGroundIntake(boolean groundIntake) {
		this.groundIntake = groundIntake;
	}
	/**
	 * @return the endLocation
	 */
	public String getEndLocation() {
		return endLocation;
	}
	/**
	 * @param endLocation the endLocation to set
	 */
	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}
	/**
	 * @return the attemptedClimb
	 */
	public boolean getAttemptedClimb() {
		return attemptedClimb;
	}
	/**
	 * @param attemptedClimb the attemptedClimb to set
	 */
	public void setAttemptedClimb(boolean attemptedClimb) {
		this.attemptedClimb = attemptedClimb;
	}
	/**
	 * @return the climbStartTime
	 */
	public int getClimbStartTime() {
		return climbStartTime;
	}
	/**
	 * @param climbStartTime the climbStartTime to set
	 */
	public void setClimbStartTime(int climbStartTime) {
		this.climbStartTime = climbStartTime;
	}
	/**
	 * @return the robotDisabled
	 */
	public boolean getRobotDisabled() {
		return robotDisabled;
	}
	/**
	 * @param robotDisabled the robotDisabled to set
	 */
	public void setRobotDisabled(boolean robotDisabled) {
		this.robotDisabled = robotDisabled;
	}
	/**
	 * @return the robotDisableReason
	 */
	public String getRobotDisableReason() {
		return robotDisableReason;
	}
	/**
	 * @param robotDisableReason the robotDisableReason to set
	 */
	public void setRobotDisableReason(String robotDisableReason) {
		this.robotDisableReason = robotDisableReason;
	}
	/**
	 * @return the dataQuality
	 */
	public int getDataQuality() {
		return dataQuality;
	}
	/**
	 * @param dataQuality the dataQuality to set
	 */
	public void setDataQuality(int dataQuality) {
		this.dataQuality = dataQuality;
	}
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	/**
	 * @return the crossedMidline
	 */
	public boolean getCrossedMidline() {
		return crossedMidline;
	}
	/**
	 * @param crossedMidline the crossedMidline to set
	 */
	public void setCrossedMidline(boolean crossedMidline) {
		this.crossedMidline = crossedMidline;
	}
		/**
	 * @return the defenseRating
	 */
	public String getDefenseRating() {
		return defenseRating;
	}
	/**
	 * @param defenseRating the defenseRating to set
	 */
	public void setDefenseRating(String defenseRating) {
		this.defenseRating = defenseRating;
	}
	
	/**
	 * @return the layout
	 */
	public String getLayout() {
		return layout;
	}
	/**
	 * @param layout the layout to set
	 */
	public void setLayout(String layout) {
		this.layout = layout;
	}
	/**
	 * @return the exportName
	 */
	public String getExportName() {
		return exportName;
	}
	/**
	 * @param exportName the exportName to set
	 */
	public void setExportName(String exportName) {
		this.exportName = exportName;
	}
	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public int getAlgaeRemove() {
		return algaeRemove;
	}

	public void setAlgaeRemove(int algaeRemove) {
		this.algaeRemove = algaeRemove;
	}

	public int getAlgaePickups() {
		return algaePickups;
	}

	public void setAlgaePickups(int algaePickups) {
		this.algaePickups = algaePickups;
	}

	public int getCoralPickups() {
		return coralPickups;
	}

	public void setCoralPickups(int coralPickups) {
		this.coralPickups = coralPickups;
	}
}

