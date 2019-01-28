package com.ta.framework.data.test;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public enum TestDataType {
	
	//In this enum we determine type of test data that we are going to use (NOT JAVA DATATYPES)

    BOOLEAN("BOOLEAN"),BYTE("BYTE"),SHORT("SHORT"),CHARACTER("CHARACTER"),INTEGER("INTEGER"),LONG("LONG"),DOUBLE("DOUBLE"),FLOAT("FLOAT"),STRING("STRING");
	private String value;
	
	private TestDataType(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}
	
}
