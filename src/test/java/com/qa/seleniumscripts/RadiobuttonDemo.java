package com.qa.seleniumscripts;

import org.openqa.selenium.By;

public class RadiobuttonDemo extends Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		setup("https://ironspider.ca/forms/checkradio.htm");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='Content']/div[1]/blockquote[2]/form/input[2]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='Content']/div[1]/blockquote[2]/form/input[3]")).click();

	}

}
