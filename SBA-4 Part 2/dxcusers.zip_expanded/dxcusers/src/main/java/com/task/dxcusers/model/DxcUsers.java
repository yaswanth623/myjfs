package com.task.dxcusers.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DxcUsers {
	@Id
	int userId;
	String username;
	String password;
	String securityQuestion;
	String securityAnswer;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getSecurityAnswer() {
		return securityAnswer;
	}
	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}
	public DxcUsers(int userId, String username, String password, String securityQuestion, String securityAnswer) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
	}
	
	public DxcUsers() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DxcUsers [userId=" + userId + ", username=" + username + ", password=" + password
				+ ", securityQuestion=" + securityQuestion + ", securityAnswer=" + securityAnswer + "]";
	}
	
}
