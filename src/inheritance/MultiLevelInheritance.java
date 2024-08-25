package inheritance;

class C {
	
	int a;
	
	void display()
	{
		System.out.println(a);
	}
}

class D extends C {
	
	int b;
	
	void show()
	{
		System.out.println(b);
	}
}

class E extends D {
	
	int c;
	
	void print()
	{
		System.out.println(c);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		E eobj = new E();
		
		eobj.b =20;
		eobj.a = 23;
		eobj.c = 25;
		
		eobj.display();
		eobj.show();
		eobj.print();
		



	}

}
