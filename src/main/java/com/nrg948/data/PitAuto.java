package com.nrg948.data;

import jakarta.persistence.Embeddable;

@Embeddable
public class PitAuto {
	private String[] autoCS;
	private String[] autoCoralScored;
	private String[] autoAlgaeRemoved;
	private String autoCoralScoredL1;
	private boolean dropsAlgaeAuto;
	/**
	 * @return the autoCS
	 */
	public String[] getAutoCS() {
		return autoCS;
	}
	/**
	 * @param autoCS the autoCS to set
	 */
	public void setAutoCS(String[] autoCS) {
		this.autoCS = autoCS;
	}
	/**
	 * @return the autoCoralScored
	 */
	public String[] getAutoCoralScored() {
		return autoCoralScored;
	}
	/**
	 * @param autoCoralScored the autoCoralScored to set
	 */
	public void setAutoCoralScored(String[] autoCoralScored) {
		this.autoCoralScored = autoCoralScored;
	}
	/**
	 * @return the autoAlgaeRemoved
	 */
	public String[] getAutoAlgaeRemoved() {
		return autoAlgaeRemoved;
	}
	/**
	 * @param autoAlgaeRemoved the autoAlgaeRemoved to set
	 */
	public void setAutoAlgaeRemoved(String[] autoAlgaeRemoved) {
		this.autoAlgaeRemoved = autoAlgaeRemoved;
	}
	/**
	 * @return the autoCoralScoredL1
	 */
	public String getAutoCoralScoredL1() {
		return autoCoralScoredL1;
	}
	/**
	 * @param autoCoralScoredL1 the autoCoralScoredL1 to set
	 */
	public void setAutoCoralScoredL1(String autoCoralScoredL1) {
		this.autoCoralScoredL1 = autoCoralScoredL1;
	}
	/**
	 * @return the dropsAlgaeAuto
	 */
	public boolean isDropsAlgaeAuto() {
		return dropsAlgaeAuto;
	}
	/**
	 * @param dropsAlgaeAuto the dropsAlgaeAuto to set
	 */
	public void setDropsAlgaeAuto(boolean dropsAlgaeAuto) {
		this.dropsAlgaeAuto = dropsAlgaeAuto;
	}
}
