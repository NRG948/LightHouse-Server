package com.nrg948.tba;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class BlueScoreBreakdownAlliance2025 {
	private @Id @GeneratedValue Long id;
	private int adjustPoints;
	private int algaePoints;
	private boolean autoBonusAchieved;
	private int autoCoralCount;
	private int autoCoralPoints;
	private String autoLineRobot1;
	private String autoLineRobot2;
	private String autoLineRobot3;
	private int autoMobilityPoints;
	private int autoPoints;
	@OneToOne(cascade = CascadeType.ALL)
	private ReefInfo autoReef;
	private boolean bargeBonusAchieved;
	private boolean coopertitionCriteriaMet;
	private boolean coralBonusAchieved;
	private int endGameBargePoints;
	private String endGameRobot1;
	private String endGameRobot2;
	private String endGameRobot3;
	private int foulCount;
	private int foulPoints;
	private boolean g206Penalty;
	private boolean g410Penalty;
	private boolean g418Penalty;
	/**
	 * @return the adjustPoints
	 */
	public int getAdjustPoints() {
		return adjustPoints;
	}
	/**
	 * @param adjustPoints the adjustPoints to set
	 */
	public void setAdjustPoints(int adjustPoints) {
		this.adjustPoints = adjustPoints;
	}
	/**
	 * @return the algaePoints
	 */
	public int getAlgaePoints() {
		return algaePoints;
	}
	/**
	 * @param algaePoints the algaePoints to set
	 */
	public void setAlgaePoints(int algaePoints) {
		this.algaePoints = algaePoints;
	}
	/**
	 * @return the autoBonusAchieved
	 */
	public boolean isAutoBonusAchieved() {
		return autoBonusAchieved;
	}
	/**
	 * @param autoBonusAchieved the autoBonusAchieved to set
	 */
	public void setAutoBonusAchieved(boolean autoBonusAchieved) {
		this.autoBonusAchieved = autoBonusAchieved;
	}
	/**
	 * @return the autoCoralCount
	 */
	public int getAutoCoralCount() {
		return autoCoralCount;
	}
	/**
	 * @param autoCoralCount the autoCoralCount to set
	 */
	public void setAutoCoralCount(int autoCoralCount) {
		this.autoCoralCount = autoCoralCount;
	}
	/**
	 * @return the autoCoralPoints
	 */
	public int getAutoCoralPoints() {
		return autoCoralPoints;
	}
	/**
	 * @param autoCoralPoints the autoCoralPoints to set
	 */
	public void setAutoCoralPoints(int autoCoralPoints) {
		this.autoCoralPoints = autoCoralPoints;
	}
	/**
	 * @return the autoLineRobot1
	 */
	public String getAutoLineRobot1() {
		return autoLineRobot1;
	}
	/**
	 * @param autoLineRobot1 the autoLineRobot1 to set
	 */
	public void setAutoLineRobot1(String autoLineRobot1) {
		this.autoLineRobot1 = autoLineRobot1;
	}
	/**
	 * @return the autoLineRobot2
	 */
	public String getAutoLineRobot2() {
		return autoLineRobot2;
	}
	/**
	 * @param autoLineRobot2 the autoLineRobot2 to set
	 */
	public void setAutoLineRobot2(String autoLineRobot2) {
		this.autoLineRobot2 = autoLineRobot2;
	}
	/**
	 * @return the autoLineRobot3
	 */
	public String getAutoLineRobot3() {
		return autoLineRobot3;
	}
	/**
	 * @param autoLineRobot3 the autoLineRobot3 to set
	 */
	public void setAutoLineRobot3(String autoLineRobot3) {
		this.autoLineRobot3 = autoLineRobot3;
	}
	/**
	 * @return the autoMobilityPoints
	 */
	public int getAutoMobilityPoints() {
		return autoMobilityPoints;
	}
	/**
	 * @param autoMobilityPoints the autoMobilityPoints to set
	 */
	public void setAutoMobilityPoints(int autoMobilityPoints) {
		this.autoMobilityPoints = autoMobilityPoints;
	}
	/**
	 * @return the autoPoints
	 */
	public int getAutoPoints() {
		return autoPoints;
	}
	/**
	 * @param autoPoints the autoPoints to set
	 */
	public void setAutoPoints(int autoPoints) {
		this.autoPoints = autoPoints;
	}
	/**
	 * @return the autoReef
	 */
	public ReefInfo getAutoReef() {
		return autoReef;
	}
	/**
	 * @param autoReef the autoReef to set
	 */
	public void setAutoReef(ReefInfo autoReef) {
		this.autoReef = autoReef;
	}
	/**
	 * @return the bargeBonusAchieved
	 */
	public boolean isBargeBonusAchieved() {
		return bargeBonusAchieved;
	}
	/**
	 * @param bargeBonusAchieved the bargeBonusAchieved to set
	 */
	public void setBargeBonusAchieved(boolean bargeBonusAchieved) {
		this.bargeBonusAchieved = bargeBonusAchieved;
	}
	/**
	 * @return the coopertitionCriteriaMet
	 */
	public boolean isCoopertitionCriteriaMet() {
		return coopertitionCriteriaMet;
	}
	/**
	 * @param coopertitionCriteriaMet the coopertitionCriteriaMet to set
	 */
	public void setCoopertitionCriteriaMet(boolean coopertitionCriteriaMet) {
		this.coopertitionCriteriaMet = coopertitionCriteriaMet;
	}
	/**
	 * @return the coralBonusAchieved
	 */
	public boolean isCoralBonusAchieved() {
		return coralBonusAchieved;
	}
	/**
	 * @param coralBonusAchieved the coralBonusAchieved to set
	 */
	public void setCoralBonusAchieved(boolean coralBonusAchieved) {
		this.coralBonusAchieved = coralBonusAchieved;
	}
	/**
	 * @return the endGameBargePoints
	 */
	public int getEndGameBargePoints() {
		return endGameBargePoints;
	}
	/**
	 * @param endGameBargePoints the endGameBargePoints to set
	 */
	public void setEndGameBargePoints(int endGameBargePoints) {
		this.endGameBargePoints = endGameBargePoints;
	}
	/**
	 * @return the endGameRobot1
	 */
	public String getEndGameRobot1() {
		return endGameRobot1;
	}
	/**
	 * @param endGameRobot1 the endGameRobot1 to set
	 */
	public void setEndGameRobot1(String endGameRobot1) {
		this.endGameRobot1 = endGameRobot1;
	}
	/**
	 * @return the endGameRobot2
	 */
	public String getEndGameRobot2() {
		return endGameRobot2;
	}
	/**
	 * @param endGameRobot2 the endGameRobot2 to set
	 */
	public void setEndGameRobot2(String endGameRobot2) {
		this.endGameRobot2 = endGameRobot2;
	}
	/**
	 * @return the endGameRobot3
	 */
	public String getEndGameRobot3() {
		return endGameRobot3;
	}
	/**
	 * @param endGameRobot3 the endGameRobot3 to set
	 */
	public void setEndGameRobot3(String endGameRobot3) {
		this.endGameRobot3 = endGameRobot3;
	}
	/**
	 * @return the foulCount
	 */
	public int getFoulCount() {
		return foulCount;
	}
	/**
	 * @param foulCount the foulCount to set
	 */
	public void setFoulCount(int foulCount) {
		this.foulCount = foulCount;
	}
	/**
	 * @return the foulPoints
	 */
	public int getFoulPoints() {
		return foulPoints;
	}
	/**
	 * @param foulPoints the foulPoints to set
	 */
	public void setFoulPoints(int foulPoints) {
		this.foulPoints = foulPoints;
	}
	/**
	 * @return the g206Penalty
	 */
	public boolean isG206Penalty() {
		return g206Penalty;
	}
	/**
	 * @param g206Penalty the g206Penalty to set
	 */
	public void setG206Penalty(boolean g206Penalty) {
		this.g206Penalty = g206Penalty;
	}
	/**
	 * @return the g410Penalty
	 */
	public boolean isG410Penalty() {
		return g410Penalty;
	}
	/**
	 * @param g410Penalty the g410Penalty to set
	 */
	public void setG410Penalty(boolean g410Penalty) {
		this.g410Penalty = g410Penalty;
	}
	/**
	 * @return the g418Penalty
	 */
	public boolean isG418Penalty() {
		return g418Penalty;
	}
	/**
	 * @param g418Penalty the g418Penalty to set
	 */
	public void setG418Penalty(boolean g418Penalty) {
		this.g418Penalty = g418Penalty;
	}
	/**
	 * @return the g428Penalty
	 */
	public boolean isG428Penalty() {
		return g428Penalty;
	}
	/**
	 * @param g428Penalty the g428Penalty to set
	 */
	public void setG428Penalty(boolean g428Penalty) {
		this.g428Penalty = g428Penalty;
	}
	/**
	 * @return the netAlgaeCount
	 */
	public int getNetAlgaeCount() {
		return netAlgaeCount;
	}
	/**
	 * @param netAlgaeCount the netAlgaeCount to set
	 */
	public void setNetAlgaeCount(int netAlgaeCount) {
		this.netAlgaeCount = netAlgaeCount;
	}
	/**
	 * @return the rp
	 */
	public int getRp() {
		return rp;
	}
	/**
	 * @param rp the rp to set
	 */
	public void setRp(int rp) {
		this.rp = rp;
	}
	/**
	 * @return the techFoulCount
	 */
	public int getTechFoulCount() {
		return techFoulCount;
	}
	/**
	 * @param techFoulCount the techFoulCount to set
	 */
	public void setTechFoulCount(int techFoulCount) {
		this.techFoulCount = techFoulCount;
	}
	/**
	 * @return the teleopCoralCount
	 */
	public int getTeleopCoralCount() {
		return teleopCoralCount;
	}
	/**
	 * @param teleopCoralCount the teleopCoralCount to set
	 */
	public void setTeleopCoralCount(int teleopCoralCount) {
		this.teleopCoralCount = teleopCoralCount;
	}
	/**
	 * @return the teleopCoralPoints
	 */
	public int getTeleopCoralPoints() {
		return teleopCoralPoints;
	}
	/**
	 * @param teleopCoralPoints the teleopCoralPoints to set
	 */
	public void setTeleopCoralPoints(int teleopCoralPoints) {
		this.teleopCoralPoints = teleopCoralPoints;
	}
	/**
	 * @return the teleopPoints
	 */
	public int getTeleopPoints() {
		return teleopPoints;
	}
	/**
	 * @param teleopPoints the teleopPoints to set
	 */
	public void setTeleopPoints(int teleopPoints) {
		this.teleopPoints = teleopPoints;
	}
	/**
	 * @return the teleopReef
	 */
	public ReefInfo getTeleopReef() {
		return teleopReef;
	}
	/**
	 * @param teleopReef the teleopReef to set
	 */
	public void setTeleopReef(ReefInfo teleopReef) {
		this.teleopReef = teleopReef;
	}
	/**
	 * @return the totalPoints
	 */
	public int getTotalPoints() {
		return totalPoints;
	}
	/**
	 * @param totalPoints the totalPoints to set
	 */
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
	/**
	 * @return the wallAlgaeCount
	 */
	public int getWallAlgaeCount() {
		return wallAlgaeCount;
	}
	/**
	 * @param wallAlgaeCount the wallAlgaeCount to set
	 */
	public void setWallAlgaeCount(int wallAlgaeCount) {
		this.wallAlgaeCount = wallAlgaeCount;
	}
	private boolean g428Penalty;
	private int netAlgaeCount;
	private int rp;
	private int techFoulCount;
	private int teleopCoralCount;
	private int teleopCoralPoints;
	private int teleopPoints;
	@OneToOne(cascade = CascadeType.ALL)
	private ReefInfo teleopReef;
	private int totalPoints;
	private int wallAlgaeCount;
}
