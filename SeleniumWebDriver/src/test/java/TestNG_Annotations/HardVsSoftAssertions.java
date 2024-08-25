package TestNG_Annotations;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	
	//@Test
	void test_Hardassertions()
	{
		System.out.println("testing");
	    System.out.println("testing");
	    
	    Assert.assertEquals(1,2);
	    
	    System.out.println("testing");
	    System.out.println("testing");
	    
	}
	
	@Test
	void test_Softassertions()
	{
		System.out.println("testing");
	    System.out.println("testing");
	    
	    SoftAssert sa = new SoftAssert();
	    sa.assertEquals(1,2);
	    
	    System.out.println("testing");
	    System.out.println("testing");
	     
	    sa.assertAll(); //*******Mandatory to keep at the end of the method while using the SoftAssertion**********
	}
	

}
