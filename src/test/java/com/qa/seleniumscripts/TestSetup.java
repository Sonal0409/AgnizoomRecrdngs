package com.qa.seleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSetup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	// Write a selenium script to check if chrome browser will open or not	
		
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (21)\\chromedriver.exe");	

	// start the chrome browser
	WebDriver driver= new ChromeDriver();
	
	Thread.sleep(2000); // wait for 2 sec
	
	// Maximize the browser window
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	// open a webpage
	
	driver.get("https://www.wikipedia.org/");
	
	// to test if title of the page is correct or not
	
	Thread.sleep(2000);
	
	  String title=  driver.getTitle();  // return the title of your current page
	
	System.out.println("The title of the page is " + title);
	
	// if (actualresult.container(expectedresult))
	
	if(title.contains("Wikipedia"))
	{
		System.out.println("title is correct, test cases passed");
	}
	else
		System.out.println("title is not as expected, Test case failed");
	

	// navigate to a new webpage
	
	driver.navigate().to("https://www.selenium.dev/downloads/");
	
	Thread.sleep(2000);
	
	driver.navigate().back();
	
	String url= driver.getCurrentUrl();
	System.out.println("the current URL after navigating back is :" + url);
	
	Thread.sleep(2000);
	
	driver.navigate().forward();
	
	String url1= driver.getCurrentUrl();
	
	Thread.sleep(2000);
	
	System.out.println("the current URL after navigating fowrwad to :" + url1);
	
	driver.navigate().refresh();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
