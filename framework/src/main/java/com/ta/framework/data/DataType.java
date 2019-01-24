package com.ta.framework.data;
/**
 * 
 * @author gentjan koliçaj
 *
 */
public enum DataType {

    BOOLEAN("BOOLEAN"),BYTE("BYTE"),SHORT("SHORT"),CHARACTER("CHARACTER"),INTEGER("INTEGER"),LONG("LONG"),DOUBLE("DOUBLE"),FLOAT("FLOAT");
	private String value;
	
	private DataType(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}
	
}
