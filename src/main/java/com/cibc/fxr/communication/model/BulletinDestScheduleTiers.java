package com.cibc.fxr.communication.model;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BulletinDestScheduleTiers extends ModelBase {

	private static final long serialVersionUID = -8119841815425340105L;
	 
	private Long id;
	
	@JsonProperty("d")
	private String destination;
	
	@JsonProperty("s")
	private String schedule;
	
	@JsonProperty("ape")
	private boolean autoPublishEnabled;
	
	@JsonProperty("dt")
	private String defaultTier;
	
	@JsonProperty("tiers")
	private List<Tier> tiers;
	
	
	@JsonProperty("addprop")
	private Map<String, String> additionalProperties;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public boolean isAutoPublishEnabled() {
		return autoPublishEnabled;
	}

	public void setAutoPublishEnabled(boolean autoPublishEnabled) {
		this.autoPublishEnabled = autoPublishEnabled;
	}

	public String getDefaultTier() {
		return defaultTier;
	}

	public void setDefaultTier(String defaultTier) {
		this.defaultTier = defaultTier;
	}

	public List<Tier> getTiers() {
		return tiers;
	}

	public void setTiers(List<Tier> tiers) {
		this.tiers = tiers;
	}

	public Map<String, String> getAdditionalProperties() {
		return additionalProperties;
	}

	public void setAdditionalProperties(Map<String, String> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
	
}
