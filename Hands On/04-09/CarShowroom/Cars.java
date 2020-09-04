package com.myshowroom.demo;

public class Cars {
	private String name;
	private String brand;
	private String colour;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Cars(String name, String brand, String colour) {
		super();
		this.name = name;
		this.brand = brand;
		this.colour = colour;
	}
	
	public Cars() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cars [name=" + name + ", brand=" + brand + ", colour=" + colour + "]";
	}
	
	
}
