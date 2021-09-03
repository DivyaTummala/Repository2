package com.framework.bussinesscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.framework.Base.BaseTest;

import listeners.Rerunfailedtestcases;

public class CreateAccount extends BaseTest {


	@Test(retryAnalyzer = Rerunfailedtestcases.class)
	public void Create() throws InterruptedException
	{

		
		Thread.sleep(4000);
		Actions actions=new Actions(Getdriver());
		WebElement account= Getdriver().findElement(By.xpath("//a[text()='Accounts']"));
		actions.moveToElement(account).build().perform();
		WebElement tabCreateAccount= Getdriver().findElement(By.xpath("//a[text()=' Create New Account']"));
		actions.moveToElement(tabCreateAccount).click().build().perform();
		Thread.sleep(1000);

//
//		WebElement idprooftype = Getdriver().findElement(By.id("ddlIDProof"));
//		Select select=new Select(idprooftype);
//		select.selectByIndex(1);
//
//
//		WebElement idproofno = Getdriver().findElement(By.id("txtIDProofNumber"));
//		idproofno.sendKeys("324327483274");
//
//		WebElement panno=Getdriver().findElement(By.xpath("//input[@id='txtPanCardNumber']"));
//		panno.sendKeys("AVLGG8244K");




		WebElement Addressprooftype = Getdriver().findElement(By.cssSelector("select[id='ddlAddressProof']"));
		Select Addselect=new Select(Addressprooftype);
		Addselect.selectByValue("DL");
		//		     
		//		   //TakesScreenshot take=(TakesScreenshot) Getdriver();
		//		   File file= ((TakesScreenshot) Getdriver()).getScreenshotAs(OutputType.FILE);
		//		  FileUtils.copyFile(file, new File("C:\\Users\\dtummala\\eclipse-workspace\\Rameshsoft_Javaprograms\\Home\\image1.jpg"));


		WebElement ChannelCode = Getdriver().findElement(By.name("ctl00$BodyContent$ddlChannelCode"));
		Select channel=new Select(ChannelCode);
		channel.selectByVisibleText("CCSALES");

		WebElement DSANo = Getdriver().findElement(By.id("txtDSANumber"));
		DSANo.sendKeys("384723889");

		WebElement ChannelStaffCode = Getdriver().findElement(By.id("txtChannelStaffCode"));
		ChannelStaffCode.sendKeys("dadkashdjk");

		WebElement ETCEmployeeCode = Getdriver().findElement(By.id("txtETCEmployeeCode"));
		ETCEmployeeCode.sendKeys("dadkashdjk");


		WebElement Firstname = Getdriver().findElement(By.id("BodyContent_txtFirstName"));
		Firstname.sendKeys("danush");


		//		     WebElement Lastname = Getdriver().findElement(By.id("BodyContent_txtLastName"));
		//		     Lastname.sendKeys("Reshmi");

		WebElement Lastname=Getdriver().findElement(By.id("BodyContent_txtLastName"));
		Lastname.sendKeys("chandu");


		WebElement Gender=Getdriver().findElement(By.id("BodyContent_ddlGender"));
		Select gg=new Select(Gender);
		gg.selectByIndex(2);

		//		     action1.sendKeys(Lastname,"ddd").build().perform();
		//		     action1.click(Lastname).sendKeys("ddd").build().perform();


		Getdriver().findElement(By.id("BodyContent_txtDateOfBirth")).click();
		Thread.sleep(3000);

		Getdriver().findElement(By.xpath("//div[@id='ui-datepicker-div']//tr[3]//td[7]")).click();


		WebElement maiden= Getdriver().findElement(By.id("BodyContent_txtMothersMaidenName"));
		maiden.sendKeys("name");

		Getdriver().findElement(By.id("BodyContent_chkApplicationForm")).click();


		WebElement nextbtn= Getdriver().findElement(By.id("BodyContent_btnAgree"));
		nextbtn.click();
		Thread.sleep(3000);




		WebElement address1=Getdriver().findElement(By.id("BodyContent_txtAddress1"));
		address1.sendKeys("Hyd");



		WebElement city =Getdriver().findElement(By.id("BodyContent_txtCity"));
		city.sendKeys("Hyd");


		WebElement state=Getdriver().findElement(By.id("BodyContent_ddlState"));
		Select select1=new Select(state);
		select1.selectByIndex(2);


		WebElement pincode =Getdriver().findElement(By.id("BodyContent_txtZip1"));
		pincode.sendKeys("225478");


		WebElement mobileno =Getdriver().findElement(By.id("txtMobilePhone"));
		mobileno.sendKeys("8744554114");



		WebElement btnagree= Getdriver().findElement(By.id("BodyContent_btnAgree"));
		btnagree.click();
		
		Thread.sleep(3000);


		WebElement chassisno= Getdriver().findElement(By.id("txtPlateChasis"));
		chassisno.sendKeys("TS23942CPAZA100");


		WebElement Engineno= Getdriver().findElement(By.id("txtEngineNum"));
		Engineno.sendKeys("TS23942CPAZA100");


		WebElement Make=Getdriver().findElement(By.id("BodyContent_ddlVehicleMake"));
		Select Make1=new Select(Make);
		Make1.selectByIndex(1);

		Thread.sleep(3000);

		WebElement Model=Getdriver().findElement(By.id("BodyContent_ddlVehicleModel"));
		Select Model1=new Select(Model);
		Model1.selectByIndex(1);


		WebElement state1=Getdriver().findElement(By.id("ddlRegisteredState"));
		Select selectstate1=new Select(state1);
		selectstate1.selectByIndex(2);




		Getdriver().findElement(By.id("chkPhone")).click();

		Getdriver().findElement(By.id("chkRCDoc")).click();


		WebElement vehicleadd = Getdriver().findElement(By.id("btnAdd"));   
		vehicleadd.click();

		Thread.sleep(3000);



		WebElement vehiclenxtbtn = Getdriver().findElement(By.id("BodyContent_aNext"));   
		vehiclenxtbtn.click();


		WebElement Paymentnext = Getdriver().findElement(By.id("BodyContent_btnSubmit"));   
		Paymentnext.click();



		WebElement Makepaymentbtn = Getdriver().findElement(By.id("BodyContent_btnDoPayment"));   		  


		if(Makepaymentbtn.isDisplayed()&&Makepaymentbtn.isEnabled())
		{
			System.out.println("Makepaymentbtn clicked");
			Makepaymentbtn.click();
		}
		else
		{
			System.out.println("Makepayment is not clicked");
			Thread.sleep(3000);
		}

	}

}
