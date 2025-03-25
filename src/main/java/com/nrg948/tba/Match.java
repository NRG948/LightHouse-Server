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
