package TestNG_Annotations.subpack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	
	@Test
	void pqr()
	{
		System.out.println("This pqr from C3");
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("This is Beforesuite method");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("This is Aftersuite method");
	}


}
