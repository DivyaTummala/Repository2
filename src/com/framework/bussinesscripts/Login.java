package com.framework.bussinesscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.framework.Base.ActionsTest;
import com.framework.Base.BaseTest;
import com.framework.Utilities.PojoUtilities;

public class Login extends BaseTest {

	@Test
	public void login() throws InterruptedException, EncryptedDocumentException, IOException {
		
		String username1=PojoUtilities.getExcelObj().getCelldata("sheetname", "data", 0, 0);
		String password1=PojoUtilities.getExcelObj().getCelldata("sheetname", "data", 0, 1);

		
		
		
		

//		FileInputStream fip=new FileInputStream("C:\\Users\\Divya\\OneDrive\\Desktop\\Project\\Project\\Mysampleframework\\src\\com\\framework\\automation\\TestData\\TestExcelData.xlsx");
//		Workbook workbook =WorkbookFactory.create(fip);
//		Sheet sheet = workbook.getSheet("Data");
//		Row row0=sheet.getRow(0);
//		Cell cell =row0.getCell(0);
//		
//		String username1="";
//		if(cell.getCellType()==CellType.NUMERIC)
//		{
//			username1=cell.getNumericCellValue()+"";
//		}
//		else if (cell.getCellType()==CellType.STRING)
//		{
//			username1=cell.getStringCellValue()+"";
//		}
//		else if (cell.getCellType()==CellType.BOOLEAN)
//		{
//			username1=cell.getBooleanCellValue()+"";
//		}	
//		
//		Cell cell1 =row0.getCell(1);
//		String password1="";
//
//		if(cell1.getCellType()==CellType.NUMERIC)
//		{
//			password1=cell1.getNumericCellValue()+"";
//		}
//		else if (cell1.getCellType()==CellType.STRING)
//		{
//			password1=cell1.getStringCellValue()+"";
//		}
//		else if (cell1.getCellType()==CellType.BOOLEAN)
//		{
//			password1=cell1.getBooleanCellValue()+"";
//		}	
//		
		
//		FileInputStream fipconf=new FileInputStream("C:\\Users\\Divya\\OneDrive\\Desktop\\Project\\Project\\Mysampleframework\\config.properties");
//		Properties prconf=new Properties();
//		prconf.load(fipconf);
//		String url=prconf.getProperty("qa_url");
		
		String url=PojoUtilities.getconfobj().getPropertyvalue("qa_url");
		Getdriver().get(url);

		 
//		 FileInputStream fipor=new FileInputStream("C:\\Users\\Divya\\OneDrive\\Desktop\\Project\\Project\\Mysampleframework\\src\\com\\framework\\automation\\objectRepository\\or.properties");
//		 Properties pror=new Properties();	
//		 pror.load(fipor);
//		  String userid=pror.getProperty("un_id");
//		  String password=pror.getProperty("pwd_id");
//		  String btnclick=pror.getProperty("login_xpath");
		 

		String userid=PojoUtilities.getorobj().getPropertyvalue("un_id");
		String password=PojoUtilities.getorobj().getPropertyvalue("pwd_id");
		String btnclick=PojoUtilities.getorobj().getPropertyvalue("login_xpath");


		 
		
           

		  
		  WebElement username= Getdriver().findElement(By.id(userid));
          ActionsTest.DTA(username, username1);
          
          WebElement pwd=Getdriver().findElement(By.name(password));
          ActionsTest.DTA(pwd,password1);
          
          WebElement btn= Getdriver().findElement(By.xpath(btnclick));
          ActionsTest.click(btn);

          Thread.sleep(4000);
          

//		     WebDriverWait wait=new WebDriverWait(Getdriver(),56);
//		     wait.until(ExpectedConditions.visibilityOf(username));
//		     
//		     if(username.isDisplayed()&&username.isEnabled())
//		     {
//		     	System.out.println("username selected");
//		     	username.click();
//		     	username.sendKeys(username1);
//		     }
//		     else
//		     {
//		     	System.out.println("Username not selected");
//		     }
//		     Thread.sleep(3000);
//		     WebElement pwd=Getdriver().findElement(By.name(password));
//		     pwd.clear();
//		     if(pwd.isDisplayed()&&pwd.isEnabled())
//		     {
//		     	System.out.println("Password selected");
//		     	pwd.click();
//		     	pwd.sendKeys(password1);
//		     }
//		     else
//		     {
//		     	System.out.println("Password not selected");
//		     }
//		     Thread.sleep(3000);
//		     
//		    WebElement btn= Getdriver().findElement(By.xpath(btnclick));
//		    btn.click();
//		    
//		     String title=Getdriver().getTitle();
//		     System.out.println(title);
//		     if (title.equalsIgnoreCase("ICICI Bank - Sub Agent Dashboard"))
//		     {
//		     	System.out.println("Titlematched");
//		     	Thread.sleep(2000);
//		     	
//		     }
//		     else
//		     {
//		     	System.out.println("Title is not matched");
//		     }
//
	}


}
