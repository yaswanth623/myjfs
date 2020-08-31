package com.myapp.model;

import javax.persistence.Embeddable;

@Embeddable
public class Publisher {
	private int publisherId;
	private String publisherName;
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	
	public Publisher() {
		// TODO Auto-generated constructor stub
	}
	public Publisher(int publisherId, String publisherName) {
		super();
		this.publisherId = publisherId;
		this.publisherName = publisherName;
	}
	
	
	
}
