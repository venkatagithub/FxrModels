package com.cibc.fxr.communication.enums;

public enum FxrApplicationStatus {

	PAUSED("PAUSED"),
	RUNNING("RUNNING");

	private String applicationStatus;

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	private FxrApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
}