package encapsulation;

//We can access the another class static stuff directly (Without creating a object) using the class name.
public class StaticMain {

	public static void main(String[] args) {
		
		System.out.println(StaticDemo.a);
		StaticDemo.m1();

	}

}
