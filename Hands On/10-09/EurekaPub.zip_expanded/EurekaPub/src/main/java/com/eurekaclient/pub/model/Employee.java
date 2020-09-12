package com.eurekaclient.pub.model;

public class Employee {
	String empName;
	int empSalary;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public Employee(String empName, int empSalary) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
}
