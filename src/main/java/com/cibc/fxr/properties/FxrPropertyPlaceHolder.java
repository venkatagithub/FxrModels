package com.cibc.fxr.properties;

import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import com.cibc.encrypt.StringEncryptor;


public class FxrPropertyPlaceHolder extends PropertyPlaceholderConfigurer {

	private List<String> encryptedPropertyKeys;
	
	private StringEncryptor stringEncryptor;
	
	private final static Logger logger = LoggerFactory.getLogger(FxrPropertyPlaceHolder.class);
	
	@Override
	protected String  resolvePlaceholder(String placeholder, Properties props){
		String value = super.resolvePlaceholder(placeholder, props);
		if(encryptedPropertyKeys.contains(placeholder) && value != null){
			logger.info("Decrypting the field {}",placeholder);
			return stringEncryptor.decrypt(value);
		}else{
			return value;
		}
	}

	public List<String> getEncryptedPropertyKeys() {
		return encryptedPropertyKeys;
	}

	public void setEncryptedPropertyKeys(List<String> encryptedPropertyKeys) {
		this.encryptedPropertyKeys = encryptedPropertyKeys;
	}

	public StringEncryptor getStringEncryptor() {
		return stringEncryptor;
	}

	public void setStringEncryptor(StringEncryptor stringEncryptor) {
		this.stringEncryptor = stringEncryptor;
	}
}