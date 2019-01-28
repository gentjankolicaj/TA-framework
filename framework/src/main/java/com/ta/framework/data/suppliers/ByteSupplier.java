package com.ta.framework.data.suppliers;

import com.ta.framework.data.DataSet;
import com.ta.framework.data.supplier.techniques.DataOrigin;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class ByteSupplier extends Supplier {
	
	private static ByteSupplier instance=new ByteSupplier();

	
	private ByteSupplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public static ByteSupplier getInstance() {
		if(instance==null) {
			instance=new ByteSupplier();
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
