package com.cibc.fxr.communication.model;



import com.fasterxml.jackson.annotation.JsonProperty;

public class Ric {
	@JsonProperty("p")
	private String ccyPair;
	@JsonProperty("m")
	private String mid;
	@JsonProperty("ba")
	private String bidAsk;
	
	public Ric() {
		
	}
	
	public Ric(String ccyPair, String mid, String bidAsk) {
		super();
		this.ccyPair = ccyPair;
		this.mid = mid;
		this.bidAsk = bidAsk;
	}
	
	public String getCcyPair() {
		return ccyPair;
	}
	public void setCcyPair(String ccyPair) {
		this.ccyPair = ccyPair;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getBidAsk() {
		return bidAsk;
	}
	public void setBidAsk(String bidAsk) {
		this.bidAsk = bidAsk;
	}

	public String toString() {
	    final String dili = ",";    
	    String retValue = "";
	    
	    retValue = "Ric ("
	        + "ccyPair=" + this.ccyPair + dili
	        + "mid=" + this.mid + dili
	        + "bidAsk=" + this.bidAsk + dili
	        + ")";
	
	    return retValue;
	}
	
	
}