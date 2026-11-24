package web_base.Framework_Practice;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseTest;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class TC4_EditUserprofile extends BaseTest
{
@Test(retryAnalyzer=RetryLogic.class)
public void editprofile() throws InterruptedException
{
	Reporter.log("Website Launch");
	HomePage homepage = new HomePage(driver);
	homepage.hoverOverOnAccountAndList(driver);
	homepage.ClickOnSignin();
	Reporter.log("Click on Signin button");
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enteremailid();
	loginpage.ClickOncontinuebutton();
	loginpage.enterpassword();
	loginpage.ClickOnsigninbutton();
	Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	Reporter.log("Signin Sucessfully");
	Thread.sleep(3000);
	
	homepage.hoverOverOnAccountAndList(driver);
	Thread.sleep(3000);
	homepage.EditTheprofile();
	Reporter.log("Click on Edit Profile");
	homepage.ClickOnprofile();
	Reporter.log("Click on Manage Profile link");
	Assert.assertEquals(homepage.verifyYourprofiletext(), "Your Profile");
	Reporter.log("Showing Your Profile Page Title");
	Reporter.log("Testcase 4 is Pass");
}
}
