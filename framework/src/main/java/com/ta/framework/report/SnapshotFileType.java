package com.ta.framework.report;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public enum SnapshotFileType {
	
    JPG("jpg"),PNG("png"),JPEG("jpeg");
	
	private String value;
	
	private SnapshotFileType(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}
	
}
