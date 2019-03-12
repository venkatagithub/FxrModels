package com.cibc.fxr.communication.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AggregatedSpreadConfiguration  extends ModelBase{

	private static final long serialVersionUID = 1L;

	@JsonProperty("fcsprd")
	private FinalSpreadConfiguration pnlCcyFcfinalSpreads;
	
	@JsonProperty("wcsprd")
	private FinalSpreadConfiguration pnlCcyWcfinalSpreads;
	
	public FinalSpreadConfiguration getPnlCcyFcfinalSpreads() {
		return pnlCcyFcfinalSpreads;
	}
	
	public void setPnlCcyFcfinalSpreads(
			FinalSpreadConfiguration pnlCcyFcfinalSpreads) {
		this.pnlCcyFcfinalSpreads = pnlCcyFcfinalSpreads;
	}

	public FinalSpreadConfiguration getPnlCcyWcfinalSpreads() {
		return pnlCcyWcfinalSpreads;
	}

	public void setPnlCcyWcfinalSpreads(
			FinalSpreadConfiguration pnlCcyWcfinalSpreads) {
		this.pnlCcyWcfinalSpreads = pnlCcyWcfinalSpreads;
	}

	public AggregatedSpreadConfiguration(){
		
	}
	
	public AggregatedSpreadConfiguration(
			FinalSpreadConfiguration pnlCcyFcfinalSpreads,
			FinalSpreadConfiguration pnlCcyWcfinalSpreads) {
		super();
		this.pnlCcyFcfinalSpreads = pnlCcyFcfinalSpreads;
		this.pnlCcyWcfinalSpreads = pnlCcyWcfinalSpreads;
	}

	@Override
	public String toString() {
		return "AggregatedSpreadConfiguration [pnlCcyFcfinalSpreads="
				+ pnlCcyFcfinalSpreads + ", pnlCcyWcfinalSpreads="
				+ pnlCcyWcfinalSpreads + "]";
	}
	
	
}