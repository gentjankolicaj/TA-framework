package com.ta.framework.data.supplier;

import java.util.List;

import com.ta.framework.data.DataType;
import com.ta.framework.data.supplier.techniques.SupplyTechnique;

/**
 * 
 * @author gentjan koliçaj
 *
 */
public abstract class Supplier {

	protected DataType dataType;

	public Supplier() {
		super();
	}

	public Supplier(DataType dataType) {
		super();
		this.dataType = dataType;
	}

	public DataType getDataType() {
		return dataType;
	}

	public abstract List<Object> supply(SupplyTechnique supplyTechnique) throws Exception;

	
}
