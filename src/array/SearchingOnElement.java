package array;

import java.util.Scanner;

public class SearchingOnElement {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50,60};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Search Element: ");
		int search_number = sc.nextInt();
		
		boolean status = false;
		
		for(int i=0; i<=a.length-1; i++)
		{
			if(search_number==a[i])
			{
				System.out.println("The Number is found");
			    status = true;
				break;
			}
		}
		
		if(status == false) 
		{
			System.out.println("The Number is not found");
		}
		
		

	}

}
