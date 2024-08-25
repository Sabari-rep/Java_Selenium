package TestNG_Annotations;

import org.testng.annotations.*;

public class AllAnnotations {
	
	@BeforeSuite
	void bs()
	{
		System.out.println("This is beforesuite");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("This is before test");
	}
	
	@BeforeClass
	void bc()
	{
		System.out.println("This is before class");
	}
	
	@BeforeMethod
	void bm()
	{
		System.out.println("This is before method");
	}
	
	@Test(priority=1)
	void t1()
	{
		System.out.println("This is test1");
	}
	
	@Test(priority=2)
	void t2()
	{
		System.out.println("This is test2");
	}
	
	@AfterMethod
	void am()
	{
		System.out.println("This is after method");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("This is after class");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("This is After test");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("This is aftersuite");
	}
	
}
