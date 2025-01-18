package com.nrg948.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.transaction.Transactional;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"matchType", "replay", "matchNumber", "scouterName"}))
@Transactional
public class HPEntry {
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

    // Setup Page
    private String scouterName;
    private String redHPTeam;
    private String blueHPTeam;
    private String matchType;
    private String matchNumber;
    private String replay;

    // Scoring Page
    private String redScore;
    private String blueScore;
    private String redMiss;
    private String blueMiss;
    private String redNetAlgae;
    private String blueNetAlgae;

    // Getters and Setters
    public String getScouterName() {
        return scouterName;
    }

    public void setScouterName(String scouterName) {
        this.scouterName = scouterName;
    }

    public String getRedHPTeam() {
        return redHPTeam;
    }

    public void setRedHPTeam(String redHPTeam) {
        this.redHPTeam = redHPTeam;
    }

    public String getBlueHPTeam() {
        return blueHPTeam;
    }

    public void setBlueHPTeam(String blueHPTeam) {
        this.blueHPTeam = blueHPTeam;
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

    public String getRedScore() {
        return redScore;
    }

    public void setRedScore(String redScore) {
        this.redScore = redScore;
    }

    public String getBlueScore() {
        return blueScore;
    }

    public void setBlueScore(String blueScore) {
        this.blueScore = blueScore;
    }

    public String getRedMiss() {
        return redMiss;
    }

    public void setRedMiss(String redMiss) {
        this.redMiss = redMiss;
    }

    public String getBlueMiss() {
        return blueMiss;
    }

    public void setBlueMiss(String blueMiss) {
        this.blueMiss = blueMiss;
    }

    public String getRedNetAlgae() {
        return redNetAlgae;
    }

    public void setRedNetAlgae(String redNetAlgae) {
        this.redNetAlgae = redNetAlgae;
    }

    public String getBlueNetAlgae() {
        return blueNetAlgae;
    }

    public void setBlueNetAlgae(String blueNetAlgae) {
        this.blueNetAlgae = blueNetAlgae;
    }
}

