package com.ta.framework.data.suppliers;


import com.ta.framework.data.DataSet;
import com.ta.framework.data.supplier.techniques.DataOrigin;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public class LongSupplier extends Supplier {
	
	private static LongSupplier instance=new LongSupplier();
	

	private LongSupplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static LongSupplier getInstance() {
		if(instance==null) {
			instance=new LongSupplier();
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
