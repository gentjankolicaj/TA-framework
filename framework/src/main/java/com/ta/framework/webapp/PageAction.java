package com.ta.framework.webapp;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ta.framework.framework.interfaces.ActionContext;
import com.ta.framework.log.MyLogger;
import com.ta.framework.result.StepResult;
import com.ta.framework.selenium.LocatorType;
import com.ta.framework.selenium.SeleniumAction;

/**
 * @author gentjan kolicaj
 *
 */
public class PageAction implements ActionContext<String, StepResult> {

	protected AbstractWebPage page;
	protected WebDriver driver;
	

	public PageAction(AbstractWebPage page,WebDriver driver) {
		this.page=page;
		this.driver = driver;
	}

	public WebElement type(LocatorType locatorType, String locatorValue, String value) throws Exception {
		preAction();
		WebElement element = SeleniumAction.type(driver, locatorType, locatorValue, value);
		postAction(page.getClass().getName(),"typed at element ( "+locatorValue+" ) value ( "+value+" ).");
		return element;
	}

	public WebElement click(LocatorType locatorType, String locatorValue) throws Exception {
		preAction();
		WebElement element = SeleniumAction.click(driver, locatorType, locatorValue);
		postAction(page.getClass().getName(),"clicked element "+locatorValue+".");
		return element;
	}

	public void navigateTo(String locatorValue) throws Exception {
		preAction();
		SeleniumAction.navigateTo(driver, locatorValue);
		postAction(page.getClass().getName(),"navigated to "+locatorValue+".");
	}

	public void refresh() throws Exception {
		preAction();
		SeleniumAction.refresh(driver);
		postAction(page.getClass().getName(),"refresh button pressed.");
	}

	public void back() throws Exception {
		preAction();
		SeleniumAction.back(driver);
		postAction(page.getClass().getName(),"back button pressed.");
	}

	public void forward() throws Exception {
		preAction();
		SeleniumAction.forward(driver);
		postAction(page.getClass().getName(),"forward button pressed.");
	}

	public String goTo(String url) throws Exception {
		preAction();
		String tmp = SeleniumAction.goTo(driver, url);
		postAction(page.getClass().getName(),"directed at "+url+".");
		return tmp;
	}

	public void clear(LocatorType locatorType, String locatorValue) throws Exception {
		preAction();
		SeleniumAction.click(driver, locatorType, locatorValue);
		postAction(page.getClass().getName(),"locator "+locatorValue+" cleared.");

	}

	public WebElement typeContinue(LocatorType locatorType, String locatorValue, String value) throws Exception {
		preAction();
		WebElement element = SeleniumAction.type(driver, locatorType, locatorValue, value);
		postAction(page.getClass().getName(),value+" typed.");
		return element;
	}

	public WebElement typeStop(LocatorType locatorType, String locatorValue, String value) throws Exception {
		preAction();
		WebElement element = SeleniumAction.type(driver, locatorType, locatorValue, value);
		postAction(page.getClass().getName(),value+" typed.");
		return element;
	}

	public WebElement pressEnter(LocatorType locatorType, String locatorValue) throws Exception {
		preAction();
		WebElement element = SeleniumAction.pressEnterKey(driver, locatorType, locatorValue);
		postAction(page.getClass().getName(),"enter key pressed.");
		return element;

	}

	public WebElement pressReturn(LocatorType locatorType, String locatorValue) throws Exception {
		preAction();
		WebElement element = SeleniumAction.pressReturnKey(driver, locatorType, locatorValue);
		postAction(page.getClass().getName(),"return key pressed.");
		return element;
	}

	public WebElement pressEnter(WebElement element) throws Exception {
		preAction();
		WebElement tmp = SeleniumAction.pressEnterKey(element);
		postAction(page.getClass().getName(),"enter key pressed.");
		return tmp;
	}

	public WebElement pressReturn(WebElement element) throws Exception {
		preAction();
		WebElement tmp = SeleniumAction.pressReturnKey(element);
		postAction(page.getClass().getName(),"return key pressed.");
		return tmp;
	}

	@Override
	public List<StepResult> preAction(String... inputs) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StepResult> postAction(String... inputs) throws Exception {
		StepResult stepResult=new StepResult();
		if(inputs!=null&&inputs.length!=0) {
			stepResult.setKey(inputs[0]);
			stepResult.setValue(inputs[1]);
			MyLogger.log(stepResult);
			
		}
		
		return null;
	}

}
