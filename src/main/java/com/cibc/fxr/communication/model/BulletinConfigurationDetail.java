package com.cibc.fxr.communication.model;

import java.util.List;

import com.cibc.fxr.marketrates.RatePublishModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BulletinConfigurationDetail extends ModelBase {

	/**
		 * 
		 */
	private static final long serialVersionUID = 6195740408174607780L;

	@JsonProperty("bt")
	private String bulletinType;
	
	@JsonProperty("bwc")
	private String bulletinWithdrawalCcy;

	@JsonProperty("fcl")
	private List<BulletinTradedCurrency> foreignCurrencyList;

	@JsonProperty("bdst")
	private List<BulletinDestScheduleTiers> bDestScheduleTiers;

	@JsonProperty("manualRatesModel")
	private RatePublishModel manualRatesModel;
	
	public List<BulletinDestScheduleTiers> getbDestScheduleTiers() {
		return bDestScheduleTiers;
	}

	public void setbDestScheduleTiers(
			List<BulletinDestScheduleTiers> bDestScheduleTiers) {
		this.bDestScheduleTiers = bDestScheduleTiers;
	}

	public String getBulletinType() {
		return bulletinType;
	}

	public void setBulletinType(String bulletinType) {
		this.bulletinType = bulletinType;
	}

	public String getBulletinWithdrawalCcy() {
		return bulletinWithdrawalCcy;
	}

	public void setBulletinWithdrawalCcy(String bulletinWithdrawalCcy) {
		this.bulletinWithdrawalCcy = bulletinWithdrawalCcy;
	}

	public List<BulletinTradedCurrency> getForeignCurrencyList() {
		return foreignCurrencyList;
	}

	public void setForeignCurrencyList(
			List<BulletinTradedCurrency> foreignCurrencyList) {
		this.foreignCurrencyList = foreignCurrencyList;
	}

	public RatePublishModel getManualRatesModel() {
		return manualRatesModel;
	}

	public void setManualRatesModel(RatePublishModel manualRatesModel) {
		this.manualRatesModel = manualRatesModel;
	}


}