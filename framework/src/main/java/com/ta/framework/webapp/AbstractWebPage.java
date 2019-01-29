package com.ta.framework.webapp;

import com.ta.framework.browsers.Browser;
import com.ta.framework.user.User;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public abstract class AbstractWebPage {
	
	protected Browser browser;
	protected PageAction pageAction;
    protected User user;
    protected String url;
    
	public AbstractWebPage() {
		super();
		// TODO in order to avoid NPE after calling this constructor you must call setters for :browser,pageAction
	}

	public AbstractWebPage(Browser browser) {
		super();
		this.browser = browser;
		this.pageAction=new PageAction(this,browser.getWebDriver());
	}
	
	public AbstractWebPage(Browser browser,User user) {
		super();
		this.browser = browser;
		this.user=user;
		this.pageAction=new PageAction(this,browser.getWebDriver());
	}
	
	

	public Browser getBrowser() {
		return browser;
	}

	public void setBrowser(Browser browser) {
		this.browser = browser;
	}

	public PageAction getPageAction() {
		return pageAction;
	}

	public void setPageAction(PageAction pageAction) {
		this.pageAction = pageAction;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
    
}


