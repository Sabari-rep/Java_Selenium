package array;

import java.util.Scanner;

public class HowManyTimesNumberRepeatedInArray {

	public static void main(String[] args) {
	
		
		int a[] = {10,10,20,10,30,40};
		
		//int num = 10;
		
		int count = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("The search number is: ");
		int num = sc.nextInt();
		
		
		for(int i = 0; i<a.length; i++)
		{
			if(num == a[i])
			{
				count++;
			}
		}
		
		System.out.println("The number is repeated "  + count +  " times. ");
		
	}
}
