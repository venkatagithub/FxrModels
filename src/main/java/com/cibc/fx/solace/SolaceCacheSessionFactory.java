package com.cibc.fx.solace;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.cibcwb.mit.messaging.MitSession;
import ca.cibcwb.mit.messaging.MitSessionFactory;

public class SolaceCacheSessionFactory {

	private  static Logger logger = LoggerFactory.getLogger(SolaceCacheSessionFactory.class);
		
	private static final Object instance = new Object();
	
	
	private MitSession session = null;
	private SolaceConfig config = null;
	
	private SolaceCacheSessionFactory() {
		
	}
	
	
	public MitSession getSession() {
		synchronized (instance) {
			if(session == null) {
				createSession();				
			}
			return session;
		}
	}
	
	
	private synchronized void createSession() {
		logger.info("create Solace Session");	
		try {
//			MitSessionConfiguration mc = new MitSessionConfiguration();			
			session = MitSessionFactory.getInstance().getMitSession(config.getMitSessionConfiguration());
		} catch (Throwable e) {		
			logger.error("failed to create Solace Session", e);
			throw new RuntimeException(e);
		}
	}

	public SolaceConfig getConfig() {
		return config;
	}

	public void setConfig(SolaceConfig config) {
		this.config = config;
	}
	
	
}