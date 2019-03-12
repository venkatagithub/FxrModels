package com.cibc.fxr.communication.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpreadParameterMatrix extends ModelBase{

	private static final long serialVersionUID = 88088761894184627L;

	@JsonProperty("stg")
	private SpreadTypeParamGroup spreadTypeParamGroup;
	
	@JsonProperty("scl")
	private Map<String, ParameterConfiguration> spreadParamConfigMap; //TIMEOUT-15:ParameterConfiguration1, TIMEOUT-5:ParameterConfiguration1 etc. (TIMEOUT-5 == unique identifier with parameter and its value

	public SpreadTypeParamGroup getSpreadTypeParamGroup() {
		return spreadTypeParamGroup;
	}

	public void setSpreadTypeParamGroup(SpreadTypeParamGroup spreadTypeParamGroup) {
		this.spreadTypeParamGroup = spreadTypeParamGroup;
	}

	public Map<String, ParameterConfiguration> getSpreadParamConfigMap() {
		return spreadParamConfigMap;
	}

	public void setSpreadParamConfigMap(
			Map<String, ParameterConfiguration> spreadParamConfigMap) {
		this.spreadParamConfigMap = spreadParamConfigMap;
	}
}