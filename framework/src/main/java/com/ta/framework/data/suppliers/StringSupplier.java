package com.ta.framework.data.suppliers;

import com.ta.framework.data.DataSet;
import com.ta.framework.data.supplier.techniques.DataOrigin;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public class StringSupplier extends Supplier{
	
	private static StringSupplier instance=new StringSupplier();

	private StringSupplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static StringSupplier getInstance() {
		if(instance==null) {
			instance=new StringSupplier();
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
