package com.cibc.fx.solace;

import java.util.Properties;

import ca.cibcwb.mit.messaging.properties.MitSessionConfiguration;

public class SolaceConfig {


	private String host; 
	private String vpn;
	private String user;
	private String password;
	private String pubAckWindowSize;
	private String subAckWindowSize;
	private String reapplySubscription;
	private String generateSendTimestamp;
	private String clientChannelSendBuffer;
	private String clientChannelRecvBuffer;
	private String clientChannelReconnectRetries;
	private String acceptOnlyCurrentDayMessages;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getVpn() {
		return vpn;
	}
	public void setVpn(String vpn) {
		this.vpn = vpn;
	}
	public String getPubAckWindowSize() {
		return pubAckWindowSize;
	}
	public void setPubAckWindowSize(String pubAckWindowSize) {
		this.pubAckWindowSize = pubAckWindowSize;
	}
	public String getSubAckWindowSize() {
		return subAckWindowSize;
	}
	public void setSubAckWindowSize(String subAckWindowSize) {
		this.subAckWindowSize = subAckWindowSize;
	}
	public String getReapplySubscription() {
		return reapplySubscription;
	}
	public void setReapplySubscription(String reapplySubscription) {
		this.reapplySubscription = reapplySubscription;
	}
	public String getGenerateSendTimestamp() {
		return generateSendTimestamp;
	}
	public void setGenerateSendTimestamp(String generateSendTimestamp) {
		this.generateSendTimestamp = generateSendTimestamp;
	}
	public String getClientChannelSendBuffer() {
		return clientChannelSendBuffer;
	}
	public void setClientChannelSendBuffer(String clientChannelSendBuffer) {
		this.clientChannelSendBuffer = clientChannelSendBuffer;
	}
	public String getClientChannelRecvBuffer() {
		return clientChannelRecvBuffer;
	}
	public void setClientChannelRecvBuffer(String clientChannelRecvBuffer) {
		this.clientChannelRecvBuffer = clientChannelRecvBuffer;
	}
	public String getClientChannelReconnectRetries() {
		return clientChannelReconnectRetries;
	}
	public void setClientChannelReconnectRetries(
			String clientChannelReconnectRetries) {
		this.clientChannelReconnectRetries = clientChannelReconnectRetries;
	}
	public String getAcceptOnlyCurrentDayMessages() {
		return acceptOnlyCurrentDayMessages;
	}
	public void setAcceptOnlyCurrentDayMessages(String acceptOnlyCurrentDayMessages) {
		this.acceptOnlyCurrentDayMessages = acceptOnlyCurrentDayMessages;
	}
	
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	protected MitSessionConfiguration getMitSessionConfiguration() {
		Properties solaceConfig = new Properties();
		solaceConfig.setProperty("jcsmp.HOST", getHost());
		solaceConfig.setProperty("jcsmp.VPN_NAME", getVpn());
		solaceConfig.setProperty("jcsmp.PUB_ACK_WINDOW_SIZE", getPubAckWindowSize());
		solaceConfig.setProperty("jcsmp.SUB_ACK_WINDOW_SIZE", getSubAckWindowSize());
		solaceConfig.setProperty("jcsmp.REAPPLY_SUBSCRIPTIONS", getReapplySubscription());
		solaceConfig.setProperty("jcsmp.GENERATE_SEND_TIMESTAMPS", getGenerateSendTimestamp());  
	
		solaceConfig.setProperty("jcsmp.CLIENT_CHANNEL_PROPERTIES.SendBuffer", getClientChannelSendBuffer());
		solaceConfig.setProperty("jcsmp.CLIENT_CHANNEL_PROPERTIES.ReceiveBuffer", getClientChannelRecvBuffer());
		solaceConfig.setProperty("jcsmp.CLIENT_CHANNEL_PROPERTIES.ReconnectRetries", getClientChannelReconnectRetries());
		solaceConfig.setProperty("mit.messaging.acceptOnlyCurrentDayMessages", getAcceptOnlyCurrentDayMessages());

		Properties credentials = new Properties();
		credentials.setProperty("jcsmp.USERNAME", getUser());
		credentials.setProperty("jcsmp.PASSWORD", getUser());
		MitSessionConfiguration mc = new MitSessionConfiguration("SolaceConfig", solaceConfig, "Credentials", credentials);
		
		return mc;
	}
	
	
}