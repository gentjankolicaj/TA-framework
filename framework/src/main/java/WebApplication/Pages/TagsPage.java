package WebApplication.Pages;

import org.openqa.selenium.WebElement;

import com.ta.framework.browsers.Browser;
import com.ta.framework.selenium.LocatorType;
import com.ta.framework.user.User;
import com.ta.framework.webapp.AbstractWebPage;

public class TagsPage extends AbstractWebPage {

    public TagsPage() {
		super();
		
	}

	public TagsPage(Browser browser, User user) {
		super(browser, user);
		
	}

	public TagsPage(Browser browser) {
		super(browser);
		
	}

	public void filterByTagName(String text) throws Exception {
      WebElement element= pageAction.typeContinue(LocatorType.XPATH,".//input[contains(@id,'tagfilter')]",text);
      pageAction.pressEnter(element);

    }

    public void submitPopular() throws Exception{
        pageAction.navigateTo("https://stackoverflow.com/tags?tab=popular");

    }

    public void submitName() throws Exception{
        pageAction.navigateTo("https://stackoverflow.com/tags?tab=name");

    }
    public void submitNew() throws Exception{
        pageAction.navigateTo("https://stackoverflow.com/tags?tab=new");
    }
    
    
}
