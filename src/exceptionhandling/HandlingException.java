package exceptionhandling;

//Unchecked Exception
//The exceptions which are not identified by the java compiler is called Un-Checked Exception

import java.util.Scanner;

public class HandlingException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Example1
		
	System.out.println("program start...");
		
       System.out.println("Enter the value: ");
       int value = sc.nextInt();
       
       try
       {
       System.out.println(100/value);  //ArithmeticException if we give a input as "0"
       }
       
       catch(ArithmeticException e)
       {
    	   System.out.println("Invalid data provided");
    	   System.out.println(e.getMessage());        //If you want to know more details about exception use this  
    	                                              //respective available methods in java.
       }
       
    System.out.println("program end...");


	}

}
