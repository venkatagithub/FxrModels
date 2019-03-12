package com.cibc.fxr.communication.model;

import com.cibc.fxr.communication.enums.PnLCcy;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TierParameterMapping extends ModelBase{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 893217362318932235L;


	@JsonProperty("stg")
	private SpreadTypeParamGroup spreadTypeParamGroup;
	
	@JsonProperty("pc")
	private PnLCcy pnlCcy;

	public SpreadTypeParamGroup getSpreadTypeParamGroup() {
		return spreadTypeParamGroup;
	}

	public void setSpreadTypeParamGroup(SpreadTypeParamGroup spreadTypeParamGroup) {
		this.spreadTypeParamGroup = spreadTypeParamGroup;
	}

	public PnLCcy getPnlCcy() {
		return pnlCcy;
	}

	public void setPnlCcy(PnLCcy pnlCcy) {
		this.pnlCcy = pnlCcy;
	}
	
	

}