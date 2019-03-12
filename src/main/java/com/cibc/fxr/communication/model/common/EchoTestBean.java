package com.cibc.fxr.communication.model.common;

public class EchoTestBean {
	
	private String destination;
	
	private String echoMessage;

	public String getEchoMessage() {
		return echoMessage;
	}

	public void setEchoMessage(String echoMessage) {
		this.echoMessage = echoMessage;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
}