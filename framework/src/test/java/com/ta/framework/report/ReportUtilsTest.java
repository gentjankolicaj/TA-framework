package com.ta.framework.report;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.ta.framework.result.MyResult;
import com.ta.framework.result.StepResult;

public class ReportUtilsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSaveResultsToExcelList() throws Exception {
		List<MyResult> list = Arrays.asList(new StepResult("firstName", "john"), new StepResult("Lastname", "doe"),
				new StepResult("age", "24"), new StepResult("code", "007"));

		ReportUtils.saveResultsToExcel(list, "test_excel", "sheet_alpha", ReportFileType.XLS);
	}

	@Test
	public void testSaveResultsToExcelMap() throws Exception {
		Map<Integer, MyResult> map = new HashMap<>();

		map.put(1, new StepResult("firstName", "john"));
		map.put(2, new StepResult("Lastname", "doe"));
		map.put(3, new StepResult("age", "24"));
		map.put(4, new StepResult("code", "007"));

		ReportUtils.saveResultsToExcel(map, "TEST_excel", "sheet_alpha", ReportFileType.XLS);
	}

	@Test
	public void testSaveResultToWordMap() throws Exception {
		Map<Integer, MyResult> map = new HashMap<>();

		map.put(1, new StepResult("firstName", "john"));
		map.put(2, new StepResult("Lastname", "doe"));
		map.put(3, new StepResult("age", "24"));
		map.put(4, new StepResult("code", "007"));

		ReportUtils.saveResultsToWord(map, "TEST_word", ReportFileType.DOCX);
	}

	@Test
	public void testSaveResultToWordList() throws Exception {
		List<MyResult> list = Arrays.asList(new StepResult("firstName", "john"), new StepResult("Lastname", "doe"),
				new StepResult("age", "24"), new StepResult("code", "007"));

		ReportUtils.saveResultsToWord(list, "test_word",  ReportFileType.DOCX);
	}

}
