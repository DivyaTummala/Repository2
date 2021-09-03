package com.framework.bussinesscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.framework.Base.BaseTest;

import listeners.Rerunfailedtestcases;

public class AddVehicle extends BaseTest {

	@Test(retryAnalyzer = Rerunfailedtestcases.class)
	public void Vehicle() throws InterruptedException {

		Actions actions1=new Actions(Getdriver());
		WebElement accounts= Getdriver().findElement(By.xpath("//a[text()='Accounts']"));
		actions1.moveToElement(accounts).build().perform();

		WebElement tagaccounts= Getdriver().findElement(By.xpath("//a[text()=' Tag Accounts']"));
		actions1.moveToElement(tagaccounts).click().build().perform();
		Thread.sleep(1000);


		WebElement subgrp=Getdriver().findElement(By.id("BodyContent_ddlSubGroup"));
		Select subgrp1=new Select(subgrp);
		subgrp1.selectByIndex(1);



		WebElement chassisno= Getdriver().findElement(By.id("txtPlateChasis"));
		chassisno.sendKeys("TS23942CPAZA97");


		WebElement Engineno= Getdriver().findElement(By.id("txtEngineNum"));
		Engineno.sendKeys("TS23942CPAZA97");


		WebElement Make=Getdriver().findElement(By.id("BodyContent_ddlVehicleMake"));
		Select Make1=new Select(Make);
		Make1.selectByIndex(1);

		Thread.sleep(3000);

		WebElement Model=Getdriver().findElement(By.id("BodyContent_ddlVehicleModel"));
		Select Model1=new Select(Model);
		Model1.selectByIndex(1);


		WebElement state1=Getdriver().findElement(By.id("BodyContent_ddlRegisteredState"));
		Select selectstate1=new Select(state1);
		selectstate1.selectByIndex(2);




		Getdriver().findElement(By.id("BodyContent_chkPhone")).click();

		Getdriver().findElement(By.id("BodyContent_chkRCDoc")).click();


		WebElement vehicleadd = Getdriver().findElement(By.id("BodyContent_btnAdd"));   
		vehicleadd.click();

		Thread.sleep(3000);




		WebElement Addnext = Getdriver().findElement(By.id("BodyContent_aNext"));   
		Addnext.click();



		WebElement Clicknext = Getdriver().findElement(By.id("BodyContent_btnSubmit"));   
		Clicknext.click();


		WebElement Makepaymnt = Getdriver().findElement(By.id("BodyContent_btnDoPayment"));   
		Makepaymnt.click();



	}

}
