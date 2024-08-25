package string;

public class RemovingWhiteSpaceInTheString {

	public static void main(String[] args) {
		
		String s = "we l c om e to   j a v a";
		
		System.out.println("Before Removing White Spaces: " + s);
		
		String s1 = s.replaceAll("\\s", "");
		
		System.out.println("After Removing White Spaces: " + s1);
		

	}

}
