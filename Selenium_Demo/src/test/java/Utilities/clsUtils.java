package Utilities;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class clsUtils 
{

	public String GetCellValue(String fileName,int rowNum, int cellNum) throws IOException
	{

		//Path of the excel file
		//FileInputStream fs = new FileInputStream("C:\\Anand_Details\\Anvesh.xlsx");
		FileInputStream fs = new FileInputStream(fileName);
		//Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(1);
		/*
		XSSFRow row = sheet.getRow(0);
		Cell cell0 = row.getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		XSSFRow row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(1);
		System.out.println(sheet.getRow(0).getCell(1));
		XSSFRow row2 = sheet.getRow(1);
		Cell cell2 = row2.getCell(1);
		System.out.println(sheet.getRow(1).getCell(0));
		XSSFRow row3 = sheet.getRow(1);
		Cell cell3 = row3.getCell(1);
		System.out.println(sheet.getRow(1).getCell(1));
		*/
		return sheet.getRow(rowNum).getCell(cellNum).toString();
		
	}
}
