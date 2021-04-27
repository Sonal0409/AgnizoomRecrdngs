package com.qa.seleniumscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicDropDown extends Base{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		setup("https://www.google.com/");
		
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java docu");


	WebDriverWait wait= new WebDriverWait(driver,10);
	
	List<WebElement> li= wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='LaCQgf']"))));

	//ul[@role='listbox']//li/descendant::div[@class='LaCQgf']
	
	
	System.out.println(" the size of the list is : " + li.size());
	
	for(int i=0; i<li.size();i++)
	{
		System.out.println(li.get(i).getText());
		
		if(li.get(i).getText().contains("java documentation 8"))
		{
			li.get(i).click();
			break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
