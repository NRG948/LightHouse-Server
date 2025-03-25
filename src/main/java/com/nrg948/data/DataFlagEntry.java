package com.nrg948.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class DataFlagEntry {
	public String layout;
	public int matchNumber;
	public String matchType;
	public String driverStation;
	public boolean replay;
	
	public String flagType; // automatic or manual
	public String flag; // just a comment
	
	public @GeneratedValue @Id Long id;
}
