package looping;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12345, reverse = 0;
		
		while(num!=0) {
			int remainder = num % 10;
			reverse = reverse *10 + remainder;
			num = num/10;
		}
		
		System.out.println("The reverse number for given number is: " + reverse);
		
	
        /*int num= 10987 , reverse=0;

		while(num!=0) {
			
			int remainder = num % 10;
			reverse = reverse*10+remainder;
			num = num / 10;
		}

		System.out.println("The reverse number for given number is: " + reverse);
		*/


	
	}


}

