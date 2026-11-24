package web_base.Framework_Practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	WebDriver driver;
	
@FindBy(xpath="//span[@class='nav-line-2 ']")
WebElement accounandList;

@FindBy(xpath="//a[@class='nav-action-signin-button']")
WebElement signin;

@FindBy(xpath="//span[text()='Sign Out']")
WebElement signout;

@FindBy(id="twotabsearchtextbox")
WebElement searchtext;

@FindBy(xpath="//div[@class='sc-eifrsQ lekJkh']")
WebElement manageprofile;

@FindBy(xpath="//a[@class='sc-gFqAkR sc-fUnMCh cgSQBY ZzHvZ']")
WebElement manageprofilelink;

@FindBy(xpath="//div[@class='context-header desktop']/div[1]")
WebElement yourprofiletext;



public void hoverOverOnAccountAndList(WebDriver driver)
{
	Actions a1 = new Actions(driver);
	a1.moveToElement(accounandList).perform();
}
public void ClickOnSignin()
{
	signin.click();	
}
public void ClickOnSignout()
{
	signout.click();	
}
public void SearchTheproduct()
{
	searchtext.sendKeys("Shoes" +Keys.ENTER);	
}
public void EditTheprofile()
{
	manageprofile.click();
}
public void ClickOnprofile()
{
	manageprofilelink.click();
}
public String verifyYourprofiletext() {
	
	String text = yourprofiletext.getText();	
	return text;
}
public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


}
