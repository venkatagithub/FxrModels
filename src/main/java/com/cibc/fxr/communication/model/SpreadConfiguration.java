package com.cibc.fxr.communication.model;

import java.math.BigDecimal;

import com.cibc.fxr.communication.enums.SpreadFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpreadConfiguration extends ModelBase{

	private static final long serialVersionUID = 7903486556406854769L;

	private long id;
	
	@JsonProperty("c1")
	private String ccy1Code;
	
	@JsonProperty("c2")
	private String ccy2Code;
	
	@JsonProperty("sf")
	private SpreadFormat spreadFormat;
	
	@JsonProperty("bs")
	private BigDecimal bidSpread;
	
	@JsonProperty("os")
	private BigDecimal offerSpread;
	
	@JsonProperty("bpRic")
	private String basisPointsRic;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCcy1Code() {
		return ccy1Code;
	}

	public void setCcy1Code(String ccy1Code) {
		this.ccy1Code = ccy1Code;
	}

	public String getCcy2Code() {
		return ccy2Code;
	}

	public void setCcy2Code(String ccy2Code) {
		this.ccy2Code = ccy2Code;
	}

	public SpreadFormat getSpreadFormat() {
		return spreadFormat;
	}

	public void setSpreadFormat(SpreadFormat spreadFormat) {
		this.spreadFormat = spreadFormat;
	}

	public BigDecimal getBidSpread() {
		return bidSpread;
	}

	public void setBidSpread(BigDecimal bidSpread) {
		this.bidSpread = bidSpread;
	}
 
	public BigDecimal getOfferSpread() {
		return offerSpread;
	}

	public void setOfferSpread(BigDecimal offerSpread) {
		this.offerSpread = offerSpread;
	}

	public String getBasisPointsRic() {
		return basisPointsRic;
	}

	public void setBasisPointsRic(String basisPointsRic) {
		this.basisPointsRic = basisPointsRic;
	}

	@Override
	public String toString() {
		return "SpreadConfiguration [id=" + id + ", ccy1Code=" + ccy1Code
				+ ", ccy2Code=" + ccy2Code + ",spreadFormat=" + spreadFormat
				+ ", bidSpread=" + bidSpread + ", offerSpread=" + offerSpread
				+ ", basisPointsRic=" + basisPointsRic + "]";
	}

}