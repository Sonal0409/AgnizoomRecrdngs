package com.qa.seleniumscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertBoxDemo extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setup("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// Step 1: switch from main window to alert box
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	Alert a=	driver.switchTo().alert();
	
		a.accept();
		
	System.out.println(	a.getText());
		
	}

}
