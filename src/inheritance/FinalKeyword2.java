package inheritance;

class Test1
{
	final void m1()
	{
		System.out.println("this is m1 from Test1");
	}
	
}

/*class Test2 extends Test1
{
	void m1()           //In correct, We can't override final methods
	{
		System.out.println("this is m2 from Test1");
	}
}*/

public class FinalKeyword2 {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		t1.m1();
		

	}

}
