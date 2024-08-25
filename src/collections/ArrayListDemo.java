package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration
		
		//If you want to store different type of data (Heterogeneous data) in ArrayList 
		
		ArrayList mylist = new ArrayList();     
		//List mylist = new ArrayList();         
		
	   //If you want to store one type of data (Homogenous data) in ArrayList 
		
		//ArrayList <Integer> mylist = new ArrayList<Integer>();  //only store Integer type objects data's
		//ArrayList <employee> mylist = new ArrayList<employee>();  //Stores only Employees data
		 
		//Adding data in ArrayList
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add(100);
		mylist.add(true);
		mylist.add(null);
		mylist.add(null);
		
		//Size of ArrayList
		
		System.out.println("size of arraylist is: " + mylist.size());
		
		//Printing the data in ArrayList
		
		System.out.println("Printing the data from array list: " + mylist);
		
		//Removing the data from ArrayList
		
		mylist.remove(3);
		System.out.println("After removing the data from array list: " + mylist);
		
		//Inserting the element in ArrayList
		
		mylist.add(2, 1234);
		System.out.println("After inserting the data from array list: " + mylist);
		
		//Modify element in ArrayList (Modify/replace/change)
		
		mylist.set(2, "java");
		System.out.println("After modifying the data from array list: " + mylist);
		
		//Accessing specific element in ArrayList
		
		System.out.println(mylist.get(3));
		
		
		//Reading all the elements from ArrayList
		
		//Using Normal For loop
		
		/*
		for(int i=0; i<mylist.size(); i++) 
		{
			System.out.println(mylist.get(i));
		}
		*/
		
		//Using Enhanced for loop (or) for each loop
		
		/*
		for(Object x:mylist)
		{
			System.out.println(x);
		}
		*/
		
		//Using Iterator // Always prefer while loop for Iterators, because we don't know the exact size of the arraylist
		
		Iterator it = mylist.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//checking arraylist is empty or not
		
		System.out.println("Is my arraylist is empty?  " + mylist.isEmpty());
		
		//Randomly removing the elements in arraylist
		
		ArrayList mylist2 = new ArrayList();
		
		mylist2.add("java");
		mylist2.add("Welcome");
		mylist2.add(null);
		
		System.out.println("Before removing" + mylist);
		mylist.removeAll(mylist2);
		System.out.println("after removing " + mylist);
		
		//Remove all the elements in arraylist
		
		mylist.clear();
		System.out.println("Is my arraylist is empty?  " + mylist.isEmpty());
		
		
	}

}
