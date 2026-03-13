package com.nrg948.data;

import jakarta.persistence.Embedded;

public class PitDTO {

    private int teamNumber;
    private String teamName;
    private int fuelCapacity;
    private int bps;
    private int weight;
    private int width;
    private int length;
    private String drivetrain;
    private String mechanisms;
    private String shooterType;
    private String intakeType;
    @Embedded
    private PitAuto pitAuto;
    private String canGoBump;
    private String canGoTrench;
    private String canShootTrench;
    private String canShootHub;
    private String canShootTower;
    private String canShootAnywhere;
    private String canFeed;
    private String canDefend;
    private String canHoard;
    private String canPass;
    private String canPushOverBump;
    private String canPushThroughTrench;
    private int cycleTime;
    private String canShootEndgame;
    @Embedded
    private PitClimb climb;
    private String layout;
    private String exportName;
    private String timestamp;
    
    public int getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getBps() {
        return bps;
    }

    public void setBps(int bps) {
        this.bps = bps;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDrivetrain() {
        return drivetrain;
    }

    public void setDrivetrain(String drivetrain) {
        this.drivetrain = drivetrain;
    }

    public String getMechanisms() {
        return mechanisms;
    }

    public void setMechanisms(String mechanisms) {
        this.mechanisms = mechanisms;
    }

    public String getShooterType() {
        return shooterType;
    }

    public void setShooterType(String shooterType) {
        this.shooterType = shooterType;
    }

    public String getIntakeType() {
        return intakeType;
    }

    public void setIntakeType(String intakeType) {
        this.intakeType = intakeType;
    }

    public PitAuto getPitAuto() {
        return pitAuto;
    }

    public void setPitAuto(PitAuto pitAuto) {
        this.pitAuto = pitAuto;
    }

    public String getCanGoBump() {
        return canGoBump;
    }

    public void setCanGoBump(String canGoBump) {
        this.canGoBump = canGoBump;
    }

    public String getCanGoTrench() {
        return canGoTrench;
    }

    public void setCanGoTrench(String canGoTrench) {
        this.canGoTrench = canGoTrench;
    }

    public String getCanShootTrench() {
        return canShootTrench;
    }

    public void setCanShootTrench(String canShootTrench) {
        this.canShootTrench = canShootTrench;
    }

    public String getCanShootHub() {
        return canShootHub;
    }

    public void setCanShootHub(String canShootHub) {
        this.canShootHub = canShootHub;
    }

    public String getCanShootTower() {
        return canShootTower;
    }

    public void setCanShootTower(String canShootTower) {
        this.canShootTower = canShootTower;
    }

    public String getCanShootAnywhere() {
        return canShootAnywhere;
    }

    public void setCanShootAnywhere(String canShootAnywhere) {
        this.canShootAnywhere = canShootAnywhere;
    }

    public String getCanFeed() {
        return canFeed;
    }

    public void setCanFeed(String canFeed) {
        this.canFeed = canFeed;
    }

    public String getCanDefend() {
        return canDefend;
    }

    public void setCanDefend(String canDefend) {
        this.canDefend = canDefend;
    }

    public String getCanHoard() {
        return canHoard;
    }

    public void setCanHoard(String canHoard) {
        this.canHoard = canHoard;
    }

    public String getCanPass() {
        return canPass;
    }

    public void setCanPass(String canPass) {
        this.canPass = canPass;
    }

    public String getCanPushOverBump() {
        return canPushOverBump;
    }

    public void setCanPushOverBump(String canPushOverBump) {
        this.canPushOverBump = canPushOverBump;
    }

    public String getCanPushThroughTrench() {
        return canPushThroughTrench;
    }

    public void setCanPushThroughTrench(String canPushThroughTrench) {
        this.canPushThroughTrench = canPushThroughTrench;
    }

    public int getCycleTime() {
        return cycleTime;
    }

    public void setCycleTime(int cycleTime) {
        this.cycleTime = cycleTime;
    }

    public String getCanShootEndgame() {
        return canShootEndgame;
    }

    public void setCanShootEndgame(String canShootEndgame) {
        this.canShootEndgame = canShootEndgame;
    }

    public PitClimb getClimb() {
        return climb;
    }

    public void setClimb(PitClimb climb) {
        this.climb = climb;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getExportName() {
        return exportName;
    }

    public void setExportName(String exportName) {
        this.exportName = exportName;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
