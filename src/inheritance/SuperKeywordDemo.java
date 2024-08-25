package inheritance;

//Main file name is SuperKeywordDemoMain

public class SuperKeywordDemo {
	
	String color = "Black";
	
	void eat()
	{
		System.out.println("eating...");
	}
	
	SuperKeywordDemo()
	{
		System.out.println("The animal is");
	}
	
	SuperKeywordDemo(String name)
	{
		System.out.println("Animal Name is: " + name);
	}
	
}

	
class Cat extends SuperKeywordDemo
	{
		String color = "White";
		
		void Display()
		{
			System.out.println(super.color);
		}
		
		void eat()
		{
			//System.out.println("eating bread");
			super.eat();
		}
		
		Cat()
		{
			super();
			//System.out.println("The animal is cat");
		}
		
		Cat(String name)
		{
			super(name);
		}
	}
	
