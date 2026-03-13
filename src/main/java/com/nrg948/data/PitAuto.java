package com.nrg948.data;

import jakarta.persistence.Embeddable;

@Embeddable
public class PitAuto {
	private int[] autoFuelScored;
	private PitAutoPath[] autoPath;
	
	public int[] getAutoFuelScored() {
		return autoFuelScored;
	}
	
	public void setAutoFuelScored(int[] autoFuelScored) {
		this.autoFuelScored = autoFuelScored;
	}
	
	public PitAutoPath[] getAutoPath() {
		return autoPath;
	}
	
	public void setAutoPath(PitAutoPath[] autoPath) {
		this.autoPath = autoPath;
	}
}
