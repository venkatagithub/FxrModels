package com.cibc.fxr.communication.config;

import java.util.List;

import com.cibc.fxr.communication.model.BulletinConfigurationDetail;
import com.cibc.fxr.communication.model.ModelBase;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class AdaptorConfiguration extends ModelBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5337073432303105258L;
	
	@JsonProperty("bConfL")
	private List<BulletinConfigurationDetail> bulletinConfigurationDetailList;

	public List<BulletinConfigurationDetail> getBulletinConfigurationDetailList() {
		return bulletinConfigurationDetailList;
	}

	public void setBulletinConfigurationDetailList(
			List<BulletinConfigurationDetail> bulletinConfigurationDetailList) {
		this.bulletinConfigurationDetailList = bulletinConfigurationDetailList;
	}
	
    
}