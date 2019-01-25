package com.ta.framework.drivers;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.ta.framework.browsers.MyBrowserType;
import com.ta.framework.configuration.GlobalConfigs;
import com.ta.framework.exceptions.DriverException;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class DriverUtils {

	public static WebDriver initWebDriver(MyBrowserType browserType) {
		WebDriver tmp = null;
		switch (browserType) {
		case CHROME:
			tmp = initChrome(DriverType.CHROME_DRIVER);
			break;
		case FIREFOX:
			tmp = initFirefox(DriverType.GECKO_DRIVER);
			break;
		case HTML_UNIT:
			tmp = initHtmlUnit(DriverType.HTML_UNIT_DRIVER);
			break;
		case EDGE:
			tmp = initEdge(DriverType.EDGE_DRIVER);
			break;
		case OPERA:
			tmp = initOpera(DriverType.OPERA_DRIVER);
			break;

		}
		return tmp;

	}

	private static WebDriver initChrome(DriverType driverType) {
		System.setProperty(driverType.getDriverName(), findDriverPath(driverType));
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	private static WebDriver initFirefox(DriverType driverType) {
		System.setProperty(driverType.getDriverName(), findDriverPath(driverType));
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

	private static WebDriver initEdge(DriverType driverType) {
		System.setProperty(driverType.getDriverName(), findDriverPath(driverType));
		WebDriver driver = new EdgeDriver();
		return driver;
	}

	private static WebDriver initHtmlUnit(DriverType driverType) {
		System.setProperty(driverType.getDriverName(), findDriverPath(driverType));
		WebDriver driver = new HtmlUnitDriver();
		return driver;
	}

	private static WebDriver initOpera(DriverType driverType) {
		System.setProperty(driverType.getDriverName(), findDriverPath(driverType));
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public static String findDriverPath(DriverType driverType) {
		String path = "";
		path = GlobalConfigs.homeDirectory+ GlobalConfigs.fileSeparator+GlobalConfigs.driversDirectoryName + GlobalConfigs.fileSeparator + driverType.getDriverExe();
		return path;
	}

	public static DriverType getDriver(MyBrowserType browserType) throws Exception {
		DriverType tmp = null;
		switch (browserType) {
		case CHROME:
			tmp = DriverType.CHROME_DRIVER;
			break;
		case FIREFOX:
			tmp = DriverType.GECKO_DRIVER;
			break;
		case HTML_UNIT:
			tmp = DriverType.HTML_UNIT_DRIVER;
			break;
		case EDGE:
			tmp = DriverType.EDGE_DRIVER;
			break;
		case OPERA:
			tmp = DriverType.OPERA_DRIVER;
			break;

		}
		if (tmp == null)
			throw new DriverException("WebDriver not found for browser of type " + browserType.getValue());

		return tmp;

	}

	public static void killDriverTasks() {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {

				try {

					DriverType driverTypes[] = DriverType.values();

					for (DriverType type : driverTypes)
						Runtime.getRuntime().exec("TASKKILL /F /IM " + type.getDriverExe());

				} catch (IOException io) {

					io.printStackTrace();
				}

			}
		});
	}

	public static void killDriverTask(MyBrowserType myBrowserType) {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {

				try {

					DriverType type = getDriver(myBrowserType);

					Runtime.getRuntime().exec("TASKKILL /F /IM " + type.getDriverExe());

				} catch (IOException io) {

					io.printStackTrace();

				} catch (DriverException d) {

					d.printStackTrace();

				} catch (Exception e) {

					e.printStackTrace();

				}

			}
		});
	}
}
