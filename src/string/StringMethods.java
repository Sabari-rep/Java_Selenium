package string;

public class StringMethods {

	public static void main(String[] args) {
		
		//length() ----> Return length of the string

		String s = new String("Sabari");
		
		int length = s.length();
		
		System.out.println(length);

		
		//concat() ----> To joint the strings

		String s1 = "Sabari";
		String s2 = "karthik";
		String s3 = "Learning Java";
		
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2) .concat(s3));
	
		
		//trim()  -----> Remove spaces right and left sides
		
		 s = "   Sabari   ";
		System.out.println("Before trimming: " + s.length());
		
	     s1 = s.trim();
		
		System.out.println("After Trimming: " + s1.length());
		
		
		//charAt() ----> Returns a character based on index -----> index starts from zero
		
		s = "sabari";
		
		System.out.println(s.charAt(2));
		
		//contains ---->Returns true/false ----> Check a string is part of the main string
		
		s = "Sabari";
		System.out.println(s.contains("s"));
		
		//equals()   ----> Compare two strings ---> Considering the case sensitive
		//equalsIgnoreCase() ----> Compare two strings ---> Not considering the case sensitive
		
		s1 = "welcome";
		s2 = "Welcome";
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//replace() ---> It's replace the single character/sequence of character in a string
		
		s = "Welcome to java selenium automation";
		
		System.out.println("Before replacing: " + s);
		
		s1 = s.replace('e', 'a');
		
		System.out.println("After replacing: " + s1);
		
		System.out.println(s.replace("java", "python"));
		
//substring()----> Extract sub string from the main string ----> Begin index will start from "0" and End index will start from "1"
		
		 s = "sabari";
		 System.out.println(s.substring(1, 6));
		 
		 //toUpperCase() & toLowerCase() ----> It's used the convert the case	
		 
		 s = "sabari";
		 
		 System.out.println(s.toUpperCase());
		 System.out.println(s.toLowerCase());
		 
		 
		 //split() -----> Split/Divide the string in to multiple parts based on the deleimeters
		 
		 s="sabari@karthik";
		 
		 String a[] = s.split("@");
		 System.out.println(a[0]);
		 System.out.println(a[1]);
		 
		 
		 String amount = "$12,00,00";
		 
		 System.out.println(amount.replace("$", "").replace(",", ""));
		 
		 s = "Sabari,karthik@05";
		 
		 /*String a1[] = s.split(",");
		 System.out.println(a1[0]);
		 System.out.println(a1[1]);
		 
		 
		 String a2[] = a1[1].split("@");
		 System.out.println(a2[0]);
		 System.out.println(a2[1]);
		 
		*/
		 
		 System.out.println(s.split(",")[0]);
		 System.out.println(s.split(",")[1].split("@")[0]);
		 System.out.println(s.split(",")[1].split("@")[1]);
		 
		 //Problem
		 
		 s = "Sabarikarthik";
		 System.out.println(s.toLowerCase().contains("sabari"));
		 
	} 

}
