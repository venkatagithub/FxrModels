package com.cibc.fxr.communication.model;

import java.math.BigDecimal;

import com.cibc.fxr.communication.enums.PnLCcy;
import com.cibc.fxr.communication.enums.SpreadFormat;
import com.cibc.fxr.communication.enums.SpreadType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ParameterConfiguration extends ModelBase{

	private static final long serialVersionUID = 1677243479709581127L;

	private long id;
	
	@JsonProperty("pt")
	private String paramType;
	
	@JsonProperty("pv")
	private String paramValue;
	
	@JsonProperty("sf")
	private SpreadFormat spreadFormat;
	
	@JsonProperty("bs")
	private BigDecimal bidSpread;
	
	@JsonProperty("os")
	private BigDecimal offerSpread;

	@JsonProperty("st")
	private SpreadType spreadType;
	
	@JsonProperty("pc")
	private PnLCcy pnlCcy;
	
	public BigDecimal getOfferSpread() {
		return offerSpread;
	}

	public void setOfferSpread(BigDecimal offerSpread) {
		this.offerSpread = offerSpread;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getParamType() {
		return paramType;
	}

	public void setParamType(String paramType) {
		this.paramType = paramType;
	}

	public String getParamValue() {
		return paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	public SpreadFormat getSpreadFormat() {
		return spreadFormat;
	}

	public void setSpreadFormat(SpreadFormat spreadFormat) {
		this.spreadFormat = spreadFormat;
	}

	public BigDecimal getBidSpread() {
		return bidSpread;
	}

	public void setBidSpread(BigDecimal bidSpread) {
		this.bidSpread = bidSpread;
	}

	public SpreadType getSpreadType() {
		return spreadType;
	}

	public void setSpreadType(SpreadType spreadType) {
		this.spreadType = spreadType;
	}

	public PnLCcy getPnlCcy() {
		return pnlCcy;
	}

	public void setPnlCcy(PnLCcy pnlCcy) {
		this.pnlCcy = pnlCcy;
	}

}