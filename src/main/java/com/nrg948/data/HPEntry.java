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
	private String scouterName;
    private int matchNumber;
    private int redHPTeam;
    private int blueHPTeam;
    private boolean replay;
    private String matchType;
    private int redScore;
    private int blueScore;
    private int redMiss;
    private int blueMiss;
    private int redNetAlgae;
    private int blueNetAlgae;
    private double dataQuality;
    private String comments;
    private String layout;
    private String exportName;
    private String timestamp;

    // Getters and setters
    public String getScouterName() {
        return scouterName;
    }

    public void setScouterName(String scouterName) {
        this.scouterName = scouterName;
    }

    public int getMatchNumber() {
        return matchNumber;
    }

    public void setMatchNumber(int matchNumber) {
        this.matchNumber = matchNumber;
    }

    public int getRedHPTeam() {
        return redHPTeam;
    }

    public void setRedHPTeam(int redHPTeam) {
        this.redHPTeam = redHPTeam;
    }

    public int getBlueHPTeam() {
        return blueHPTeam;
    }

    public void setBlueHPTeam(int blueHPTeam) {
        this.blueHPTeam = blueHPTeam;
    }

    public boolean isReplay() {
        return replay;
    }

    public void setReplay(boolean replay) {
        this.replay = replay;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public int getRedScore() {
        return redScore;
    }

    public void setRedScore(int redScore) {
        this.redScore = redScore;
    }

    public int getBlueScore() {
        return blueScore;
    }

    public void setBlueScore(int blueScore) {
        this.blueScore = blueScore;
    }

    public int getRedMiss() {
        return redMiss;
    }

    public void setRedMiss(int redMiss) {
        this.redMiss = redMiss;
    }

    public int getBlueMiss() {
        return blueMiss;
    }

    public void setBlueMiss(int blueMiss) {
        this.blueMiss = blueMiss;
    }

    public int getRedNetAlgae() {
        return redNetAlgae;
    }

    public void setRedNetAlgae(int redNetAlgae) {
        this.redNetAlgae = redNetAlgae;
    }

    public int getBlueNetAlgae() {
        return blueNetAlgae;
    }

    public void setBlueNetAlgae(int blueNetAlgae) {
        this.blueNetAlgae = blueNetAlgae;
    }

    public double getDataQuality() {
        return dataQuality;
    }

    public void setDataQuality(double dataQuality) {
        this.dataQuality = dataQuality;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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
}

