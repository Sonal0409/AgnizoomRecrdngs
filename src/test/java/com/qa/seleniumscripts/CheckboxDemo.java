package com.qa.seleniumscripts;

import org.openqa.selenium.By;

public class CheckboxDemo extends Base{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		setup("https://ironspider.ca/forms/checkradio.htm");
		
		Thread.sleep(3000);
		
		// Checkbox
		
		boolean sel= driver.findElement(By.xpath("//input[@value='red']")).isSelected(); 
		
		if(sel==false)
		{
		driver.findElement(By.xpath("//input[@value='red']")).click();
		}
		else
			System.out.println("checkbox is selected");
		
		driver.findElement(By.xpath("//input[@value='blue']")).click();
		driver.findElement(By.xpath("//input[@value='orange']")).click();
		
		Thread.sleep(5000);
		
		

	}

}
