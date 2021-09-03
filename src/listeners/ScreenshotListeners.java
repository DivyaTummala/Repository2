package listeners;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.framework.Utilities.Screenshot;


public class ScreenshotListeners extends TestListenerAdapter  {
	
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

	

}
