package day41_DependencyMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
	
	@Test(priority=1)
	void openapp()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods={"openapp"})
	void login()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=3, dependsOnMethods={"login"})
	void search()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=4, dependsOnMethods={"login", "search"})
	void advSearch()
	{
		Assert.assertFalse(false);
	}
	
	@Test(priority=5, dependsOnMethods={"login"})
	void logot()
	{
		Assert.assertTrue(true);
	}
}
