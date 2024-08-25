package exceptionhandling;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
				//Example1
				
		System.out.println("program start...");
		
		/*
		System.out.println("Enter the value: ");
		int value = sc.nextInt();
		System.out.println(100/value);  //ArithmeticException if we give a input as "0"
		*/
		
		
		//Example2
		
		/*
		int a[] = new int[5];
		System.out.println("Enter the position[0-4]: ");
		int pos = sc.nextInt();
		
		System.out.println("Enter the value: ");
		int value = sc.nextInt();
		
		a[pos] = value;            //ArrayIndexOutOfBoundsException
		System.out.println(a[pos]); 
		*/
		
		//Example3
		
		String s = "welcome";
		int num = Integer.parseInt(s);    //NumberFormatException
		System.out.println(num);
		
		
		System.out.println("program end...");

	}

}
