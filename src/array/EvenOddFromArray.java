package array;

public class EvenOddFromArray {

	public static void main(String[] args) {
		
		
		int a[] = {1,2,3,4,5,6};
		
		System.out.println("Print Even Numbers in array");
		
		/*for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		*/
		
		//Enhanced For loop
		
		for(int value:a)
		{
			if(value%2==0)
				System.out.println(value);
		}
			
		
System.out.println("Print Odd Numbers in array");
		
		/*for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}
		*/

//Enhanced For loop

		for(int value:a)
		{
			if(value%2!=0)
				System.out.println(value);
		}
		
	}

}
