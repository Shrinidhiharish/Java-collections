package list;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List {

	public static <E> void main(String[] args) {
		ArrayList array = new ArrayList();// TODO Auto-generated method stub	
array.add(7);//0 Yellow warning which means any data type can be added to the list. 
array.add(9);//1
array.add(9);//1 can contain duplicates
System.out.println(array.size());//array size
System.out.println(array.get(2));//get the value

//to print all the values from arraylist use 1.For loop 2.iterator 

for(int i=0;i<array.size();i++)
{
	System.out.println(array.get(i));
}

//generics v/s Nongeneric
ArrayList<Integer> numbers = new ArrayList<Integer>();
numbers.add(100);
numbers.add(900);

//when we are not sure about the kind of data which we need to store we use E 
ArrayList<E> number = new ArrayList<E>();
//Helper class objects
Helper_class obj = new Helper_class(897, "nidhi", 8976);
Helper_class obj1 = new Helper_class(8978, "Nimmi", 11.232);
Helper_class obj2 = new Helper_class(123, "Peer", 657.098);

//Arraylist
ArrayList<Helper_class> helper = new ArrayList<Helper_class>();
helper.add(obj);
helper.add(obj1);
helper.add(obj2);

//use of iterator to tranverse the values
Iterator<Helper_class> tran = helper.iterator();
while(tran.hasNext())
{
	Helper_class it = tran.next();
	System.out.println(it.money);
	System.out.println(it.number);
	System.out.println(it.owner);
}

//************** addall()

ArrayList<String> adding = new ArrayList<String>();
adding.add("AABB");
adding.add("BBCC");
adding.add("CCDD");

ArrayList<String> adding1 = new ArrayList<String>();
adding1.add("DDEE");
adding1.add("EEFF");
adding1.add("FFGG");

//add all
adding.addAll(adding1);
for(int i=0;i<adding.size();i++)
	System.out.println(adding.get(i));


System.out.println("*********");
//remove all
adding.removeAll(adding1);
for(int i=0;i<adding.size();i++)
	System.out.println(adding.get(i));


//retainall() retains the intersection part of two arraylist
System.out.println("*********");
ArrayList<String> add = new ArrayList<String>();
add.add("AABB");
add.add("BBCC");
add.add("CCDD");

ArrayList<String> add1 = new ArrayList<String>();
add1.add("CCDD");
add1.add("EEFF");
add1.add("FFGG");

add.retainAll(add1);
for(int i=0;i<add.size();i++)
	System.out.println(add.get(i));
	}
}
