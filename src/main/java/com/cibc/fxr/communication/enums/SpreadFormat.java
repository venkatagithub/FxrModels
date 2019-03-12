package com.cibc.fxr.communication.enums;

import java.io.Serializable;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum SpreadFormat implements Serializable {

	PERCENTAGE("%"), BASISPOINTS("BPS"), RICCODE("RIC");

	private String text;

	private static final Map<String, SpreadFormat> spreadFormatTextMap;

	static {
		spreadFormatTextMap = new HashMap<String, SpreadFormat>();
		for (SpreadFormat type : EnumSet.allOf(SpreadFormat.class)) {
			spreadFormatTextMap.put(type.getText(), type);
		}
	}

	private SpreadFormat(String text) {
		this.text = text;
	}

	public static SpreadFormat get(String value) {
		SpreadFormat type = spreadFormatTextMap.get(value);
		return type;
	}

	public boolean equals(SpreadFormat t) {
		if (t == null || !(t instanceof SpreadFormat))
			return false;

		return getText() == t.getText();
	}

	public boolean notEquals(SpreadFormat t) {
		return !equals(t);
	}

	public String getText() {
		return text;
	}

}