package com.nrg948.data;

public class CycleData {
    private String accuracy;
    private String capacity;
    private int duration;

    public CycleData() {}

    public CycleData(String accuracy, String capacity, int duration) {
        this.accuracy = accuracy;
        this.capacity = capacity;
        this.duration = duration;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
