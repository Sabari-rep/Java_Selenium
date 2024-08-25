package typecasting;

/*example
 Cat ct =(Cat) an
 A --> Cat 
 b --> ct
 C ---> (Cat)
 d ---> an
 */

class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}

public class TypeCastingForObject2 {

	public static void main(String[] args) {
		
		//*********Rule1 : Conversion is valid or not *********
		//the type of 'd' and 'C' must have relationship (either parent to child or child to parent)
		
		//Animal an = new Animal();
		//Cat ct =(Cat) an;   //Valid as per Rule1
		
		//Dog dg = new Dog();
		//Cat ct = (Cat) dg; //Invalid as per Rule1
		
		//*********Rule2 : Assignment is valid or not***********
		//'C' must be either same or child of 'A'
		
		//Animal an = new Dog();
		//Cat ct = (Cat) an;   //Valid as per Rule 2
		
		//Animal an = new Dog();
		//Cat ct = (Dog) an;     //Invalid as per Rule2
		
		
		//********Rule 3 : The underlying object type of 'd' must be either same or child of 'C'******
		
		//Animal an = new Dog();    //Getting ClassCast Runtime error
		//Cat ct = (Cat) an;         //Invalid as per Rule 3
		
		//********Rule1, Rule2, Rule3 ************
		
		Animal an = new Dog();
		Dog dg = (Dog) an;    //Rule1 - Yes, Rule2 - Yes, Rule 3 - Yes
		
		
		

	}

}
