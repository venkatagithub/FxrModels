package com.cibc.fxr.communication.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cibc.fxr.communication.model.CcyPair;
import com.cibc.fxr.communication.model.ModelBase;
import com.cibc.fxr.communication.model.Schedule;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RatePublisherConfiguration extends ModelBase{

	private static final long serialVersionUID = -2017169423852078851L;

	@JsonProperty("rpProperties")
	private Map<String, String> ratePublisherPropertiesMap;
	
	//{"CUP":[{CcyPair1},{CcyPair2}....],"REUTERS":[{CcyPair3},{CcyPair4}....],...}
	@JsonProperty("rscpMap")
	private Map<String, List<CcyPair>> rateSourceCurrencyPairsMap = new HashMap<String, List<CcyPair>>();
	
	@JsonProperty("bpRics")
	private Set<String> basisPointsRics;

	//{"WSS":{"Schedule"},"RUETERS":{"schedule"}, etc}
	@JsonProperty("rs")
	private Map<String, Schedule> rateSourceSchedules;
	
	public Map<String, String> getRatePublisherPropertiesMap() {
		return ratePublisherPropertiesMap;
	}

	public void setRatePublisherPropertiesMap(
			Map<String, String> ratePublisherPropertiesMap) {
		this.ratePublisherPropertiesMap = ratePublisherPropertiesMap;
	}

	public Map<String, List<CcyPair>> getRateSourceCurrencyPairsMap() {
		return rateSourceCurrencyPairsMap;
	}

	public void setRateSourceCurrencyPairsMap(Map<String, List<CcyPair>> rateSourceCurrencyPairsMap) {
		this.rateSourceCurrencyPairsMap = rateSourceCurrencyPairsMap;
	}

	public Set<String> getBasisPointsRics() {
		return basisPointsRics;
	}

	public void setBasisPointsRics(Set<String> basisPointsRics) {
		this.basisPointsRics = basisPointsRics;
	}
}