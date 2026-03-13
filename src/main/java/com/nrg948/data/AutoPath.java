package com.nrg948.data;

public class AutoPath {
    private Object[] path;
    private boolean attemptedClimb;
    private boolean climbSuccessful;
    private Object climbLevel;

    public AutoPath() {}

    public Object[] getPath() {
        return path;
    }

    public void setPath(Object[] path) {
        this.path = path;
    }

    public boolean isAttemptedClimb() {
        return attemptedClimb;
    }

    public void setAttemptedClimb(boolean attemptedClimb) {
        this.attemptedClimb = attemptedClimb;
    }

    public boolean isClimbSuccessful() {
        return climbSuccessful;
    }

    public void setClimbSuccessful(boolean climbSuccessful) {
        this.climbSuccessful = climbSuccessful;
    }

    public Object getClimbLevel() {
        return climbLevel;
    }

    public void setClimbLevel(Object climbLevel) {
        this.climbLevel = climbLevel;
    }
}
