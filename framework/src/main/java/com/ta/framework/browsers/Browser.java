package com.ta.framework.browsers;

import org.openqa.selenium.WebDriver;

import com.ta.framework.drivers.DriverUtils;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public abstract class Browser {

	protected WebDriver webDriver;
	protected MyBrowserType browserType;
	protected int timeout;
	
	public Browser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Browser(WebDriver webDriver, MyBrowserType browserType, int timeout) {
		super();
		this.webDriver = webDriver;
		this.browserType = browserType;
		this.timeout = timeout;
	}

	public WebDriver getWebDriver() {
		return webDriver;
	}

	public void setWebDriver(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public MyBrowserType getBrowserType() {
		return browserType;
	}

	public void setBrowserType(MyBrowserType browserType) {
		this.browserType = browserType;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public void close() {
		webDriver.close();
	}
	
	public void quit() {
		webDriver.quit();
		DriverUtils.killDriverTask(browserType);
	}


}
