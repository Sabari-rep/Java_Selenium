package inheritance;

class Bank 
{
	
	double roi() 
	{
		return 0;
	}
}

class HDFC extends Bank 
{
	double roi()
	{
		return 10.5;
	}
}

class SBI extends Bank
{
	double roi()
	{
		return 11.5;
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		HDFC b = new HDFC();
		
		System.out.println(b.roi());

	}

}
