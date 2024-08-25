package day41_DependencyMethods;

import org.testng.annotations.Test;

public class LoginTest_Grouping {
	
	@Test(priority=1, groups= {"Sanity"})
	void loginbyEmail()
	{
		System.out.println("This is login by email..");
	}
	
	@Test(priority=2, groups= {"Sanity"})
	void loginbyLinkedIn()
	{
		System.out.println("This is login by linkedin..");
	}
	
	@Test(priority=3, groups= {"Sanity"})
	void loginbynakuri()
	{
		System.out.println("This is login by nakuri..");
	}

}
