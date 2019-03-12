package com.cibc.fxr.communication.enums;

import java.io.Serializable;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum BulletinStatus implements Serializable {

	CREATED("CREATED","Bulletin created successfully"),
	CREATION_FAILED("CREATION_FAILED","Bulletin creation failed"),
	PUBLISHED("PUBLISHED","Published successfully"),
	PUBLISHING_FAILED("PUBLISHING_FAILED","Publishing failed"),
	MANUALLY_CREATED("MANUALLY_CREATED", "Manual bulletin created for calculation"),
	MANUAL_CREATION_FAILED("MANUAL_CREATION_FAILED","Manual bulletin creation failed"),
	REPUBLISHED("REPUBLISHED","Bulletin republished as new bulletin");

	private String code;
	
	private String desc;

	private static final Map<String, BulletinStatus> bulletinStatusCodeMap;

	static {
	
		bulletinStatusCodeMap = new HashMap<String, BulletinStatus>();
		for (BulletinStatus type : EnumSet.allOf(BulletinStatus.class)) {
			bulletinStatusCodeMap.put(type.getCode(), type);
		}
	}

	private BulletinStatus(String code,String desc) {
		this.code = code;
		this.desc = desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public static BulletinStatus get(String code) {
		BulletinStatus type = bulletinStatusCodeMap.get(code);
		return type;
	}

	public boolean notEquals(BulletinStatus t) {
		return !equals(t);
	}


	public String getDesc() {
		return desc;
	}
	
	public boolean equals(BulletinStatus t) {
		if (t == null || !(t instanceof BulletinStatus))
			return false;

		return getCode() == t.getCode();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}