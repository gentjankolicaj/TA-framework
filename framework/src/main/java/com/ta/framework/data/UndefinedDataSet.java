package com.ta.framework.data;

import java.util.List;

import com.ta.framework.data.test.TestData;
import com.ta.framework.exceptions.TestDataException;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public class UndefinedDataSet extends DataSet {
	

	public UndefinedDataSet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UndefinedDataSet(List<TestData> validTestData, List<TestData> unvalidTestData) {
		super(validTestData, unvalidTestData);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<TestData> getValidTestData(Object... boundaries) throws TestDataException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TestData> getInvalidTestData(Object... boundaries) throws TestDataException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
