package com.cibc.fxr.communication.model;

import java.util.List;

import com.cibc.fxr.communication.enums.BulletinCurrencyStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TierSpreadsMapping extends ModelBase{

	private static final long serialVersionUID = 3537371294293168387L;

	@JsonProperty("fcd")
	private String foreignCcyCode;

	@JsonProperty("brsc")
	private String baseRateSource;
	
	@JsonProperty("prsc")
	private String pricedRateSource;
	
	@JsonProperty("buyst")
	private BulletinCurrencyStatus buySideCurrencyStatus;

	@JsonProperty("sellst")
	private BulletinCurrencyStatus sellSideCurrencyStatus;
	
	@JsonProperty("as")
	private List<TierAmountSpread> amountSpreads;

	public String getForeignCcyCode() {
		return foreignCcyCode;
	}

	public void setForeignCcyCode(String foreignCcyCode) {
		this.foreignCcyCode = foreignCcyCode;
	}

	public String getBaseRateSource() {
		return baseRateSource;
	}

	public void setBaseRateSource(String baseRateSource) {
		this.baseRateSource = baseRateSource;
	}

	public String getPricedRateSource() {
		return pricedRateSource;
	}

	public void setPricedRateSource(String pricedRateSource) {
		this.pricedRateSource = pricedRateSource;
	}

	public BulletinCurrencyStatus getBuySideCurrencyStatus() {
		return buySideCurrencyStatus;
	}

	public void setBuySideCurrencyStatus(BulletinCurrencyStatus buySideCurrencyStatus) {
		this.buySideCurrencyStatus = buySideCurrencyStatus;
	}

	public BulletinCurrencyStatus getSellSideCurrencyStatus() {
		return sellSideCurrencyStatus;
	}

	public void setSellSideCurrencyStatus(BulletinCurrencyStatus sellSideCurrencyStatus) {
		this.sellSideCurrencyStatus = sellSideCurrencyStatus;
	}

	public List<TierAmountSpread> getAmountSpreads() {
		return amountSpreads;
	}

	public void setAmountSpreads(List<TierAmountSpread> amountSpreads) {
		this.amountSpreads = amountSpreads;
	}

}