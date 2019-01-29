package WebApplication.Pages;

import org.openqa.selenium.WebElement;

import com.ta.framework.browsers.Browser;
import com.ta.framework.selenium.LocatorType;
import com.ta.framework.user.User;
import com.ta.framework.webapp.AbstractWebPage;

public class UserPage extends AbstractWebPage {


    public UserPage() {
		super();
		
	}
    
	public UserPage(Browser browser, User user) {
		super(browser, user);
		
	}
	public UserPage(Browser browser) {
		super(browser);
		
	}
	
	public String filterByUser(String userName)throws Exception{
        WebElement element= pageAction.typeContinue(LocatorType.XPATH,".//input[contains(@id,'userfilter')]",userName);
        pageAction.pressEnter(element);
        return userName;
    }
    public void submitReputation()throws Exception{
        pageAction.navigateTo("https://stackoverflow.com/users?tab=reputation");

    }
    public void submitNewUsers()throws Exception{
        pageAction.navigateTo("https://stackoverflow.com/users?tab=newusers");

    }

    public void submitVoters()throws Exception{
        pageAction.navigateTo("https://stackoverflow.com/users?tab=voters");

    }

    public void submitEditors()throws Exception{
        pageAction.navigateTo("https://stackoverflow.com/users?tab=editors");
    }

    public void submitModerators()throws Exception {
        pageAction.navigateTo("https://stackoverflow.com/users?tab=moderators");
    }
}
