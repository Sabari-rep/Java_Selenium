package polymorphism;

//Main file name AdderMain

public class Adder {
	
	int a=10, b=20;
	
	void sum()
	{
		System.out.println(a+b);
	}
	
	void sum(int x, int y)             //Number of parameters should be different
	{
		System.out.println(x+y);
	}
	
	void sum(double x, double y)      //Data type of parameter should be different
	{
		System.out.println(x+y);
	}
	
	void sum(int x, double y)         //Data type of parameter should be different
	{
		System.out.println(x+y);
	}
	
	void sum(double y, int x)         //Order of parameter should be different.
	{
		System.out.println(x+y);
	}
}
