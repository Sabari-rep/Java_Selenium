package exceptionhandling;

public class ThrowKeyword {
	
	void square(int num)
	{
		if(num < 1)
		{
			throw new ArithmeticException("Number is less than 1");
		}
		
		else
		{
			System.out.println(num*num);
		}
	}
	
	public static void main(String[] args)
	{
		ThrowKeyword tk = new ThrowKeyword();
		
		try 
		{
		tk.square(-1);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("the number is not valid");
			e.getMessage();
			
		}
			System.out.println("program end");
		
		}

}
