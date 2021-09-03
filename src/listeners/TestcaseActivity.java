package listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.framework.Utilities.Screenshot;

public class TestcaseActivity implements ITestListener
{

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("Suite is finished"+arg0);
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("Suite is stated"+arg0);

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		
		System.out.println("Testcase is Failed"+arg0);
		try {
			Screenshot.screenshotutility(arg0.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Testcase is skipped"+arg0);
		try {
			Screenshot.screenshotutility(arg0.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("Testcase is Started"+arg0);
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Testcase is Success"+arg0);
		
	}
	
	

}
