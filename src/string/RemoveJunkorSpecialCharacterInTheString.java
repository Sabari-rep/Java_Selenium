package string;

public class RemoveJunkorSpecialCharacterInTheString {

	public static void main(String[] args) {
		
		String s = "1234567890sa!bari@@@@ka%%%rthik$$$$";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		

	}

}
