package com.cibc.fxr.communication.model.bulletin;

import java.util.List;

import com.cibc.fxr.communication.model.ModelBase;
import com.cibc.fxr.communication.model.Tier;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PEBulletinTierForeignCcy extends ModelBase{

	private static final long serialVersionUID = 1L;

	@JsonProperty("tier")
	private Tier tier;
	
	/*Parameter Format is a string of all parameter separated by '-' in any specific order
	Eg. SEGMENT-TIMEOUT */
	@JsonProperty("pkft")
	private String paramKeyFormat; 
	
	@JsonProperty("fbkt")
	private List<PEBulletinForeignCcyBracket> forgnCcyBracket;

	public Tier getTier() {
		return tier;
	}

	public void setTier(Tier tier) {
		this.tier = tier;
	}

	public String getParamKeyFormat() {
		return paramKeyFormat;
	}

	public void setParamKeyFormat(String paramKeyFormat) {
		this.paramKeyFormat = paramKeyFormat;
	}

	public List<PEBulletinForeignCcyBracket> getForgnCcyBracket() {
		return forgnCcyBracket;
	}

	public void setForgnCcyBracket(List<PEBulletinForeignCcyBracket> forgnCcyBracket) {
		this.forgnCcyBracket = forgnCcyBracket;
	}

}