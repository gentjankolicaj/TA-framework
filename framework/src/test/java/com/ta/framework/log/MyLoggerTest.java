package com.ta.framework.log;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.ta.framework.configuration.GlobalConfigs;
import com.ta.framework.references.LogMap;
import com.ta.framework.result.MyResult;
import com.ta.framework.result.StepResult;

public class MyLoggerTest {

   static {
	   GlobalConfigs.showLogs=true;
	   GlobalConfigs.storeLogs=true;
   }
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLogString() {
		MyLogger.log("Hello world test");
	}

	@Test
	public void testLogObject() {
	  Object object=new StepResult(" MyKey"," Test value");
	  MyLogger.log(object);
	}

	@Test
	public void testLogMyResult() {
		 Object object=new StepResult("username:",":john doe");
		 MyLogger.log(object);
	}

	@Test
	public void testLogListOfObject() {
	   List<StepResult> list=Arrays.asList(new StepResult("username","jon doe"),new StepResult("username","jane doe"),new StepResult("username","tim doe"));
	   MyLogger.log(list);
	}

	@Test
	public void testLogMapOfObjectObject() {
		Map<Integer,StepResult> map=new HashMap<>();
		map.put(1,new StepResult("Name","jon doe"));
		map.put(2, new StepResult("Name","jane doe"));
		map.put(3, new StepResult("Name","tim doe"));
		
		System.out.println();
		
		MyLogger.log(map);
		
	}
	
	
	@Test 
	public void testLogMap() throws Exception{
		System.out.println();
		System.out.println("=========================================================================");
		System.out.println("=========================================================================");
		Map<Integer, MyResult> logMap=LogMap.getLogMap();
		MyLogger.log(logMap);
		System.out.println("=========================================================================");
		System.out.println("=========================================================================");
		System.out.println();
	}

}
