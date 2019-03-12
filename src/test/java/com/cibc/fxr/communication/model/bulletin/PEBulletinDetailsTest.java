package com.cibc.fxr.communication.model.bulletin;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.Test;

import com.cibc.fxr.communication.enums.BulletinCurrencyStatus;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PEBulletinDetailsTest {
	
	private final ObjectMapper mapper = new ObjectMapper();

	@Test
	public void testJsonForeignCurrencyActiveStatuses() throws JsonProcessingException {
		Map<String, BulletinCurrencyStatus> fccyStatuses = new HashMap<String, BulletinCurrencyStatus>();
		fccyStatuses.put("XXX", BulletinCurrencyStatus.ACTIVE);
		fccyStatuses.put("YYY", BulletinCurrencyStatus.TNP);
		fccyStatuses.put("ZZZ", BulletinCurrencyStatus.RTT);
		PEBulletinDetails bulletin = new PEBulletinDetails();
		bulletin.setBuySideForeignCurrencyActiveStatuses(fccyStatuses);
		String jsonString = mapper.writeValueAsString(bulletin);
		System.out.println(jsonString);
		assertTrue(jsonString.contains("XXX"));
		assertTrue(jsonString.contains("ACTIVE"));
	}

}