package com.nrg948.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.transaction.Transactional;
import jakarta.persistence.Transient;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"scouterName", "teamNumber", "driverStation", "matchType", "matchNumber", "replay"}))
@Transactional
public class AtlasEntry {
	private @Id @GeneratedValue Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	private String scouterName;
    private int matchNumber;
    private int teamNumber;
    private boolean replay;
    private String matchType;
    private String driverStation;
    
    @JsonSerialize(using = AutoPathSerializer.class)
    @JsonDeserialize(using = AutoPathDeserializer.class)
    @Transient
    private AutoPath autoPath;
    
    @JsonSerialize(using = CycleDataListSerializer.class)
    @JsonDeserialize(using = CycleDataListDeserializer.class)
    @Transient
    private CycleDataList autoCycles;
    
    private boolean transitionOnshiftIsFeeding;
    private boolean transitionOnshiftIsDisabled;
    private boolean transitionOnshiftIsDefending;
    private boolean firstOnshiftIsFeeding;
    private boolean firstOnshiftIsDisabled;
    private boolean firstOnshiftIsDefending;
    private boolean secondOnshiftIsFeeding;
    private boolean secondOnshiftIsDisabled;
    private boolean secondOnshiftIsDefending;
    
    @JsonSerialize(using = CycleDataListSerializer.class)
    @JsonDeserialize(using = CycleDataListDeserializer.class)
    @Transient
    private CycleDataList transitionOnshiftCycles;
    
    @JsonSerialize(using = CycleDataListSerializer.class)
    @JsonDeserialize(using = CycleDataListDeserializer.class)
    @Transient
    private CycleDataList firstOnshiftCycles;
    
    @JsonSerialize(using = CycleDataListSerializer.class)
    @JsonDeserialize(using = CycleDataListDeserializer.class)
    @Transient
    private CycleDataList secondOnshiftCycles;
    
    private boolean transitionOffshiftIsDisabled;
    private boolean firstOffshiftIsDisabled;
    private boolean secondOffshiftIsDisabled;
    private int dataQuality;
    private String comments;
    
    @Transient
    private CheckboxSelection transitionOffshiftIsDefending;
    @Transient
    private CheckboxSelection transitionOffshiftIsFeeding;
    @Transient
    private CheckboxSelection transitionOffshiftIsStealing;
    @Transient
    private CheckboxSelection firstOffshiftIsDefending;
    @Transient
    private CheckboxSelection firstOffshiftIsStealing;
    @Transient
    private CheckboxSelection secondOffshiftIsDefending;
    @Transient
    private CheckboxSelection secondOffshiftIsStealing;
    
    private String[] tags;
    
    @Transient
    private ClimbData climb;
    
    private String layout;
    private String exportName;
    private String timestamp;

	public String getScouterName() {
		return scouterName;
	}

	public void setScouterName(String scouterName) {
		this.scouterName = scouterName;
	}

	public int getMatchNumber() {
		return matchNumber;
	}

	public void setMatchNumber(int matchNumber) {
		this.matchNumber = matchNumber;
	}

	public int getTeamNumber() {
		return teamNumber;
	}

	public void setTeamNumber(int teamNumber) {
		this.teamNumber = teamNumber;
	}

	public boolean getReplay() {
		return replay;
	}

	public void setReplay(boolean replay) {
		this.replay = replay;
	}

	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public String getDriverStation() {
		return driverStation;
	}

	public void setDriverStation(String driverStation) {
		this.driverStation = driverStation;
	}

	public AutoPath getAutoPath() {
		return autoPath;
	}

	public void setAutoPath(AutoPath autoPath) {
		this.autoPath = autoPath;
	}

	public CycleDataList getAutoCycles() {
		return autoCycles;
	}

	public void setAutoCycles(CycleDataList autoCycles) {
		this.autoCycles = autoCycles;
	}

	public boolean isTransitionOnshiftIsFeeding() {
		return transitionOnshiftIsFeeding;
	}

	public void setTransitionOnshiftIsFeeding(boolean transitionOnshiftIsFeeding) {
		this.transitionOnshiftIsFeeding = transitionOnshiftIsFeeding;
	}

	public boolean isTransitionOnshiftIsDisabled() {
		return transitionOnshiftIsDisabled;
	}

	public void setTransitionOnshiftIsDisabled(boolean transitionOnshiftIsDisabled) {
		this.transitionOnshiftIsDisabled = transitionOnshiftIsDisabled;
	}

	public boolean isTransitionOnshiftIsDefending() {
		return transitionOnshiftIsDefending;
	}

	public void setTransitionOnshiftIsDefending(boolean transitionOnshiftIsDefending) {
		this.transitionOnshiftIsDefending = transitionOnshiftIsDefending;
	}

	public boolean isFirstOnshiftIsFeeding() {
		return firstOnshiftIsFeeding;
	}

	public void setFirstOnshiftIsFeeding(boolean firstOnshiftIsFeeding) {
		this.firstOnshiftIsFeeding = firstOnshiftIsFeeding;
	}

	public boolean isFirstOnshiftIsDisabled() {
		return firstOnshiftIsDisabled;
	}

	public void setFirstOnshiftIsDisabled(boolean firstOnshiftIsDisabled) {
		this.firstOnshiftIsDisabled = firstOnshiftIsDisabled;
	}

	public boolean isFirstOnshiftIsDefending() {
		return firstOnshiftIsDefending;
	}

	public void setFirstOnshiftIsDefending(boolean firstOnshiftIsDefending) {
		this.firstOnshiftIsDefending = firstOnshiftIsDefending;
	}

	public boolean isSecondOnshiftIsFeeding() {
		return secondOnshiftIsFeeding;
	}

	public void setSecondOnshiftIsFeeding(boolean secondOnshiftIsFeeding) {
		this.secondOnshiftIsFeeding = secondOnshiftIsFeeding;
	}

	public boolean isSecondOnshiftIsDisabled() {
		return secondOnshiftIsDisabled;
	}

	public void setSecondOnshiftIsDisabled(boolean secondOnshiftIsDisabled) {
		this.secondOnshiftIsDisabled = secondOnshiftIsDisabled;
	}

	public boolean isSecondOnshiftIsDefending() {
		return secondOnshiftIsDefending;
	}

	public void setSecondOnshiftIsDefending(boolean secondOnshiftIsDefending) {
		this.secondOnshiftIsDefending = secondOnshiftIsDefending;
	}

	public CycleDataList getTransitionOnshiftCycles() {
		return transitionOnshiftCycles;
	}

	public void setTransitionOnshiftCycles(CycleDataList transitionOnshiftCycles) {
		this.transitionOnshiftCycles = transitionOnshiftCycles;
	}

	public CycleDataList getFirstOnshiftCycles() {
		return firstOnshiftCycles;
	}

	public void setFirstOnshiftCycles(CycleDataList firstOnshiftCycles) {
		this.firstOnshiftCycles = firstOnshiftCycles;
	}

	public CycleDataList getSecondOnshiftCycles() {
		return secondOnshiftCycles;
	}

	public void setSecondOnshiftCycles(CycleDataList secondOnshiftCycles) {
		this.secondOnshiftCycles = secondOnshiftCycles;
	}

	public boolean isTransitionOffshiftIsDisabled() {
		return transitionOffshiftIsDisabled;
	}

	public void setTransitionOffshiftIsDisabled(boolean transitionOffshiftIsDisabled) {
		this.transitionOffshiftIsDisabled = transitionOffshiftIsDisabled;
	}

	public boolean isFirstOffshiftIsDisabled() {
		return firstOffshiftIsDisabled;
	}

	public void setFirstOffshiftIsDisabled(boolean firstOffshiftIsDisabled) {
		this.firstOffshiftIsDisabled = firstOffshiftIsDisabled;
	}

	public boolean isSecondOffshiftIsDisabled() {
		return secondOffshiftIsDisabled;
	}

	public void setSecondOffshiftIsDisabled(boolean secondOffshiftIsDisabled) {
		this.secondOffshiftIsDisabled = secondOffshiftIsDisabled;
	}

	public int getDataQuality() {
		return dataQuality;
	}

	public void setDataQuality(int dataQuality) {
		this.dataQuality = dataQuality;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public CheckboxSelection getTransitionOffshiftIsDefending() {
		return transitionOffshiftIsDefending;
	}

	public void setTransitionOffshiftIsDefending(CheckboxSelection transitionOffshiftIsDefending) {
		this.transitionOffshiftIsDefending = transitionOffshiftIsDefending;
	}

	public CheckboxSelection getTransitionOffshiftIsFeeding() {
		return transitionOffshiftIsFeeding;
	}

	public void setTransitionOffshiftIsFeeding(CheckboxSelection transitionOffshiftIsFeeding) {
		this.transitionOffshiftIsFeeding = transitionOffshiftIsFeeding;
	}

	public CheckboxSelection getTransitionOffshiftIsStealing() {
		return transitionOffshiftIsStealing;
	}

	public void setTransitionOffshiftIsStealing(CheckboxSelection transitionOffshiftIsStealing) {
		this.transitionOffshiftIsStealing = transitionOffshiftIsStealing;
	}

	public CheckboxSelection getFirstOffshiftIsDefending() {
		return firstOffshiftIsDefending;
	}

	public void setFirstOffshiftIsDefending(CheckboxSelection firstOffshiftIsDefending) {
		this.firstOffshiftIsDefending = firstOffshiftIsDefending;
	}

	public CheckboxSelection getFirstOffshiftIsStealing() {
		return firstOffshiftIsStealing;
	}

	public void setFirstOffshiftIsStealing(CheckboxSelection firstOffshiftIsStealing) {
		this.firstOffshiftIsStealing = firstOffshiftIsStealing;
	}

	public CheckboxSelection getSecondOffshiftIsDefending() {
		return secondOffshiftIsDefending;
	}

	public void setSecondOffshiftIsDefending(CheckboxSelection secondOffshiftIsDefending) {
		this.secondOffshiftIsDefending = secondOffshiftIsDefending;
	}

	public CheckboxSelection getSecondOffshiftIsStealing() {
		return secondOffshiftIsStealing;
	}

	public void setSecondOffshiftIsStealing(CheckboxSelection secondOffshiftIsStealing) {
		this.secondOffshiftIsStealing = secondOffshiftIsStealing;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public ClimbData getClimb() {
		return climb;
	}

	public void setClimb(ClimbData climb) {
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
