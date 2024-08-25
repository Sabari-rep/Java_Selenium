package string;

import java.util.Arrays;

public class CountOccuranceOfCharacterInString {

	public static void main(String[] args) {
		
		String s = "sabarikarthik";
		
		int lengthoforiginalstring = s.length();
		int lengthafterremovingspecifiedcharacter = s.replace("a", "").length();
		
		int count = lengthoforiginalstring - lengthafterremovingspecifiedcharacter;
		
		System.out.println("The Occurance count of a is: " + count);

	}

}
