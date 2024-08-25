package TestNG_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 *Login  ---->@BeforeClass
 *Search  ---->@Test
 *Adv Search  ---->@Test
 *logout  ---->@AfterClass
 */

public class AnnotationsDemo2 {
	
	@BeforeClass
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
	
	@AfterClass
	void logout()
	{
		System.out.println("Logout from application");
	}
	
	
	
	

}
