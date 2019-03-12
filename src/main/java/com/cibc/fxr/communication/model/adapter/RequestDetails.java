package com.cibc.fxr.communication.model.adapter;

import java.io.Serializable;

public class RequestDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String endpoint;
	private long bulletinNumber;
	private String publishedBulletinMessage;
	
	public String getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	public long getBulletinNumber() {
		return bulletinNumber;
	}
	public void setBulletinNumber(long bulletinNumber) {
		this.bulletinNumber = bulletinNumber;
	}
	public String getPublishedBulletinMessage() {
		return publishedBulletinMessage;
	}
	public void setPublishedBulletinMessage(String publishedBulletinMessage) {
		this.publishedBulletinMessage = publishedBulletinMessage;
	}

}