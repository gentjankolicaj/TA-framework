package WebApplication.TestCases;

import com.ta.framework.browsers.Browser;
import com.ta.framework.browsers.BrowserManager;
import com.ta.framework.browsers.MyBrowserType;
import com.ta.framework.report.ReportFileType;
import com.ta.framework.report.ReportUtils;
import com.ta.framework.test.TestCase;

import WebApplication.Pages.HomePage;
import WebApplication.Pages.UserPage;

public class Test_003 extends TestCase {

	int timeout;

	@Override
	public void start() throws Exception {
		/**
		 * Test opening activities
		 * 
		 * 
		 */

		timeout = 2000;

	}

	@Override
	public void run() throws Exception {

		// 1blablaPass
		Browser myBrowser = BrowserManager.openBrowser(MyBrowserType.FIREFOX);

		HomePage homePage = new HomePage(myBrowser);
		UserPage userPage = homePage.submitUser();
		userPage.filterByUser("Neymar");
		Thread.sleep(timeout + 4000);
		userPage.submitReputation();
		Thread.sleep(timeout);
		userPage.submitVoters();
		Thread.sleep(timeout);
		userPage.submitEditors();
		Thread.sleep(timeout);
		userPage.submitNewUsers();
		Thread.sleep(timeout);
		userPage.submitModerators();
		Thread.sleep(timeout);
		userPage.submitReputation();
		Thread.sleep(timeout);
		userPage.filterByUser("messi");
		userPage.submitModerators();
		Thread.sleep(timeout);
		userPage.filterByUser("hazard");

	}

	@Override
	public void finish() throws Exception {
		/**
		 * Test closure activities
		 * 
		 * 
		 */
		
		try {

			ReportUtils.saveLogs(getClass().getName(), "testResults", ReportFileType.XLSX);

		} finally {

			BrowserManager.quitAllBrowsers();

		}

	}

}
