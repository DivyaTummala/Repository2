package com.framework.automation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	private String filepath;
	private FileInputStream fip;
	private Workbook workbook;
	private Sheet sheet;
	private  Cell cell;
	private Row row;
	private String cellvalue ;


	public ExcelReader(String filepath) throws EncryptedDocumentException, IOException {
		this.filepath=filepath;
		fip=new FileInputStream(filepath);
		workbook =WorkbookFactory.create(fip);

	}

	public Sheet getsheetobj(String how,String value)
	{

		if(workbook!=null)
		{
			if(how.equalsIgnoreCase("sheetname"))
			{
				sheet=workbook.getSheet(value);
			}
			else if(how.equalsIgnoreCase("index"))
			{
				int intvalue=Integer.parseInt(value);
				sheet=workbook.getSheetAt(intvalue);

			}
		}
		else
		{
			//throw exception
		}
		return sheet;

	}

	
	public String getCelldata(String how,String value,int rownum,int cellNum)
	{
		sheet=getsheetobj(how, value);
		if(sheet!=null)
		{
			row=sheet.getRow(rownum);
			if(row!=null)
			{
				cell=row.getCell(cellNum);
				if(cell.getCellType()==CellType.NUMERIC)
				{
					cellvalue=cell.getNumericCellValue()+"";
				}
				else if(cell.getCellType()==CellType.STRING)
				{
					cellvalue=cell.getStringCellValue()+"";

				}
				else if(cell.getCellType()==CellType.BOOLEAN)
				{
					cellvalue=cell.getBooleanCellValue()+"";

				}
			}
			else
			{
				//throw excep
			}
		}
		return cellvalue;

	}
	
	
	
	
	
	
	


	public  List<String> getRowData(String how,String value,int rownum,int cellNum)
	{
		List<String> rowData=new ArrayList<String>();
		sheet=getsheetobj(how, value);
		Row row = sheet.getRow(rownum);
		for(int i=0;i<=row.getLastCellNum();i++)
		{
			cell=row.getCell(i);
			if(cell.getCellType()==CellType.STRING)
			{
				cellvalue=cell.getStringCellValue()+"";
				rowData.add(cellvalue);
			}
			else if(cell.getCellType()==CellType.BOOLEAN)
			{
				cellvalue=cell.getBooleanCellValue()+"";
				rowData.add(cellvalue);

			}
			else if(cell.getCellType()==CellType.NUMERIC)
			{
				cellvalue=cell.getBooleanCellValue()+"";
				rowData.add(cellvalue);

			}
		}
		return rowData;

	}



	public  List<String> getsheetData(String how,String value)
	{
		List<String> sheetData=new ArrayList<String>();
		sheet=getsheetobj(how, value);
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			Row row=sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				cell =row.getCell(j);
				if(cell.getCellType()==CellType.STRING)
				{
					cellvalue=cell.getStringCellValue()+"";
					sheetData.add(cellvalue);
				}
				else if(cell.getCellType()==CellType.BOOLEAN)
				{
					cellvalue=cell.getBooleanCellValue()+"";
					sheetData.add(cellvalue);

				}
				else if(cell.getCellType()==CellType.NUMERIC)
				{
					cellvalue=cell.getBooleanCellValue()+"";
					sheetData.add(cellvalue);

				}
			}
		}
		return sheetData;
	}


	//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//		ExcelReader excelreader=new ExcelReader("C:\\Users\\Divya\\OneDrive\\Desktop\\Project\\Project\\Mysampleframework\\src\\com\\framework\\automation\\TestData\\TestExcelData.xlsx");
	//		excelreader.getsheetobj("sheetname", "data");
	//	}

}
