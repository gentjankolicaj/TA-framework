package com.ta.framework.browsers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import com.ta.framework.configuration.GlobalConfigs;
import com.ta.framework.drivers.DriverUtils;
import com.ta.framework.exceptions.BrowserException;
import com.ta.framework.references.BrowserMap;
import com.ta.framework.references.LogMap;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class BrowserManager {

	private static int browserNumber = 0;

	private BrowserManager() {

	}

	public static Browser openBrowser(MyBrowserType myBrowserType) throws Exception {
		Browser browser = createBrowser(myBrowserType);
		WebDriver driver = DriverUtils.initWebDriver(myBrowserType);
		browser.setBrowserType(myBrowserType);
		browser.setTimeout(GlobalConfigs.timeouts.get(myBrowserType));
		browser.setWebDriver(driver);
		setDriverProperties(driver, myBrowserType);

		BrowserMap.putBrowser(new Integer(browserNumber), browser);
		browserNumber++;

		return browser;
	}

	public static List<Browser> openBrowsers(MyBrowserType... browserTypes) throws Exception {
		List<Browser> browserList = new ArrayList<>(browserTypes.length);
		for (MyBrowserType type : browserTypes) {
			Browser browser = createBrowser(type);
			WebDriver driver = DriverUtils.initWebDriver(type);
			browser.setBrowserType(type);
			browser.setTimeout(GlobalConfigs.timeouts.get(type));
			browser.setWebDriver(driver);
			setDriverProperties(driver, type);

			BrowserMap.putBrowser(new Integer(browserNumber), browser);
			browserNumber++;

			browserList.add(browser);
		}

		return browserList;
	}

	private static void setDriverProperties(WebDriver driver, MyBrowserType myBrowserType) {
		// size fix
		if (GlobalConfigs.browserDimensions == null) {
			driver.manage().window().maximize();
		} else {
			driver.manage().window().setSize(GlobalConfigs.browserDimensions);
		}
		// implicit timeout fix
		driver.manage().timeouts().implicitlyWait(GlobalConfigs.timeouts.get(myBrowserType), GlobalConfigs.timeUnit);

	}

	public static Browser createBrowser(MyBrowserType myBrowserType) throws Exception {
		if (myBrowserType.equals(MyBrowserType.FIREFOX)) {

			return new FirefoxBrowser();
		} else if (myBrowserType.equals(MyBrowserType.CHROME)) {

			return new ChromeBrowser();
		} else if (myBrowserType.equals(MyBrowserType.EDGE)) {

			return new EdgeBrowser();
		} else if (myBrowserType.equals(MyBrowserType.OPERA)) {

			return new OperaBrowser();
		} else if (myBrowserType.equals(MyBrowserType.HTML_UNIT)) {

			return new HtmlUnitBrowser();

		} else
			throw new BrowserException(
					"Functionality for browser of type " + myBrowserType.getValue() + " has not been implemented !!!");

	}

	public static void closeBrowsers(List<Browser> list) {
		for (Browser var : list)
			var.webDriver.close();
	}

	public static void closeBrowsers(Browser[] array) {
		for (Browser var : array)
			var.webDriver.close();
	}

	public static void quitBrowsers(List<Browser> list) {
		for (Browser var : list)
			var.webDriver.quit();

		DriverUtils.killDriverTasks();
	}

	public static void quitBrowsers(Browser[] array) {
		for (Browser var : array)
			var.webDriver.quit();
		
		DriverUtils.killDriverTasks();

	}

	public static void quitAllBrowsers() {
		Map<Integer, Browser> map = BrowserMap.getBrowserReferences();
		for (Map.Entry<Integer, Browser> entry : map.entrySet()) {
			entry.getValue().webDriver.quit();
		}
		
		BrowserMap.clearMap();
		LogMap.clearLogMap();
		DriverUtils.killDriverTasks();

	}

	public static void closeAllBrowsers() {
		Map<Integer, Browser> map = BrowserMap.getBrowserReferences();
		for (Map.Entry<Integer, Browser> entry : map.entrySet()) {
			entry.getValue().webDriver.close();
		}
		BrowserMap.clearMap();

	}

	public static void removeDriversFromMemory() {
		DriverUtils.killDriverTasks();
	}

}
