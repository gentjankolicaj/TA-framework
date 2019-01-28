package com.ta.framework.selenium;
/**
 * @author gentjan kolicaj
 *
 */
public enum LocatorType {

    XPATH("XPATH"),ID("ID"),CSS("CSS"),CLASS_NAME("CLASS_NAME"),TAG("TAG"),NAME("NAME"),LINK("LINK"),PARTIAL_LINK("PARTIAL_LINK");
	
	private String value;
	
	private LocatorType(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}
}
