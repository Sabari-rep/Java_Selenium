package abstraction;

interface shape
{
	int length=10;   //If we created any variable inside interface, those are final & static variables
	int width=20;
	
	void Circle();  //Abstract method - always in public
	
	default void Square()          //default method - we need to specify the access modifier
	
	//if we creating any method inside interface, apart from abstract method, we need to specify the access modifier
    //name to those methods
	
	{
		System.out.println("This is square - default method");   
	}
	
	static void Rectangle()           //static method
	{
		System.out.println("This is Rectangle - static method");
	}
}

public class InterfaceDemo implements shape{
	
	public void Circle()             
	{
		System.out.println("This is Circle - Abstract method");
	}
	
	void triangle()
	{
		System.out.println("This is Triangle");
	}

	public static void main(String[] args) {
		
		//Scenario 1
		
		InterfaceDemo idobj = new InterfaceDemo();
		
		idobj.Circle();   //abstract method
		idobj.Square();   //default method
		idobj.triangle(); //default method
		shape.Rectangle(); //static method --> To accessing the static method/variable we need to specify the interface/class name
		
		System.out.println(shape.length + shape.width);
		
		
		//Scenario 2
		
		shape sh = new InterfaceDemo();
		
		sh.Circle();      //Abstract method
		sh.Square();      //Default method
		shape.Rectangle();  //Static method 
		System.out.println(shape.length);  //static variable
		System.out.println(shape.width);   //static variable
		
		InterfaceDemo id = new InterfaceDemo(); 
		
		id.triangle();    //This method only created in class(InterfaceDemo)
		
		

	}

}
