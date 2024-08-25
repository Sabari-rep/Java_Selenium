package looping;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =123, even_count=0, odd_count=0;
		
		while(num>0) {
			
			int reminder = num%10;
			
			if(reminder%2==0) {
				
				even_count++;
			}
			
			else {
				
				odd_count++;
			}
			
			num=num/10;
			
			
		}
		System.out.println("The number of even number is: " + even_count);
		System.out.println("The number of even number is: " + odd_count);
		

	}

}
