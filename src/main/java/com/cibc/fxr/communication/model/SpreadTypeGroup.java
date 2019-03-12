package com.cibc.fxr.communication.model;

import com.cibc.fxr.communication.enums.SpreadType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpreadTypeGroup extends ModelBase{

	private static final long serialVersionUID = 4671670801405239672L;

	@JsonProperty("st")
	private SpreadType spreadType;
	
	@JsonProperty("sg")
	private String spreadGroup;

	public SpreadTypeGroup() {		
	}
	
	public SpreadTypeGroup(SpreadType spreadType, String spreadGroup) {
		this.spreadType = spreadType;
		this.spreadGroup = spreadGroup;
	}

	public SpreadType getSpreadType() {
		return spreadType;
	}

	public String getSpreadGroup() {
		return spreadGroup;
	}
	public void setSpreadType(SpreadType spreadType) {
		this.spreadType = spreadType;
	}

	public void setSpreadGroup(String spreadGroup) {
		this.spreadGroup = spreadGroup;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((spreadGroup == null) ? 0 : spreadGroup.hashCode());
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
		SpreadTypeGroup other = (SpreadTypeGroup) obj;
		if (spreadGroup == null) {
			if (other.spreadGroup != null)
				return false;
		} else if (!spreadGroup.equals(other.spreadGroup))
			return false;
		if (spreadType == null) {
			if (other.spreadType != null)
				return false;
		} else if (!spreadType.equals(other.spreadType))
			return false;
		return true;
	}
	
	
	
}