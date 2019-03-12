package com.cibc.fxr.marketrates;

import java.io.Serializable;
import java.math.BigDecimal;

public class CalculatedRates implements Serializable {

	private static final long serialVersionUID = -2799160336610681764L;
	
	BigDecimal calculatedRate;
	BigDecimal calculatedRateCcy1;
	BigDecimal calculatedRateCcy2;

	
	
	public CalculatedRates() {}
	
	public CalculatedRates(BigDecimal calculatedRate, BigDecimal calculatedRateCcy1, BigDecimal calculatedRateCcy2) {
		this.calculatedRate = calculatedRate;
		this.calculatedRateCcy1 = calculatedRateCcy1;
		this.calculatedRateCcy2 = calculatedRateCcy2;
	}
	public BigDecimal getCalculatedRate() {
		return calculatedRate;
	}
	public void setCalculatedRate(BigDecimal calculatedRate) {
		this.calculatedRate = calculatedRate;
	}
	public BigDecimal getCalculatedRateCcy1() {
		return calculatedRateCcy1;
	}
	public void setCalculatedRateCcy1(BigDecimal calculatedRateCcy1) {
		this.calculatedRateCcy1 = calculatedRateCcy1;
	}
	public BigDecimal getCalculatedRateCcy2() {
		return calculatedRateCcy2;
	}
	public void setCalculatedRateCcy2(BigDecimal calculatedRateCcy2) {
		this.calculatedRateCcy2 = calculatedRateCcy2;
	}

}