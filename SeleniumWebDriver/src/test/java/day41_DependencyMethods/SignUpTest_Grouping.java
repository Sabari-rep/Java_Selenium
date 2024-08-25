package day41_DependencyMethods;

import org.testng.annotations.Test;

public class SignUpTest_Grouping {
	
	@Test(priority=1, groups= {"Regression"})
	void signupbyEmail()
	{
		System.out.println("This is signed up by email..");
	}
	
	@Test(priority=2, groups= {"Regression"})
	void signupbyLinkedIn()
	{
		System.out.println("This is signed up by linkedin..");
	}
	
	@Test(priority=3, groups= {"Regression"})
	void signupbynakuri()
	{
		System.out.println("This is signed up by nakuri..");
	}

	
}
