package com.nrg948.data;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import jakarta.persistence.Embeddable;

@Embeddable
@JsonDeserialize(using = ChronosEventDeserializer.class)
public class ChronosEvent {
	private String str;
	private double doublee;
	
	/**
	 * @return the str
	 */
	public String getStr() {
		return str;
	}
	/**
	 * @param str the str to set
	 */
	public void setStr(String str) {
		this.str = str;
	}
	/**
	 * @return the integer
	 */
	public double getDouble() {
		return doublee;
	}
	/**
	 * @param integer the integer to set
	 */
	public void setDouble(double doublee) {
		this.doublee = doublee;
	}
}
