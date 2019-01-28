package com.ta.framework.data.suppliers;

import com.ta.framework.data.DataSet;
import com.ta.framework.data.supplier.techniques.DataOrigin;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class IntegerSupplier extends Supplier {
	
	private static IntegerSupplier instance=new IntegerSupplier();

	
	private IntegerSupplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static IntegerSupplier getInstance() {
		if(instance==null) {
			instance=new IntegerSupplier();
			return instance;
		}else
			return instance;
	}
	
	
	@Override
	public DataSet supplyDataSet(DataOrigin dataOrigin) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
}
