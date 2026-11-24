package web_base.Framework_Practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseTest;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class TC2_LoginAndLogoutToAmazon extends BaseTest
{
	@Test(retryAnalyzer=RetryLogic.class)
	public void withvalidCredAndLogout()
	{
		Reporter.log("Website Launch");
		HomePage homepage = new HomePage(driver);
		homepage.hoverOverOnAccountAndList(driver);
		homepage.ClickOnSignin();
		Reporter.log("Signin Successfully");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enteremailid();
		loginpage.ClickOncontinuebutton();
		loginpage.enterpassword();
		loginpage.ClickOnsigninbutton();
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		homepage.hoverOverOnAccountAndList(driver);
		homepage.ClickOnSignout();
		Reporter.log("Signout Successfully");
		Assert.assertEquals(loginpage.verifyloginpage(), "Sign in or create account");
		Reporter.log("Testcase 2 is Pass");
	}
}
