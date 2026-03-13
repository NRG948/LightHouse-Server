package com.nrg948.data;

import java.util.ArrayList;
import java.util.List;

public class CycleDataList {
    private List<CycleData> cycles;
    private String keyPrefix;

    public CycleDataList() {
        this.cycles = new ArrayList<>();
        this.keyPrefix = "";
    }

    public CycleDataList(String keyPrefix) {
        this.cycles = new ArrayList<>();
        this.keyPrefix = keyPrefix;
    }

    public CycleDataList(List<CycleData> cycles, String keyPrefix) {
        this.cycles = cycles != null ? cycles : new ArrayList<>();
        this.keyPrefix = keyPrefix;
    }

    public List<CycleData> getCycles() {
        return cycles;
    }

    public void setCycles(List<CycleData> cycles) {
        this.cycles = cycles;
    }

    public String getKeyPrefix() {
        return keyPrefix;
    }

    public void setKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }

    public void add(CycleData cycle) {
        this.cycles.add(cycle);
    }

    public int size() {
        return cycles.size();
    }
}
