package com.cibc.fxr.communication.config;

import java.util.Map;

import com.cibc.fxr.communication.CommunicationBaseModel;
import com.cibc.fxr.communication.model.Currency;
import com.cibc.fxr.communication.model.RateSource;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ConfigurationModel extends CommunicationBaseModel{
	
	private static final long serialVersionUID = -6388461341718028133L;
	
	@JsonProperty("gccl")
	private Map<String, Currency> globalCodeCurrencyList;
	
	@JsonProperty("gblprop")
	private Map<String, String> globalProperties;
	
	@JsonProperty("gblrs")
	private Map<String, RateSource> globalRateSources;
	
	@JsonProperty("rpc")
	private RatePublisherConfiguration ratePublisherConfiguration;
	
	@JsonProperty("pec")
	private PricingEngineConfiguration pricingEngineConfiguration;
	
	@JsonProperty("ac")
	private AdaptorConfiguration adaptorConfiguration;

	public ConfigurationModel(){
		this.ratePublisherConfiguration = new RatePublisherConfiguration();
		this.pricingEngineConfiguration = new PricingEngineConfiguration();
		this.adaptorConfiguration = new AdaptorConfiguration();
		
	}
	
	public Map<String, Currency> getGlobalCodeCurrencyList() {
		return globalCodeCurrencyList;
	}

	public void setGlobalCodeCurrencyList(
			Map<String, Currency> globalCodeCurrencyList) {
		this.globalCodeCurrencyList = globalCodeCurrencyList;
	}

	
	public Map<String, String> getGlobalProperties() {
		return globalProperties;
	}

	public void setGlobalProperties(Map<String, String> globalProperties) {
		this.globalProperties = globalProperties;
	}

	public Map<String, RateSource> getGlobalRateSources() {
		return globalRateSources;
	}

	public void setGlobalRateSources(Map<String, RateSource> globalRateSources) {
		this.globalRateSources = globalRateSources;
	}

	public AdaptorConfiguration getAdaptorConfiguration() {
		return this.adaptorConfiguration;
	}

	public RatePublisherConfiguration getRatePublisherConfiguration() {
	/*	this.ratePublisherConfiguration = RatePublisherConfiguration.getInstance();*/
		return this.ratePublisherConfiguration;
	}

	public void setRatePublisherConfiguration(RatePublisherConfiguration ratePublisherConfiguration) {
		this.ratePublisherConfiguration = ratePublisherConfiguration; 
	}

	public PricingEngineConfiguration getPricingEngineConfiguration() {
		return this.pricingEngineConfiguration;
	}
	
	public void setPricingEngineConfiguration(PricingEngineConfiguration pricingEngineConfiguration) {
		this.pricingEngineConfiguration = pricingEngineConfiguration;
	}
}