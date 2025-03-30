package com.nrg948.security;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class VerifCode {
	// hashed
	@Id
	private String password;
	
	private String comment;
	
	public VerifCode() {}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
