package encapsulation;

//Main method file name is StaticMain


public class StaticDemo {
	
	static int a=10;
	int b=20;
	
	static void m1()
	{
		System.out.println("Static method");
	}
	
	void m2 ()
	{
		System.out.println("Non static method");
	}
	
	

	/*public static void main(String[] args) {
		
		System.out.println(a);
		m1();
		
		StaticDemo sd = new StaticDemo();
		
		System.out.println(sd.b);
		sd.m2();
		

	}*/

}
