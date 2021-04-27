package com.qa.testNGScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationDemo {
	
	
	// we have a common pre-req for every test method
	@BeforeMethod
	public void login()
	{
		System.out.println("Log into gmail account");
		
	}
	
@Test(priority='1')
	public void Createemail()
	{
		
			System.out.println("create email into gmail ");
			
			
	}
@Test(priority='2')
	public void searchemail()
	{
		System.out.println("search an email into gmail ");
	}
	
@Test(dependsOnMethods={"Createemail","searchemail"})
	public void Modifyemail()
	{
		
			System.out.println("modify email into gmail ");
		
		
	}
@Test(priority='3')
	public void Deleteemail()
	{
		
			System.out.println("delete email into gmail ");
			
		
	}


// post-req after every method

@AfterMethod
public void logout()
{
	System.out.println("log out of gmail ");
}






	
}
