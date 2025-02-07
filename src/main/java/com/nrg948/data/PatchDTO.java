package com.nrg948.data;

public class PatchDTO {
	private String dataType;
	
	private int matchNumber;
	private int teamNumber;
	private boolean replay;
	private String matchType;
	private String driverStation;
	
	/**
	 * @return the dataType
	 */
	public String getDataType() {
		return dataType;
	}
	/**
	 * @param dataType the dataType to set
	 */
	public void setDataType(String dataType) {
		this.dataType = dataType;
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
	public boolean isReplay() {
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
	 * @return the patcher
	 */
	public String getPatcher() {
		return patcher;
	}
	/**
	 * @param patcher the patcher to set
	 */
	public void setPatcher(String patcher) {
		this.patcher = patcher;
	}
	private String comments;
	private String patcher;
}
