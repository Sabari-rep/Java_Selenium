package encapsulation;

//We can create the class variable and local variable in same name, it's execute the output as "zero". 
//Since method(SetData) can't able to recognize

public class ThisKeyword {
	
	int x,y;          //Class Variable/Instance Variable
	
	void SetData(int x, int y)         //Local Variable
	{
		this.x=x;       //this keyword represents the class name, if we mention the class variable and local variable
		                //in same name we can mention the "this" keyword to differentiate
		this.y=y;
	}
	
	void display()
	{
		System.out.println(x + "   " + y);
	}
	
	
	public static void main(String[] args) { 
		
		ThisKeyword th = new ThisKeyword();
		
		th.SetData(12, 45);
		
		th.display();
		

	}

}
