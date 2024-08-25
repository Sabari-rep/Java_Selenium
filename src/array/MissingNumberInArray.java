package array;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,40,50};
		
		int sum1 = 0;
		
		for(int i=0; i<=a.length-1; i++)
		{
			sum1 = sum1+a[i];
		}
		
		System.out.println("The Sum of value is: " + sum1);
		
		int sum2 = 0;
		
		for(int i=10; i<=50; i+=10)
		{
			sum2 = sum2+i;
		}
		
		System.out.println("The sum of second value is: " + sum2);
		
		System.out.println("Missing Number in Array is: " + (sum2 - sum1));
			
			

	}

}
