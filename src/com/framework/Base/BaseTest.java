package com.framework.Base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.framework.Utilities.Screenshot;
import com.framework.automation.customizedexception.Frameworkexception;
import com.google.gson.annotations.Until;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {

	private static WebDriver driver;
	private static ExtentReports reports;
	private static  ExtentTest extenttest;
	
	
	@Parameters({"browser"})
	@BeforeSuite
	public void OpenBrowser(@Optional("Chrome") String browser) {

	if(browser.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\OneDrive\\Desktop\\Project\\Project\\Mysampleframework\\Driver\\chromedriver.exe");
     
		 driver=new ChromeDriver();
		
		 browser_mechanism();
				
		
	}
	else if(browser.equalsIgnoreCase("Firefox"))
	{
		System.setProperty("webdriver.gicko.driver", "C:\\Users\\Divya\\OneDrive\\Desktop\\Project\\Project\\Mysampleframework\\Driver");
	     
		 driver=new FirefoxDriver();
		 
		 browser_mechanism();
	

		
	}
	else if(browser.equalsIgnoreCase("Ie"))
	{
		System.setProperty("webdriver.Ie.driver", "C:\\Users\\Divya\\OneDrive\\Desktop\\Project\\Project\\Mysampleframework\\Driver");
	     
		 driver=new InternetExplorerDriver();
		 
		 browser_mechanism();

	}

	}
	
	public void browser_mechanism()
	{
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void CloseBrowser() throws Frameworkexception
	{
		if(driver!=null)
		{
		driver.close();
		}
		else
		{
			//Throws exception
			System.out.println("Driver is pointing to Null");
			Frameworkexception exception=new Frameworkexception("Driver is pointing to null");
			throw exception;
			
		}
		
	}
	
//	@BeforeTest
//	public void initReport()
//	{
//		 reports=new ExtentReports("C:\\Users\\Divya\\OneDrive\\Desktop\\Project\\Project\\Mysampleframework\\Reports");
//	}
//	@AfterTest
//	public void GenerateReports()
//	{
//		reports.close();
//	}
//
//	@BeforeMethod
//	public void beforestartingtest(Method method) {
//		
//          String tcname= method.getName();
//          System.out.println("Test case is executed"+tcname);
//           extenttest = reports.startTest(tcname);
//           extenttest.log(LogStatus.PASS, "Test case is executed"+tcname);
//           
//	}
//	
//	
//	@AfterMethod
//	public void Afterstartingtest(ITestResult result) throws IOException {
//	
//	if(result.getStatus() == ITestResult.SUCCESS)
//	{
//		System.out.println("Testcase is success"+result.getName());
//		Screenshot.screenshotutility(result.getName());
//        extenttest.log(LogStatus.PASS, "Testcase is success"+result.getName());
//
//	}
//	
//	else if(result.getStatus()==ITestResult.FAILURE)
//	{
//		System.out.println("Test case is failure"+result.getName());
//		Screenshot.screenshotutility(result.getName());
//        extenttest.log(LogStatus.FAIL, "Testcase is failed"+result.getName());
//        extenttest.log(LogStatus.FAIL,result.getThrowable());
//
//	}
//        
//	else if(result.getStatus()==ITestResult.SKIP)
//	{
//		System.out.println("Test case is skipped"+result.getName());
//		Screenshot.screenshotutility(result.getName());
//        extenttest.log(LogStatus.SKIP, "Testcase is skipped"+result.getName());
//        extenttest.log(LogStatus.SKIP,result.getThrowable());
//
//	}
//    reports.endTest(extenttest);
//    reports.flush();
//
//	}

	public static WebDriver Getdriver()
	{
		return driver;
		
	}
	
//	public static ExtentTest GetExtenttest()
//	{
//		return extenttest;
//		
//	}
	
	

}
