package com.myntra.genericLibrary;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getPropertyKeyValue(String key) {
		FileInputStream ip = null;
		Properties prop = null;
		try {
			ip = new FileInputStream("./commonData.properties");
			prop = new Properties();
			prop.load(ip);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return prop.getProperty(key);
	}

	public String getExcelData(String sheetName, int rowNum, int cellNum) {
		FileInputStream ip = null;
		Workbook wb = null;
		try {
			ip = new FileInputStream("./src/main/java/com/vTigerMaven/testData/testData.xlsx");
			wb = WorkbookFactory.create(ip);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Sheet sh = wb.getSheet(sheetName);
		Cell c = sh.getRow(rowNum).getCell(cellNum);
		CellType cType = c.getCellType();

		if (cType.toString().equals("NUMERIC")) {
			int data = (int) c.getNumericCellValue();
			return String.valueOf(data);
		} else {
			String data = c.getStringCellValue();
			return data;
		}

	}

}
