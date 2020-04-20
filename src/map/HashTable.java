package map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {

		Hashtable h1 = new Hashtable();
		h1.put(1, "Hari");
		h1.put(2, "Harish");
		h1.put(3, "Harisha");
		
		//Create a clone copy/Shallow copy
		
		Hashtable h2 = new Hashtable();
		h2= (Hashtable)h1.clone();
		System.out.println("The values from h1" +h1);
		System.out.println("The values from h2" +h2);
		
		h1.clear();
		System.out.println("The values from h1" +h1);
		System.out.println("The values from h2" +h2);
		
		//contains value
		Hashtable h3 = new Hashtable();
		h3.put("A", "Nidhi");
		h3.put("B", "ShriNidhi");
		h3.put("C", "ShriNidhi Harish");
		
		if(h3.contains("Nidhi"))
		{
			System.out.println("This is me!!");
		}
		
		//how to iterate hashtable using enumeration ---elements()
	Enumeration	h4 = h3.elements();
	System.out.println("Print values using enumeration");
	while(h4.hasMoreElements())
	{
		System.out.println(h4.nextElement());
	}
		
	//Fetch all the values using entrySet() -- set of hashtable values
		Set s = h3.entrySet();
		System.out.println("Print values using entry set " + s);
		
		//Equals
		Hashtable h5 = new Hashtable();
		h5.put("A", "Nidhi");
		h5.put("B", "ShriNidhi");
		h5.put("C", "ShriNidhi Harish");
		h5.put("C", "ShriNidhi Harish");//It contains only unique values
		//h5.put(null, "ShriNidhi Harish");//Null values in key or value id not allowed
		
		
		if(h5.equals(h3))
		{
			System.out.println("Both the hashtable h3 and h5 are same");
		}
	
		//get the value 
		System.out.println(h5.get(1));
		
		
		//Get hashcode
		System.out.println("The hashcode value of h5" +h5.hashCode());
		
		//generics
		Hashtable<String , String> h6 = new Hashtable<String , String>();
		//only string key and values are allowed
		
	
	}

}
