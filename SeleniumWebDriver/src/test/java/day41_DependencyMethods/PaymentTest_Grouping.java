package day41_DependencyMethods;

import org.testng.annotations.Test;

public class PaymentTest_Grouping {
	
	@Test(priority=1, groups= {"Sanity","Regression", "Functional"})
	void paymentinRupees()
	{
		System.out.println("Payment in rupees");
	}
	
	@Test(priority=2, groups= {"Sanity","Regression", "Functional"})
	void paymentinDollors()
	{
		System.out.println("Payment in dollors");
	}

}
