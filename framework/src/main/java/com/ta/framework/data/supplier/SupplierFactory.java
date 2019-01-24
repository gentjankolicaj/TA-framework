package com.ta.framework.data.supplier;

import com.ta.framework.data.DataType;

/**
 * 
 * @author gentjan koliçaj
 *
 */
public class SupplierFactory {
	

	private SupplierFactory() {

	}
	

	public static Supplier getDataTypeSupplier(DataType type) {
		if (type.equals(DataType.BOOLEAN)) {
			return new BooleanSupplier(type);
		} else if (type.equals(DataType.BYTE)) {
			return new ByteSupplier(type);
		} else if (type.equals(DataType.CHARACTER)) {
			return new CharacterSupplier(type);
		} else if (type.equals(DataType.INTEGER)) {
			return new IntegerSupplier(type);
		} else if (type.equals(DataType.LONG)) {
			return new LongSupplier(type);
		} else if (type.equals(DataType.FLOAT)) {
			return new FloatSupplier(type);
		} else {
			return new DoubleSupplier(type);
		}
	}

}
