package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerunfailedtestcases implements IRetryAnalyzer {

	int retrycount=0;
	int maxcount=3;
	@Override
	public boolean retry(ITestResult result) {
		
		if(ITestResult.FAILURE==result.getStatus()&&retrycount<=maxcount)
		{
			retrycount++;
			System.out.println("count is "+retrycount+"executing test case"+result.getName());
			return true;
		}
		
		return false;
	}

}
