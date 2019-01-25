package com.ta.framework.drivers;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public enum DriverType {
	
	CHROME_DRIVER("chromedriver.exe","webdriver.chrome.driver"),GECKO_DRIVER("geckodriver.exe","webdriver.gecko.driver"),OPERA_DRIVER("operadriver.exe","webdriver.opera.driver"),
	HTML_UNIT_DRIVER("htmlunit-driver-2.33.3.jar","htmlunit.binary.path"),EDGE_DRIVER("MicrosoftWebDriver.exe","webdriver.edge.driver");
	
	private String driverExe;
	private String driverName;
	
	private DriverType(String driverExe,String driverName) {
		this.driverExe=driverExe;
		this.driverName=driverName;
	}

	public String getDriverExe() {
		return driverExe;
	}

	public String getDriverName() {
		return driverName;
	}

	
}
