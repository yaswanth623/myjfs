package com.myshowroom.demo;

import java.util.ArrayList;

public class Showroom {
	private String showroomName;
	private ArrayList<Cars> cars;
	public String getShowroomName() {
		return showroomName;
	}
	public void setShowroomName(String showroomName) {
		this.showroomName = showroomName;
	}
	public ArrayList<Cars> getCars() {
		return cars;
	}
	public void setCars(ArrayList<Cars> cars) {
		this.cars = cars;
	}
	public Showroom(String showroomName, ArrayList<Cars> cars) {
		super();
		this.showroomName = showroomName;
		this.cars = cars;
	}
	
	public Showroom() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Showroom [showroomName=" + showroomName + ", cars=" + cars + "]";
	}
	
	
}
