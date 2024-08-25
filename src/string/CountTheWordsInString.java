package string;

import java.util.Scanner;

public class CountTheWordsInString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		
		String word = s.nextLine();
		
		int count =1;
		
		for(int i=0; i<word.length()-1; i++)
		{
			if((word.charAt(i)==' ') && (word.charAt(i+1)!=' '))
			{
				count++;
			}
			
			
		}
		
		System.out.println("The word count of the given string is: " + count);
	

	}

}
