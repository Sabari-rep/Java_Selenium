package day40_TestNG;

import org.testng.annotations.Test;

/*
 1.Open App
 2.Login to App
 3.Logout from App
 
 */

public class TestNG_FirstTestCase 

{
	@Test(priority=1)    //------------> Using TestNG to run the application instead of java
	void openapp()
	{
		System.out.println("Opening the application..");
	}
	
	@Test(priority=2)
	void login()
	{
		System.out.println("Login to application.....");
	}
	
	@Test(priority=3)
	void logout()
	{
		System.out.println("Logout from application....");
	}
	

}
