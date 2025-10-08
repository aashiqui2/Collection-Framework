package collection.ArrayListLearning;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	public String toString() {
		return "Hi";
	}

	public static void main(String[] args) {
		
        //Declare ArrayList
		//ArrayList al=new ArrayList();
		//ArrayList<Integer> al=new ArrayList<Integer>();
		//ArrayList<String> al=new ArrayList<String>();
	    List al=new ArrayList();
		
		
       // Add new Element to the arrayList -Insertion order is maintained
		al.add(100);
		al.add("welcome");
		al.add(15.5);
		al.add(true);
		al.add('A');
		
		//we can add Object of our own class
		ArrayListDemo1 ald1=new ArrayListDemo1();
		al.add(ald1);
		System.out.println(al);
		
		//To find the no of elements Stored in the ArrayList- size()
		System.out.println(al.size());
		
		//remove
		al.remove(1); //here 1 is index
		al.remove("welcome");  //here welcome is Object
		
		System.out.println("After removing element from ArrayList: "+ al);
		
		//insert a new Element
		al.add(2,"Python"); // add(index,Object)
		//index start from 0
		System.out.println("After Insertion: "+ al);
		
		//Retrieve specific element
		System.out.println(al.get(2)); //2 is index
		
		//replace element
		al.set(1, "java");
		System.out.println("After replacing elements "+ al);
		
		//Search -contains()
		System.out.println(al.contains("java")); //Return true/ false
		System.out.println(al.contains("PHP")); //Return true/ false
		
		//isEmpty()
		System.out.println(al.isEmpty()); //Return true/false
		
		
		
		//1.For Loop
		System.out.println("Reading Element using For Loop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		
		//2. ForEach Loop
		
		for(Object o:al) {
			System.out.println(o);	
		}
		
		//3.iterator()
		Iterator i=al.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
		
		
		

	}

}
