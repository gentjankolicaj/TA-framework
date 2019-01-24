package com.ta.framework.data.supplier.techniques;

public enum SupplyTechnique {

	RANDOM("RANDOM"),ORDERED("ORDERED"),PREDEFINED("PREDEFINED");
	private String value;
	
	private SupplyTechnique(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}
}
