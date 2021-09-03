package com.framework.automation.TestData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestExcelDemo {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fip=new FileInputStream("C:\\Users\\Divya\\OneDrive\\Desktop\\Project\\Project\\Mysampleframework\\src\\com\\framework\\automation\\TestData\\TestExcelData.xlsx");
		Workbook workbook =WorkbookFactory.create(fip);
		Sheet sheet = workbook.getSheet("Data");
		int lastrownum=sheet.getLastRowNum();
		
		for(int i=0;i<=lastrownum;i++)
		{ 
			
			Row row=sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				Cell cell = row.getCell(j);
				if(cell.getCellType()==CellType.NUMERIC)
				{
					System.out.println(cell.getNumericCellValue());
				}
				else if (cell.getCellType()==CellType.STRING)
				{
					System.out.println(cell.getStringCellValue());
				}
				else if (cell.getCellType()==CellType.BOOLEAN)
				{
					System.out.println(cell.getBooleanCellValue());
				}

			}
		}
	
//		Row row0=sheet.getRow(0);
//		
//		Cell cell0 = row0.getCell(0);
//		
//		String cell00value = cell0.getStringCellValue();	
//		System.out.println(cell00value);
//		
//		Cell cell1 = row0.getCell(1);
//		String cell01value = cell1.getStringCellValue();	
//		System.out.println(cell01value);

		
		
		
	}

}
