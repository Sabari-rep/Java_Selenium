package typecasting;

//Upcasting ----> Converting the data from smaller to larger ---> Automatic
//int -->long
//float ---> double

//Downcasting ---> Converting the data from larger to smaller  ---> Manual
//long ---> int
//double ---> float

public class TypeCatingConcepts {

	public static void main(String[] args) {
		
		//Upcasting ----> Converting the data from smaller to larger ---> Automatic
		/*
		int intvalue = 100;
		
		long longvalue = intvalue;
		System.out.println(longvalue);
		
		float floatvalue = 12.45F;
		
		double doublevalue = floatvalue;
		System.out.println(doublevalue);
		*/
		
		//Downcasting ---> Converting the data from larger to smaller  ---> Manual
		
		long longvalue = 1203455;
		int intvalue = (int) longvalue;
		
		double doublevalue = 1234.567;
		float flotvalue = (float) doublevalue;
		
		System.out.println(flotvalue);
		System.out.println(intvalue);
		

	}

}
