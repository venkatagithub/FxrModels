package com.cibc.fxr.communication.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tier extends ModelBase{

	private static final long serialVersionUID = 6064279165972774813L;

	@JsonProperty("code")
	private String tierCode;
	
	@JsonProperty("name")
	private String tierName;
	
	@JsonProperty("ccy")
	private String ccy;
	
	@JsonProperty("lc")
	private String limitCcyCode;

	public String getTierCode() {
		return tierCode;
	}
	public void setTierCode(String tierCode) {
		this.tierCode = tierCode;
	}
	public String getTierName() {
		return tierName;
	}
	public void setTierName(String name) {
		this.tierName = name;
	}
	
	public String getCcy() {
		return ccy;
	}
	public void setCcy(String ccy) {
		this.ccy = ccy;
	}
	public String getLimitCcyCode() {
		return limitCcyCode;
	}

	public void setLimitCcyCode(String limitCcyCode) {
		this.limitCcyCode = limitCcyCode;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tierCode == null) ? 0 : tierCode.hashCode());
		result = prime * result + ((tierName == null) ? 0 : tierName.hashCode());
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
		Tier other = (Tier) obj;
		if (tierCode == null) {
			if (other.tierCode != null)
				return false;
		} else if (!tierCode.equals(other.tierCode))
			return false;
		if (tierName == null) {
			if (other.tierName != null)
				return false;
		} else if (!tierName.equals(other.tierName))
			return false;
		return true;
	}

}