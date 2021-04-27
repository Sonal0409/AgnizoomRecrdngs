package com.qa.seleniumscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;

	public static void setup(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (21)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);// TimeoutException
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Element nor found exceltion
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Thread.sleep(3000);
	}

}
