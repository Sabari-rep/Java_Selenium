package TestNG_Annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	@Test
	
	void test()
	{
		//Assert.assertEquals("abc", "abc");  //PASSED
		//Assert.assertEquals("abc", "efg");   //FAILED
		
		
		//Assert.assertNotEquals("abc","abc");  //FAILED
		//Assert.assertNotEquals(123, 456);     //PASSED
		
		//Assert.assertTrue(true);   //PASSED
		//Assert.assertTrue(1==1);   //PASSED
		
		//Assert.assertFalse(false);   //PASSED
		//Assert.assertFalse(1==1);   //FAILED
		   
		//Assert.fail();     //Is used fail the test methods intentionally
	}

}
