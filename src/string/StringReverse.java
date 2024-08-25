package string;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		
		//Method 1
		
		String s ="Sabari";
		
		System.out.println("Original String: " + s );
		
		String rev = "";
		
		for(int i =s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println("Reverse String: " + rev);
		
	
		
		//Method 2 ---> By converting to character type array
		
		/*String s = "Sabari";
		System.out.println("Original String: " + s);
		
		String rev = "";
		
		char a[] = s.toCharArray();   // This will convert string to character type array
		System.out.println(Arrays.toString(a));
		
		for(int i = a.length-1; i>=0; i--)
		{
			rev = rev + a[i];
			
		}
		
		System.out.println("Reverse String: " + rev);
		*/
		
		//Method 3 ----> Using StringBuffer
		
		/*StringBuffer s = new StringBuffer("Welcome");
		System.out.println(s.reverse());
		*/
		
	    //Method 4 -----> Using StringBuilder
		
		/*StringBuilder s = new StringBuilder("welcome");
		System.out.println(s.reverse());
		*/
	}

}
