package com.cibc.fxr.communication.model.bulletin;

import com.cibc.fxr.communication.CommunicationBaseModel;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseResponse extends CommunicationBaseModel {

	private static final long serialVersionUID = 1L;

	@JsonProperty("rcd")
	private Integer responseCode;
	
	@JsonProperty("rdsc")
	private String responseDesc;

	public Integer getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseDesc() {
		return responseDesc;
	}

	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}

}