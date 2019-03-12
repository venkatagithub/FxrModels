package com.cibc.fxr.communication.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Schedule extends ModelBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 398976861318328028L;

	@JsonProperty("nm")
	private String name;	
	
	@JsonProperty("wdet")
	private String weekdayEndTime;

	@JsonProperty("wdf")
	private Integer weekdayFrequency;

	@JsonProperty("wdst")
	private String weekdayStartTime;
	
	@JsonProperty("sset")
	private String satsunEndTime;

	@JsonProperty("ssf")
	private Integer satsunFrequency;

	@JsonProperty("ssst")
	private String satsunStartTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeekdayEndTime() {
		return weekdayEndTime;
	}

	public void setWeekdayEndTime(String weekdayEndTime) {
		this.weekdayEndTime = weekdayEndTime;
	}

	public Integer getWeekdayFrequency() {
		return weekdayFrequency;
	}

	public void setWeekdayFrequency(Integer weekdayFrequency) {
		this.weekdayFrequency = weekdayFrequency;
	}

	public String getWeekdayStartTime() {
		return weekdayStartTime;
	}

	public void setWeekdayStartTime(String weekdayStartTime) {
		this.weekdayStartTime = weekdayStartTime;
	}

	public String getSatsunEndTime() {
		return satsunEndTime;
	}

	public void setSatsunEndTime(String satsunEndTime) {
		this.satsunEndTime = satsunEndTime;
	}

	public Integer getSatsunFrequency() {
		return satsunFrequency;
	}

	public void setSatsunFrequency(Integer satsunFrequency) {
		this.satsunFrequency = satsunFrequency;
	}

	public String getSatsunStartTime() {
		return satsunStartTime;
	}

	public void setSatsunStartTime(String satsunStartTime) {
		this.satsunStartTime = satsunStartTime;
	}
}