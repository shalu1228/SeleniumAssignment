package com.myntra.genericLibrary;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility {

	public void selectByValue(WebElement webElement,String value)
	{
		Select sel=new Select(webElement);
		sel.selectByValue(value);
	}
	public void selectByIndex(WebElement webElement,int index)
	{
		Select sel=new Select(webElement);
		sel.selectByIndex(index);
	}
	public void selectByVisibleText(WebElement webElement,String text)
	{
		Select sel=new Select(webElement);
		sel.selectByVisibleText(text);
	}



	public String switchToNewWindow(WebDriver driver)
	{
		 Set<String> ids = driver.getWindowHandles();
		 Iterator<String> it = ids.iterator();
		 
		 String pid = it.next();
		 String cid = it.next();
		 
		 driver.switchTo().window(cid);
		 return pid;
	}
	
	public void moveToElement(WebDriver driver, WebElement webElemnt)
	{
		Actions act = new Actions(driver);
		act.moveToElement(webElemnt).perform();
		
		
	}
	
	public void moveToElementDouble(WebDriver driver, WebElement webElemnt)
	{
		Actions act = new Actions(driver);
		act.moveToElement(webElemnt).doubleClick().perform();
		
		
	}
	
	
	public Object[][] getAllData(String filePath,String sheetName)
	{
		Object[][] data = null;
		try 
		{
			FileInputStream ip = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(ip);
			
			Sheet sh = wb.getSheet(sheetName);
			int rowNum = sh.getLastRowNum();
			int cellNum = sh.getRow(0).getLastCellNum();
			
			data = new Object[rowNum][cellNum];
			
			for(int i=0;i<rowNum;i++)
			{
				for(int j=0;j<cellNum;j++)
				{
					data[i][j] = sh.getRow(i+1).getCell(j).toString();
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return data;
	}
}
