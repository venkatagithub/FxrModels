package com.cibc.fxr.communication.model.bulletin;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.cibc.fxr.communication.enums.BulletinCurrencyStatus;
import com.cibc.fxr.communication.enums.RateOption;
import com.cibc.fxr.communication.model.ModelBase;
import com.cibc.fxr.marketrates.Rate;
import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PEBulletinForeignCcyBracket extends ModelBase{
	
	private static final long serialVersionUID = -3991966937916726532L;

	@JsonProperty("lcy")
	private String limitCcyCode;
	
	@JsonProperty("fcy")
	private String foreignCcyCode;
	
	@JsonProperty("fbs")
	private BulletinCurrencyStatus foreignCcyBuyStatus;
	
	@JsonProperty("fss")
	private BulletinCurrencyStatus foreignCcySellStatus;
	
	@JsonProperty("mr")
	private Rate marketRate;
	
	@JsonProperty("rsc")
	@Deprecated
	private long rateSourceCode;

	@JsonProperty("brsc")
	private String baseRateSource;
	
	@JsonProperty("prsc")
	private String pricedRateSource;
	
	@JsonProperty("rto")
	private RateOption rateOption;   //MID or BIDOFFER
	
	//[1000:{BUY:PEBulletinParameter1,SELL:BUY:PEBulletinParameter2},2000:{BUY:PEBulletinParameter3,SELL:BUY:PEBulletinParameter4}...]
	@JsonProperty("rlp")
	@Deprecated
	private Map<BigDecimal, List<PEBulletinParameterRate>> rateLimitParamMap;

	//[1000:{BUY:PEBulletinSpreadAndRate1,SELL:PEBulletinSpreadAndRate2},2000:{BUY:PEBulletinSpreadAndRate3,SELL:BUY:PEBulletinSpreadAndRate4}...]
	@JsonProperty("rates")
	private Map<BigDecimal, List<PEBulletinSpreadAndRate>> bulletinRates;  
	
	public String getLimitCcyCode() {
		return limitCcyCode;
	}

	public void setLimitCcyCode(String limitCcyCode) {
		this.limitCcyCode = limitCcyCode;
	}

	public String getForeignCcyCode() {
		return foreignCcyCode;
	}

	public void setForeignCcyCode(String foreignCcyCode) {
		this.foreignCcyCode = foreignCcyCode;
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

	public Rate getMarketRate() {
		return marketRate;
	}

	public void setMarketRate(Rate marketRate) {
		this.marketRate = marketRate;
	}

	@Deprecated
	public long getRateSourceCode() {
		return rateSourceCode;
	}

	@Deprecated
	public void setRateSourceCode(long rateSourceCode) {
		this.rateSourceCode = rateSourceCode;
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

	@Deprecated
	public Map<BigDecimal, List<PEBulletinParameterRate>> getRateLimitParamMap() {
		return rateLimitParamMap;
	}

	@Deprecated
	public void setRateLimitParamMap(Map<BigDecimal, List<PEBulletinParameterRate>> rateLimitParamMap) {
		this.rateLimitParamMap = rateLimitParamMap;
	}
	
	public Map<BigDecimal, List<PEBulletinSpreadAndRate>> getBulletinRates() {
		return bulletinRates;
	}

	public void setBulletinRates(Map<BigDecimal, List<PEBulletinSpreadAndRate>> bulletinRates) {
		this.bulletinRates = bulletinRates;
	}

	public RateOption getRateOption() {
		return rateOption;
	}

	public void setRateOption(RateOption rateOption) {
		this.rateOption = rateOption;
	}

}