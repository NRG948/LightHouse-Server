package com.nrg948.data;

import jakarta.persistence.Embeddable;

@Embeddable
public class PitClimb {
	private boolean attempted;
	private String startTime;
	private String region;
	private String level;
	
	public boolean getAttempted() {
		return attempted;
	}
	
	public void setAttempted(boolean attempted) {
		this.attempted = attempted;
	}
	
	public String getStartTime() {
		return startTime;
	}
	
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public String getRegion() {
		return region;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	public String getLevel() {
		return level;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}
}
