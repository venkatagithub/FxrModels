package com.cibc.fxr.communication.model;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cibc.fxr.communication.enums.RateType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CcyPair extends ModelBase {
	private  static Logger logger = LoggerFactory.getLogger(CcyPair.class);
	private static final long serialVersionUID = 1L;
	public static final CcyPair DEFAULT_PAIR = new CcyPair("CC1", "CC2");
	
	@JsonProperty("c1")
    private String ccy1;
	
	@JsonProperty("c2")
    private String ccy2;
	
	@JsonProperty("rm")
	private String ricMid;
	
	@JsonProperty("rba")
	private String ricBidAsk;
	
	//COMPONENET or DIRECT
	@JsonProperty("rt")
	private RateType rateType;
	
	/** componentPairs is populated if this is a cross pair. For example: this pair is EURCAD, component pairs are: EURUSD and USDCAD. */
	@JsonProperty("cmp")
	private List<CcyPair> componentPairs;
		

    public CcyPair(String ccy1, String ccy2) {
        this.ccy1 = ccy1;
        this.ccy2 = ccy2;
    }
    
    public CcyPair(String ccy1, String ccy2, String ricBidAsk, String ricMid) {
        this.ccy1 = ccy1;
        this.ccy2 = ccy2;
        this.ricBidAsk = ricBidAsk;
        this.ricMid = ricMid;
    }
    
    public CcyPair(String pair,  String ricBidAsk, String ricMid) {
        this(pair.substring(0,3), pair.substring(3,6), ricBidAsk, ricMid);
    }
    
    public CcyPair(String pair) {
        this.ccy1 = pair.substring(0,3);
        this.ccy2 = pair.substring(3,6);
    }
    
    public CcyPair() {
    }
    
    public List<CcyPair> getComponentPairs() {
		return componentPairs;
	}

	public void setComponentPairs(List<CcyPair> componentPairs) {
		this.componentPairs = componentPairs;
	}

	public String getRicMid() {
		return ricMid;
	}

	public void setRicMid(String ricMid) {
		this.ricMid = ricMid;
	}

	public String getRicBidAsk() {
		return ricBidAsk;
	}

	public void setRicBidAsk(String ricBidAsk) {
		this.ricBidAsk = ricBidAsk;
	}

	public String getCcy1() {
        return ccy1;
    }

    public String getCcy2() {
        return ccy2;
    }
    

    public void setCcy1(String ccy1) {
		this.ccy1 = ccy1;
	}


	public void setCcy2(String ccy2) {
		this.ccy2 = ccy2;
	}
	

	@Override
    public boolean equals(Object obj) {
    	if(this == obj) {
    		return true;
    	}
    	
    	if( obj == null || !(obj instanceof CcyPair)) {
    		return false;
    	}
    	
    	CcyPair other = (CcyPair) obj;
    	
    	return this.ccy1.equalsIgnoreCase(other.getCcy1()) 
    		&& this.ccy2.equalsIgnoreCase(other.getCcy2());
    }
   
    public String getPair() {
    	return this.getCcy1() + this.getCcy2();
    }
	
	public boolean isCross() {
		return ! Currency.USD.equals(this.getCcy1()) 
			&& ! Currency.USD.equals(this.getCcy2());
	}
	
	public CcyPair getComponentPair(boolean firstCmpPair) {
		CcyPair cp = null;
		if(isCross()) {
			if(firstCmpPair) {
				if (getComponentPairs().get(0).getPair().contains(getCcy1())) {
					cp = getComponentPairs().get(0);
				} else {
					cp = getComponentPairs().get(1);
				}
			} else {
				if (getComponentPairs().get(1).getPair().contains(getCcy2())) {
					cp = getComponentPairs().get(1);
				} else {
					cp = getComponentPairs().get(0);
				}
			}
		}
		
		logger.info(getPair() + ":  " + (firstCmpPair ? "first" : "second") + " cmp pair: " + cp.getPair());
			
		return cp;
	}
    
    public RateType getRateType() {
		return rateType;
	}

	public void setRateType(RateType rateType) {
		this.rateType = rateType;
	}

	@Override
    public int hashCode() {
        int result = ccy1 != null ? ccy1.hashCode() : 0;
        result = 31 * result + (ccy2 != null ? ccy2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
    	return getPair() + " {" +
    			"rateType: " + getRateType() +
    			", ric b/a: " + getRicBidAsk() +
    			( isCross() ? 
    			(", comp pairs: " + componentPairs) : "") + 
    			"}";
    }
}