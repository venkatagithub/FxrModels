package com.cibc.fxr.marketrates;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

public enum RateErrorType {

	NONE("0", "None"),
	SEVERE("-1", "Severe error, rates may be unavailable"),
	INVALID_RATE("1", "Invalid rates, rates may be unavailable"),
	RATE_NOT_AVAIL("2", "Rate not available"),
	INVALID_BID_OFFER("3", "Invalid bid and/or offer rate"),
	INVALID_TOLERANCE("4", "Invalid tolerance: rate was too far off last published rate"),
	RATE_ZERO("5", "Rate is zero");
	
	
	private String value;
	@JsonIgnore
	private String text;
	
	private static final Map<String, RateErrorType> map;
	static { 
		map = new HashMap<String, RateErrorType>(); 
		for (RateErrorType type : EnumSet.allOf(RateErrorType.class)) {
			map.put(type.getValue(), type);
		}
	}
	
	private RateErrorType(String value, String text) {
		this.value = value;
		this.text = text;		
	}
	
	public static RateErrorType get(String value) {
		RateErrorType type = map.get(value);
		if(type == null) {
			type = NONE;
		}
		return type;
	}
	
	
	public boolean equals(RateErrorType t) {
		return getValue().equals(t.getValue());
	}
	
	public boolean notEquals(RateErrorType t) {
		return ! equals(t);
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value)throws IllegalAccessException {
		throw new IllegalAccessException("You are not supposed to reset this field!");
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) throws IllegalAccessException {
		throw new IllegalAccessException("You are not supposed to reset this field!");
	}
	
	public String toString() {
		return value + "-" + text;
	}
	
}