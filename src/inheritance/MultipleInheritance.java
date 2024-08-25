package inheritance;

//Multiple inheritance has been achieved by using the interface 

interface I1
{
	int x=100;
	void m1();
}

interface I2
{
	int y =200;
	void m2();
	
}

public class MultipleInheritance implements I1,I2 
{
	public void m1()
	{
		System.out.println("This is m1 method");
	}
	
	public void m2()
	{
		System.out.println("This is m2 method");
	}
	
	
	public static void main(String[] args) {
		
		MultipleInheritance mi = new MultipleInheritance();
		
		mi.m1();
		mi.m2();
		System.out.println(mi.x);
		System.out.println(mi.y);

	}

}
