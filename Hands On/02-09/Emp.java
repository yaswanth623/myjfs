package com.myapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	private String empId;
	private String fName;
	private String lName;
	private int age;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*public Emp(String empId, String fName, String lName, int age) {
		super();
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}*/
	
	public Emp(String fName, String lName, int age) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", fName=" + fName + ", lName=" + lName + ", age=" + age + "]";
	}
	
	
}
