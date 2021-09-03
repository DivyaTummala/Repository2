package com.framework.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

public class ActionsTest extends BaseTest {

	public static void enterurl(String url)
	{
		try
		{
			Getdriver().get(url);
		}
		catch (Exception e) {

		}
	}
	
	public static void DTA(WebElement element,String testdata)
	{
		try
		{
			element.clear();
		element.sendKeys(testdata);

		}
		catch (Exception e) {

		}
	}
	
	public static void DTAByActions(WebElement element,String testdata)
	{
		Actions actions=new Actions(Getdriver());
		try
		{
			actions.sendKeys(element,testdata).build().perform();
		}
		catch (Exception e) {
			
		}
	}
	
	public static void click(WebElement element)
	{
		try
		{
			if(element.isDisplayed()&&element.isEnabled())
			{
				element.click();

			}
		}
		catch (Exception e) {

		}
	}
	
	
	
	
	
}
