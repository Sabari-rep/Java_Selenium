package TestNG_Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 *Login  ---->@BeforeMethod
 *Search  ---->@Test
 *logout  ---->@AfterMethod
 *login  
 *Adv Search  ---->@Test
 *logout
 */

public class AnnotationsDemo1 {
	
	@BeforeMethod
	void login()
	{
		System.out.println("Logged in to the application");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("The search...");
	}
	
	@Test(priority=2)
	void advsearch()
	{
		System.out.println("Advanced Search");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("Logout from application");
	}
	
	
	
	

}
