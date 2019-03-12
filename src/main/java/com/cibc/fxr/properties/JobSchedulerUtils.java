package com.cibc.fxr.properties;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JobSchedulerUtils {
	
	
	private  static Logger logger = LoggerFactory.getLogger(JobSchedulerUtils.class);
	
	/**
	 * This method returns the list of dates when job has to run based on :
	 * start time 
	 * End time
	 * frequency
	 * For example start time = 7:30am, end time = 9:00 am and Frequency = 30mins This method returns :
	 * 7:30, 8:00, 8:30, 9:00
	 * @param startTime
	 * @param endTime
	 * @param frequency
	 * @return
	 */
	
	public static List<Long> buildScheduleIntervalList(String startTime, String endTime, String frequency) {
		
		logger.info("Calculating time intervals for start time: " + startTime + " End time: " + endTime + " frequency: " + frequency);
		
		Calendar startCal = Calendar.getInstance();
		Calendar endCal = Calendar.getInstance();
		
		List<Long> intervals = new ArrayList<Long>();
		
		String startHour = (startTime.split(":"))[0];
		String startMins = (startTime.split(":"))[1];
		String endHour = (endTime.split(":"))[0];
		String endMins = (endTime.split(":"))[1];
		
		startCal.set(Calendar.HOUR_OF_DAY, new Integer(startHour));
		startCal.set(Calendar.MINUTE, new Integer(startMins));
		startCal.set(Calendar.SECOND, 0);
		startCal.set(Calendar.MILLISECOND, 0);
		
		endCal.set(Calendar.HOUR_OF_DAY,new Integer(endHour));
		endCal.set(Calendar.MINUTE, new Integer(endMins));
		endCal.set(Calendar.SECOND, 0);
		endCal.set(Calendar.MILLISECOND, 0);
		
		while(!startCal.after(endCal)) {
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(startCal.getTimeInMillis());
			intervals.add(cal.getTimeInMillis());
			startCal.add(Calendar.MINUTE, new Integer(frequency));
			
			logger.info("Time {}",cal.getTime());
		}
		
		if(logger.isDebugEnabled()){
			logger.debug("Calculated Intervals are: " + intervals);
		}
		
		return intervals;
	}
	
	
	/**
	 * This method returns list of job schedule based on hour to build Cron expressions
	 * For example:
	 * 7:15 , 7:30, 7:45, 8:00, 8:20, 8:50, 9:05 it returns
	 * 15,30,45 7, 00, 20, 50, 8, 05 9
	 * @param merged
	 * @return
	 */
	public static List<String> constructScheduleList(List<Long>merged) {
		
		logger.debug("Constrcuting schedule interval list based on Hours from merged schedule list " + merged);
		
		int preHr =-1;
		StringBuffer bff = new StringBuffer();
		int index =1;
		
		List<String> intervalStr = new ArrayList<String>();
		
		
		for(Long timeInMillSecs : merged){
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(timeInMillSecs);
			if(cal.get(Calendar.HOUR_OF_DAY) !=preHr) {
				if(preHr !=-1) {
				bff.deleteCharAt(bff.length()-1);
				bff.append(" "+ preHr);
				intervalStr.add(bff.toString());
				bff = new StringBuffer();
				}
				preHr = cal.get(Calendar.HOUR_OF_DAY);
				
			}
			bff.append(cal.get(Calendar.MINUTE)+",");
			if(index == merged.size()) {
				bff.append(" "+ preHr);
				intervalStr.add(bff.toString());
			}
			index++;
		}
		
		logger.debug("Calculated Schedule interval list is :" + intervalStr);
		
		return intervalStr;
	}
	
	
	/**
	 * This method returns the map with Key as Schedule time and value as destinations with comma separated
	 * Example:
	 * 7:28, "ERDS,FCPC"
	 * @param scheduleList
	 * @param scheduleMap
	 * @param destination
	 * @return
	 */
	public static Map<String, String> constructScheduleAndDestinationMapping(List<Long>scheduleList, Map<String, String> scheduleMap, String destination) {
		
		logger.debug("Constrcuting schedule map and corresponding destinations to publish based on input parameters: scheduleList = " + scheduleList + " scheduleMap = " + scheduleMap + " destination = "+ destination);
		
		if(scheduleMap ==null || scheduleMap.size() ==0) {
			scheduleMap = new HashMap<String, String>();
		}
		
		for(Long scheduleTimeStamp: scheduleList) {
			
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(scheduleTimeStamp);
			
			String key = cal.get(Calendar.HOUR_OF_DAY) +":"+cal.get(Calendar.MINUTE);
			
			if(scheduleMap.containsKey(key)) {
				String value = scheduleMap.get(key)+","+destination;
				scheduleMap.put(key, value);
			} else {
				scheduleMap.put(key, destination);
			}
			
		}
		
		logger.debug("Schedule map is" + scheduleMap);
		
		return scheduleMap;
	}
	

}