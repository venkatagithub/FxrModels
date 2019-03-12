package com.cibc.fxr.communication.enums;

import java.io.Serializable;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum BulletinCurrencyStatus implements Serializable {

	ACTIVE(0,"Active"),
	RTT(1,"Refer To Traders"),
	NA(2,"Not Available"),
	TNP(3,"Trading Not Permitted");
	
	private int code;
	
	private String text;

	private static final Map<Integer, BulletinCurrencyStatus> bulletinCcyStatusCodeMap;
	
	private static final Map<String, BulletinCurrencyStatus> bulletinCcyStatusTextMap;

	static {
		bulletinCcyStatusTextMap = new HashMap<String, BulletinCurrencyStatus>();
		for (BulletinCurrencyStatus type : EnumSet.allOf(BulletinCurrencyStatus.class)) {
			bulletinCcyStatusTextMap.put(type.getText(), type);
		}
		
		bulletinCcyStatusCodeMap = new HashMap<Integer, BulletinCurrencyStatus>();
		for (BulletinCurrencyStatus type : EnumSet.allOf(BulletinCurrencyStatus.class)) {
			bulletinCcyStatusTextMap.put(type.getText(), type);
		}
	}

	private BulletinCurrencyStatus(int code, String text) {
		this.code = code;
		this.text = text;
	}

	public static BulletinCurrencyStatus get(String text) {
		BulletinCurrencyStatus type = bulletinCcyStatusTextMap.get(text);
		return type;
	}

	public static BulletinCurrencyStatus get(int code) {
		BulletinCurrencyStatus type = bulletinCcyStatusCodeMap.get(code);
		return type;
	}
	
	public boolean equals(BulletinCurrencyStatus t) {
		if (t == null || !(t instanceof BulletinCurrencyStatus))
			return false;

		return getText() == t.getText();
	}

	public boolean notEquals(BulletinCurrencyStatus t) {
		return !equals(t);
	}


	public String getText() {
		return text;
	}

	public int getCode() {
		return code;
	}
	
	
}