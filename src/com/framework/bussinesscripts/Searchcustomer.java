package com.framework.bussinesscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.framework.Base.BaseTest;

import listeners.Rerunfailedtestcases;


public class Searchcustomer extends BaseTest  {

	@Test(retryAnalyzer = Rerunfailedtestcases.class)
	public void search() throws InterruptedException {



		WebElement search = Getdriver().findElement(By.xpath("//a[text()=' Search']"));
		search.click();

		Thread.sleep(2000);

		WebElement searchcusotmerid = Getdriver().findElement(By.id("BodyContent_txtAccountNumber"));
		searchcusotmerid.sendKeys("15060537");


		Getdriver().findElement(By.id("BodyContent_btnSearch")).click();
		Thread.sleep(2000);

		
	


		
		

		
		
	}

}
