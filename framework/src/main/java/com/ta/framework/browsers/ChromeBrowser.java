package com.ta.framework.browsers;

import org.openqa.selenium.WebDriver;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class ChromeBrowser extends Browser {

	public ChromeBrowser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChromeBrowser(WebDriver webDriver, MyBrowserType browserType, int timeout) {
		super(webDriver, browserType, timeout);
		
	}
	
   
}
