package com.nrg948.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.transaction.Transactional;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"teamName", "interviewerName", "intervieweeName"}))
@Transactional
public class PitEntry {
	private @Id @GeneratedValue Long id;

    /**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	// Initial Info Page
    private String teamNumber;
    private String teamName;
    private String intervieweeName;
    private String interviewerName;

    // Robot Stats Page
    private String robotTeamNumber;

    // Auto Page
    private String autoRoutine;
    private String dropsAlgaeAuto;

    // Teleop Page
    private String coralScoringAbility;
    private String coralIntakeAbility;
    private String algaeRemovalAbility;
    private String algaeScoringAbility;

    // Endgame Page
    private String climbingAbilityAndPreference;
    private String averageClimbTime;

    // Drive Team Page
    private String driveExperience;
    private String humanPlayerPreference;
    private String averageCoralCycles;
    private String averageAlgaeCycles;
    private String idealAlliancePartnerQualities;
    private String otherComments;

    // Getters and Setters
    public String getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(String teamNumber) {
        this.teamNumber = teamNumber;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getIntervieweeName() {
        return intervieweeName;
    }

    public void setIntervieweeName(String intervieweeName) {
        this.intervieweeName = intervieweeName;
    }

    public String getInterviewerName() {
        return interviewerName;
    }

    public void setInterviewerName(String interviewerName) {
        this.interviewerName = interviewerName;
    }

    public String getRobotTeamNumber() {
        return robotTeamNumber;
    }

    public void setRobotTeamNumber(String robotTeamNumber) {
        this.robotTeamNumber = robotTeamNumber;
    }

    public String getAutoRoutine() {
        return autoRoutine;
    }

    public void setAutoRoutine(String autoRoutine) {
        this.autoRoutine = autoRoutine;
    }

    public String getDropsAlgaeAuto() {
        return dropsAlgaeAuto;
    }

    public void setDropsAlgaeAuto(String dropsAlgaeAuto) {
        this.dropsAlgaeAuto = dropsAlgaeAuto;
    }

    public String getCoralScoringAbility() {
        return coralScoringAbility;
    }

    public void setCoralScoringAbility(String coralScoringAbility) {
        this.coralScoringAbility = coralScoringAbility;
    }

    public String getCoralIntakeAbility() {
        return coralIntakeAbility;
    }

    public void setCoralIntakeAbility(String coralIntakeAbility) {
        this.coralIntakeAbility = coralIntakeAbility;
    }

    public String getAlgaeRemovalAbility() {
        return algaeRemovalAbility;
    }

    public void setAlgaeRemovalAbility(String algaeRemovalAbility) {
        this.algaeRemovalAbility = algaeRemovalAbility;
    }

    public String getAlgaeScoringAbility() {
        return algaeScoringAbility;
    }

    public void setAlgaeScoringAbility(String algaeScoringAbility) {
        this.algaeScoringAbility = algaeScoringAbility;
    }

    public String getClimbingAbilityAndPreference() {
        return climbingAbilityAndPreference;
    }

    public void setClimbingAbilityAndPreference(String climbingAbilityAndPreference) {
        this.climbingAbilityAndPreference = climbingAbilityAndPreference;
    }

    public String getAverageClimbTime() {
        return averageClimbTime;
    }

    public void setAverageClimbTime(String averageClimbTime) {
        this.averageClimbTime = averageClimbTime;
    }

    public String getDriveExperience() {
        return driveExperience;
    }

    public void setDriveExperience(String driveExperience) {
        this.driveExperience = driveExperience;
    }

    public String getHumanPlayerPreference() {
        return humanPlayerPreference;
    }

    public void setHumanPlayerPreference(String humanPlayerPreference) {
        this.humanPlayerPreference = humanPlayerPreference;
    }

    public String getAverageCoralCycles() {
        return averageCoralCycles;
    }

    public void setAverageCoralCycles(String averageCoralCycles) {
        this.averageCoralCycles = averageCoralCycles;
    }

    public String getAverageAlgaeCycles() {
        return averageAlgaeCycles;
    }

    public void setAverageAlgaeCycles(String averageAlgaeCycles) {
        this.averageAlgaeCycles = averageAlgaeCycles;
    }

    public String getIdealAlliancePartnerQualities() {
        return idealAlliancePartnerQualities;
    }

    public void setIdealAlliancePartnerQualities(String idealAlliancePartnerQualities) {
        this.idealAlliancePartnerQualities = idealAlliancePartnerQualities;
    }

    public String getOtherComments() {
        return otherComments;
    }

    public void setOtherComments(String otherComments) {
        this.otherComments = otherComments;
    }
}
