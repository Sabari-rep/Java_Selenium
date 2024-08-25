package TestNG_Annotations.subpack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	
	@Test
	void abc()
	{
		System.out.println("This abc from C1");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("This is Before test method");
	}

}
