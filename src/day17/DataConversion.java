package day17;

public class DataConversion {

	public static void main(String[] args) {
		
		/*
		//Scenario 1 ---> String to int, char, double, boolean
		
		//String to int -----> Integer.parseInt(variable name)
		
		String s1 = "100";
		String s2 = "200";
		
		int sum = Integer.parseInt(s1)+Integer.parseInt(s2);
		
		System.out.println(sum);
		    
		//String to double ----> Double.parseDouble(variable name)
		
		String s = "12.34";
		
		double value = Double.parseDouble(s);
		
		System.out.println(value);
		    
		    
		//String to Boolean ---->Boolean.parseBoolean (variable name)
		
		String a = "true";
		
		boolean b = Boolean.parseBoolean(a);
		
		System.out.println(a);
		
	
		//String to char ------> Is not possible
		
		*/
		
		//Scenario 2 ---> int, char, double, boolean ----> String
		
		int x = 100;
		
		String s = String.valueOf(x);
		
		double d = 12.45;
		
		String s1 = String.valueOf(d);
		
		char c = 'A';
		
		String s2 = String.valueOf(c);
		
		boolean b = true;
		
		String s3  = String.valueOf(b);
		
		System.out.println(s+ " " +s1 +" "+s2+ " " +s3);
		
		

	}

}
