package com.ta.framework.data.supplier.techniques;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public enum DataOrigin {

	CPU("CPU"),TESTER("TESTER");
	
	private String value;
	
	private DataOrigin(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}
}
