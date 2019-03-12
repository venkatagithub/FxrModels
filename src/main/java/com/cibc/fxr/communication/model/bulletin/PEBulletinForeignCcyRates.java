package com.cibc.fxr.communication.model.bulletin;

import java.math.BigDecimal;

import com.cibc.fxr.communication.model.ModelBase;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PEBulletinForeignCcyRates extends ModelBase{

	private static final long serialVersionUID = 1L;

	
	@JsonProperty("eql")
	private BigDecimal eqvlntLimit;
	
	@JsonProperty("eqsl")
	private BigDecimal eqvlntStaffLimit;
	
	@JsonProperty("crt")
	private BigDecimal clientRate;
	
	@JsonProperty("brt")
	private BigDecimal bestRate;
	
	@JsonProperty("wrt")
	private BigDecimal wbMarketRate;
	
	@JsonProperty("c1cr")
	private BigDecimal ccy1ClientRate;
	
	@JsonProperty("c2cr")
	private BigDecimal ccy2ClientRate;
	
	
	@JsonProperty("c1wbmr")
	private BigDecimal ccy1ClientWbRate;
	
	@JsonProperty("c2wbmr")
	private BigDecimal ccy2ClientWbRate;

	
	@JsonProperty("c1br")
	private BigDecimal ccy1ClientBestRate;
	
	@JsonProperty("c2br")
	private BigDecimal ccy2ClientBestRate;

	public BigDecimal getEqvlntLimit() {
		return eqvlntLimit;
	}

	public void setEqvlntLimit(BigDecimal eqvlntLimit) {
		this.eqvlntLimit = eqvlntLimit;
	}

	public BigDecimal getEqvlntStaffLimit() {
		return eqvlntStaffLimit;
	}

	public void setEqvlntStaffLimit(BigDecimal eqvlntStaffLimit) {
		this.eqvlntStaffLimit = eqvlntStaffLimit;
	}

	public BigDecimal getClientRate() {
		return clientRate;
	}

	public void setClientRate(BigDecimal clientRate) {
		this.clientRate = clientRate;
	}

	public BigDecimal getBestRate() {
		return bestRate;
	}

	public void setBestRate(BigDecimal bestRate) {
		this.bestRate = bestRate;
	}

	public BigDecimal getWbMarketRate() {
		return wbMarketRate;
	}

	public void setWbMarketRate(BigDecimal wbMarketRate) {
		this.wbMarketRate = wbMarketRate;
	}

	public BigDecimal getCcy1ClientRate() {
		return ccy1ClientRate;
	}

	public void setCcy1ClientRate(BigDecimal ccy1ClientRate) {
		this.ccy1ClientRate = ccy1ClientRate;
	}

	public BigDecimal getCcy2ClientRate() {
		return ccy2ClientRate;
	}

	public void setCcy2ClientRate(BigDecimal ccy2ClientRate) {
		this.ccy2ClientRate = ccy2ClientRate;
	}

	public BigDecimal getCcy1ClientWbRate() {
		return ccy1ClientWbRate;
	}

	public void setCcy1ClientWbRate(BigDecimal ccy1ClientWbRate) {
		this.ccy1ClientWbRate = ccy1ClientWbRate;
	}

	public BigDecimal getCcy2ClientWbRate() {
		return ccy2ClientWbRate;
	}

	public void setCcy2ClientWbRate(BigDecimal ccy2ClientWbRate) {
		this.ccy2ClientWbRate = ccy2ClientWbRate;
	}

	public BigDecimal getCcy1ClientBestRate() {
		return ccy1ClientBestRate;
	}

	public void setCcy1ClientBestRate(BigDecimal ccy1ClientBestRate) {
		this.ccy1ClientBestRate = ccy1ClientBestRate;
	}

	public BigDecimal getCcy2ClientBestRate() {
		return ccy2ClientBestRate;
	}

	public void setCcy2ClientBestRate(BigDecimal ccy2ClientBestRate) {
		this.ccy2ClientBestRate = ccy2ClientBestRate;
	}


}