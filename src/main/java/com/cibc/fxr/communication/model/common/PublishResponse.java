package com.cibc.fxr.communication.model.common;

import java.io.Serializable;

import com.cibc.fxr.communication.model.adapter.RequestDetails;


public class PublishResponse implements Serializable{

	private static final long serialVersionUID = 9036597226801373209L;
	
	private int responsecode;
	private String destination;
	private String responseDesc;
	private String responseMsg;
	private RequestDetails requestDetails;
	
	public int getResponsecode() {
		return responsecode;
	}
	
	public void setResponsecode(int responsecode) {
		this.responsecode = responsecode;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String getResponseDesc() {
		return responseDesc;
	}
	
	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}

	public String getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public RequestDetails getRequestDetails() {
		return requestDetails;
	}

	public void setRequestDetails(RequestDetails requestDetails) {
		this.requestDetails = requestDetails;
	}

}