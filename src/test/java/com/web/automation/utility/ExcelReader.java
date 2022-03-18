package com.web.automation.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.SimpleFormatter;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader<T> {

	
	public String getexceldata(String SheetName,String ColumnName,String TestcaseID) throws IOException
	{
		String strval = null;
		double intval;
		
		FileInputStream file=new FileInputStream("Configfiles/Automation.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet(SheetName);
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell=null;
		int a=row.getPhysicalNumberOfCells();
		try {
			int columnno = -1;
			for(int i=0;i<row.getLastCellNum();i++) {
				if(row.getCell(i).getStringCellValue().equals(ColumnName))
				{ 
					columnno=i;
				}
			 }
			int rowno=-1;
			for(int j=0;j<a;j++) {
				if(row.getCell(0).getStringCellValue().equals(TestcaseID));
				{
					rowno=j;
					int ijj=1/0;
				}
			}
			row=sheet.getRow(rowno);
			cell=row.getCell(columnno);		
			
		}
		catch(Exception e){
			e.printStackTrace();
		}	
		
		
		return cell.getStringCellValue();
	
	}
	
	
	
	
	
	
	
	
}
