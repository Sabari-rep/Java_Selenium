package scannerclass;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Given value of a is: " + a);
		*/
		
		//String
		
		System.out.println("Enter a Name: ");
		String name = sc.next();
		System.out.println("The entered name is: " + name);
		
	}

} 