package controalstatements;

public class LargestOfGivenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100, b=200, c=10000;
		
		if(a>b && a>c) {
			System.out.println("The a is largest number: " + a);
			
		}
		
		else if (b>a && b>c) {
			System.out.println("The b is largest number: " + b);

		}
		
		else {
			
			System.out.println("The c is largest number: " + c);
		}
		
	}
			

}
