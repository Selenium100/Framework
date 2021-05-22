package com.hubspot.ExcelUtiliy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {
	
	public String path;
	public FileInputStream fis = null;
	public FileOutputStream fileOut = null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row = null;
	private XSSFCell cell = null;

	public Xls_Reader(String path,String env) {

		this.path = path;
		try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(env);
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// returns the row count in a sheet

	public int getRowCount(String sheetName) {
		int index = workbook.getSheetIndex(sheetName);
		if (index == -1)
			return 0;
		else {
			sheet = workbook.getSheetAt(index);
			int number = sheet.getLastRowNum() + 1;
			return number;
		}

	}
	
	public int getColumnCount() {
		
		return sheet.getRow(0).getPhysicalNumberOfCells();
		
	}
	
	public String getData(int rowCount,int colCount) {
		
		return sheet.getRow(rowCount).getCell(colCount).getStringCellValue();
		
	}

	
	public  Object[][] getTableArray( String sheetName) throws Exception {
		String[][] tabArray = null;
		try {

			

			int startRow = 1;
			int startCol = 0;
			int ci, cj;
			int totalRows = getRowCount(sheetName);

			// Getting the column count
			int totalCols = getColumnCount();

			tabArray = new String[totalRows][totalCols];
			ci = 0;

			for (int i = startRow; i <= totalRows; i++, ci++) {
				cj = 0;
				try {
					for (int j = startCol; j < totalCols; j++, cj++) {
						tabArray[ci][cj] = getData(i, j);
						if (tabArray[ci][cj] == null) {
							throw new NullPointerException();
						}
					}
				} catch (NullPointerException e) {
					
					e.printStackTrace();
				}
			}
		} catch (NullPointerException e) {
			
			e.printStackTrace();
		}
		return (tabArray);
	}
}


