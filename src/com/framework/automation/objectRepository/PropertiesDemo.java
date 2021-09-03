package com.framework.automation.objectRepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo  {

	public static void main(String[] args) throws IOException {
		FileInputStream fip=new FileInputStream("C:\\Users\\Divya\\OneDrive\\Desktop\\Project\\Project\\Mysampleframework\\src\\com\\framework\\automation\\objectRepository\\or.properties");
		Properties properties=new Properties();
		properties.load(fip);
		String username=properties.getProperty("un_id");
		System.out.println(username);
		
		String password=properties.getProperty("pwd_id");
		System.out.println(password);
		
		
		String loginbtn=properties.getProperty("login_xpath");
		System.out.println(loginbtn);
		
		
		
	}
	


}
