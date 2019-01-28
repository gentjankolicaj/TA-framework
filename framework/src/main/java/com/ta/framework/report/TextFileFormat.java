package com.ta.framework.report;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public enum TextFileFormat {
    RAW("raw"),JSON("json"),TXT("txt"),XML("xml"),CSV("csv"),PDF("pdf");
	
	private String value;
	
	private TextFileFormat(String value) {
	  this.value=value;
	}
	
	public String getValue() {
		return value;
	}
}
