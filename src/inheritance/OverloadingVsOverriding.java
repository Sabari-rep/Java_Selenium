package inheritance;

class Animal
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2 (int b)
	{
		System.out.println(b);
	}
}

class Dog extends Animal
{
	void m1(int a)         //Overriding
	{
		System.out.println("The Dog count is: " + a);
	}
	
	void m2 (int b)     //Overriding
	{ 
		System.out.println("The dog count in 2 is: " + b);
	}
	
	void m2 (int a, int b)       //Overloading
	{
		System.out.println(a+b);
	}
}

public class OverloadingVsOverriding {

	public static void main(String[] args) {
		
		Dog a = new Dog();
		
		a.m1(2);
		a.m2(5);
		a.m2(2, 3);

	}

}
