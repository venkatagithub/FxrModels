package com.cibc.fxr.communication.enums;


public enum FxrApplication {
	
	FXRM_WEB("FXRM"),
	RATE_PUBLISHER("MKTRP"),
	PRICING_ENGINE("FXRPE"),
	FXR_ADAPTER("ADAPTER"),
	FX_COMMAND_UTILS("CMDUTIL"), 
	MPOP("MPOP"),
	WSSDATAREPL("WSSDATAREPL");
	private String applicationCode;
	
	private FxrApplication(String applicationCode) {
		this.applicationCode = applicationCode;
	}

	public String getApplicationCode() {
		return applicationCode;
	}

	public void setApplicationCode(String applicationCode) {
		this.applicationCode = applicationCode;
	}

	public static FxrApplication getApplicationFromCode(final String code) {
		FxrApplication fxrApp = null;
		if (code != null) {
			for (FxrApplication app : FxrApplication.values()) {
				if (code.equalsIgnoreCase(app.getApplicationCode())
						|| code.startsWith(app.getApplicationCode())) {
					fxrApp = app;
					break;
				}
			}
		}
		return fxrApp;
	}
	
	public String toString() {
		return applicationCode;
	}
	
}