package com.cibc.fxr.communication.model.bulletin;

import com.cibc.fxr.communication.enums.BulletinCurrencyStatus;
import com.cibc.fxr.communication.model.ModelBase;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class PEBulletinInactiveForeignCcy extends ModelBase{
	
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("fcy")
	private String foreignCcyCode;
	
	@JsonProperty("prc")
	private int precision;
	
	@JsonProperty("fbs")
	private BulletinCurrencyStatus foreignCcyBuyStatus;
	
	@JsonProperty("fss")
	private BulletinCurrencyStatus foreignCcySellStatus;

	public String getForeignCcyCode() {
		return foreignCcyCode;
	}

	public void setForeignCcyCode(String foreignCcyCode) {
		this.foreignCcyCode = foreignCcyCode;
	}
	
	public int getPrecision() {
		return precision;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
	}

	public BulletinCurrencyStatus getForeignCcyBuyStatus() {
		return foreignCcyBuyStatus;
	}

	public void setForeignCcyBuyStatus(BulletinCurrencyStatus foreignCcyBuyStatus) {
		this.foreignCcyBuyStatus = foreignCcyBuyStatus;
	}

	public BulletinCurrencyStatus getForeignCcySellStatus() {
		return foreignCcySellStatus;
	}

	public void setForeignCcySellStatus(BulletinCurrencyStatus foreignCcySellStatus) {
		this.foreignCcySellStatus = foreignCcySellStatus;
	}
	

}