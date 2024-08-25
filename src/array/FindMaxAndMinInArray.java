package array;

public class FindMaxAndMinInArray {

	public static void main(String[] args) {
		
		
		int a[] = {100,200,30,40,500};
		
		int max = a[0];
		
		for(int i =1; i < a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		
		System.out.println("The max value in the given array is: " + max);
		
		int min = a[0];
		
		for (int i=1; i<a.length; i++)
		{
			if(a[i] < min)
			{
				min = a[i];
			}
		}
		
		System.out.println("The min value in the array is: " + min);
	}

}
