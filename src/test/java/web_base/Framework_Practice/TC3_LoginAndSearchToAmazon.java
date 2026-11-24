package web_base.Framework_Practice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utility.BaseTest;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class TC3_LoginAndSearchToAmazon extends BaseTest
{
@Test(retryAnalyzer=RetryLogic.class)
	public void searchtheproduct()
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
	
	homepage.SearchTheproduct();
	Reporter.log("Searching the product sucessfull");
	Assert.assertEquals(driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']")).size()>40, true);
	Reporter.log("Testcase 3 is Pass");
	}
}
