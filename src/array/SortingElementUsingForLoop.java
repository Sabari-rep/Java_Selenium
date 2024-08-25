package array;

import java.util.Arrays;

public class SortingElementUsingForLoop {

	public static void main(String[] args) {
		
		int a[] = {50,20,40,10,100};
		
		System.out.println("Before Sorting: " + Arrays.toString(a));
		
		int n = a.length;
		
		
		for(int i=0; i<n-1; i++)      //Number of Passes
		{
		
			for(int j=0; j<n-1; j++)   //Iterations in each pass
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
			}
				
		}
		
		System.out.println("After Sorting: " + Arrays.toString(a));

	}

}
