package com.nrg948.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.transaction.Transactional;

@Entity
/*
 * FYI NOT DONE. if modifications to fields are made, modify the findby method in the chronosdatabase
 */
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"scouterName", "matchType", "matchNumber", "replay", "driverStation", "teamNumber"}))
@Transactional
public class ChronosEntry {
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

	private @Id @GeneratedValue Long id;

    // HorizontalTest Page
    private String random;

    // Setup Page
    private String scouterName;
    private String teamNumber;
    private String driverStation;
    private String matchType;
    private String matchNumber;
    private String replay;
    private String startingPosition;
    private String startMatchGuided;

    // Auto Page
    private String idkYetAuto;
    private String shouldThisBeSeparateAuto;

    // Teleop Page
    private String idkYetTeleop;
    private String shouldThisBeSeparateTeleop;

    // Endgame Page
    private String generalStrategy;
    private String dataQuality;
    private String comments;

    // Getters and Setters
    public String getRandom() {
        return random;
    }

    public void setRandom(String random) {
        this.random = random;
    }

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

    public String getStartMatchGuided() {
        return startMatchGuided;
    }

    public void setStartMatchGuided(String startMatchGuided) {
        this.startMatchGuided = startMatchGuided;
    }

    public String getIdkYetAuto() {
        return idkYetAuto;
    }

    public void setIdkYetAuto(String idkYetAuto) {
        this.idkYetAuto = idkYetAuto;
    }

    public String getShouldThisBeSeparateAuto() {
        return shouldThisBeSeparateAuto;
    }

    public void setShouldThisBeSeparateAuto(String shouldThisBeSeparateAuto) {
        this.shouldThisBeSeparateAuto = shouldThisBeSeparateAuto;
    }

    public String getIdkYetTeleop() {
        return idkYetTeleop;
    }

    public void setIdkYetTeleop(String idkYetTeleop) {
        this.idkYetTeleop = idkYetTeleop;
    }

    public String getShouldThisBeSeparateTeleop() {
        return shouldThisBeSeparateTeleop;
    }

    public void setShouldThisBeSeparateTeleop(String shouldThisBeSeparateTeleop) {
        this.shouldThisBeSeparateTeleop = shouldThisBeSeparateTeleop;
    }

    public String getGeneralStrategy() {
        return generalStrategy;
    }

    public void setGeneralStrategy(String generalStrategy) {
        this.generalStrategy = generalStrategy;
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
}

