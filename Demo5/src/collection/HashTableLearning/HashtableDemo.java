package collection.HashTableLearning;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableDemo {

	public static void main(String[] args) {
		//Hashtable t=new Hashtable();//capacity is 11, load factor 0.75
		
		//HashTable t=new(initial capacity); //create hashtable object with some capacity
		
		//Hashtable t=new Hashtable(initial capacity,fill ratio/load factor);
		
		Hashtable<Integer,String> t=new Hashtable<Integer,String>();
		
		t.put(101, "Harish");//no order is maintained
		t.put(102, "Harish");
		t.put(103, "David");
		t.put(103, "David Billa");//no duplicates are allowed
//		t.put(null, "X"); //null key or null value is not allowed throws Exception(NullPointerException)
//		t.put(104, null);
		System.out.println(t);
		System.out.println(t.get(103));
		
		System.out.println(t.remove(101));
		System.out.println("After Removing "+t);
		System.out.println(t.containsKey(102));// Returns true or false
		System.out.println(t.containsValue("David Billa"));// Returns true or false
		System.out.println(t.isEmpty());//false
		
		System.out.println(t.keySet());//return as set
		System.out.println(t.values());//return as collections
		
		for(int key:t.keySet()) {
			System.out.println(key+"  "+t.get(key));
		}
		
		//Entry specific methods
		for(Map.Entry entry:t.entrySet()) {
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		
		//iterator
		Set s=t.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry entry=(Entry) i.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		
		
		

	}

}
