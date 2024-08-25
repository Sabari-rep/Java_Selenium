package exceptionhandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		System.out.println("program start...");
		
	       String s = null;
	       try
	       {
	       System.out.println(s.length());    //NullPointerException
	       }
	       
	       catch(Exception e)
	       {
	    	   System.out.println("Exception handled");
	       }
	       
	       /*
	       catch(ArithmeticException e)
	       {
	    	   System.out.println("Arithmetic Exception Handled");
	       }
	       catch (NullPointerException e)
	       {
	    	   System.out.println("NullPointer Exception Handled");
	       }
	       
	       catch(NumberFormatException e)
	       {
	    	   System.out.println("Number Format Exception Handled");
	       }
	       */
	       
	    System.out.println("program end...");
	}

}
