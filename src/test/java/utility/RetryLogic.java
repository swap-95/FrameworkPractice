package utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer
{
int initialCount = 0;
int retrycount  = 0;
	@Override
	public boolean retry(ITestResult result)
	{
		if(initialCount<retrycount)
		{
			initialCount++;
			return true;
		}
		
		return false;
	}

}
