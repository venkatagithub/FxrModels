package com.cibc.fxr.communication.model.bulletin;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import com.cibc.fxr.communication.CommunicationBaseModel;
import com.cibc.fxr.communication.enums.BulletinCurrencyStatus;
import com.cibc.fxr.communication.enums.BulletinStatus;
import com.cibc.fxr.communication.model.BulletinDestScheduleTiers;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class PEBulletinDetails extends CommunicationBaseModel implements Cloneable {

	private static final long serialVersionUID = -5093816006013090655L;

	@JsonProperty("bn")
	private Long bulletinNum;
	
	@JsonProperty("mnl")
	private boolean manual;
	
	@JsonProperty("pub")
	private boolean publish;
	
	@JsonProperty("bt")
	private String bulletinType;
	
	@JsonProperty("wdlcy")
	private String withDrawalCcy;
	
	@JsonProperty("pd")
	private Long publishedDate;
	
	@JsonProperty("pt")
	private Long publishTime;
	
	@JsonProperty("cnfid")
	private Long configurationId;
	
	@JsonProperty("dstns")
	private List<String> destinationCode;
	
	@JsonProperty("bst")
	private BulletinStatus bulletinStatus;
	
	@JsonProperty("bdst")
	private List<BulletinDestScheduleTiers> bDestScheduleTiers;
	
	// This property indicates the time RP retrieved rates
	@JsonProperty("rrt")
	private Timestamp rateRetrieveTime;
	
	@JsonProperty("mid")
	private String messageId;
	
	/* Used for ERDS bulletin-level foreign-currency-status */
	@JsonProperty("fccystbuy")
	private Map<String, BulletinCurrencyStatus> buySideForeignCurrencyActiveStatuses;
	/* Used for ERDS bulletin-level foreign-currency-status */
	@JsonProperty("fccystsll")
	private Map<String, BulletinCurrencyStatus> sellSideForeignCurrencyActiveStatuses;

	@JsonProperty("incyl")
	private List<PEBulletinInactiveForeignCcy> inactiveCcyList;
	
	//List of all foreign ccys for this bulletin with tier code and parameter format
	@JsonProperty("tcys")
	private List<PEBulletinTierForeignCcy> tierAndForgnCcys;
	
	public Long getBulletinNum() {
		return bulletinNum;
	}
	
	public void setBulletinNum(Long bulletinNum) {
		this.bulletinNum = bulletinNum;
	}
	
	public String getBulletinType() {
		return bulletinType;
	}
	
	public void setBulletinType(String bulletinType) {
		this.bulletinType = bulletinType;
	}

	public boolean isManual() {
		return manual;
	}

	public void setManual(boolean manual) {
		this.manual = manual;
	}

	public void setBulletinStatus(BulletinStatus bulletinStatus) {
		this.bulletinStatus = bulletinStatus;
	}

	public String getWithDrawalCcy() {
		return withDrawalCcy;
	}
	
	public void setWithDrawalCcy(String withDrawalCcy) {
		this.withDrawalCcy = withDrawalCcy;
	}
	
	public Long getPublishedDate() {
		return publishedDate;
	}
	
	public void setPublishedDate(Long publishedDate) {
		this.publishedDate = publishedDate;
	}
	
	public Long getPublishTime() {
		return publishTime;
	}
	
	public void setPublishTime(Long publishTime) {
		this.publishTime = publishTime;
	}
	
 
	public Long getConfigurationId() {
		return configurationId;
	}

	public void setConfigurationId(Long configurationId) {
		this.configurationId = configurationId;
	}

	public List<String> getDestinationCode() {
		return destinationCode;
	}

	public void setDestinationCode(List<String> destinationCode) {
		this.destinationCode = destinationCode;
	}

	public PEBulletinDetails cloneBulletin() throws CloneNotSupportedException{
		return (PEBulletinDetails) super.clone();
	}

	public Map<String, BulletinCurrencyStatus> getBuySideForeignCurrencyActiveStatuses() {
		return buySideForeignCurrencyActiveStatuses;
	}

	public void setBuySideForeignCurrencyActiveStatuses(
			Map<String, BulletinCurrencyStatus> buySideForeignCurrencyActiveStatuses) {
		this.buySideForeignCurrencyActiveStatuses = buySideForeignCurrencyActiveStatuses;
	}

	public Map<String, BulletinCurrencyStatus> getSellSideForeignCurrencyActiveStatuses() {
		return sellSideForeignCurrencyActiveStatuses;
	}

	public void setSellSideForeignCurrencyActiveStatuses(
			Map<String, BulletinCurrencyStatus> sellSideForeignCurrencyActiveStatuses) {
		this.sellSideForeignCurrencyActiveStatuses = sellSideForeignCurrencyActiveStatuses;
	}

	public List<PEBulletinInactiveForeignCcy> getInactiveCcyList() {
		return inactiveCcyList;
	}

	public void setInactiveCcyList(
			List<PEBulletinInactiveForeignCcy> inactiveCcyList) {
		this.inactiveCcyList = inactiveCcyList;
	}

	public BulletinStatus getBulletinStatus() {
		return bulletinStatus;
	}


	public List<BulletinDestScheduleTiers> getbDestScheduleTiers() {
		return bDestScheduleTiers;
	}

	public void setbDestScheduleTiers(
			List<BulletinDestScheduleTiers> bDestScheduleTiers) {
		this.bDestScheduleTiers = bDestScheduleTiers;
	}

	public Timestamp getRateRetrieveTime() {
		return rateRetrieveTime;
	}

	public void setRateRetrieveTime(Timestamp rateRetrieveTime) {
		this.rateRetrieveTime = rateRetrieveTime;
	}

	public List<PEBulletinTierForeignCcy> getTierAndForgnCcys() {
		return tierAndForgnCcys;
	}

	public void setTierAndForgnCcys(List<PEBulletinTierForeignCcy> tierAndForgnCcys) {
		this.tierAndForgnCcys = tierAndForgnCcys;
	}

	public boolean isPublish() {
		return publish;
	}

	public void setPublish(boolean publish) {
		this.publish = publish;
	}

	
	@Override
	public String toString() {
		return "PEBulletinDetails [bulletinNum=" + bulletinNum + ", manual="
				+ manual + ", publish=" + publish + ", bulletinType="
				+ bulletinType + ", withDrawalCcy=" + withDrawalCcy
				+ ", publishedDate=" + publishedDate + ", publishTime="
				+ publishTime + ", configurationId=" + configurationId
				+ ", destinationCode=" + destinationCode + ", bulletinStatus="
				+ bulletinStatus + ", bDestScheduleTiers=" + bDestScheduleTiers
				+ ", rateRetrieveTime=" + rateRetrieveTime + ", messageId="
				+ messageId + ", inactiveCcyList=" + inactiveCcyList
				+ ", tierAndForgnCcys=" + tierAndForgnCcys + "]";
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	
	
}