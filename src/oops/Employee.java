package oops;

public class Employee {
	
	int id;
	String Name;
	String Job;
	int Salary;
	
	void display()
	{
		System.out.println(id);
		System.out.println(Name);
		System.out.println(Job);
		System.out.println(Salary);
	}
	
     //Creating Object with reference Variable
	
	public static void main(String[] args) {
		

		Employee emp1 = new Employee();
		emp1.id = 211;
		emp1.Name = "John";
		emp1.Job = "Tester";
		emp1.Salary = 20000;
		
		emp1.display();
	
	
	//Creating Object Without Reference Variable -----> This is not possible
		
		/*
	 new Employee();
	 
	 new Employee().id = 35;
	 new Employee().Name = "Alan";
	 new Employee().Job = "Tester";
	 new Employee().Salary = 30000;
	 
	 new Employee().display();
		*/
	
	}
}
