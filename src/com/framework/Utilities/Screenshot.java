package com.framework.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.framework.Base.BaseTest;

public interface Screenshot {
	
	public static void screenshotutility(String name) throws IOException
	{
		TakesScreenshot screenshot=(TakesScreenshot) BaseTest.Getdriver();
		File file =screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\Divya\\OneDrive\\Desktop\\Project\\Project\\Mysampleframework\\Screenshots\\"+name+".jpeg"));
	}
}
