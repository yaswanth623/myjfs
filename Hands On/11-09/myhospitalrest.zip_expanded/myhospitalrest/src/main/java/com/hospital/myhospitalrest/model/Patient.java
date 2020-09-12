package com.hospital.myhospitalrest.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	int patientId;
	String patientName;
	String status;
	int age;
	String symptoms;
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public Patient(int patientId, String patientName, String status, int age, String symptoms) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.status = status;
		this.age = age;
		this.symptoms = symptoms;
	}
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", status=" + status + ", age="
				+ age + ", symptoms=" + symptoms + "]";
	}
	
}
