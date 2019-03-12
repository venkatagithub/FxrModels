package com.cibc.fxr.communication.model;

import com.cibc.fxr.communication.enums.BulletinCurrencyStatus;
import com.cibc.fxr.communication.enums.RateOption;
import com.cibc.fxr.communication.enums.RateType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BulletinTradedCurrency extends ModelBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6868765915085795842L;
	
	@JsonProperty("wc")
	private String withdrawalCcyCode;

	@JsonProperty("fc")
	private String foreignCcyCode;
	
	@JsonProperty("sells")
	private BulletinCurrencyStatus sellStatus;
	
	@JsonProperty("buys")
	private BulletinCurrencyStatus buyStatus;
	
	@JsonProperty("sccy")
	private String spreadCcyCode;
	
	//COMPONENT or DIRECT
	@JsonProperty("rtype")
	private RateType rateType;
	
	//MKT Rate to be used for calculation, MID rate or BID/OFFER rate
	@JsonProperty("roption")
	private RateOption rateOption;
	
	@JsonProperty("rinv")
	private Boolean rateInverted;
	
	public String getForeignCcyCode() {
		return foreignCcyCode;
	}

	public void setForeignCcyCode(String foreignCcyCode) {
		this.foreignCcyCode = foreignCcyCode;
	}

	public BulletinCurrencyStatus getSellStatus() {
		return sellStatus;
	}

	public void setSellStatus(BulletinCurrencyStatus sellStatus) {
		this.sellStatus = sellStatus;
	}

	public BulletinCurrencyStatus getBuyStatus() {
		return buyStatus;
	}

	public void setBuyStatus(BulletinCurrencyStatus buyStatus) {
		this.buyStatus = buyStatus;
	}

	public String getSpreadCcyCode() {
		return spreadCcyCode;
	}

	public void setSpreadCcyCode(String spreadCcyCode) {
		this.spreadCcyCode = spreadCcyCode;
	}

	public RateType getRateType() {
		return rateType;
	}

	public void setRateType(RateType rateType) {
		this.rateType = rateType;
	}

	public RateOption getRateOption() {
		return rateOption;
	}

	public void setRateOption(RateOption rateOption) {
		this.rateOption = rateOption;
	}

	public Boolean getRateInverted() {
		return rateInverted;
	}

	public void setRateInverted(Boolean rateInverted) {
		this.rateInverted = rateInverted;
	}

	public String getWithdrawalCcyCode() {
		return withdrawalCcyCode;
	}

	public void setWithdrawalCcyCode(String withdrawalCcyCode) {
		this.withdrawalCcyCode = withdrawalCcyCode;
	}

}