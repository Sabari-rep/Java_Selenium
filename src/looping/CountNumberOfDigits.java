package looping;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =12345, count=0;
		
		while(n>0) {
			n=n/10;
			++count;
		}
		
		System.out.println("The number of digits in given number is: " + count);
	
		
         /*int count =0;
		
		for(int n =234050;n>0;++count) {
			
			n=n/10;
		}
		System.out.println("the number of digits in given number is: " + count);

	*/

	}

}
