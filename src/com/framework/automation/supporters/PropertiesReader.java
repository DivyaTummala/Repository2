package com.framework.automation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	
	private String filepath;
	private  FileInputStream fileinputstream;
	private  Properties properties;
	private  String value;

	
	
	public PropertiesReader(String filepath) throws IOException
	{
		this.filepath=filepath;
		fileinputstream=new FileInputStream(filepath);
		properties=new Properties();
		properties.load(fileinputstream);
	
	}
	
	public String getPropertyvalue(String key)
	{
		if(properties!=null)
		{
			value=properties.getProperty(key);
			
		}
		else
		{
			//throw excep
		}
		return value;
		
	}
	
}
