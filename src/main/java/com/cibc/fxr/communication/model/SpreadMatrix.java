package com.cibc.fxr.communication.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpreadMatrix extends ModelBase{

	private static final long serialVersionUID = 88088761894184627L;

	@JsonProperty("stg")
	private SpreadTypeGroup spreadTypeGroup;
	
	//{"USDINR":{SpreadConfiguration1}, "USDHKD":{SpreadConfiguration2}, etc}
	@JsonProperty("scl")
	private Map<String, SpreadConfiguration> spreadConfigMap;

	public SpreadTypeGroup getSpreadTypeGroup() {
		return spreadTypeGroup;
	}

	public void setSpreadTypeGroup(SpreadTypeGroup spreadTypeGroup) {
		this.spreadTypeGroup = spreadTypeGroup;
	}

	public Map<String, SpreadConfiguration> getSpreadConfigMap() {
		return spreadConfigMap;
	}

	public void setSpreadConfigMap(
			Map<String, SpreadConfiguration> spreadConfigMap) {
		this.spreadConfigMap = spreadConfigMap;
	}


}