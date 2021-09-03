package com.framework.bussinesscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.framework.Base.BaseTest;

import listeners.Rerunfailedtestcases;


public class AssignTag extends BaseTest{

	@Test(retryAnalyzer = Rerunfailedtestcases.class)
	public void TagAssign() throws InterruptedException {
	
		 
		Getdriver().findElement(By.id("CustInfo_lnkbtnDone")).click();
	
		WebElement search = Getdriver().findElement(By.xpath("//a[text()=' Search']"));
		search.click();

		Thread.sleep(2000);
		
		WebElement searchcusotmerid = Getdriver().findElement(By.id("BodyContent_txtAccountNumber"));
		searchcusotmerid.sendKeys("15060587");

		Getdriver().findElement(By.id("BodyContent_btnSearch")).click();
		Thread.sleep(2000);
		
		Getdriver().findElement(By.xpath("//a[text()='View Tag Account Summary']")).click();
		
		Actions actions1=new Actions(Getdriver());
		WebElement Manageaccounts= Getdriver().findElement(By.xpath("//a[text()='Manage Account']"));
		actions1.moveToElement(Manageaccounts).build().perform();
		
		Thread.sleep(2000);



		WebElement tagassign= Getdriver().findElement(By.xpath("//a[text()=' Assign Tag']"));
		actions1.moveToElement(tagassign).click().build().perform();
		Thread.sleep(1000);
		
		Getdriver().findElement(By.xpath("//a[text()='Select']")).click();

		Thread.sleep(2000);

		
		Getdriver().findElement(By.xpath("//input[@id='txtTagids']")).sendKeys("150985436");
		
		Thread.sleep(2000);
		Getdriver().findElement(By.id("btnFulfillRequest")).click();
		
		Thread.sleep(2000);

		 try {
	         WebDriverWait wait = new WebDriverWait(Getdriver(), 60);
	         wait.until(ExpectedConditions.alertIsPresent());
	         Alert alert = Getdriver().switchTo().alert();
	         alert.accept();
				Thread.sleep(1000);

	     } catch (Exception e) {
	         //exception handling
	 		Getdriver().findElement(By.id("btnFulfillRequest")).click();
	 		 WebDriverWait wait = new WebDriverWait(Getdriver(), 60);
	         wait.until(ExpectedConditions.alertIsPresent());
	         Alert alert = Getdriver().switchTo().alert();

	      e.printStackTrace();
	      System.out.println("In alert hanlder");
	     }






		
			
		}
}
