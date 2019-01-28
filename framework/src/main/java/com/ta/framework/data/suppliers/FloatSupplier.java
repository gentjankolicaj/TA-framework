package com.ta.framework.data.suppliers;

import com.ta.framework.data.DataSet;
import com.ta.framework.data.supplier.techniques.DataOrigin;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public class FloatSupplier extends Supplier {
	
	private static FloatSupplier instance=new FloatSupplier();
	
	private FloatSupplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public static FloatSupplier getInstance() {
		if(instance==null) {
			instance=new FloatSupplier();
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
