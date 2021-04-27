package com.qa.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTimeDemo extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setup("https://www.wikipedia.org/");
		
	// explicit wait for an element
		
		// wait time and condition
		
		// wait for 10 seconds for element to be available,
		// also check for a condition--element is visible or not
		
		// thread.sleep(10000);
		
	
		
		driver.findElement(By.id("searchInput32425")).sendKeys("selenium automation");
		
	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
