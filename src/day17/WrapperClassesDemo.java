package day17;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		
		//Primitive Data Types
		
		int i = 10;
		double d = 10.5;
		char c = 'A';
		boolean b = true;
		
		
		//**********Auto Boxing   ------> Converting Primitive data type to Object type is called Auto boxing.
		
		Integer iobj = i;
		Double dobj = d;
		Character cobj = c;
		Boolean bobj = b;
		
		System.out.println(iobj);
		System.out.println(dobj);
		System.out.println(cobj);
		System.out.println(bobj);
		
		//**********Auto Unboxing -----> Converting Object type to Primitive type is called Auto Unboxing
		
		int intvalue = iobj;
		double doublevalue = dobj;
		char charvalue = cobj;
		boolean bolleanvalue = bobj;
		
		System.out.println(intvalue);
		System.out.println(doublevalue);
		System.out.println(charvalue);
		System.out.println(bolleanvalue);
		

	}

}
