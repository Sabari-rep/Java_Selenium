package array;

public class FindSumOfElemnetsInArray {

	public static void main(String[] args) {
		
		int a[] = {2,3,5,6,7,9},  sum=0;
		
		/*for(int i =0; i<=a.length-1; i++)
		{
			sum=sum+a[i];
		}
		*/
		
		//Enhanced For Loop
		
		for (int value :a)
		{
			sum = sum+value;
		}
		
		System.out.println("Sum of array elemnts is: " + sum);
		
	}

}
