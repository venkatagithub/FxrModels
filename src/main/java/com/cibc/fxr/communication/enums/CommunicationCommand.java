package com.cibc.fxr.communication.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum CommunicationCommand {
	RESUME_ALL_PROCESSES("resume", "resume"),
	PAUSE_ALL_PROCESSES("pause", "pause"),
	RECYLE_ALL_PROCESSES("recycle", "recycle"),
	SHUTDOWN("shutdown", "shutdown"),
	SHUTDOWN_ALL("shutdownall", "shutdownall"),
	ALIVE("alive", "alive"),
	CHANGE_LOG_LVL("loglvl","loglvl"),
	//More supported commands here
	INIT_DATE_RULES("init","init"),
	NONE("none", "none");
	
	private String value;
	private String text;
	
	private static final Map<String, CommunicationCommand> map;
	static { 
		map = new HashMap<String, CommunicationCommand>(); 
		for (CommunicationCommand c : EnumSet.allOf(CommunicationCommand.class)) {
			map.put(c.getValue(), c);
		}
	}
	
	private CommunicationCommand(String value, String text) {
		this.value = value;
		this.text = text;		
	}
	
	public static CommunicationCommand get(String value) {
		CommunicationCommand type = map.get(value);
		if(type == null) {
			type = NONE;
		}
		return type;
	}
	
	
	public boolean equals(CommunicationCommand c) {
		return getValue().equalsIgnoreCase(c.getValue());
	}
	
	public boolean equals(String value) {
		return getValue().equalsIgnoreCase(value);
	}
	
	public boolean notEquals(CommunicationCommand c) {
		return ! equals(c);
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) throws IllegalAccessException {
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