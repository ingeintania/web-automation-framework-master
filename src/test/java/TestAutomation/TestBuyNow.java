package TestAutomation;

import org.testng.annotations.Test;
import TestAutomation.helpers.Browser;
import TestAutomation.helpers.Config;
import TestAutomation.helpers.TestBase;
import TestAutomation.pageObjects.MidtransHomePage;

public class TestBuyNow extends TestBase
{
	
	@Test(dataProvider = "getTestConfig", description = "This testcase is verifying successful buy now click to Midtrans demo site")
	public void testBuyNowClick(Config testConfig)
	{
		Browser.openBrowserAndNavigateToUrl(testConfig, "https://demo.midtrans.com/");
		
		MidtransHomePage midtransHomePage = new MidtransHomePage(testConfig);
		// midtransHomePage.clickBuyButton();
		// midtransHomePage.changeToWrongEmail();
		midtransHomePage.clickCheckoutButton();
		// midtransHomePage.assertErrorBottomSheet();
		
		Browser.takeScreenshot(testConfig);
	}
}