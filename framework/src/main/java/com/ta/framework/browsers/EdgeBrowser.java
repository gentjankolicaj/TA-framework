package com.ta.framework.browsers;

import org.openqa.selenium.WebDriver;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class EdgeBrowser extends Browser {

	public EdgeBrowser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EdgeBrowser(WebDriver webDriver, MyBrowserType browserType, int timeout) {
		super(webDriver, browserType, timeout);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EdgeBrowser [webDriver=" + webDriver + ", browserType=" + browserType + ", timeout=" + timeout + "]";
	}

	

}
