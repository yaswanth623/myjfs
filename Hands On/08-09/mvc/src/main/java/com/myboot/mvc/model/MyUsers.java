package com.myboot.mvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyUsers {
	@Id
	String userName;
	String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public MyUsers(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	public MyUsers() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MyUsers [userName=" + userName + ", password=" + password + "]";
	}
	
}
