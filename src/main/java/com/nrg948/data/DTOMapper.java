package com.nrg948.data;

import java.util.ArrayList;
import java.util.List;

import com.nrg948.tba.Match;
import com.nrg948.tba.MatchEntry;

public class DTOMapper {
	public static AtlasDTO fromEntry(AtlasEntry entry) {
	    if (entry == null) {
	        return null;
	    }

	    AtlasDTO dto = new AtlasDTO();

	    dto.setScouterName(entry.getScouterName());
	    dto.setTeamNumber(entry.getTeamNumber());
	    dto.setDriverStation(entry.getDriverStation());
	    dto.setMatchType(entry.getMatchType());
	    dto.setMatchNumber(entry.getMatchNumber());
	    dto.setReplay(entry.getReplay());

	    dto.setAutoPath(entry.getAutoPath());
	    
	    CycleDataList autoCycles = entry.getAutoCycles();
	    if (autoCycles != null) {
	        autoCycles.setKeyPrefix("autoCycles");
	    }
	    dto.setAutoCycles(autoCycles);

	    dto.setTransitionOnshiftIsFeeding(entry.isTransitionOnshiftIsFeeding());
	    dto.setTransitionOnshiftIsDisabled(entry.isTransitionOnshiftIsDisabled());
	    dto.setTransitionOnshiftIsDefending(entry.isTransitionOnshiftIsDefending());
	    dto.setFirstOnshiftIsFeeding(entry.isFirstOnshiftIsFeeding());
	    dto.setFirstOnshiftIsDisabled(entry.isFirstOnshiftIsDisabled());
	    dto.setFirstOnshiftIsDefending(entry.isFirstOnshiftIsDefending());
	    dto.setSecondOnshiftIsFeeding(entry.isSecondOnshiftIsFeeding());
	    dto.setSecondOnshiftIsDisabled(entry.isSecondOnshiftIsDisabled());
	    dto.setSecondOnshiftIsDefending(entry.isSecondOnshiftIsDefending());

	    CycleDataList transitionOnshiftCycles = entry.getTransitionOnshiftCycles();
	    if (transitionOnshiftCycles != null) {
	        transitionOnshiftCycles.setKeyPrefix("transitionOnshiftCycles");
	    }
	    dto.setTransitionOnshiftCycles(transitionOnshiftCycles);
	    
	    CycleDataList firstOnshiftCycles = entry.getFirstOnshiftCycles();
	    if (firstOnshiftCycles != null) {
	        firstOnshiftCycles.setKeyPrefix("firstOnshiftCycles");
	    }
	    dto.setFirstOnshiftCycles(firstOnshiftCycles);
	    
	    CycleDataList secondOnshiftCycles = entry.getSecondOnshiftCycles();
	    if (secondOnshiftCycles != null) {
	        secondOnshiftCycles.setKeyPrefix("secondOnshiftCycles");
	    }
	    dto.setSecondOnshiftCycles(secondOnshiftCycles);

	    dto.setTransitionOffshiftIsDisabled(entry.isTransitionOffshiftIsDisabled());
	    dto.setFirstOffshiftIsDisabled(entry.isFirstOffshiftIsDisabled());
	    dto.setSecondOffshiftIsDisabled(entry.isSecondOffshiftIsDisabled());

	    dto.setDataQuality(entry.getDataQuality());
	    dto.setComments(entry.getComments());

	    dto.setTransitionOffshiftIsDefending(entry.getTransitionOffshiftIsDefending());
	    dto.setTransitionOffshiftIsFeeding(entry.getTransitionOffshiftIsFeeding());
	    dto.setTransitionOffshiftIsStealing(entry.getTransitionOffshiftIsStealing());
	    dto.setFirstOffshiftIsDefending(entry.getFirstOffshiftIsDefending());
	    dto.setFirstOffshiftIsStealing(entry.getFirstOffshiftIsStealing());
	    dto.setSecondOffshiftIsDefending(entry.getSecondOffshiftIsDefending());
	    dto.setSecondOffshiftIsStealing(entry.getSecondOffshiftIsStealing());

	    dto.setTags(entry.getTags());
	    dto.setClimb(entry.getClimb());

	    dto.setLayout(entry.getLayout());
	    dto.setExportName(entry.getExportName());
	    dto.setTimestamp(entry.getTimestamp());

	    return dto;
	}
	
	public static AtlasEntry fromDTO(AtlasDTO dto) {
	    if (dto == null) {
	        return null;
	    }

	    AtlasEntry entry = new AtlasEntry();

	    entry.setScouterName(dto.getScouterName());
	    entry.setTeamNumber(dto.getTeamNumber());
	    entry.setDriverStation(dto.getDriverStation());
	    entry.setMatchType(dto.getMatchType());
	    entry.setMatchNumber(dto.getMatchNumber());
	    entry.setReplay(dto.getReplay());

	    entry.setAutoPath(dto.getAutoPath());
	    
	    CycleDataList autoCycles = dto.getAutoCycles();
	    if (autoCycles != null) {
	        autoCycles.setKeyPrefix("autoCycles");
	    }
	    entry.setAutoCycles(autoCycles);

	    entry.setTransitionOnshiftIsFeeding(dto.isTransitionOnshiftIsFeeding());
	    entry.setTransitionOnshiftIsDisabled(dto.isTransitionOnshiftIsDisabled());
	    entry.setTransitionOnshiftIsDefending(dto.isTransitionOnshiftIsDefending());
	    entry.setFirstOnshiftIsFeeding(dto.isFirstOnshiftIsFeeding());
	    entry.setFirstOnshiftIsDisabled(dto.isFirstOnshiftIsDisabled());
	    entry.setFirstOnshiftIsDefending(dto.isFirstOnshiftIsDefending());
	    entry.setSecondOnshiftIsFeeding(dto.isSecondOnshiftIsFeeding());
	    entry.setSecondOnshiftIsDisabled(dto.isSecondOnshiftIsDisabled());
	    entry.setSecondOnshiftIsDefending(dto.isSecondOnshiftIsDefending());

	    CycleDataList transitionOnshiftCycles = dto.getTransitionOnshiftCycles();
	    if (transitionOnshiftCycles != null) {
	        transitionOnshiftCycles.setKeyPrefix("transitionOnshiftCycles");
	    }
	    entry.setTransitionOnshiftCycles(transitionOnshiftCycles);
	    
	    CycleDataList firstOnshiftCycles = dto.getFirstOnshiftCycles();
	    if (firstOnshiftCycles != null) {
	        firstOnshiftCycles.setKeyPrefix("firstOnshiftCycles");
	    }
	    entry.setFirstOnshiftCycles(firstOnshiftCycles);
	    
	    CycleDataList secondOnshiftCycles = dto.getSecondOnshiftCycles();
	    if (secondOnshiftCycles != null) {
	        secondOnshiftCycles.setKeyPrefix("secondOnshiftCycles");
	    }
	    entry.setSecondOnshiftCycles(secondOnshiftCycles);

	    entry.setTransitionOffshiftIsDisabled(dto.isTransitionOffshiftIsDisabled());
	    entry.setFirstOffshiftIsDisabled(dto.isFirstOffshiftIsDisabled());
	    entry.setSecondOffshiftIsDisabled(dto.isSecondOffshiftIsDisabled());

	    entry.setDataQuality(dto.getDataQuality());
	    entry.setComments(dto.getComments());

	    entry.setTransitionOffshiftIsDefending(dto.getTransitionOffshiftIsDefending());
	    entry.setTransitionOffshiftIsFeeding(dto.getTransitionOffshiftIsFeeding());
	    entry.setTransitionOffshiftIsStealing(dto.getTransitionOffshiftIsStealing());
	    entry.setFirstOffshiftIsDefending(dto.getFirstOffshiftIsDefending());
	    entry.setFirstOffshiftIsStealing(dto.getFirstOffshiftIsStealing());
	    entry.setSecondOffshiftIsDefending(dto.getSecondOffshiftIsDefending());
	    entry.setSecondOffshiftIsStealing(dto.getSecondOffshiftIsStealing());

	    entry.setTags(dto.getTags());
	    entry.setClimb(dto.getClimb());

	    entry.setLayout(dto.getLayout());
	    entry.setExportName(dto.getExportName());
	    entry.setTimestamp(dto.getTimestamp());

	    return entry;
	}
	
	public static PitDTO fromEntry(PitEntry entry) {
	    if (entry == null) {
	        return null;
	    }
	    PitDTO dto = new PitDTO();
	    dto.setTeamNumber(entry.getTeamNumber());
	    dto.setTeamName(entry.getTeamName());
	    dto.setFuelCapacity(entry.getFuelCapacity());
	    dto.setBps(entry.getBps());
	    dto.setWeight(entry.getWeight());
	    dto.setWidth(entry.getWidth());
	    dto.setLength(entry.getLength());
	    dto.setDrivetrain(entry.getDrivetrain());
	    dto.setMechanisms(entry.getMechanisms());
	    dto.setShooterType(entry.getShooterType());
	    dto.setIntakeType(entry.getIntakeType());
	    dto.setPitAuto(entry.getPitAuto());
	    dto.setCanGoBump(entry.getCanGoBump());
	    dto.setCanGoTrench(entry.getCanGoTrench());
	    dto.setCanShootTrench(entry.getCanShootTrench());
	    dto.setCanShootHub(entry.getCanShootHub());
	    dto.setCanShootTower(entry.getCanShootTower());
	    dto.setCanShootAnywhere(entry.getCanShootAnywhere());
	    dto.setCanFeed(entry.getCanFeed());
	    dto.setCanDefend(entry.getCanDefend());
	    dto.setCanHoard(entry.getCanHoard());
	    dto.setCanPass(entry.getCanPass());
	    dto.setCanPushOverBump(entry.getCanPushOverBump());
	    dto.setCanPushThroughTrench(entry.getCanPushThroughTrench());
	    dto.setCycleTime(entry.getCycleTime());
	    dto.setCanShootEndgame(entry.getCanShootEndgame());
	    dto.setClimb(entry.getClimb());
	    dto.setLayout(entry.getLayout());
	    dto.setExportName(entry.getExportName());
	    dto.setTimestamp(entry.getTimestamp());
	    return dto;
	}
	
	
	public static PitEntry fromDTO(PitDTO dto) {
	    if (dto == null) {
	        return null;
	    }
	    PitEntry entry = new PitEntry();
	    entry.setTeamNumber(dto.getTeamNumber());
	    entry.setTeamName(dto.getTeamName());
	    entry.setFuelCapacity(dto.getFuelCapacity());
	    entry.setBps(dto.getBps());
	    entry.setWeight(dto.getWeight());
	    entry.setWidth(dto.getWidth());
	    entry.setLength(dto.getLength());
	    entry.setDrivetrain(dto.getDrivetrain());
	    entry.setMechanisms(dto.getMechanisms());
	    entry.setShooterType(dto.getShooterType());
	    entry.setIntakeType(dto.getIntakeType());
	    entry.setPitAuto(dto.getPitAuto());
	    entry.setCanGoBump(dto.getCanGoBump());
	    entry.setCanGoTrench(dto.getCanGoTrench());
	    entry.setCanShootTrench(dto.getCanShootTrench());
	    entry.setCanShootHub(dto.getCanShootHub());
	    entry.setCanShootTower(dto.getCanShootTower());
	    entry.setCanShootAnywhere(dto.getCanShootAnywhere());
	    entry.setCanFeed(dto.getCanFeed());
	    entry.setCanDefend(dto.getCanDefend());
	    entry.setCanHoard(dto.getCanHoard());
	    entry.setCanPass(dto.getCanPass());
	    entry.setCanPushOverBump(dto.getCanPushOverBump());
	    entry.setCanPushThroughTrench(dto.getCanPushThroughTrench());
	    entry.setCycleTime(dto.getCycleTime());
	    entry.setCanShootEndgame(dto.getCanShootEndgame());
	    entry.setClimb(dto.getClimb());
	    entry.setLayout(dto.getLayout());
	    entry.setExportName(dto.getExportName());
	    entry.setTimestamp(dto.getTimestamp());
	    return entry;
	}
	
	public static PatchEntry fromDTO(PatchDTO dto) {
		if (dto == null) {
	        return null;
	    }
		PatchEntry entry = new PatchEntry();
		entry.setComments(dto.getComments());
		entry.setDataType(dto.getDataType());
		entry.setDriverStation(dto.getDriverStation());
		entry.setMatchNumber(dto.getMatchNumber());
		entry.setMatchType(dto.getMatchType());
		entry.setPatcher(dto.getPatcher());
		entry.setReplay(dto.isReplay());
		entry.setTeamNumber(dto.getTeamNumber());
		return entry;
	}
	
	public static PatchDTO fromEntry(PatchEntry entry) {
		if (entry == null) {
	        return null;
	    }
		PatchDTO dto = new PatchDTO();
		entry.setComments(dto.getComments());
		entry.setDataType(dto.getDataType());
		entry.setDriverStation(dto.getDriverStation());
		entry.setMatchNumber(dto.getMatchNumber());
		entry.setMatchType(dto.getMatchType());
		entry.setPatcher(dto.getPatcher());
		entry.setReplay(dto.isReplay());
		entry.setTeamNumber(dto.getTeamNumber());
		return dto;
	}
	
	public static Match fromEntry(MatchEntry entry) {
		if(entry == null) return null;
		Match dto = new Match();
		dto.setActual_time(entry.getActual_time());
		dto.setAlliances(entry.getAlliances());
		dto.setComp_level(entry.getComp_level());
		dto.setEvent_key(entry.getEvent_key());
		dto.setKey(entry.getKey());
		dto.setMatch_number(entry.getMatch_number());
		dto.setPost_result_time(entry.getPost_result_time());
		dto.setPredicted_time(entry.getPredicted_time());
		dto.setScore_breakdown(entry.getScore_breakdown());
		dto.setSet_number(entry.getSet_number());;
		dto.setTime(entry.getTime());
		dto.setVideos(entry.getVideos());
		dto.setWinning_alliances(entry.getWinning_alliance());
		return dto;
	}
	
	public static MatchEntry fromDTO(Match dto) {
		if(dto == null) return null;
		MatchEntry entry = new MatchEntry();
		entry.setActual_time(dto.getActual_time());
		entry.setAlliances(dto.getAlliances());
		entry.setComp_level(dto.getComp_level());
		entry.setEvent_key(dto.getEvent_key());
		entry.setKey(dto.getKey());
		entry.setMatch_number(dto.getMatch_number());
		entry.setPost_result_time(dto.getPost_result_time());
		entry.setPredicted_time(dto.getPredicted_time());
		entry.setScore_breakdown(dto.getScore_breakdown());
		entry.setSet_number(dto.getSet_number());;
		entry.setTime(dto.getTime());
		entry.setVideos(dto.getVideos());
		entry.setWinning_alliance(dto.getWinning_alliance());
		return entry;
	}
}
