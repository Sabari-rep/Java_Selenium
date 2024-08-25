package  inheritance;

class A {
	
	int a;
	
	void display()
	{
		System.out.println(a);
	}
}

class B extends A {
	
	int b;
	
	void show()
	{
		System.out.println(b);
	}
}

public class InheritanceTypes {

	public static void main(String[] args) {
		
		B bobj = new B();
		
		bobj.a=10;
		bobj.b =20;
		
		bobj.display();
		bobj.show();
		

	}

}
