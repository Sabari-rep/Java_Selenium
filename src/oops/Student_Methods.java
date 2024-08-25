package oops;

public class Student_Methods {
	
	int sid;
	String sname;
	char grade;
	
	void PrintStuData()
	{
		System.out.println(sid+ " "+sname+ " "+grade);
	}
	
	void SetStuData(int id,String name,char g)
	{
		sid = id;
		sname = name;
		grade = g;
	}
	
	Student_Methods(int id,String name,char g)
	{
		sid = id;
		sname = name;
		grade = g;
	}

}
