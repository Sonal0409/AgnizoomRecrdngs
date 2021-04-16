package com.qa.seleniumscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiHomePageTest {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
	//Base.setup();	
		Thread.sleep(3000);
		
		// find the inputbox and enter data in the input box
		
	boolean dis=driver.findElement(By.xpath("//input[@id='searchInput']")).isDisplayed();
		
	if(dis==true)
	{
		boolean en= driver.findElement(By.tagName("input123")).isEnabled();
		
		if(en==true)
		{
		
		driver.findElement(By.id("searchInput")).clear();
		
		driver.findElement(By.id("searchInput")).sendKeys("Selenium Automation");
	
		}
	}
	else
		System.out.println("testcase failed");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
