package com.cibc.fxr.communication.config;

import java.util.*;

import com.cibc.fxr.communication.model.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PricingEngineConfiguration extends ModelBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2687480583351148845L;

	@JsonProperty("bConfL")
	private List<BulletinConfigurationDetail> bulletinConfigurationDetailList;

	@JsonProperty("sdl")
	private List<SpreadMatrix> spreadMatrixList;
	
	@JsonProperty("spl")
	private List<SpreadParameterMatrix> spreadParameterMatrixList;
	
	@JsonProperty("tl")
	private Map<String, List<TierSpreadsMapping>> tierDataMap;

	@JsonProperty("tp")
	private Map<String, List<TierParameterMapping>> tierParametersMap; //eg. {"T1-PPC Default-CAD":{TierParameterMapping1, TierParameterMappin2}, etc.} (Key is TierCode-TierDescription-Bulletin ccy)
	
	@JsonProperty("s")
	private Map<String, Schedule> globalSchedules;

	@JsonProperty("h")
	private Map<String, List<Date>> globalHolidays;
	
	@JsonProperty("pep")
	private Map<String, String> pricingEnginePropertiesMap;

	public List<BulletinConfigurationDetail> getBulletinConfigurationDetailList() {
		return bulletinConfigurationDetailList;
	}

	public void setBulletinConfigurationDetailList(
			List<BulletinConfigurationDetail> bulletinConfigurationDetailList) {
		this.bulletinConfigurationDetailList = bulletinConfigurationDetailList;
	}

	public List<SpreadMatrix> getSpreadMatrixList() {
		return spreadMatrixList;
	}

	public void setSpreadMatrixList(List<SpreadMatrix> spreadMatrixList) {
		this.spreadMatrixList = spreadMatrixList;
	}

	public Map<String, List<TierSpreadsMapping>> getTierDataMap() {
		return tierDataMap;
	}

	public void setTierDataMap(Map<String, List<TierSpreadsMapping>> tierDataMap) {
		this.tierDataMap = tierDataMap;
	}

	public Map<String, Schedule> getGlobalSchedules() {
		return globalSchedules;
	}

	public void setGlobalSchedules(Map<String, Schedule> globalSchedules) {
		this.globalSchedules = globalSchedules;
	}

	public Map<String, List<Date>> getGlobalHolidays() {
		return globalHolidays;
	}

	public void setGlobalHolidays(Map<String, List<Date>> globalHolidays) {
		this.globalHolidays = globalHolidays;
	}

	public Map<String, String> getPricingEnginePropertiesMap() {
		return pricingEnginePropertiesMap;
	}

	public void setPricingEnginePropertiesMap(
			Map<String, String> pricingEnginePropertiesMap) {
		this.pricingEnginePropertiesMap = pricingEnginePropertiesMap;
	}

	public List<SpreadParameterMatrix> getSpreadParameterMatrixList() {
		return spreadParameterMatrixList;
	}

	public void setSpreadParameterMatrixList(
			List<SpreadParameterMatrix> spreadParameterMatrixList) {
		this.spreadParameterMatrixList = spreadParameterMatrixList;
	}

	public Map<String, List<TierParameterMapping>> getTierParametersMap() {
		return tierParametersMap;
	}

	public void setTierParametersMap(
			Map<String, List<TierParameterMapping>> tierParametersMap) {
		this.tierParametersMap = tierParametersMap;
	}
	
}