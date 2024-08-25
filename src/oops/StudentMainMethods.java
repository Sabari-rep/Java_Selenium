package oops;

public class StudentMainMethods {

	public static void main(String[] args) {
		
		//Student_Methods stu = new Student_Methods();
		
		//1.Assign data using object reference
		/*stu.sid = 21;
		stu.sname = "sabari";
		stu.grade = 'A';
		stu.PrintStuData();
*/
		//2.Assign data using user defined methods
		/*
		stu.SetStuData(23, "sabari", 'B');
		stu.PrintStuData();
		*/
		//3.Using Constructor
		
		Student_Methods stu = new Student_Methods(23, "sabari", 'B');
		stu.PrintStuData();
	}

}
