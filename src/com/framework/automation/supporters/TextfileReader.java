package com.framework.automation.supporters;

import java.io.File;
import java.io.IOException;

public class TextfileReader {

public static void main(String[] args) throws IOException {
	
File file=new File("C:\\Users\\Divya\\OneDrive\\Desktop\\Project\\Project\\Mysampleframework\\src\\com\\framework\\automation\\supporters");
 boolean status = file.createNewFile();
 if(status)
 {
	 System.out.println("create new file");
 }
 else 
 {
	 System.out.println("Return existing  file");
 }
 
}	
}
