package com.cibc.fxr.communication.enums;

import java.io.Serializable;


public enum MessageType implements Serializable {

	MARKET_DATA("MD"),
	MARKET_RATES("MR"),
	EVENTS("EVT"),
	BULLETIN("BLT"),
	MANUAL_PUBLISH("MP"),
	ECHO("ECHO"),
	ECHO_RESP("ECHO_RESP"),
	BULLETIN_RESP("BLT_RESP"),
	MP_BULLETIN("MarketplaceBulletin"),
	MPOP_RESPONSE("MPOP_RESPONSE"),
	TEST("TEST");

	private String text;

	private MessageType(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

}