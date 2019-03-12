package com.cibc.fxr.communication.model.bulletin;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.cibc.fxr.communication.model.FinalSpreadConfiguration;
import com.cibc.fxr.communication.model.ModelBase;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PEBulletinParameterRate  extends ModelBase{

	private static final long serialVersionUID = 1L;
	
	
	// Use this to link to the corresponding DB Object (PBULLETIN_TIER_FCCY_LMTS) to get the DB generated key (RATE_ID)
	@JsonIgnore
	private String dbPersistLinkingKey = UUID.randomUUID().toString();

	@JsonProperty("rid")
	private Long rateId;
	
	@JsonProperty("pvl")
	private String paramValue;   //GOLD-160
	
	@JsonProperty("bsl")
	private List<FinalSpreadConfiguration> bestRateSpreadList;
		
	@JsonProperty("msl")
	private List<FinalSpreadConfiguration> clientMarketRateSpreadList;
	
	@JsonProperty("csl")
	private List<FinalSpreadConfiguration> clientRateSpreadList;
	
	//[BUY:PEBulletinForeignCcyRate1,SELL:PEBulletinForeignCcyRate2,....]
	@JsonProperty("rmp")
	private Map<String, PEBulletinForeignCcyRates> rateMap;

	@JsonProperty("spccy")
	private String spreadCurrency;
	
	public Long getRateId() {
		return rateId;
	}

	public void setRateId(Long rateId) {
		this.rateId = rateId;
	}

	public String getParamValue() {
		return paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
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

	public Map<String, PEBulletinForeignCcyRates> getRateMap() {
		return rateMap;
	}

	public void setRateMap(Map<String, PEBulletinForeignCcyRates> rateMap) {
		this.rateMap = rateMap;
	}

	public String getSpreadCurrency() {
		return spreadCurrency;
	}

	public void setSpreadCurrency(String spreadCurrency) {
		this.spreadCurrency = spreadCurrency;
	}

	public String getDbPersistLinkingKey() {
		return dbPersistLinkingKey;
	}

	public void setDbPersistLinkingKey(String dbPersistLinkingKey) {
		this.dbPersistLinkingKey = dbPersistLinkingKey;
	} 
}