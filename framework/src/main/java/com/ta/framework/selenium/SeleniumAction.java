package com.ta.framework.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import com.ta.framework.configuration.GlobalConfigs;
import com.ta.framework.utils.MyStringUtils;

import java.io.File;
import java.net.URL;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public class SeleniumAction {

	private SeleniumAction() {
	}

	public static String goTo(WebDriver driver, String url) throws Exception {
		driver.get(url);
		return url;
	}

	public static WebElement click(WebDriver driver, LocatorType locatorType, String locatorValue) throws Exception {
		WebElement element = driver.findElement(decideLocatorType(locatorType, locatorValue));
		element.click();
		return element;
	}

	public static WebElement type(WebDriver driver, LocatorType locatorType, String locatorValue, String text)
			throws Exception {
		WebElement element = driver.findElement(decideLocatorType(locatorType, locatorValue));
		element.sendKeys(text);
		return element;
	}

	public static WebElement clear(WebDriver driver, LocatorType locatorType, String locatorValue) throws Exception {
		WebElement element = driver.findElement(decideLocatorType(locatorType, locatorValue));
		element.clear();
		return element;
	}

	public static void takeSnapshot(WebDriver driver, String snapshotName) throws Exception {
		File snapshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String snapshotPath = GlobalConfigs.homeDirectory + GlobalConfigs.fileSeparator
				+ GlobalConfigs.snapshotDirectoryName;

		File tmp = new File(snapshotPath);
		if (!tmp.exists()) {
			tmp.mkdirs();
		}
		snapshotPath = snapshotPath + GlobalConfigs.fileSeparator + snapshotName
				+ GlobalConfigs.snapshotFileType.getValue();
		FileUtils.copyFile(snapshotFile, new File(snapshotPath));

	}

	public static void back(WebDriver driver) throws Exception {
		driver.navigate().back();
	}

	public static void forward(WebDriver driver) throws Exception {
		driver.navigate().forward();
	}

	public static void refresh(WebDriver driver) throws Exception {
		driver.navigate().refresh();
	}

	public static void navigateTo(WebDriver driver, String url) throws Exception {
		driver.navigate().to(url);
	}

	public static void navigateTo(WebDriver driver, URL url) throws Exception {
		driver.navigate().to(url);
	}

	public static WebElement pressEnterKey(WebDriver driver, LocatorType locatorType, String locatorValue)
			throws Exception {
		WebElement element = driver.findElement(decideLocatorType(locatorType, locatorValue));
		element.sendKeys(Keys.ENTER);
		return element;
	}

	public static WebElement pressEnterKey(WebElement element) throws Exception {
		element.sendKeys(Keys.ENTER);
		return element;
	}

	public static WebElement pressReturnKey(WebDriver driver, LocatorType locatorType, String locatorValue)
			throws Exception {
		WebElement element = driver.findElement(decideLocatorType(locatorType, locatorValue));
		element.sendKeys(Keys.RETURN);
		return element;
	}

	public static WebElement pressReturnKey(WebElement element) throws Exception {
		element.sendKeys(Keys.RETURN);
		return element;
	}

	public static WebElement pressKeys(WebDriver driver, LocatorType locatorType, String locatorValue, Keys... keys)
			throws Exception {
		WebElement element = driver.findElement(decideLocatorType(locatorType, locatorValue));

		for (Keys key : keys)
			element.sendKeys(key);

		return element;

	}

	public static boolean checkPageContent(WebDriver driver, boolean caseSensitive, String content) {
		String pageSource = driver.getPageSource();
		return MyStringUtils.checkContent(pageSource, content, caseSensitive);
	}

	public static boolean[] checkPageContent(WebDriver driver, boolean caseSensitive, String... contents) {
		boolean[] resultArray = new boolean[contents.length];
		String pageSource = driver.getPageSource();
		for (int i = 0; i < contents.length; i++)
			resultArray[i] = MyStringUtils.checkContent(pageSource, contents[i], caseSensitive);

		return resultArray;
	}

	public static String assertPageContent(WebDriver driver, boolean caseSensitive, String content) throws Exception {
		String pageSource = driver.getPageSource();
		return MyStringUtils.assertContains(pageSource, content, caseSensitive);

	}

	public static String[] assertPageContent(WebDriver driver, boolean caseSensitive, String... contents)
			throws Exception {
		String[] assertedArray = new String[contents.length];
		String pageSource = driver.getPageSource();
		for (int i = 0; i < contents.length; i++)
			assertedArray[i] = MyStringUtils.assertContains(pageSource, contents[i], caseSensitive);

		return assertedArray;
	}

	public static WebElement checkElementPresence(WebDriver driver, LocatorType locatorType, String locatorValue,
			String text) throws Exception {
		WebElement element = driver.findElement(decideLocatorType(locatorType, locatorValue));
		String textElement = element.getText();
		if (textElement.equals(text)) {
			return element;
		} else
			return null;

	}

	public static boolean isElementPresent(WebDriver driver, LocatorType locatorType, String locatorValue) {
		boolean elementPresence = false;
		try {

			WebElement element = driver.findElement(decideLocatorType(locatorType, locatorValue));

			if (element != null)
				elementPresence = true;

			return elementPresence;

		} catch (IllegalArgumentException ia) {
			ia.printStackTrace();

			return elementPresence;

		} catch (NoSuchElementException nse) {
			nse.printStackTrace();

			return elementPresence;

		} catch (Exception e) {
			e.printStackTrace();

			return elementPresence;
		}

	}

	public static boolean isTextPresent(WebElement element, String text) {
		String textElement = element.getText();
		if (textElement.equals(text))
			return true;
		else
			return false;
	}

	public static boolean isTextPresent(WebDriver driver, LocatorType locatorType, String locatorValue, String text) {
		if (isElementPresent(driver, locatorType, locatorValue)) {
			WebElement element = driver.findElement(decideLocatorType(locatorType, locatorValue));
			return isTextPresent(element, text);
		} else
			return false;

	}

	private static By decideLocatorType(LocatorType locatorType, String locatorValue) {
		if (locatorType.equals(LocatorType.ID)) {
			return By.id(locatorValue);
		} else if (locatorType.equals(LocatorType.CSS)) {
			return By.cssSelector(locatorValue);
		} else if (locatorType.equals(LocatorType.CLASS_NAME)) {
			return By.className(locatorValue);
		} else if (locatorType.equals(LocatorType.NAME)) {
			return By.name(locatorValue);
		} else if (locatorType.equals(LocatorType.TAG)) {
			return By.tagName(locatorValue);
		} else if (locatorType.equals(LocatorType.PARTIAL_LINK)) {
			return By.partialLinkText(locatorValue);
		} else if (locatorType.equals(LocatorType.LINK)) {
			return By.linkText(locatorValue);
		} else {
			return By.xpath(locatorValue);
		}
	}

}
