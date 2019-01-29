package WebApplication.Pages;

import org.openqa.selenium.WebElement;

import com.ta.framework.browsers.Browser;
import com.ta.framework.selenium.LocatorType;
import com.ta.framework.user.User;
import com.ta.framework.webapp.AbstractWebPage;

public class JobsPage extends AbstractWebPage {

    public JobsPage() {
		super();
	}

	public JobsPage(Browser browser, User user) {
		super(browser, user);
	}

	public JobsPage(Browser browser) {
		super(browser);
	}

	
	public void searchJobs( String jobName)throws Exception{
        WebElement element=pageAction.typeContinue(LocatorType.XPATH,".//input[@id='q']",jobName);
        pageAction.pressEnter(element);
    }

    public void searchCompanies(String companyName)throws Exception{
        pageAction.navigateTo("https://stackoverflow.com/jobs/companies");
        WebElement element=pageAction.typeContinue(LocatorType.XPATH,".//input[@id='q']",companyName);
        pageAction.pressEnter(element);

    }
}
