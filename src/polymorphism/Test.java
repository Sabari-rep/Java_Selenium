package polymorphism;

//Main method file name is CallByValue 
//Main method file name is CallByReference

public class Test {
	
	int number;   //Class Variable or Instance Variable
	
	
	 void m1( int number)   // Local Variable
	 
	{
		number = number + 10;
		System.out.println("Value in the method: " + number);
	}

	
	void m2(Test t)
	{
		t.number=t.number+10;
		System.out.println("Value in the method: " + t.number);
	}
	
	

}
/*
Outside of the class variable called "Global Variable"
In java Global variable is not available, since
We need to specify the variable within the class.
*/
