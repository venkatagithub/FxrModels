package com.cibc.fxr.marketrates;

import java.io.Serializable;
import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;



public class Rate implements Serializable {

	private  static Logger logger = LoggerFactory.getLogger(Rate.class);
	private static final long serialVersionUID = -2978524874239890698L;
	
	@JsonProperty("p")
	private String pair;
	
	@JsonProperty("c1b")
	private BigDecimal ccy1Bid;
	
	@JsonProperty("c1m")
	private BigDecimal ccy1Mid;
	
	@JsonProperty("c1o")
	private BigDecimal ccy1Offer;
	
	@JsonProperty("c2b")
	private BigDecimal ccy2Bid;
	
	@JsonProperty("c2m")
	private BigDecimal ccy2Mid;
	
	@JsonProperty("c2o")
	private BigDecimal ccy2Offer;
	
	@JsonProperty("xb")
    private BigDecimal crossCcyBid;
	
	@JsonProperty("xo")
    private BigDecimal crossCcyOffer;
	
	@JsonProperty("pc")
	private Integer precision = 6; // default but it later set by max value of the two ccy's
    
    @JsonIgnore
    private boolean midSet;
    @JsonIgnore
    private boolean bidOfferSet;
    
    @JsonIgnore   // see getErrorTypeValue() & setErrorTypeValue ()
    private RateErrorType rateErrorType = RateErrorType.NONE; 

    public Rate(){
    }


	public Rate(String p) {
		
		this.pair = p;
		ccy1Bid = new BigDecimal(1);
		ccy1Mid = new BigDecimal(1);
		ccy1Offer = new BigDecimal(1);
		ccy2Bid = new BigDecimal(1);
		ccy2Mid = new BigDecimal(1);
		ccy2Offer = new BigDecimal(1);
		crossCcyBid = new BigDecimal(1);
		crossCcyOffer = new BigDecimal(1);
	}
			
	
	public Rate(String p, BigDecimal c1b, BigDecimal c1o, BigDecimal c2b, BigDecimal c2o) {

		this.pair = p;
		this.ccy1Bid = c1b;
		this.ccy1Mid = c1b.add(c1o).divide(new BigDecimal(2));
		this.ccy1Offer = c1o;
		this.ccy2Bid = c2b;
		this.ccy2Mid = c2b.add(c2o).divide(new BigDecimal(2));
		this.ccy2Offer = c2o;
	}


	public Rate(String p, BigDecimal c1b, BigDecimal c1m, BigDecimal c1o, BigDecimal c2b, BigDecimal c2m, BigDecimal c2o) {

		this.pair = p;
		this.ccy1Bid = c1b;
		this.ccy1Mid = c1m;
		this.ccy1Offer = c1o;
		this.ccy2Bid = c2b;
		this.ccy2Mid = c2m;
		this.ccy2Offer = c2o;
	}
	
	public Rate(String p, BigDecimal c1b, BigDecimal c1m, BigDecimal c1o, BigDecimal c2b, BigDecimal c2m, BigDecimal c2o, BigDecimal xb, BigDecimal xo) {

		this.pair = p;
		this.ccy1Bid = c1b;
		this.ccy1Mid = c1m;
		this.ccy1Offer = c1o;
		this.ccy2Bid = c2b;
		this.ccy2Mid = c2m;
		this.ccy2Offer = c2o;
		this.crossCcyBid = xb;
		this.crossCcyOffer = xo;		
	}
	
	public Rate(String p, BigDecimal c1b, BigDecimal c1m, BigDecimal c1o, BigDecimal c2b, BigDecimal c2m, BigDecimal c2o, BigDecimal xb, BigDecimal xo, int precision) {

		this.pair = p;
		this.ccy1Bid = c1b;
		this.ccy1Mid = c1m;
		this.ccy1Offer = c1o;
		this.ccy2Bid = c2b;
		this.ccy2Mid = c2m;
		this.ccy2Offer = c2o;
		this.crossCcyBid = xb;
		this.crossCcyOffer = xo;
		this.precision = precision;
	}

	public Rate clone() {
		
		logger.info("clone rate " + this);
		
		Rate copy = new Rate(getPair()); 		
			
		// important to set this flag to ensure that rate consumer knows if rates are available
		if(!isFullyPopulated()) {
			copy.setBidOfferSet(false);
			logger.error(getPair() + " is not fully popuplated");
		}							
		else {
			copy.setBidOfferSet(isBidOfferSet());	
			copy.setMidSet(isMidSet());
			
			copy.setCcy1Bid(getCcy1Bid());				
			copy.setCcy1Offer(getCcy1Offer());
			try {
				copy.setCcy1Mid(getCcy1Bid().add(getCcy1Offer()).divide(new BigDecimal(2)));
			} catch (Exception e) {	
				logger.error("failed to set mid rate", e);
			}
			
			copy.setCcy2Bid(getCcy2Bid());				
			copy.setCcy2Offer(getCcy2Offer());
			try {
				copy.setCcy2Mid(getCcy1Bid().add(getCcy2Offer()).divide(new BigDecimal(2)));
			} catch (Exception e) {	
				logger.error("failed to set mid rate", e);
			}				
		}
		
		return  copy;
	}
	
	
	public String getPair() {
		return pair;
	}

	public void setPair(String p) {
		this.pair = p;
	}

	public BigDecimal getCcy1Bid() {
		return ccy1Bid;
	}

	public void setCcy1Bid(BigDecimal c1b) {
		this.ccy1Bid = c1b;
	}

	public BigDecimal getCcy1Mid() {
		return ccy1Mid;
	}

	public void setCcy1Mid(BigDecimal c1m) {
		this.ccy1Mid = c1m;
	}

	public BigDecimal getCcy1Offer() {
		return ccy1Offer;
	}

	public void setCcy1Offer(BigDecimal c1o) {
		this.ccy1Offer = c1o;
	}

	public BigDecimal getCcy2Bid() {
		return ccy2Bid;
	}

	public void setCcy2Bid(BigDecimal c2b) {
		this.ccy2Bid = c2b;
	}

	public BigDecimal getCcy2Mid() {
		return ccy2Mid;
	}

	public void setCcy2Mid(BigDecimal c2m) {
		this.ccy2Mid = c2m;
	}

	public BigDecimal getCcy2Offer() {
		return ccy2Offer;
	}

	public void setCcy2Offer(BigDecimal c2o) {
		this.ccy2Offer = c2o;
	}

	public BigDecimal getCrossCcyBid() {
		return crossCcyBid;
	}

	public void setCrossCcyBid(BigDecimal xb) {
		this.crossCcyBid = xb;
	}

	public BigDecimal getCrossCcyOffer() {
		return crossCcyOffer;
	}

	public void setCrossCcyOffer(BigDecimal xo) {
		this.crossCcyOffer = xo;
	}	   	
	
	public boolean isMidSet() {
		return midSet;
	}

	public void setMidSet(boolean midSet) {
		this.midSet = midSet;
	}

	@JsonIgnore
	public boolean isBidOfferSet() {
		return bidOfferSet;
	}

	public void setBidOfferSet(boolean bidOfferSet) {
		this.bidOfferSet = bidOfferSet;
	}

	@JsonProperty("fp")
	public boolean isFullyPopulated() {		
		return (bidOfferSet);
	}
	
	@JsonProperty("fp")
	public void setFullyPopulated(String value) {		
		bidOfferSet = "true".equals(value);
	}

	@JsonProperty("ec") // for JSON serialization
	public String getErrorTypeValue() {		
		return rateErrorType.getValue();		
	}
	
	@JsonProperty("ec")  // for JSON de-serialization
	public void setErrorTypeValue(String value) {		
		rateErrorType = RateErrorType.get(value);		
	}
	
	@JsonIgnore  // for pojo
	public RateErrorType getRateErrorType() {
		return rateErrorType;
	}
			
	// for pojo
	public void setRateErrorType(RateErrorType rateErrorType) {
		this.rateErrorType = rateErrorType;
	}

	public Integer getPrecision() {
		return precision;
	}

	public void setPrecision(Integer precision) {
		this.precision = precision;
	}

	public String toString() {
		return pair + ": c1b: " + ccy1Bid + ", c1m: " + ccy1Mid + ", c1o: " + ccy1Offer 
				+ ", c2b: " + ccy2Bid + ", c2m: " + ccy2Mid + ", c2o: " + ccy2Offer
				+ ", xb: " + crossCcyBid + ", xo: " + crossCcyOffer + ", fp: " + isFullyPopulated() + ", ec: " + getErrorTypeValue(); 
	}
}