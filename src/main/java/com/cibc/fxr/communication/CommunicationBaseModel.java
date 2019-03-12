package com.cibc.fxr.communication;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class CommunicationBaseModel implements Serializable{

	@JsonProperty("ctime")
	protected Date currentTimeStamp;
	
	protected long identifierKey;
	
	public Date getCurrentTimeStamp() {
		return currentTimeStamp;
	}

	public void setCurrentTimeStamp(Date currentTimeStamp) {
		this.currentTimeStamp = currentTimeStamp;
	}

	public long getIdentifierKey() {
		return identifierKey;
	}

	public void setIdentifierKey(long identifierKey) {
		this.identifierKey = identifierKey;
	}

	public java.lang.String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}