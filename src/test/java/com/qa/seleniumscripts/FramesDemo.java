package com.qa.seleniumscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FramesDemo extends Base {


     @Test
     public void frameTest()  // testcase1
     {
		
		setup("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		// name of the frame: packageListFrame, packageFrame, classFrame
		

		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
		
     }	
     @Test
     public void testcase2()
     {
    	 System.out.println("my 2nd test case");
     }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
