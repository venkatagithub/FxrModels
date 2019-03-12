package com.cibc.fxr.communication.enums;

import java.io.Serializable;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;


public enum SpreadType implements Serializable {
	
	CLIENT("Client"),
	MARKET("Market"),
	BEST("Best");

	private String text;

	
	private static final Map<String, SpreadType> spreadTypeTextMap;

	static {
		spreadTypeTextMap = new HashMap<String, SpreadType>();
		for (SpreadType type : EnumSet.allOf(SpreadType.class)) {
			spreadTypeTextMap.put(type.getText(), type);
		}
	}
	
	private SpreadType(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
	
	public static SpreadType get(String value) {
		SpreadType sprdtype = spreadTypeTextMap.get(value);
		return sprdtype;
	}
}