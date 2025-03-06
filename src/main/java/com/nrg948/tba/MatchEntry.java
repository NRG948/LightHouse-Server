package com.nrg948.tba;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.transaction.Transactional;

@Entity
@Transactional
public class MatchEntry {
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
	private String keyy;
	private String compLevel;
	private int setNumber;
	private int matchNumber;
	private MatchAlliances alliances;
	private String winningAlliance;
	private String eventKey;
	private long time;
	private long actualTime;
	private long predictedTime;
	private long postResultTime;
	@OneToOne(cascade = CascadeType.ALL)
	private ScoreBreakdown2025 scoreBreakdown;
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
	/**
	 * @return the comp_level
	 */
	public String getComp_level() {
		return compLevel;
	}
	/**
	 * @param comp_level the comp_level to set
	 */
	public void setComp_level(String comp_level) {
		this.compLevel = comp_level;
	}
	/**
	 * @return the set_number
	 */
	public int getSet_number() {
		return setNumber;
	}
	/**
	 * @param set_number the set_number to set
	 */
	public void setSet_number(int set_number) {
		this.setNumber = set_number;
	}
	/**
	 * @return the match_number
	 */
	public int getMatch_number() {
		return matchNumber;
	}
	/**
	 * @param match_number the match_number to set
	 */
	public void setMatch_number(int match_number) {
		this.matchNumber = match_number;
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
		return winningAlliance;
	}
	/**
	 * @param winning_alliances the winning_alliances to set
	 */
	public void setWinning_alliance(String winning_alliance) {
		this.winningAlliance = winning_alliance;
	}
	/**
	 * @return the event_key
	 */
	public String getEvent_key() {
		return eventKey;
	}
	/**
	 * @param event_key the event_key to set
	 */
	public void setEvent_key(String event_key) {
		this.eventKey = event_key;
	}
	/**
	 * @return the time
	 */
	public long getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(long time) {
		this.time = time;
	}
	/**
	 * @return the actual_time
	 */
	public long getActual_time() {
		return actualTime;
	}
	/**
	 * @param actual_time the actual_time to set
	 */
	public void setActual_time(long actual_time) {
		this.actualTime = actual_time;
	}
	/**
	 * @return the predicted_time
	 */
	public long getPredicted_time() {
		return predictedTime;
	}
	/**
	 * @param predicted_time the predicted_time to set
	 */
	public void setPredicted_time(long predicted_time) {
		this.predictedTime = predicted_time;
	}
	/**
	 * @return the post_result_time
	 */
	public long getPost_result_time() {
		return postResultTime;
	}
	/**
	 * @param post_result_time the post_result_time to set
	 */
	public void setPost_result_time(long post_result_time) {
		this.postResultTime = post_result_time;
	}
	/**
	 * @return the score_breakdown
	 */
	public ScoreBreakdown2025 getScore_breakdown() {
		return scoreBreakdown;
	}
	/**
	 * @param score_breakdown the score_breakdown to set
	 */
	public void setScore_breakdown(ScoreBreakdown2025 score_breakdown) {
		this.scoreBreakdown = score_breakdown;
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
	@ElementCollection
	private Video[] videos;
}
