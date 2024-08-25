package array;

public class NumberOfEvenAndOddNumbersInArray {

	public static void main(String[] args) {
		
		int a[] = {2,4,6,7,9,5,12};
		
		int even = 0;
		int odd = 0;
		
		for(int i = 0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				even++;
			}
			
			else
			{
				odd++;
			}
		}
		
		System.out.println("The Number of Even number is: " + even);
		System.out.println("The Number of odd number is: " + odd);
			
		
		}
		

}
