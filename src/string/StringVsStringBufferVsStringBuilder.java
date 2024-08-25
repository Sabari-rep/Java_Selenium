package string;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		//String ------> Is a immutable object, We cannot change
		/*
		String s = "welcome";
		System.out.println(s.concat(" to java"));
		System.out.println(s);
		*/
		
		//StringBuffer ---->  Is a mutable object, We can change
		
		StringBuffer s = new StringBuffer("welcome");
		System.out.println(s.append(" to java"));
		System.out.println(s);
		
		
		
		//StringBuilder ----> Is a mutable object, We can change
		/*
		StringBuilder s = new StringBuilder("welcome");
		s.append(" to java");
		System.out.println(s);
*/
	}

}
