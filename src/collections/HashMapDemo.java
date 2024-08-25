package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration
		
		//If you want to store different type of data (Heterogeneous data) in HashMap
		
		//HashMap hm = new HashMap();
		//Map hm = new HashMap();
		
		
		//If you want to store specific type of data in HashMap 
		
		HashMap<Integer,String>hm = new HashMap<Integer,String>();
		
		//Adding Pairs in HashMap
		
		hm.put(101, "Sabari");
		hm.put(101, "karthik");
		hm.put(102, "csk");
		hm.put(103, "rcb");
		hm.put(104, "India");
		
		//Printing the HashMap
		System.out.println(hm);
		
		
		//Size of HashMap
		System.out.println(hm.size());
		
		//Removing the pairs in HashMap
		hm.remove(103);
		System.out.println("after removing " + hm);
		
		//Access value of particular key
		System.out.println(hm.get(102));
		
		//Get all the keys from HashMap
		System.out.println(hm.keySet());
		
		//Get all the values fromHashMap
		System.out.println(hm.values());
		
		
		//Return all data in HashMap
		System.out.println(hm.entrySet());
		
		//Reading data from HashMap
		//Using for...each
		
		for(int k : hm.keySet())
		{
			System.out.println(k +" "+ hm.get(k));
		}
		
		
		//Using Iterator
		
		Iterator<Entry<Integer, String>> it= hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		

	}

}
