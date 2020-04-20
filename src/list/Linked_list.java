package list;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		//add
		ll.add("pari");
		ll.add("sree");
		ll.add("nidhi");
		System.out.println("The linkedlist elements are"+ ll);
	
		//addfirst
		ll.addFirst("sparsh");
		System.out.println("the first elemet is"+ll);
		//addlast
		ll.addLast("Aish");
		System.out.println("the last elemet is"+ll);
		//get:
		System.out.println(ll.get(0));
		//set:
		ll.set(2, "Shravan");
		System.out.println(ll.get(2));
		System.out.println("The linkedlist elements are"+ ll);
		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("The linkedlist elements are"+ ll);
		
		ll.remove(2);
		System.out.println(ll);
		
		//print all values of linkedlist
		//for loop
		
		System.out.println("****for loop");
		for(int i=0;i<ll.size();i++)
		System.out.println(ll.get(i));
		
		//Advanced for loop
		System.out.println("****Advanced for loop (for each)");
		for(String str:ll)
		{
			System.out.println(str);
		}
		
		//iterator
		System.out.println("****using iterator");
		Iterator<String> refobj = ll.iterator();
		while(refobj.hasNext())
		{
			System.out.println(refobj.next());
		}
        //while loop
		System.out.println("****using while loop");
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num++;
		}
		
	}
}
