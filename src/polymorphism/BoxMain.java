package polymorphism;

public class BoxMain {

	public static void main(String[] args) {
		 
		//Box b = new Box();   //Calling (1) default constructor
		
		//Box b = new Box(5.5,5.6,5.7);  //Calling (2) Parameterized Constructor
		
		Box b = new Box(10.5);   //Calling 3
		
		System.out.println("Volume of the box is: " + b.volume());

	}

}
