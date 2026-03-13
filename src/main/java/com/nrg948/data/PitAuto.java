package com.nrg948.data;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.FetchType;
import java.util.List;

@Embeddable
public class PitAuto {
	private int[] autoFuelScored;
	@ElementCollection(fetch = FetchType.EAGER)
	private List<PitAutoPath> autoPath;
	
	public int[] getAutoFuelScored() {
		return autoFuelScored;
	}
	
	public void setAutoFuelScored(int[] autoFuelScored) {
		this.autoFuelScored = autoFuelScored;
	}
	
	public List<PitAutoPath> getAutoPath() {
		return autoPath;
	}
	
	public void setAutoPath(List<PitAutoPath> autoPath) {
		this.autoPath = autoPath;
	}
}
