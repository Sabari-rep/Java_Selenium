package string;

import java.util.Scanner;

public class StringIsPalindromeOrNot {

	public static void main(String[] args) {
		
		String s = "MADAM";
		String rev = "";
		
		System.out.println("Given String: " + s);
		
		for (int i = s.length()-1; i>=0; i--)
		{
		rev = rev+s.charAt(i);
		}
		
		System.out.println("Reversed String: " + rev);
		
		if(s.equals(rev))
		{
			System.out.println(s + " Is a Palindrome");
		}
	
		else
		{
			System.out.println(s + "Not a Palindrome");
		}
		
		
	}

}


/* String str, rev = "";
Scanner sc = new Scanner(System.in);

System.out.println("Enter a string:");
str = sc.nextLine();

int length = str.length();

for ( int i = length - 1; i >= 0; i-- )
   rev = rev + str.charAt(i);

if (str.equals(rev))
   System.out.println(str+" is a palindrome");
else
   System.out.println(str+" is not a palindrome");
   
   */