package com.cibc.fxr.communication.model.bulletin;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
 

public class PublishedBulletinResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;
	
	@JsonProperty("bid")
	private long bulletinId;
	
	@JsonProperty("bn")
	private Long bulletinNum;
	
	@JsonProperty("dstncd")
	private String destinationCode;

	@JsonProperty("trcds")
    private List<String> tierCodes;

	@JsonProperty("sts")
    private String publishedStatus;
	
	@JsonProperty("stdsc")
    private String publishedStatusDesc;
    
	@JsonProperty("pbd")
    private String publishedBulletinData;

	public long getBulletinId() {
		return bulletinId;
	}

	public void setBulletinId(long bulletinId) {
		this.bulletinId = bulletinId;
	}

	public Long getBulletinNum() {
		return bulletinNum;
	}

	public void setBulletinNum(Long bulletinNum) {
		this.bulletinNum = bulletinNum;
	}

	public String getDestinationCode() {
		return destinationCode;
	}

	public void setDestinationCode(String destinationCode) {
		this.destinationCode = destinationCode;
	}

	public List<String> getTierCodes() {
		return tierCodes;
	}

	public void setTierCodes(List<String> tierCodes) {
		this.tierCodes = tierCodes;
	}

	public String getPublishedStatus() {
		return publishedStatus;
	}

	public void setPublishedStatus(String publishedStatus) {
		this.publishedStatus = publishedStatus;
	}

	public String getPublishedStatusDesc() {
		return publishedStatusDesc;
	}

	public void setPublishedStatusDesc(String publishedStatusDesc) {
		this.publishedStatusDesc = publishedStatusDesc;
	}

	public String getPublishedBulletinData() {
		return publishedBulletinData;
	}

	public void setPublishedBulletinData(String publishedBulletinData) {
		this.publishedBulletinData = publishedBulletinData;
	}
}