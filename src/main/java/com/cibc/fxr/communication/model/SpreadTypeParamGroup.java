package com.cibc.fxr.communication.model;

import com.cibc.fxr.communication.enums.SpreadType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpreadTypeParamGroup extends ModelBase{

	private static final long serialVersionUID = 4671670801405239672L;

	@JsonProperty("st")
	private SpreadType spreadType;
	
	@JsonProperty("sg")
	private String parameterGroup;

	public SpreadTypeParamGroup() {		
	}
	
	public SpreadTypeParamGroup(SpreadType spreadType, String parameterGroup) {
		this.spreadType = spreadType;
		this.parameterGroup = parameterGroup;
	}


	public SpreadType getSpreadType() {
		return spreadType;
	}

	public void setSpreadType(SpreadType spreadType) {
		this.spreadType = spreadType;
	}

	public String getParameterGroup() {
		return parameterGroup;
	}

	public void setParameterGroup(String parameterGroup) {
		this.parameterGroup = parameterGroup;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((parameterGroup == null) ? 0 : parameterGroup.hashCode());
		result = prime * result
				+ ((spreadType == null) ? 0 : spreadType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpreadTypeParamGroup other = (SpreadTypeParamGroup) obj;
		if (parameterGroup == null) {
			if (other.parameterGroup != null)
				return false;
		} else if (!parameterGroup.equals(other.parameterGroup))
			return false;
		if (spreadType == null) {
			if (other.spreadType != null)
				return false;
		} else if (!spreadType.equals(other.spreadType))
			return false;
		return true;
	}
	
	
	
}