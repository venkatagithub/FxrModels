package com.cibc.fxr.communication.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Currency extends ModelBase{

	private static final long serialVersionUID = 2533734561267715130L;

	private long id;
	
	@JsonProperty("a")
	private String active;

	@JsonProperty("c")
	private String code;
	
	@JsonProperty("d")
	private String direct;
	
	@JsonProperty("p")
	private Integer precision;

	@JsonProperty("pi")
	private Integer precisionIndirect;

	@JsonProperty("t")
	private BigDecimal tolerance;
	
	@JsonProperty("ct")
	private BigDecimal clientTolerance;

	
	public static String NONE = "";
	public static String USD = "USD";
    public static String CAD = "CAD";
    public static String JPY = "JPY";
    public static String GBP = "GBP";
    
    @JsonIgnore
    public boolean isDirect() {
    	return "1".equals(direct);
    }
    
    @JsonIgnore
    public boolean isActive() {
    	return "1".equals(active);
    }
    
    
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Currency() {
	}
	
	public Currency(String code) {
		this.code = code;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDirect() {
		return direct;
	}

	public void setDirect(String direct) {
		this.direct = direct;
	}

	public Integer getPrecision() {
		return precision;
	}

	public void setPrecision(Integer precision) {
		this.precision = precision;
	}

	public Integer getPrecisionIndirect() {
		return precisionIndirect;
	}

	public void setPrecisionIndirect(Integer precisionIndirect) {
		this.precisionIndirect = precisionIndirect;
	}

	public BigDecimal getTolerance() {
		return tolerance;
	}

	public void setTolerance(BigDecimal tolerance) {
		this.tolerance = tolerance;
	}

	public BigDecimal getClientTolerance() {
		return clientTolerance;
	}

	public void setClientTolerance(BigDecimal clientTolerance) {
		this.clientTolerance = clientTolerance;
	}
	
	
}