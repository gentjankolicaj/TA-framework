package com.ta.framework.data.suppliers;

import com.ta.framework.data.DataSet;
import com.ta.framework.data.supplier.techniques.DataOrigin;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class BooleanSupplier extends Supplier{
	
	private static BooleanSupplier instance=new BooleanSupplier();
	
	private BooleanSupplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static BooleanSupplier getInstance() {
		if(instance==null) {
			instance=new BooleanSupplier();
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
