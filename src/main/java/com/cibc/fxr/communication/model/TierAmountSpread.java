package com.cibc.fxr.communication.model;

import java.math.BigDecimal;

import com.cibc.fxr.communication.enums.PnLCcy;
import com.fasterxml.jackson.annotation.JsonProperty;


@SuppressWarnings("serial")
public class TierAmountSpread extends ModelBase{
	
	@JsonProperty("amt")
	private BigDecimal amount;
	
	@JsonProperty("stg")
	private SpreadTypeGroup spreadTypeGroup;
	
	@JsonProperty("bsf")
	private int bidSpreadFactor;
	
	@JsonProperty("osf")
	private int offerSpreadFactor;
	
	@JsonProperty("pc")
	private PnLCcy pnlCcy;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public SpreadTypeGroup getSpreadTypeGroup() {
		return spreadTypeGroup;
	}

	public void setSpreadTypeGroup(SpreadTypeGroup spreadTypeGroup) {
		this.spreadTypeGroup = spreadTypeGroup;
	}

	public int getBidSpreadFactor() {
		return bidSpreadFactor;
	}

	public void setBidSpreadFactor(int bidSpreadFactor) {
		this.bidSpreadFactor = bidSpreadFactor;
	}

	public int getOfferSpreadFactor() {
		return offerSpreadFactor;
	}

	public void setOfferSpreadFactor(int offerSpreadFactor) {
		this.offerSpreadFactor = offerSpreadFactor;
	}

	public PnLCcy getPnlCcy() {
		return pnlCcy;
	}

	public void setPnlCcy(PnLCcy pnlCcy) {
		this.pnlCcy = pnlCcy;
	}

	@Override
	public String toString() {
		return "TierAmountSpread [amount=" + amount + ", spreadTypeGroup="
				+ spreadTypeGroup + ", bidSpreadFactor=" + bidSpreadFactor
				+ ", offerSpreadFactor=" + offerSpreadFactor + ", pnlCcy="
				+ pnlCcy + "]";
	}

}