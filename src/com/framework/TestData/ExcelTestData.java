package com.framework.TestData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTestData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		FileInputStream fis=new FileInputStream("C:\\Users\\Divya\\OneDrive\\Desktop\\Project\\Project\\Mysampleframework\\src\\com\\framework\\TestData\\TestExcelData.xlsx");
		Workbook workbook= WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Data");
		
		
	 Row row=sheet.getRow(0);
	 Cell cell03=row.createCell(0);
	 cell03.setCellValue("ddddf");
	 
	 Cell cell03d=row.createCell(1);
	 cell03d.setCellValue("ddddf");
		 
	 Row row2=sheet.createRow(1);
	 Cell cell2=row2.createCell(0);
	 cell2.setCellValue("Prog");
	 
	 
	 Cell cell200=row2.createCell(1);
	 cell200.setCellValue("djdj");

		
	 Row row11=sheet.getRow(0);
	Cell  cell44=row11.createCell(0);
	cell44.setCellValue("ggg");
	 
	Row row3=sheet.createRow(2);
	Cell cell30 =row3.createCell(0);
	cell30.setCellValue("Progg");
	

	
	 
		 FileOutputStream fop=new FileOutputStream("C:\\Users\\dtummala\\eclipse-workspace\\Mysampleframework\\src\\com\\framework\\TestData\\TestData.xlsx");
		 workbook.write(fop);
		
		
		
		
		
//		int rownumber = sheet.getLastRowNum();
//		
//		Row row=sheet.getRow(0);
//		Cell cell = row.createCell(0);
//		 cell.setCellValue("sreya");
//		 
//		 
//			Row rowcol2=sheet.getRow(0);
//			Cell cell2 = rowcol2.createCell(2);
//			cell2.setCellValue("divya");
//		 
//			Row rowcol3=sheet.getRow(0);
//			Cell cell3 = rowcol3.createCell(3);
//			 cell3.setCellValue("kavya");
//		 
//			 Row rowcol4=sheet.getRow(0);
//				Cell cell4 = rowcol4.createCell(4);
//				 cell4.setCellValue("subash"); 
//				 
//				 Row rowcol5=sheet.getRow(0);
//					Cell cell5 = rowcol5.createCell(5);
//					 cell5.setCellValue("niketha"); 	 
//				 
//					 
//			Row row1 = sheet.getRow(1);
//			Cell cell0 = row1.createCell(0);
//			cell0.setCellValue(455);
//		
			

			 
		
			
		 
		
		
		
//		for (int i=0;i<=rownumber;i++)
//		{
//			Row row = sheet.getRow(i);
//			
//			for(int j=0;j<row.getLastCellNum();j++)
//			{
//				Cell cell = row.getCell(j);
//				if(cell.getCellType()==CellType.NUMERIC)
//				{
//					System.out.println(cell.getNumericCellValue());
//				}
//				else if(cell.getCellType()==CellType.BOOLEAN)
//				{
//					System.out.println(cell.getBooleanCellValue());
//				}
//				else if(cell.getCellType()==CellType.STRING)
//				{
//					System.out.println(cell.getStringCellValue());
//				}
//			}
//		}
		
//		Row row= sheet.getRow(0);
//		Cell cell= row.getCell(0);
//		String rowcell00 = cell.getStringCellValue();
//		System.out.println(rowcell00);
//
//		Cell cell1= row.getCell(1);
//		String rowcell11 = cell1.getStringCellValue();
//		System.out.println(rowcell11);





	}




}
