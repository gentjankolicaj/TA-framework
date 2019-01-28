package com.ta.framework.data.suppliers;


import com.ta.framework.data.DataSet;
import com.ta.framework.data.supplier.techniques.DataOrigin;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class CharacterSupplier extends Supplier {
	
	private static CharacterSupplier instance=new CharacterSupplier();
	
	private CharacterSupplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static CharacterSupplier getInstance() {
		if(instance==null) {
			instance=new CharacterSupplier();
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
