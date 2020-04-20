package map;
import java.util.HashMap;
import java.util.Map.Entry;

import list.Helper_class;
public class Map {

	public static void main(String[] args) 
	{
		HashMap<Integer , String> obj = new HashMap<Integer , String>();
		obj.put(1, "Selenium");
		obj.put(2, "Java");
		obj.put(3, "QTP");
		obj.put(4, "Appium");
		System.out.println(obj.get(2));
		System.out.println(obj.get(6));
		for(Entry objhm :obj.entrySet()) {
			System.out.println(objhm.getKey() + " " + objhm.getValue());
		}
		obj.remove(3);
		System.out.println(obj);
		
		
		HashMap<Integer , Helper_class>Help = new HashMap<Integer , Helper_class>();
		Helper_class h1 = new Helper_class(1,"tom",22 );
		Helper_class h2 = new Helper_class(1,"jerry",33 );
		Helper_class h3 = new Helper_class(1,"micky",44 );
		
		Help.put(1, h1);
		Help.put(2, h2);
		Help.put(3, h3);
		
		for(Entry<Integer ,Helper_class> m :Help.entrySet())
		{
			int key = m.getKey();
			Helper_class h=m.getValue();
			System.out.println(key + "Info");
			System.out.println(h.money +" " +h.number+ " " +h.owner);
			System.out.println();
		}
		
		
	}

}
