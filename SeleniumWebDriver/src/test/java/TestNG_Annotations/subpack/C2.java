package TestNG_Annotations.subpack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {
	
	@Test
	void xyz()
	{
		System.out.println("This xyz from C2");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("This is After test method");
	}

}
