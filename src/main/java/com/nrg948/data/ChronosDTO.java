package com.nrg948.data;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jakarta.persistence.ElementCollection;

public class ChronosDTO {
    private String scouterName;
    private int matchNumber;
    private int teamNumber;
    private boolean replay;
    private String matchType;
    private String driverStation;
    private double rating;
    /**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(double rating) {
		this.rating = rating;
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
	 * @return the autoEventList
	 */
	public List<ChronosEvent> getAutoEventList() {
		return autoEventList;
	}
	/**
	 * @param autoEventList the autoEventList to set
	 */
	public void setAutoEventList(List<ChronosEvent> autoEventList) {
		this.autoEventList = autoEventList;
	}
	/**
	 * @return the teleopEventList
	 */
	public List<ChronosEvent> getTeleopEventList() {
		return teleopEventList;
	}
	/**
	 * @param teleopEventList the teleopEventList to set
	 */
	public void setTeleopEventList(List<ChronosEvent> teleopEventList) {
		this.teleopEventList = teleopEventList;
	}
	/**
	 * @return the generalStrategy
	 */
	public String getGeneralStrategy() {
		return generalStrategy;
	}
	/**
	 * @param generalStrategy the generalStrategy to set
	 */
	public void setGeneralStrategy(String generalStrategy) {
		this.generalStrategy = generalStrategy;
	}
	/**
	 * @return the dataQuality
	 */
	public double getDataQuality() {
		return dataQuality;
	}
	/**
	 * @param dataQuality the dataQuality to set
	 */
	public void setDataQuality(double dataQuality) {
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
	private String startingPosition;
	@JsonSerialize(contentUsing = ChronosSerializer.class) // Using the custom serializer for the Event list
	@ElementCollection
    private List<ChronosEvent> autoEventList;
	@ElementCollection
	@JsonSerialize(contentUsing = ChronosSerializer.class) // Using the custom serializer for the Event list
    private List<ChronosEvent> teleopEventList;
    private String generalStrategy;
    private double dataQuality;
    private String comments;
    private String layout;
    private String exportName;
    private String timestamp;
}

