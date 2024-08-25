package controalstatements;

public class IfPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int month = 2;
		
		switch(month) {
		
		case 1: System.out.println("Jan");break;
		case 2: System.out.println("Feb");break;
		case 3: System.out.println("Mar");break;
		case 4: System.out.println("Apr");break;
		case 5: System.out.println("May");break;
		case 6: System.out.println("Jun");break;
		case 7: System.out.println("July");break;
		case 8: System.out.println("Aug");break;
		case 9: System.out.println("Sep");break;
		case 10: System.out.println("Oct");break;
		case 11: System.out.println("Nov");break;
		case 12: System.out.println("Dec");break;
		default: System.out.println("month is not valid");
		}
		*/
		
		/*Smallest of 3 Numbers
		
		int a=800, b=60, c=70;
		
		if (a<b && a<c) {
			
			System.out.println("a is the smallest number: " + a);
		}
		
		else if (b<a && b<c) {
			System.out.println("b is the smallest number: " + b);
		}
		
		else {
			System.out.println("c is the smallest number: " + c);
		}
		*/
		
		/*Largest of 2 number (using If else and Ternery Operator)
		
		int a = 70, b = 80;
		if(a>b) {
		System.out.println("a is the large number: " + a);

	    }
		else {
			System.out.println("b is the large number: " + b);
		}
		*/
		
		//Finding large number using Ternery operator
		
		int a = 5, b = 7;
		
		int x = a>b ? a : b;
		System.out.println(x);
	}

}
