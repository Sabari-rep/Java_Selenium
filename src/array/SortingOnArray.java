package array;

import java.util.Arrays;

public class SortingOnArray {

	public static void main(String[] args) {
		
		int a[] = {1000,200,100,700,500};
		
		System.out.println("Before Sorting: " + Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After Sorting: " + Arrays.toString(a));
	}

}
