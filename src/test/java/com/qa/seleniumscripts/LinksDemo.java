package com.qa.seleniumscripts;

import org.openqa.selenium.By;


public class LinksDemo extends Base{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setup();
		
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("selenium Automation");
		
		// Click on Button
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// redirect to the new page
		
		// confirm if your are on the correct page or not
		
	 String title	=driver.getTitle();
	 
	 if(title.contains("Search"))
	 {
		 System.out.println("you are on the correct webpage");
		// Thread.sleep(3000);
		 System.out.println(" And the URL of the page i s: " + driver.getCurrentUrl());
		 driver.findElement(By.linkText("Main page")).click();
	 }
	 else
	 {
		 System.out.println(" you are not on the search page, do you still want to click on Main Page");
		 driver.close();
	 }
		
   String title1	=driver.getTitle();
	 
	 if(title1.equalsIgnoreCase("Wikipedia, the free encyclopedia"))
			 {
		 System.out.println(" Again you are on the correct webpage");
		 //Thread.sleep(3000);
		 System.out.println(" And the URL of the page is: " + driver.getCurrentUrl());
		 
		  driver.findElement(By.linkText("Create account")).click();;
			 }
	 else
	 {
		 System.out.println(" you are not on the search page, do you still want to click on Main Page");
		 driver.close();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
