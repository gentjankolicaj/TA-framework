package com.ta.framework.browsers;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public class BrowserManagerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOpenBrowser() throws Exception {
		Browser chrome=BrowserManager.openBrowser(MyBrowserType.CHROME);
		assertNotNull(chrome);
		chrome.close();
	}

	@Test
	public void testOpenBrowsers() throws Exception {
		List<Browser> browsers=BrowserManager.openBrowsers(MyBrowserType.CHROME,MyBrowserType.FIREFOX,MyBrowserType.EDGE);
		assertNotNull(browsers);
		
		BrowserManager.quitAllBrowsers();
	}

	@Test
	public void testCreateBrowser() {
		fail("Not yet implemented");
	}

	@Test
	public void testCloseListOfBrowser() {
		fail("Not yet implemented");
	}

	@Test
	public void testCloseBrowserArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testQuitListOfBrowser() {
		fail("Not yet implemented");
	}

	@Test
	public void testQuitBrowserArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testQuitAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testCloseAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveDriversFromMemory() {
		fail("Not yet implemented");
	}

}
