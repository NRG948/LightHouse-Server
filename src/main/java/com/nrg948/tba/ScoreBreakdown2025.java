package com.nrg948.tba;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ScoreBreakdown2025 {
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
