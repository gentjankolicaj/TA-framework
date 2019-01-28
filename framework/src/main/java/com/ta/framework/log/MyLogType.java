package com.ta.framework.log;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public enum MyLogType {
	
   JAVA_LOGGER("JAVA_LOGGER"),CONSOLE_LOGGER("CONSOLE_LOGGER");
	
	private String value;
	
	private MyLogType(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}

}
