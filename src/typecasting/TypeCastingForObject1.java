package typecasting;

class parent
{
	String name = "sabari";
	
	void m1()
	{
		System.out.println("this is m1 from parent...");
	}
}

class child extends parent
{
	
	int id = 123;
	
	void m2()
	{
		System.out.println("this is m2 from child....");
	}
}

public class TypeCastingForObject1 {

	public static void main(String[] args) {
		
		/*child c = new child();
		
		System.out.println(c.id);  //child
		System.out.println(c.name); //parent
		c.m1();  //parent
		c.m2(); //child
		
		*/
		
		//Upcasting
		
		parent p = new child();
		
		//System.out.println(p.id);  //child class can't access
		System.out.println(p.name); //parent
		p.m1();  //parent
		//p.m2(); //child class can't access
		
		
		
		//Downcasting ---> Is not possible, Because typecasting.parent cannot be cast to class typecasting.child 
		//We are getting the run time exception error
		
				/*parent p=new parent();
				
				child c=(child)p;
				
				System.out.println(c.id);  //child 
				System.out.println(c.name); //parent
				c.m1();  //parent
				c.m2(); //child 
				
				*/
				

	}

}
