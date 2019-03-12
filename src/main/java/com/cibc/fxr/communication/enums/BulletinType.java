package com.cibc.fxr.communication.enums;

public enum BulletinType {
	FUND("FUND"),
	CASH("CASH"),
	DCC("DCC");

	private String text;

	private BulletinType(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}