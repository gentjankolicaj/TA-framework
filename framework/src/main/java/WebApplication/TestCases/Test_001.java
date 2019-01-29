package WebApplication.TestCases;

import com.ta.framework.browsers.Browser;
import com.ta.framework.browsers.BrowserManager;
import com.ta.framework.browsers.MyBrowserType;
import com.ta.framework.report.ReportFileType;
import com.ta.framework.report.ReportUtils;
import com.ta.framework.test.TestCase;

import WebApplication.Pages.HomePage;

public class Test_001 extends TestCase {

	private static int timeout;

	@Override
	public void start() {

		/**
		 * Test opening activities
		 * 
		 * 
		 */

		timeout = 3000;

	}

	@Override
	public void run() throws Exception {

		// 1blablaPass
		Browser myBrowser = BrowserManager.openBrowser(MyBrowserType.FIREFOX); // open browser

		HomePage homePage = new HomePage(myBrowser);
		homePage.submitSignUp();
		homePage.typeEmail("test12blabla@gmail.com");
		Thread.sleep(timeout);
		homePage.typePassword("blabla1password");
		Thread.sleep(timeout);
		homePage.typeDisplayName("Batman ,Dark Knight");

		// homePage.signUp(); robot issue

	}

	public void finish() throws Exception {

		/**
		 * Test closure activities
		 * 
		 * 
		 */
		
		try{
			
			ReportUtils.saveLogs(getClass().getName(), "testResults", ReportFileType.XLSX); 
			
		}finally {
			
			BrowserManager.quitAllBrowsers();
			
		}
		
	}

}
