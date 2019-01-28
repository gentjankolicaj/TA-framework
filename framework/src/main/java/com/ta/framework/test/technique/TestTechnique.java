package com.ta.framework.test.technique;

import java.util.List;

import com.ta.framework.data.test.TestData;
import com.ta.framework.result.TestResult;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public interface TestTechnique {

	public abstract List<TestData> use(List<TestData> testDataList) throws Exception;
	
    public abstract List<TestResult> executeTest() throws Exception;
}
