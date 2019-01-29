package WebApplication.Pages;

import com.ta.framework.browsers.Browser;
import com.ta.framework.selenium.LocatorType;
import com.ta.framework.user.User;
import com.ta.framework.webapp.AbstractWebPage;

public class HomePage extends AbstractWebPage {
	
	private String applicationUrl="https://stackoverflow.com/";
	

   public HomePage() {
		super();
		
	}

   
public HomePage(Browser browser) throws Exception {
		super(browser);
        pageAction.goTo(applicationUrl);
	}

   public HomePage(Browser browser,User user) throws Exception {
	   super(browser,user);
       pageAction.goTo(applicationUrl);
   }


    public void typeEmail(String email)  throws Exception{
       pageAction.type(LocatorType.XPATH,".//input[contains(@id,'email')]",email);

    }

    public void typeDisplayName(String name)  throws Exception{
       pageAction.type(LocatorType.XPATH,".//input[contains(@id,'display-name')]",name);

    }

    public void typePassword(String password) throws Exception{
      pageAction.type(LocatorType.XPATH,".//input[contains(@id,'password')]",password);

    }

    public void submitSignUp() throws Exception{
        pageAction.navigateTo("https://stackoverflow.com/users/signup?ssrc=hero&returnurl=%2fusers%2fstory%2fcurrent");
    }

    public void signUp() throws Exception{
      pageAction.click(LocatorType.XPATH,".//button[contains(@id,'submit-button') and contains(text(),'Sign up')]");
    }

    public UserPage submitUser() throws Exception{
       pageAction.navigateTo("https://stackoverflow.com/users");
       return new UserPage(browser);
    }
    public JobsPage submitJobs()throws Exception{
        pageAction.navigateTo("https://stackoverflow.com/jobs?med=site-ui&ref=jobs-tab");
        return new JobsPage(browser);
    }

    public TagsPage submitTags()throws Exception {
        pageAction.navigateTo("https://stackoverflow.com/tags");
        return new TagsPage(browser);
    }
}
