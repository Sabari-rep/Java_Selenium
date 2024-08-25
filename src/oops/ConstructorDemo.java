package oops;

public class ConstructorDemo {

	
		int x,y;
		
		ConstructorDemo()    //Default Constructor
		{
			x=10;
			y=20;
		}
		
		ConstructorDemo(int a, int b)   //Parameterized Constructor
		{
			x=a;
			y=b;
		}
		
		void Demo()
		{
			System.out.println(x+y);
		}
		
		
		public static void main(String[] args) {	
			
			//ConstructorDemo d1 = new ConstructorDemo();
			//d1.Demo();
			
			ConstructorDemo d1 = new ConstructorDemo(100,200);
			d1.Demo();
  }
		
		
		
		
}





