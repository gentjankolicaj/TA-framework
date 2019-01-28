package com.ta.framework.data.suppliers;

import com.ta.framework.data.DataSet;
import com.ta.framework.data.supplier.techniques.DataOrigin;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class ShortSupplier extends Supplier {
	
	private static ShortSupplier instance=new ShortSupplier();

	private ShortSupplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static ShortSupplier getInstance() {
		if(instance==null) {
			instance=new ShortSupplier();
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
