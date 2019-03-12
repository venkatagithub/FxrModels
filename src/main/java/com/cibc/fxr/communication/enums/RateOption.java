package com.cibc.fxr.communication.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;


public enum RateOption {
	
	MID("Mid"),
	BIDOFFER("Bid/Offer");
	
	private String text;
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	private static final Map<String, RateOption> rateOptionTextMap;

	static {
		rateOptionTextMap = new HashMap<String, RateOption>();
		for (RateOption type : EnumSet.allOf(RateOption.class)) {
			rateOptionTextMap.put(type.getText(), type);
		}
	}

	private RateOption(String text) {
		this.text = text;
	}
	
	public static RateOption get(String value) {
		RateOption option = rateOptionTextMap.get(value);
		return option;
	}
}