package com.cibc.fxr.communication.model;


public class RateSource extends ModelBase{

	private static final long serialVersionUID = -8422555279997090684L;

	private Long code;
	
	private String name;
	
	private Boolean calculateTolerance;

	private String weekdayEndTime;

	private Integer weekdayFrequency;

	private String weekdayStartTime;
	
	private String saturdayEndTime;
	
	private String saturdayStartTime;
	
	private Integer saturdayFrequency;
	
	private String sundayStartTime;
	
	private String sundayEndTime;
	
	private Integer sundayFrequency;
	
	public RateSource() {
		super();
	}

	public RateSource(Long code, String name, Boolean calculateTolerance) {
		super();
		this.code = code;
		this.name = name;
		this.calculateTolerance = calculateTolerance;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getCalculateTolerance() {
		return calculateTolerance;
	}

	public void setCalculateTolerance(Boolean calculateTolerance) {
		this.calculateTolerance = calculateTolerance;
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

	public String getSaturdayEndTime() {
		return saturdayEndTime;
	}

	public void setSaturdayEndTime(String saturdayEndTime) {
		this.saturdayEndTime = saturdayEndTime;
	}

	public String getSaturdayStartTime() {
		return saturdayStartTime;
	}

	public void setSaturdayStartTime(String saturdayStartTime) {
		this.saturdayStartTime = saturdayStartTime;
	}

	public Integer getSaturdayFrequency() {
		return saturdayFrequency;
	}

	public void setSaturdayFrequency(Integer saturdayFrequency) {
		this.saturdayFrequency = saturdayFrequency;
	}

	public String getSundayStartTime() {
		return sundayStartTime;
	}

	public void setSundayStartTime(String sundayStartTime) {
		this.sundayStartTime = sundayStartTime;
	}

	public String getSundayEndTime() {
		return sundayEndTime;
	}

	public void setSundayEndTime(String sundayEndTime) {
		this.sundayEndTime = sundayEndTime;
	}

	public Integer getSundayFrequency() {
		return sundayFrequency;
	}

	public void setSundayFrequency(Integer sundayFrequency) {
		this.sundayFrequency = sundayFrequency;
	}

	@Override
	public String toString() {
		return "RateSource [code=" + code + ", name=" + name
				+ ", calculateTolerance=" + calculateTolerance
				+ ", weekdayEndTime=" + weekdayEndTime + ", weekdayFrequency="
				+ weekdayFrequency + ", weekdayStartTime=" + weekdayStartTime
				+ ", saturdayEndTime=" + saturdayEndTime
				+ ", saturdayStartTime=" + saturdayStartTime
				+ ", saturdayFrequency=" + saturdayFrequency
				+ ", sundayStartTime=" + sundayStartTime + ", sundayEndTime="
				+ sundayEndTime + ", sundayFrequency=" + sundayFrequency
				+ "]";
	}
}