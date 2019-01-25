package com.ta.framework.browsers;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public enum MyBrowserType {

    CHROME("CHROME"),FIREFOX("FIREFOX"),EDGE("EDGE"),OPERA("OPERA"),HTML_UNIT("HTML_UNIT");
	
	private String value;
	
	private MyBrowserType(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}

}
