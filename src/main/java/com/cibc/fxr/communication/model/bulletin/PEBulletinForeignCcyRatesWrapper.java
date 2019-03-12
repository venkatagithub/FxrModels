package com.cibc.fxr.communication.model.bulletin;

import java.util.List;
import java.util.Map;

import com.cibc.fxr.communication.model.FinalSpreadConfiguration;
import com.cibc.fxr.communication.model.ModelBase;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class PEBulletinForeignCcyRatesWrapper extends ModelBase{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 822596048822464982L;
	
	@JsonProperty("rid")
	private Long rateId;
	
	@JsonProperty("bsl")
	private List<FinalSpreadConfiguration> bestRateSpreadList;
		
	@JsonProperty("msl")
	private List<FinalSpreadConfiguration> clientMarketRateSpreadList;
	
	@JsonProperty("csl")
	private List<FinalSpreadConfiguration> clientRateSpreadList;

	@JsonProperty("rmp")
	private Map<String, Map<String,PEBulletinForeignCcyRates>> rateMap; //[BUY, [{GOLD-60,PEBulletinForeignCcyRate1},{GOLD-120,PEBulletinForeignCcyRate2},...] ]

	public Long getRateId() {
		return rateId;
	}

	public void setRateId(Long rateId) {
		this.rateId = rateId;
	}
	
	public List<FinalSpreadConfiguration> getBestRateSpreadList() {
		return bestRateSpreadList;
	}

	public void setBestRateSpreadList(
			List<FinalSpreadConfiguration> bestRateSpreadList) {
		this.bestRateSpreadList = bestRateSpreadList;
	}

	public List<FinalSpreadConfiguration> getClientMarketRateSpreadList() {
		return clientMarketRateSpreadList;
	}

	public void setClientMarketRateSpreadList(
			List<FinalSpreadConfiguration> clientMarketRateSpreadList) {
		this.clientMarketRateSpreadList = clientMarketRateSpreadList;
	}

	public List<FinalSpreadConfiguration> getClientRateSpreadList() {
		return clientRateSpreadList;
	}

	public void setClientRateSpreadList(
			List<FinalSpreadConfiguration> clientRateSpreadList) {
		this.clientRateSpreadList = clientRateSpreadList;
	}

	public Map<String, Map<String,PEBulletinForeignCcyRates>> getRateMap() {
		return rateMap;
	}

	public void setRateMap(Map<String, Map<String,PEBulletinForeignCcyRates>> rateMap) {
		this.rateMap = rateMap;
	}

}