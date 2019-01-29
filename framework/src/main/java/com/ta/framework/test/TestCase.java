package com.ta.framework.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public abstract class TestCase{
	
	
	@Before
	public abstract void start() throws Exception;
	
	@Test
	public abstract void run() throws Exception;
	
	@After
	public abstract void finish() throws Exception;

	

}
