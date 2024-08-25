package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		//Declaration
		
		//If you want to store different type of data (Heterogeneous data) in HashSet
		
		HashSet myset = new HashSet();
		//Set myset = new HashSet();
		
		//If you want to store one type of data (Homogenous data) in HashSet 
		
		//HashSet <String>myset = new HashSet<String>();
		
		//Adding elements in to HashSet
		
		myset.add(100);
		myset.add(100);
		myset.add("welcome");
		myset.add(null);
		myset.add(null);
		myset.add('A');
		
		//Printing HashSet
		
		System.out.println(myset);
		
		//Size of HashSet
		
		System.out.println(myset.size());
		
		//Removing elements from HashSet
		
		myset.remove(100);
		System.out.println("After removing: " + myset);
		
		//Inserting element in HashSet ---> Not possible
		
		//Accessing specific element in HashSet ---> Not possible directly
		//So we have a work around for this convert the Hashset to ArrayList then access the specific element is possible
		
		ArrayList al = new ArrayList(myset);
		System.out.println(al.get(1));
		
		//Read all elements using for..each loop/enhanced for loop
		//Normal for loop is possible, because in HashSet there is no insertion order(Indexing not allowed)
		
		for(Object x : myset)
		{
			System.out.println(x);
		}
		
		//Using Iterator
		
		Iterator it = myset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
