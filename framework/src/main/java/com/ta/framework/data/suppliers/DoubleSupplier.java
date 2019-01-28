package com.ta.framework.data.suppliers;

import com.ta.framework.data.DataSet;
import com.ta.framework.data.supplier.techniques.DataOrigin;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class DoubleSupplier extends Supplier{
	
	private static DoubleSupplier instance=new DoubleSupplier();
	

	private DoubleSupplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static DoubleSupplier getInstance() {
		if(instance==null) {
			instance=new DoubleSupplier();
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
