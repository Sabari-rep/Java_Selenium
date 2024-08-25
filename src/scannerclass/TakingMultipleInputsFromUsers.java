package scannerclass;

import java.util.Scanner;

public class TakingMultipleInputsFromUsers {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first Number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter Second Number: ");
		int num2 = sc.nextInt();
		
		System.out.println("The Sum of two number is: " + (num1+num2));

	}

}
