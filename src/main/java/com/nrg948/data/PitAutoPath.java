package com.nrg948.data;

import jakarta.persistence.Embeddable;

@Embeddable
public class PitAutoPath {
	private Object[] path;
	private boolean attemptedClimb;
	private boolean climbSuccessful;
	private String climbLevel;
	
	public Object[] getPath() {
		return path;
	}
	
	public void setPath(Object[] path) {
		this.path = path;
	}
	
	public boolean getAttemptedClimb() {
		return attemptedClimb;
	}
	
	public void setAttemptedClimb(boolean attemptedClimb) {
		this.attemptedClimb = attemptedClimb;
	}
	
	public boolean getClimbSuccessful() {
		return climbSuccessful;
	}
	
	public void setClimbSuccessful(boolean climbSuccessful) {
		this.climbSuccessful = climbSuccessful;
	}
	
	public String getClimbLevel() {
		return climbLevel;
	}
	
	public void setClimbLevel(String climbLevel) {
		this.climbLevel = climbLevel;
	}
}
