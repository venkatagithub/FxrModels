package com.cibc.fxr.communication.model;

import java.math.BigDecimal;

import com.cibc.fxr.communication.enums.PnLCcy;
import com.cibc.fxr.communication.enums.SpreadFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FinalSpreadConfiguration extends ModelBase{

	private static final long serialVersionUID = 6172294416768856170L;

	private long id;
	
	@JsonProperty("lc")
	private String limitCcyCode;
	
	@JsonProperty("amt")
	private BigDecimal amount;
	
	@JsonProperty("sf")
	@Deprecated
	private SpreadFormat spreadFormat;
	
	@JsonProperty("bs")
	@Deprecated
	private BigDecimal bidSpread;
	
	@JsonProperty("as")
	@Deprecated
	private BigDecimal askSpread;
	
	@JsonProperty("pbsd")
	@Deprecated
	private String paramBidSprdDetails;  //eg. 0.003+0.002
	
	@JsonProperty("pasd")
	@Deprecated
	private String paramAskSprdDetails;  //eg. 0.003+0.002
	
	@JsonProperty("bdperspr")
	private BigDecimal bidPercentageSpread;
	
	@JsonProperty("ofperspr")
	private BigDecimal offerPercentageSpread;
	
	@JsonProperty("bdbpsspr")
	private BigDecimal bidBpsSpread;
	
	@JsonProperty("ofbpsspr")
	private BigDecimal offerBpsSpread;
	
	@JsonProperty("bdricspr")
	private BigDecimal bidRicSpread;
	
	@JsonProperty("ofricspr")
	private BigDecimal offerRicSpread;
	
	@JsonProperty("pbdperspr")
	private BigDecimal paramBidPercentageSpread;

	@JsonProperty("poffperspr")
	private BigDecimal paramOfferPercentageSpread;

	@JsonProperty("pbdbpsspr")
	private BigDecimal paramBidBpsSpread;
	
	@JsonProperty("pofbpsspr")
	private BigDecimal paramOfferBpsSpread;
	
	@JsonProperty("pnlc")
	private PnLCcy pnlCcy;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLimitCcyCode() {
		return limitCcyCode;
	}

	public void setLimitCcyCode(String limitCcyCode) {
		this.limitCcyCode = limitCcyCode;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	@Deprecated
	public SpreadFormat getSpreadFormat() {
		return spreadFormat;
	}

	@Deprecated
	public void setSpreadFormat(SpreadFormat spreadFormat) {
		this.spreadFormat = spreadFormat;
	}
	
	@Deprecated
	public BigDecimal getBidSpread() {
		return bidSpread;
	}

	@Deprecated
	public void setBidSpread(BigDecimal bidSpread) {
		this.bidSpread = bidSpread;
	}

	@Deprecated
	public BigDecimal getAskSpread() {
		return askSpread;
	}

	@Deprecated
	public void setAskSpread(BigDecimal askSpread) {
		this.askSpread = askSpread;
	}

	@Deprecated
	public String getParamBidSprdDetails() {
		return paramBidSprdDetails;
	}
	
	@Deprecated
	public void setParamBidSprdDetails(String paramBidSprdDetails) {
		this.paramBidSprdDetails = paramBidSprdDetails;
	}
	
	@Deprecated
	public String getParamAskSprdDetails() {
		return paramAskSprdDetails;
	}
	
	@Deprecated
	public void setParamAskSprdDetails(String paramAskSprdDetails) {
		this.paramAskSprdDetails = paramAskSprdDetails;
	}

	public BigDecimal getBidPercentageSpread() {
		return bidPercentageSpread;
	}

	public void setBidPercentageSpread(BigDecimal bidPercentageSpread) {
		this.bidPercentageSpread = bidPercentageSpread;
	}

	public BigDecimal getOfferPercentageSpread() {
		return offerPercentageSpread;
	}

	public void setOfferPercentageSpread(BigDecimal offerPercentageSpread) {
		this.offerPercentageSpread = offerPercentageSpread;
	}

	public BigDecimal getBidBpsSpread() {
		return bidBpsSpread;
	}

	public void setBidBpsSpread(BigDecimal bidBpsSpread) {
		this.bidBpsSpread = bidBpsSpread;
	}

	public BigDecimal getOfferBpsSpread() {
		return offerBpsSpread;
	}

	public void setOfferBpsSpread(BigDecimal offerBpsSpread) {
		this.offerBpsSpread = offerBpsSpread;
	}

	public BigDecimal getBidRicSpread() {
		return bidRicSpread;
	}

	public void setBidRicSpread(BigDecimal bidRicSpread) {
		this.bidRicSpread = bidRicSpread;
	}

	public BigDecimal getOfferRicSpread() {
		return offerRicSpread;
	}

	public void setOfferRicSpread(BigDecimal offerRicSpread) {
		this.offerRicSpread = offerRicSpread;
	}

	public BigDecimal getParamBidPercentageSpread() {
		return paramBidPercentageSpread;
	}

	public void setParamBidPercentageSpread(BigDecimal paramBidPercentageSpread) {
		this.paramBidPercentageSpread = paramBidPercentageSpread;
	}

	public BigDecimal getParamOfferPercentageSpread() {
		return paramOfferPercentageSpread;
	}

	public void setParamOfferPercentageSpread(BigDecimal paramOfferPercentageSpread) {
		this.paramOfferPercentageSpread = paramOfferPercentageSpread;
	}

	public BigDecimal getParamBidBpsSpread() {
		return paramBidBpsSpread;
	}

	public void setParamBidBpsSpread(BigDecimal paramBidBpsSpread) {
		this.paramBidBpsSpread = paramBidBpsSpread;
	}

	public BigDecimal getParamOfferBpsSpread() {
		return paramOfferBpsSpread;
	}

	public void setParamOfferBpsSpread(BigDecimal paramOfferBpsSpread) {
		this.paramOfferBpsSpread = paramOfferBpsSpread;
	}

	public PnLCcy getPnlCcy() {
		return pnlCcy;
	}

	public void setPnlCcy(PnLCcy pnlCcy) {
		this.pnlCcy = pnlCcy;
	}

	@Override
	public String toString() {
		return "FinalSpreadConfiguration [id=" + id + ", limitCcyCode="
				+ limitCcyCode + ", amount=" + amount
				+ ", bidPercentageSpread=" + bidPercentageSpread
				+ ", offerPercentageSpread=" + offerPercentageSpread
				+ ", bidBpsSpread=" + bidBpsSpread + ", offerBpsSpread="
				+ offerBpsSpread + ", bidRicSpread=" + bidRicSpread
				+ ", offerRicSpread=" + offerRicSpread
				+ ", paramBidPercentageSpread=" + paramBidPercentageSpread
				+ ", paramOfferPercentageSpread=" + paramOfferPercentageSpread
				+ ", paramBidBpsSpread=" + paramBidBpsSpread
				+ ", paramOfferBpsSpread=" + paramOfferBpsSpread + ", pnlCcy="
				+ pnlCcy + "]";
	}

}