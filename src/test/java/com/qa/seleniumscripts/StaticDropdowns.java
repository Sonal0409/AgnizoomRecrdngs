package com.qa.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (21)\\chromedriver.exe");	

				// start the chrome browser
	WebDriver driver= new ChromeDriver();
	driver.get("https://ironspider.ca/forms/dropdowns.htm");
	
	driver.manage().window().maximize();
	
	// To handle dropdowns on a webpage we use a class -- Select class, selectByVisibleText() , selectByIndex()
Thread.sleep(2000);
	
	Select dd= new Select(driver.findElement(By.xpath("//select[@name='coffee']")));
	
	  dd.selectByIndex(1);  // with cream will be sleected
	  
	  Thread.sleep(3000);
	  
	  dd.selectByVisibleText("With cream & sugar");
	  
	  Thread.sleep(3000);
	  
	  dd.selectByValue("crisp");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
	
	}

}
