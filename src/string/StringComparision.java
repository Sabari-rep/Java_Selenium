package string;

public class StringComparision {

	public static void main(String[] args) {
		
		//Case1
		
		/*String s1 = "sabari";
		String s2 = "sabari";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		*/
		
		//Case2
		
		/*String s1 = new String("sabari");
		String s2 = new String("sabari");
		
		System.out.println(s1==s2);           // Is used for comparing the object
		System.out.println(s1.equals(s2));    //Is used for comparing the values in the object
		
		*/
		
		//Case3
		
		/*String s1 = "sabari";
		String s2 = new String("sabari");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		*/
		
		//Case4
		
		String s1 = "sabari";
		String s2 = new String("sabari");
		String s3 = s2;
		
		System.out.println(s1==s2);          //False
		System.out.println(s1.equals(s2));   //True
		
		System.out.println(s2==s3);          //True       //Here Objects are same
		System.out.println(s2.equals(s3));   //True       //Here values of objects are same
		
	}  

}
