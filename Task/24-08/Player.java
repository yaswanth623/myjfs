package com.myproduct.model;

import java.util.Date;

public class Player {
	private String playerId;
	private String fName;
	private String lName;
	private Date dob;
	private String place;
	private String team;
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public Player(String playerId, String fName, String lName, Date dob, String place, String team) {
		super();
		this.playerId = playerId;
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
		this.place = place;
		this.team = team;
	}
	
	public Player(String fName, String lName, Date dob, String place, String team) {
		super();
		//this.playerId = playerId;
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
		this.place = place;
		this.team = team;
	}
	
	public Player() {}
	
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", fName=" + fName + ", lName=" + lName + ", dob=" + dob + ", place="
				+ place + ", team=" + team + "]";
	}
	
	
}
