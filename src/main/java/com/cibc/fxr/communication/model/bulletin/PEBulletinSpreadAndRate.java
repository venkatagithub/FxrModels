package com.cibc.fxr.communication.model.bulletin;

import java.util.Map;
import java.util.UUID;

import com.cibc.fxr.communication.model.AggregatedSpreadConfiguration;
import com.cibc.fxr.communication.model.ModelBase;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PEBulletinSpreadAndRate extends ModelBase{

	private static final long serialVersionUID = 1L;
	
	// Use this to link to the corresponding DB Object (PBULLETIN_TIER_FCCY_LMTS) to get the DB generated key (RATE_ID)
	@JsonIgnore
	private String dbPersistLinkingKey = UUID.randomUUID().toString();

	@JsonProperty("rid")
	private Long rateId;
	
	@JsonProperty("pvl")
	private String paramValue;   //eg. GOLD-160
	
	@JsonProperty("brs")
	private AggregatedSpreadConfiguration bestRateSpread;
		
	@JsonProperty("mrs")
	private AggregatedSpreadConfiguration marketRateSpread;
	
	@JsonProperty("crs")
	private AggregatedSpreadConfiguration clientRateSpread;
	
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

	public AggregatedSpreadConfiguration getBestRateSpread() {
		return bestRateSpread;
	}

	public void setBestRateSpread(AggregatedSpreadConfiguration bestRateSpread) {
		this.bestRateSpread = bestRateSpread;
	}

	public AggregatedSpreadConfiguration getMarketRateSpread() {
		return marketRateSpread;
	}

	public void setMarketRateSpread(AggregatedSpreadConfiguration marketRateSpread) {
		this.marketRateSpread = marketRateSpread;
	}

	public AggregatedSpreadConfiguration getClientRateSpread() {
		return clientRateSpread;
	}

	public void setClientRateSpread(AggregatedSpreadConfiguration clientRateSpread) {
		this.clientRateSpread = clientRateSpread;
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