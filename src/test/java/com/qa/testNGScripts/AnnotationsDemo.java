package com.qa.testNGScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	
	public static WebDriver driver;
    
	@BeforeMethod
    
   // @BeforeClass
	// to check if you are able to open the webpage
	public void SetupTest()
	// this method will be executed as the first methos in the class
	{
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (21)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);// TimeoutException
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 

	}
	
    @Test(priority='1')
	// to check if we are able to login into the application or not
	public void wikiHomePageTest()
	{
    	driver.get("https://www.wikipedia.org/");
    	String title=driver.getTitle();
    	System.out.println(title);
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("selenium automation");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
    
    @Test(priority='2')
	// test create email feature
	public void SearchPageTest()
	{
    	driver.get("https://en.wikipedia.org/wiki/Special:Search?search=selenium+automation&go=Go&ns0=1");
    	String title= driver.getTitle();
    	System.out.println("title of the second page is: "+ title);
	
    	WebDriverWait w= new WebDriverWait(driver,5);
    	w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Main page"))));
    	
    	driver.findElement(By.linkText("Main page")).click();
		
	}
    
    @AfterMethod
	//@AfterClass
	// this method will be executed at the end of all the test method execution
	public void closebrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	

}
