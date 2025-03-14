package com.nrg948.data;

import jakarta.persistence.Embeddable;

@Embeddable
public class PitAuto {
	private boolean bargeCS;
	private boolean processorCS;
	private String[] autoCoralScored;
	private String[] autoAlgaeRemoved;
	private String autoCoralScoredL1;
	private boolean dropsAlgaeAuto;
	private boolean drivesOut;
	private boolean hasNoAuto;
	private boolean groundIntake;
	/**
	 * @return the bargeCS
	 */
	public boolean getBargeCS() {
		return bargeCS;
	}

	/**
	 * @param bargeCS the bargeCS to set
	 */
	public void setBargeCS(boolean bargeCS) {
		this.bargeCS = bargeCS;
	}

	/**
	 * @return the processorCS
	 */
	public boolean getProcessorCS() {
		return processorCS;
	}

	/**
	 * @param processorCS the processorCS to set
	 */
	public void setProcessorCS(boolean processorCS) {
		this.processorCS = processorCS;
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
	/**
	 * @return the drivesOut
	 */
	public boolean isDrivesOut() {
		return drivesOut;
	}
	/**
	 * @param drivesOut the drivesOut to set
	 */
	public void setDrivesOut(boolean drivesOut) {
		this.drivesOut = drivesOut;
	}
	/**
	 * @return the hasNoAuto
	 */
	public boolean getHasNoAuto() {
		return hasNoAuto;
	}

	/**
	 * @param hasNoAuto the hasNoAuto to set
	 */
	public void setHasNoAuto(boolean hasNoAuto) {
		this.hasNoAuto = hasNoAuto;
	}
	/**
	 * @return the groundIntake
	 */
	public boolean getGroundIntake() {
		return groundIntake;
	}

	/**
	 * @param groundIntake the groundIntake to set
	 */
	public void setGroundIntake(boolean groundIntake) {
		this.groundIntake = groundIntake;
	}
}
