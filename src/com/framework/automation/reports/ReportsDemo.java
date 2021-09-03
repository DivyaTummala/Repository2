package com.framework.automation.reports;

import com.framework.Utilities.FilePaths;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportsDemo {
	
	public static void main(String[] args) {
		
		ExtentReports reports=new ExtentReports("C:\\Users\\Divya\\OneDrive\\Desktop\\Project\\Project\\Mysampleframework\\Reports\\report.html");
		ExtentTest extenttest=reports.startTest("demo", "sampletc");
		
		extenttest.log(LogStatus.PASS,"Browser is opened");
		extenttest.log(LogStatus.PASS,"username is entered");
		extenttest.log(LogStatus.PASS,"password is entered");
		
		reports.endTest(extenttest);

		reports.flush();
		reports.close();
		
		
	}

}
