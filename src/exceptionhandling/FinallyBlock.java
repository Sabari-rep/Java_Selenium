package exceptionhandling;

//finally block will execute every time, even the exception occurs or not occurred 


public class FinallyBlock {

	public static void main(String[] args) {
		
		String s = null;
		
		try
		{
		System.out.println(s.length());
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Handled");
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("Entered into finally block");
		}

	}

}
