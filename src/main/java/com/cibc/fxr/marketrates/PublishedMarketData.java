package com.cibc.fxr.marketrates;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PublishedMarketData implements Serializable {

	private static final long serialVersionUID = 2396568461763383778L;
	
	@JsonProperty("bps")
	private Set<DdsBasisPoints> ddsBasisPoints;
	
	@JsonProperty("ratemodels")
	private List<RatePublishModel> ratePublishModels;
	
	public Set<DdsBasisPoints> getDdsBasisPoints() {
		return ddsBasisPoints;
	}
	public void setDdsBasisPoints(Set<DdsBasisPoints> ddsBasisPoints) {
		this.ddsBasisPoints = ddsBasisPoints;
	}
	public List<RatePublishModel> getRatePublishModels() {
		return ratePublishModels;
	}
	public void setRatePublishModels(List<RatePublishModel> ratePublishModels) {
		this.ratePublishModels = ratePublishModels;
	}

}