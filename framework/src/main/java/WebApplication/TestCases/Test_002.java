package WebApplication.TestCases;

import com.ta.framework.browsers.Browser;
import com.ta.framework.browsers.BrowserManager;
import com.ta.framework.browsers.MyBrowserType;
import com.ta.framework.report.ReportFileType;
import com.ta.framework.report.ReportUtils;
import com.ta.framework.test.TestCase;

import WebApplication.Pages.HomePage;
import WebApplication.Pages.TagsPage;

public class Test_002 extends TestCase {

	int timeout;

	@Override
	public void start() throws Exception {
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
		Browser myBrowser = BrowserManager.openBrowser(MyBrowserType.FIREFOX);

		HomePage homePage = new HomePage(myBrowser);
		TagsPage tagsPage = homePage.submitTags();
		tagsPage.filterByTagName("Java");
		Thread.sleep(timeout + 3000);
		tagsPage.submitPopular();
		Thread.sleep(timeout);
		tagsPage.submitName();
		Thread.sleep(timeout);
		tagsPage.submitNew();

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
