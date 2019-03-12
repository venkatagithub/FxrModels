package com.cibc.fxr.communication.config;

public abstract class FxrConstants {
	
	//sysprop constants
	public static final String CATEGORY_ALL = "ALL";
	public static final String CONFIGURATION_EMAILLIST_STR_PROP = "CONFIGURATION_EMAIL_LIST";
	public static final String EVENT_EMAILLIST_STR_PROP = "EVENT_EMAIL_LIST";
	public static final String SUPPORT_EMAILLIST_STR_PROP = "SUPPORT_EMAIL_LIST"; // readonly
	public static final String RATE_TYPE_STR_PROP = "DEFAULT_RATE_TYPE";
	public static final String RATE_SOURCE_STR_PROP = "DEFAULT_RATE_SOURCE";
	public static final String IS_EMAIL_ALERT_ENABLED_STR_PROP = "EMAIL_ALERTS_ENABLE";
	public static final String MAX_RATE_LATENCY_PROP = "MAX_RATE_LATENCY";
	public static final String RATE_RETRIEVAL_TIMEOUT_RP = "RATE_RETRIEVAL_TIMEOUT_RP";
	public static final String RATE_RETRIEVAL_TIMEOUT_PE = "RATE_RETRIEVAL_TIMEOUT_PE";
	
	// Market Rate Publish Freq:
	public static final String RS_FETCH_RATE_FREQ_MONFRI = "FETCH_RATE_FREQ_MONFRI";
	public static final String RS_FETCH_RATE_FREQ_SAT = "FETCH_RATE_FREQ_SAT";
	public static final String RS_FETCH_RATE_FREQ_SUN = "FETCH_RATE_FREQ_SUN";
	public static final String RS_FETCH_RATE_FREQ_HR_START = "FETCH_RATE_FREQ_HR_START";
	public static final String RS_FETCH_RATE_FREQ_HR_END = "FETCH_RATE_FREQ_HR_END";
	public static final String RS_FETCH_RATE_FREQ_MIN = "FETCH_RATE_FREQ_MIN";
	
	public static final String RS_DAY_MON_TO_FRI ="MON,TUE,WED,THU,FRI";
	public static final String RS_DAY_SAT ="SAT";
	public static final String RS_DAY_SUN ="SUN";

	//messagetype prop
	public static final String MESSAGE_TYPE = "MTYPE";
	
	//Constants to calculate bulletin rates
	public static final String BUY_SIDE = "BUY";
	public static final String SELL_SIDE = "SELL";
	
	
	// FXRM stores these values in database
	public static final String MARKET_SPREAD_GROUP_TYPE = "Market";
	public static final String CLIENT_SPREAD_GROUP_TYPE = "Client";
	public static final String BEST_CLIENT_SPREAD_GROUP_TYPE = "Best";
	
	//EVENT CONSTANTS
	public static final String SYSTEM_INSTANCE_ID 	= "INSTANCE_ID";
	public static final String SYSTEM_TYPE 			= "SYSTEM TYPE";
	public static final String SYSTEM_PARAM 		= "SYSTEM_PARAM";
	public static final String BULLETIN_ID 			= "BULLETIN_ID";
	public static final String BULLETIN_NO 			= "Bulletin #";
	public static final String BULLETIN_TYPE 		= "Bulletin Type";
	public static final String WITHDRAWAL_CCY 		= "Base ccy";
	public static final String DESTINATION_STRING 	= "Destination/s";
	
	public static final String MKTRP_SYSTEM			= "MKTRP Market Rate Publisher";
	public static final String MPOP					= "Market Place Order Processor";
	public static final String WSSDATAREPL			= "Wallstreet Data Replication";
	//Compression header
	public static final String COMPRESSION = "CMPRSN";
	public static final String COMPRESSION_TRUE = "T";
	
	public static final String TRUE = "1";
	public static final String FALSE = "0";
	
	public static final String ECHO_TEST_STATUS_SUCCESS = "SUCCESS";
	public static final String ECHO_TEST_STATUS_FAIL = "FAIL";
	public static final String ECHO_TEST_STATUS_IN_PROGRESS = "IN_PROGRESS";
	
	//ADDITIONAL PROPERTIES
	public static final String PARAM_PRICING_PROPERTY = "PARAMETER PRICING";
	
	public static final String CUP_RATE_FILE_CHECK_DAYS = "CUP_RATE_FILE_CHECK_DAYS";
	public static final String CUP_RATE_FILE_CHECK_TIME = "CUP_RATE_FILE_CHECK_TIME"; 
}