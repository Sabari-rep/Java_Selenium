package array;

import java.util.Arrays;

/*
 1)Declare an array
 2)Add values into array
 3)Find size of an array
 4)Read Single value from an array
 5)Read multiple values from an array
 */

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		/*
		 Approach1
		 int a[] = new int [3];
		 
		 a[0] = 10;
		 a[1] = 20;
		 a[2] = 30;
		 */
		 
		 /* Approach2
		 int a[] = {10,20,30};
		 */
		int a [] = {10,20,30,40,50};
		
		//3) Find size of an array
		System.out.println(a.length);       //a.length returns length of an array
		
		//4) Read Single value from an array
		System.out.println(a[4]);
		
		
		//5)Read multiple values from an array
		//System.out.println(Arrays.toString(a));  //toString method returns values in the array
		
		for (int i =0; i<=4; i++)
		{
			System.out.println(a[i]);
		}
		
		//Enhanced for loop or for each loop
		
		for(int x:a)
		{
			System.out.println(x);
		}
		

	}

}
