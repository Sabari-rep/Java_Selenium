package looping;

public class PalindromeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 121, reminder, sum=0, temp;
		
		temp=n;
		
		while(n>1) {
			
			reminder = n%10;
			sum = sum*10+reminder;
			n=n/10;
			
		}
		
		if(temp==sum) {
			System.out.println("The given number is palindrome: " + temp);
		}
		
		else {
			System.out.println("The number is not palidrome: " + temp);
		}

	}

}
