package com.ta.framework.browsers;

import org.openqa.selenium.WebDriver;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public class HtmlUnitBrowser extends Browser {

	public HtmlUnitBrowser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HtmlUnitBrowser(WebDriver webDriver, MyBrowserType browserType, int timeout) {
		super(webDriver, browserType, timeout);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "HtmlUnitBrowser [webDriver=" + webDriver + ", browserType=" + browserType + ", timeout=" + timeout
				+ "]";
	}

	

  

}
