package array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		//Approach 1
		/*int a[][] = new int [3][2];
		
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400;
		
		a[2][0] = 500;
		a[2][1] = 600;
		*/
		
		//Approach 2
		int a[][]= { {100,200},{300,400},{500,600} };
		
		
		//3)Find size of an array
		
		System.out.println(a.length);   //Returns Number Of Rows
		System.out.println(a[2].length); //Returns Number Of Columns in Specific Rows
		
		//4)Read Single value from an array
		System.out.println(a[1][1]);
		
		
		//5)Read multiple values from an array
		
		for (int i=0; i<=2; i++)
		{
			for (int j=0; j<=1; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		//Enhanced For Loop For Each loop
		
		for(int arr[]:a)    //To Hold Multiple Values in single variable so we use 1D array to store value
		{
			for(int x:arr)
			{
				System.out.println(x);
			}
		}
	}

}
