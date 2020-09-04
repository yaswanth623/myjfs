package com.spr.spr;

import java.util.Arrays;
import java.util.Date;

public class Student {
	private String name;
	private String studentId;
	private Address address;
	private int sem;
	String[] plocation;
	Date studentDob;
	
	
	public Date getStudentDob() {
		return studentDob;
	}
	public void setStudentDob(Date studentDob) {
		this.studentDob = studentDob;
	}
	public Address getAddress() {
		return address;
	}
	public String[] getPlocation() {
		return plocation;
	}
	public void setPlocation(String[] plocation) {
		this.plocation = plocation;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentId=" + studentId + ", address=" + address + ", sem=" + sem
				+ ", plocation=" + Arrays.toString(plocation) + ", studentDob=" + studentDob + "]";
	}
	public Student(String name, String studentId, Address address, int sem, String[] plocation, Date studentDob) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.address = address;
		this.sem = sem;
		this.plocation = plocation;
		this.studentDob = studentDob;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
}
