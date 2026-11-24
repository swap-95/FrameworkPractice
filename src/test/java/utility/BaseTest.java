package utility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class BaseTest extends ListenersLogic
{
	@Parameters("browser")
	@BeforeMethod
	public void lunchBrowser(String nameofBrowser) throws InterruptedException
	{
		if(nameofBrowser.equals("edge"))
		{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		}
		if(nameofBrowser.equals("chrome"))
		{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		}
		
	}
	@AfterMethod
	public void quitBrpwser() throws InterruptedException
	{
		Thread.sleep(3000);
		//driver.quit();
	}
	}

