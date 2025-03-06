package com.nrg948.tba;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

public class Match {
	private String key;
	private String comp_level;
	private int set_number;
	private int match_number;
	private MatchAlliances alliances;
	private String winning_alliance;
	private String event_key;
	private long time;
	private long actual_time;
	private long predicted_time;
	private long post_result_time;
	private ScoreBreakdown2025 score_breakdown;
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * @return the comp_level
	 */
	public String getComp_level() {
		return comp_level;
	}
	/**
	 * @param comp_level the comp_level to set
	 */
	public void setComp_level(String comp_level) {
		this.comp_level = comp_level;
	}
	/**
	 * @return the set_number
	 */
	public int getSet_number() {
		return set_number;
	}
	/**
	 * @param set_number the set_number to set
	 */
	public void setSet_number(int set_number) {
		this.set_number = set_number;
	}
	/**
	 * @return the match_number
	 */
	public int getMatch_number() {
		return match_number;
	}
	/**
	 * @param match_number the match_number to set
	 */
	public void setMatch_number(int match_number) {
		this.match_number = match_number;
	}
	/**
	 * @return the alliances
	 */
	public MatchAlliances getAlliances() {
		return alliances;
	}
	/**
	 * @param alliances the alliances to set
	 */
	public void setAlliances(MatchAlliances alliances) {
		this.alliances = alliances;
	}
	/**
	 * @return the winning_alliances
	 */
	public String getWinning_alliance() {
		return winning_alliance;
	}
	/**
	 * @param winning_alliances the winning_alliances to set
	 */
	public void setWinning_alliances(String winning_alliance) {
		this.winning_alliance = winning_alliance;
	}
	/**
	 * @return the event_key
	 */
	public String getEvent_key() {
		return event_key;
	}
	/**
	 * @param event_key the event_key to set
	 */
	public void setEvent_key(String event_key) {
		this.event_key = event_key;
	}
	/**
	 * @return the time
	 */
	public long getTime() {
		return time;
	}
	/**
	 * @param time the ti value doesnt get mappedme to set
	 */
	public void setTime(long time) {
		this.time = time;
	}
	/**
	 * @return the actual_time
	 */
	public long getActual_time() {
		return actual_time;
	}
	/**
	 * @param actual_time the actual_time to set
	 */
	public void setActual_time(long actual_time) {
		this.actual_time = actual_time;
	}
	/**
	 * @return the predicted_time
	 */
	public long getPredicted_time() {
		return predicted_time;
	}
	/**
	 * @param predicted_time the predicted_time to set
	 */
	public void setPredicted_time(long predicted_time) {
		this.predicted_time = predicted_time;
	}
	/**
	 * @return the post_result_time
	 */
	public long getPost_result_time() {
		return post_result_time;
	}
	/**
	 * @param post_result_time the post_result_time to set
	 */
	public void setPost_result_time(long post_result_time) {
		this.post_result_time = post_result_time;
	}
	/**
	 * @return the score_breakdown
	 */
	public ScoreBreakdown2025 getScore_breakdown() {
		return score_breakdown;
	}
	/**
	 * @param score_breakdown the score_breakdown to set
	 */
	public void setScore_breakdown(ScoreBreakdown2025 score_breakdown) {
		this.score_breakdown = score_breakdown;
	}
	/**
	 * @return the videos
	 */
	public Video[] getVideos() {
		return videos;
	}
	/**
	 * @param videos the videos to set
	 */
	public void setVideos(Video[] videos) {
		this.videos = videos;
	}
	private Video[] videos;
}

@Entity
class MatchAlliances {
	private @Id @GeneratedValue Long id;
	/**
	 * @return the red
	 */
	public RedMatchAlliance getRed() {
		return red;
	}
	/**
	 * @param red the red to set
	 */
	public void setRed(RedMatchAlliance red) {
		this.red = red;
	}
	/**
	 * @return the blue
	 */
	public BlueMatchAlliance getBlue() {
		return blue;
	}
	/**
	 * @param blue the blue to set
	 */
	public void setBlue(BlueMatchAlliance blue) {
		this.blue = blue;
	}
	@OneToOne(cascade = CascadeType.ALL)
    private RedMatchAlliance red;
	@OneToOne(cascade = CascadeType.ALL)
	private BlueMatchAlliance blue;
}

@Entity
class RedMatchAlliance {
	private @Id @GeneratedValue Long id;
	private int score;
	private String[] team_keys;
	private String[] surrogate_team_keys;
	private String[] dq_team_keys;
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	/**
	 * @return the team_keys
	 */
	public String[] getTeam_keys() {
		return team_keys;
	}
	/**
	 * @param team_keys the team_keys to set
	 */
	public void setTeam_keys(String[] team_keys) {
		this.team_keys = team_keys;
	}
	/**
	 * @return the surrogate_team_keys
	 */
	public String[] getSurrogate_team_keys() {
		return surrogate_team_keys;
	}
	/**
	 * @param surrogate_team_keys the surrogate_team_keys to set
	 */
	public void setSurrogate_team_keys(String[] surrogate_team_keys) {
		this.surrogate_team_keys = surrogate_team_keys;
	}
	/**
	 * @return the dq_team_keys
	 */
	public String[] getDq_team_keys() {
		return dq_team_keys;
	}
	/**
	 * @param dq_team_keys the dq_team_keys to set
	 */
	public void setDq_team_keys(String[] dq_team_keys) {
		this.dq_team_keys = dq_team_keys;
	}
}
@Entity
class BlueMatchAlliance {
	private @Id @GeneratedValue Long id;
	private int score;
	private String[] team_keys;
	private String[] surrogate_team_keys;
	private String[] dq_team_keys;
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	/**
	 * @return the team_keys
	 */
	public String[] getTeam_keys() {
		return team_keys;
	}
	/**
	 * @param team_keys the team_keys to set
	 */
	public void setTeam_keys(String[] team_keys) {
		this.team_keys = team_keys;
	}
	/**
	 * @return the surrogate_team_keys
	 */
	public String[] getSurrogate_team_keys() {
		return surrogate_team_keys;
	}
	/**
	 * @param surrogate_team_keys the surrogate_team_keys to set
	 */
	public void setSurrogate_team_keys(String[] surrogate_team_keys) {
		this.surrogate_team_keys = surrogate_team_keys;
	}
	/**
	 * @return the dq_team_keys
	 */
	public String[] getDq_team_keys() {
		return dq_team_keys;
	}
	/**
	 * @param dq_team_keys the dq_team_keys to set
	 */
	public void setDq_team_keys(String[] dq_team_keys) {
		this.dq_team_keys = dq_team_keys;
	}
}

@Embeddable
class Video {
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the key
	 */
	public String getKey() {
		return keyy;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.keyy = key;
	}
	private String type;
	@JsonProperty("key")
	private String keyy;
}

@Entity
class ScoreBreakdown2025 {
	@OneToOne(cascade = CascadeType.ALL)
	private RedScoreBreakdownAlliance2025 red;
	@OneToOne(cascade = CascadeType.ALL)
	private BlueScoreBreakdownAlliance2025 blue;
	private @GeneratedValue @Id Long id;
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
	/**
	 * @return the red
	 */
	public RedScoreBreakdownAlliance2025 getRed() {
		return red;
	}
	/**
	 * @param red the red to set
	 */
	public void setRed(RedScoreBreakdownAlliance2025 red) {
		this.red = red;
	}
	/**
	 * @return the blue
	 */
	public BlueScoreBreakdownAlliance2025 getBlue() {
		return blue;
	}
	/**
	 * @param blue the blue to set
	 */
	public void setBlue(BlueScoreBreakdownAlliance2025 blue) {
		this.blue = blue;
	}
}

@Entity
class RedScoreBreakdownAlliance2025 {
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

@Entity
class BlueScoreBreakdownAlliance2025 {
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

@Entity
class ReefInfo {
	private @Id @GeneratedValue Long id;
	@OneToOne(cascade = CascadeType.ALL)
	private TopNodesInfo topRow;
	@OneToOne(cascade = CascadeType.ALL)
	private MidNodesInfo midRow;
	@OneToOne(cascade = CascadeType.ALL)
	private BotNodesInfo botRow;
	/**
	 * @return the topRow
	 */
	public TopNodesInfo getTopRow() {
		return topRow;
	}
	/**
	 * @param topRow the topRow to set
	 */
	public void setTopRow(TopNodesInfo topRow) {
		this.topRow = topRow;
	}
	/**
	 * @return the midRow
	 */
	public MidNodesInfo getMidRow() {
		return midRow;
	}
	/**
	 * @param midRow the midRow to set
	 */
	public void setMidRow(MidNodesInfo midRow) {
		this.midRow = midRow;
	}
	/**
	 * @return the botRow
	 */
	public BotNodesInfo getBotRow() {
		return botRow;
	}
	/**
	 * @param botRow the botRow to set
	 */
	public void setBotRow(BotNodesInfo botRow) {
		this.botRow = botRow;
	}
	/**
	 * @return the trough
	 */
	public int getTrough() {
		return trough;
	}
	/**
	 * @param trough the trough to set
	 */
	public void setTrough(int trough) {
		this.trough = trough;
	}
	/**
	 * @return the tba_botRowCount
	 */
	public int getTba_botRowCount() {
		return tba_botRowCount;
	}
	/**
	 * @param tba_botRowCount the tba_botRowCount to set
	 */
	public void setTba_botRowCount(int tba_botRowCount) {
		this.tba_botRowCount = tba_botRowCount;
	}
	/**
	 * @return the tba_midRowCount
	 */
	public int getTba_midRowCount() {
		return tba_midRowCount;
	}
	/**
	 * @param tba_midRowCount the tba_midRowCount to set
	 */
	public void setTba_midRowCount(int tba_midRowCount) {
		this.tba_midRowCount = tba_midRowCount;
	}
	/**
	 * @return the tba_topRowCount
	 */
	public int getTba_topRowCount() {
		return tba_topRowCount;
	}
	/**
	 * @param tba_topRowCount the tba_topRowCount to set
	 */
	public void setTba_topRowCount(int tba_topRowCount) {
		this.tba_topRowCount = tba_topRowCount;
	}
	private int trough;
	private int tba_botRowCount;
	private int tba_midRowCount;
	private int tba_topRowCount;
}

@Entity
class TopNodesInfo {
	private @Id @GeneratedValue Long id;
	/**
	 * @return the nodeA
	 */
	public boolean isNodeA() {
		return nodeA;
	}
	/**
	 * @param nodeA the nodeA to set
	 */
	public void setNodeA(boolean nodeA) {
		this.nodeA = nodeA;
	}
	/**
	 * @return the nodeB
	 */
	public boolean isNodeB() {
		return nodeB;
	}
	/**
	 * @param nodeB the nodeB to set
	 */
	public void setNodeB(boolean nodeB) {
		this.nodeB = nodeB;
	}
	/**
	 * @return the nodeC
	 */
	public boolean isNodeC() {
		return nodeC;
	}
	/**
	 * @param nodeC the nodeC to set
	 */
	public void setNodeC(boolean nodeC) {
		this.nodeC = nodeC;
	}
	/**
	 * @return the nodeD
	 */
	public boolean isNodeD() {
		return nodeD;
	}
	/**
	 * @param nodeD the nodeD to set
	 */
	public void setNodeD(boolean nodeD) {
		this.nodeD = nodeD;
	}
	/**
	 * @return the nodeE
	 */
	public boolean isNodeE() {
		return nodeE;
	}
	/**
	 * @param nodeE the nodeE to set
	 */
	public void setNodeE(boolean nodeE) {
		this.nodeE = nodeE;
	}
	/**
	 * @return the nodeF
	 */
	public boolean isNodeF() {
		return nodeF;
	}
	/**
	 * @param nodeF the nodeF to set
	 */
	public void setNodeF(boolean nodeF) {
		this.nodeF = nodeF;
	}
	/**
	 * @return the nodeG
	 */
	public boolean isNodeG() {
		return nodeG;
	}
	/**
	 * @param nodeG the nodeG to set
	 */
	public void setNodeG(boolean nodeG) {
		this.nodeG = nodeG;
	}
	/**
	 * @return the nodeH
	 */
	public boolean isNodeH() {
		return nodeH;
	}
	/**
	 * @param nodeH the nodeH to set
	 */
	public void setNodeH(boolean nodeH) {
		this.nodeH = nodeH;
	}
	/**
	 * @return the nodeI
	 */
	public boolean isNodeI() {
		return nodeI;
	}
	/**
	 * @param nodeI the nodeI to set
	 */
	public void setNodeI(boolean nodeI) {
		this.nodeI = nodeI;
	}
	/**
	 * @return the nodeJ
	 */
	public boolean isNodeJ() {
		return nodeJ;
	}
	/**
	 * @param nodeJ the nodeJ to set
	 */
	public void setNodeJ(boolean nodeJ) {
		this.nodeJ = nodeJ;
	}
	/**
	 * @return the nodeK
	 */
	public boolean isNodeK() {
		return nodeK;
	}
	/**
	 * @param nodeK the nodeK to set
	 */
	public void setNodeK(boolean nodeK) {
		this.nodeK = nodeK;
	}
	/**
	 * @return the nodeL
	 */
	public boolean isNodeL() {
		return nodeL;
	}
	/**
	 * @param nodeL the nodeL to set
	 */
	public void setNodeL(boolean nodeL) {
		this.nodeL = nodeL;
	}
	private boolean nodeA;
	private boolean nodeB;
	private boolean nodeC;
	private boolean nodeD;
	private boolean nodeE;
	private boolean nodeF;
	private boolean nodeG;
	private boolean nodeH;
	private boolean nodeI;
	private boolean nodeJ;
	private boolean nodeK;
	private boolean nodeL;
}
@Entity
class MidNodesInfo {
	private @Id @GeneratedValue Long id;
	/**
	 * @return the nodeA
	 */
	public boolean isNodeA() {
		return nodeA;
	}
	/**
	 * @param nodeA the nodeA to set
	 */
	public void setNodeA(boolean nodeA) {
		this.nodeA = nodeA;
	}
	/**
	 * @return the nodeB
	 */
	public boolean isNodeB() {
		return nodeB;
	}
	/**
	 * @param nodeB the nodeB to set
	 */
	public void setNodeB(boolean nodeB) {
		this.nodeB = nodeB;
	}
	/**
	 * @return the nodeC
	 */
	public boolean isNodeC() {
		return nodeC;
	}
	/**
	 * @param nodeC the nodeC to set
	 */
	public void setNodeC(boolean nodeC) {
		this.nodeC = nodeC;
	}
	/**
	 * @return the nodeD
	 */
	public boolean isNodeD() {
		return nodeD;
	}
	/**
	 * @param nodeD the nodeD to set
	 */
	public void setNodeD(boolean nodeD) {
		this.nodeD = nodeD;
	}
	/**
	 * @return the nodeE
	 */
	public boolean isNodeE() {
		return nodeE;
	}
	/**
	 * @param nodeE the nodeE to set
	 */
	public void setNodeE(boolean nodeE) {
		this.nodeE = nodeE;
	}
	/**
	 * @return the nodeF
	 */
	public boolean isNodeF() {
		return nodeF;
	}
	/**
	 * @param nodeF the nodeF to set
	 */
	public void setNodeF(boolean nodeF) {
		this.nodeF = nodeF;
	}
	/**
	 * @return the nodeG
	 */
	public boolean isNodeG() {
		return nodeG;
	}
	/**
	 * @param nodeG the nodeG to set
	 */
	public void setNodeG(boolean nodeG) {
		this.nodeG = nodeG;
	}
	/**
	 * @return the nodeH
	 */
	public boolean isNodeH() {
		return nodeH;
	}
	/**
	 * @param nodeH the nodeH to set
	 */
	public void setNodeH(boolean nodeH) {
		this.nodeH = nodeH;
	}
	/**
	 * @return the nodeI
	 */
	public boolean isNodeI() {
		return nodeI;
	}
	/**
	 * @param nodeI the nodeI to set
	 */
	public void setNodeI(boolean nodeI) {
		this.nodeI = nodeI;
	}
	/**
	 * @return the nodeJ
	 */
	public boolean isNodeJ() {
		return nodeJ;
	}
	/**
	 * @param nodeJ the nodeJ to set
	 */
	public void setNodeJ(boolean nodeJ) {
		this.nodeJ = nodeJ;
	}
	/**
	 * @return the nodeK
	 */
	public boolean isNodeK() {
		return nodeK;
	}
	/**
	 * @param nodeK the nodeK to set
	 */
	public void setNodeK(boolean nodeK) {
		this.nodeK = nodeK;
	}
	/**
	 * @return the nodeL
	 */
	public boolean isNodeL() {
		return nodeL;
	}
	/**
	 * @param nodeL the nodeL to set
	 */
	public void setNodeL(boolean nodeL) {
		this.nodeL = nodeL;
	}
	private boolean nodeA;
	private boolean nodeB;
	private boolean nodeC;
	private boolean nodeD;
	private boolean nodeE;
	private boolean nodeF;
	private boolean nodeG;
	private boolean nodeH;
	private boolean nodeI;
	private boolean nodeJ;
	private boolean nodeK;
	private boolean nodeL;
}
@Entity
class BotNodesInfo {
	private @Id @GeneratedValue Long id;
	/**
	 * @return the nodeA
	 */
	public boolean isNodeA() {
		return nodeA;
	}
	/**
	 * @param nodeA the nodeA to set
	 */
	public void setNodeA(boolean nodeA) {
		this.nodeA = nodeA;
	}
	/**
	 * @return the nodeB
	 */
	public boolean isNodeB() {
		return nodeB;
	}
	/**
	 * @param nodeB the nodeB to set
	 */
	public void setNodeB(boolean nodeB) {
		this.nodeB = nodeB;
	}
	/**
	 * @return the nodeC
	 */
	public boolean isNodeC() {
		return nodeC;
	}
	/**
	 * @param nodeC the nodeC to set
	 */
	public void setNodeC(boolean nodeC) {
		this.nodeC = nodeC;
	}
	/**
	 * @return the nodeD
	 */
	public boolean isNodeD() {
		return nodeD;
	}
	/**
	 * @param nodeD the nodeD to set
	 */
	public void setNodeD(boolean nodeD) {
		this.nodeD = nodeD;
	}
	/**
	 * @return the nodeE
	 */
	public boolean isNodeE() {
		return nodeE;
	}
	/**
	 * @param nodeE the nodeE to set
	 */
	public void setNodeE(boolean nodeE) {
		this.nodeE = nodeE;
	}
	/**
	 * @return the nodeF
	 */
	public boolean isNodeF() {
		return nodeF;
	}
	/**
	 * @param nodeF the nodeF to set
	 */
	public void setNodeF(boolean nodeF) {
		this.nodeF = nodeF;
	}
	/**
	 * @return the nodeG
	 */
	public boolean isNodeG() {
		return nodeG;
	}
	/**
	 * @param nodeG the nodeG to set
	 */
	public void setNodeG(boolean nodeG) {
		this.nodeG = nodeG;
	}
	/**
	 * @return the nodeH
	 */
	public boolean isNodeH() {
		return nodeH;
	}
	/**
	 * @param nodeH the nodeH to set
	 */
	public void setNodeH(boolean nodeH) {
		this.nodeH = nodeH;
	}
	/**
	 * @return the nodeI
	 */
	public boolean isNodeI() {
		return nodeI;
	}
	/**
	 * @param nodeI the nodeI to set
	 */
	public void setNodeI(boolean nodeI) {
		this.nodeI = nodeI;
	}
	/**
	 * @return the nodeJ
	 */
	public boolean isNodeJ() {
		return nodeJ;
	}
	/**
	 * @param nodeJ the nodeJ to set
	 */
	public void setNodeJ(boolean nodeJ) {
		this.nodeJ = nodeJ;
	}
	/**
	 * @return the nodeK
	 */
	public boolean isNodeK() {
		return nodeK;
	}
	/**
	 * @param nodeK the nodeK to set
	 */
	public void setNodeK(boolean nodeK) {
		this.nodeK = nodeK;
	}
	/**
	 * @return the nodeL
	 */
	public boolean isNodeL() {
		return nodeL;
	}
	/**
	 * @param nodeL the nodeL to set
	 */
	public void setNodeL(boolean nodeL) {
		this.nodeL = nodeL;
	}
	private boolean nodeA;
	private boolean nodeB;
	private boolean nodeC;
	private boolean nodeD;
	private boolean nodeE;
	private boolean nodeF;
	private boolean nodeG;
	private boolean nodeH;
	private boolean nodeI;
	private boolean nodeJ;
	private boolean nodeK;
	private boolean nodeL;
}
