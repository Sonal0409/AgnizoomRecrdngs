package com.qa.testNGScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivernTestingDemo {

		
		public static WebDriver driver;
		
		@BeforeClass
public static void setup()
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (22)\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();  // maximize the browser window
driver.manage().deleteAllCookies();  // delete cookies on the browser
driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium		+%28software%29");
}	
		@Test(dataProvider="testdata")
		public  void wikipagedata(String name, String password, String retype, String email)
		{
			driver.findElement(By.id("wpName2")).clear();	
			driver.findElement(By.id("wpName2")).sendKeys(name);	
			driver.findElement(By.id("wpPassword2")).clear();
			driver.findElement(By.id("wpPassword2")).sendKeys(password);
			driver.findElement(By.id("wpRetype")).clear();
			driver.findElement(By.id("wpRetype")).sendKeys(retype);
			driver.findElement(By.id("wpEmail")).clear();
			driver.findElement(By.id("wpEmail")).sendKeys(email);
		}


@DataProvider(name="testdata")
public Object[][] readExcel() throws Exception // method used by jxl to ftech data
{
	// JXL  & java
	//1. get the location & name of you excelsheet/workbook
	
  File f= new File("C:\\Users\\vishal mittal\\Desktop\\input.xls");
  
  // fetch the workbook from the above location
  
   Workbook w= Workbook.getWorkbook(f);
   
  // In the workbook get the sheet which has testdata
   
      Sheet s= w.getSheet("Sheet1");
      
      // get how many rows that have data in sheet1
      
     int rows= s.getRows();  // integer values
     
  // get how many columns that have data in sheet1
     
     int col= s.getColumns();
       
    String inputData[][]= new String [rows][col];
    
    // loop to goto each row in the excel
    for(int i=0;i<rows;i++)
    {
    	// loop to goto each column of each row
    	for(int j=0;j<col;j++)
    	{
    		
    		Cell c= s.getCell(j,i);
    		
    		inputData[i][j] = c.getContents();
    	}
    }
     
    return inputData;
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
   
	

}




}







