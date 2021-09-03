package com.framework.Utilities;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.framework.automation.supporters.ExcelReader;
import com.framework.automation.supporters.PropertiesReader;

public class PojoUtilities {
	
	public static ExcelReader getExcelObj() throws EncryptedDocumentException, IOException
	{
		
		ExcelReader excelReader=new ExcelReader(FilePaths.excelFile);
		return excelReader;
		
		
	}
	
	public static PropertiesReader getorobj() throws EncryptedDocumentException, IOException
	{
		PropertiesReader pror=new PropertiesReader(FilePaths.orFile);
		return pror;		
		
	}
	
	public static PropertiesReader getconfobj() throws EncryptedDocumentException, IOException
	{
		PropertiesReader conffile=new PropertiesReader(FilePaths.ConfFile);
		return conffile;
		
		
	}


}
