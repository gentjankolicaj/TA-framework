package com.ta.framework.data;

import java.util.List;

import com.ta.framework.data.test.TestData;
import com.ta.framework.exceptions.TestDataException;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public abstract class DataSet {

	protected List<TestData> validTestData;
	protected List<TestData> unvalidTestData;

	public DataSet() {
		super();

	}

	public DataSet(List<TestData> validTestData, List<TestData> unvalidTestData) {
		super();
		this.validTestData = validTestData;
		this.unvalidTestData = unvalidTestData;
	}

	public List<TestData> getValidTestData() {
		return validTestData;
	}

	public void setValidTestData(List<TestData> validTestData) {
		this.validTestData = validTestData;
	}

	public List<TestData> getUnvalidTestData() {
		return unvalidTestData;
	}

	public void setUnvalidTestData(List<TestData> unvalidTestData) {
		this.unvalidTestData = unvalidTestData;
	}

	public abstract List<TestData> getValidTestData(Object... boundaries) throws TestDataException;

	public abstract List<TestData> getInvalidTestData(Object... boundaries) throws TestDataException;

}
