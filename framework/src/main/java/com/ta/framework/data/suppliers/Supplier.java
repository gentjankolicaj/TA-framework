package com.ta.framework.data.suppliers;


import com.ta.framework.data.DataSet;
import com.ta.framework.data.supplier.techniques.DataOrigin;


/**
 * 
 * @author gentjan kolicaj
 *
 */
public abstract class Supplier {

	public Supplier() {
		super();
	}

	public abstract DataSet supplyDataSet(DataOrigin dataOrigin) throws Exception;

	
}
