package web_base.Framework_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.cdimascio.dotenv.Dotenv;

public class LoginPage 
	{
		WebDriver driver;
		
	

	@FindBy(id="ap_email_login")
	WebElement emailid;

	@FindBy(id="continue")
	WebElement continuebutton;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signinbutton;
	
	@FindBy(xpath="//h1[text()='Sign in or create account']")
	WebElement signintext;
	
	Dotenv env = Dotenv.load();
	public void enteremailid()
	{
		
		String un = env.get("username1");
		emailid.sendKeys(un);	
	}
	public void ClickOncontinuebutton()
	{
		continuebutton.click();	
	}
	public void enterpassword()
	{
		
		String pw = env.get("password1");
		password.sendKeys(pw);	
	}
	public void ClickOnsigninbutton()
	{
		signinbutton.click();	
	}
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyloginpage() 
	{
		String text = signintext.getText();	
		return text;
	}
	}


