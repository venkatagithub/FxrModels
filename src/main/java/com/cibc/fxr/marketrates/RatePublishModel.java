package com.cibc.fxr.marketrates;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RatePublishModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6702615674591787545L;
	public static final String TS_FORMAT = "yyyy-MM-dd HH:mm:ss.S";
	@JsonProperty("rs")
	private String rateSourceKey;
	@JsonProperty("ts")
	private String ts;
	@JsonProperty("rates")
	private Map<String, Rate> rates;
	@JsonProperty("err")
	private String error;
	@JsonProperty("rrt")
	private Timestamp rateRetrievalTime;
	
	public RatePublishModel() {
    }

	public String getRateSourceKey() {
		return rateSourceKey;
	}
	public void setRateSourceKey(String rateSourceKey) {
		this.rateSourceKey = rateSourceKey;
	}
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
	public Map<String, Rate> getRates() {
		return rates;
	}
	public void setRates(Map<String, Rate> rates) {
		this.rates = rates;
	}

	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	public String toString() {
		return "RatePublishModel {rateSourceKey: "+ rateSourceKey +", rates: " + rates +", ts: " + ts +"}"; 
	}

	public Timestamp getRateRetrievalTime() {
		return rateRetrievalTime;
	}

	public void setRateRetrievalTime(Timestamp rateRetrievalTime) {
		this.rateRetrievalTime = rateRetrievalTime;
	}
	
}