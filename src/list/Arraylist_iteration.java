package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist_iteration {

	public static void main(String[] args) {

		ArrayList<String> TV  = new ArrayList<String>();
		TV.add("F.R.I.E.N.D.S");
		TV.add("G O T");
		TV.add("How I met your mother");
		TV.add("Prison Break");
		TV.add("Sisters");
		
		//1.For each loop and lamda expression in java 8
		
		TV.forEach(Shows ->{
			System.out.println(Shows);
		});
		
		System.out.println("***Using lamda expression****");
		//2.Using Iterator
		Iterator<String> tv = TV.iterator();
		while(tv.hasNext())
		{
			String shows = tv.next();
			System.out.println(shows);
		}
		
		System.out.println("**Using Iterator**");
		
		//3.Using iterator and java 8 foreachremaining() method
		
		System.out.println("***Print using for each remaining() method ***");
		
		tv=TV.iterator();
		tv.forEachRemaining(Show -> {
			System.out.println(Show);
		});
		
		//4.Using for each loop
		System.out.println("**Using For each loop ***");
		for(String show :TV)
		System.out.println(show);
		
		//5.Using for loop with order/index
		System.out.println("**Using For loop with order / index***");
		for(int i=-0; i<TV.size();i++)
		{
		System.out.println(TV.get(i));	
		}
		
		//6.Using list iterator
		System.out.println("**Using list iterator to traverse in both directions**");
		ListIterator<String> TVListIterator = TV.listIterator(TV.size());
		while(TVListIterator.hasPrevious())
		{
			String it = TVListIterator.previous();
			System.out.println(it);
		}
		
	}

}
