package collection.HashMapLearning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
//		HashMap m = new HashMap();
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		m.put(101, "John");
		m.put(102, "David");
		m.put(103, "Scott");
		m.put(104, "Mary");
		m.put(104, "Chubby");//new value for key 104 is updated
		m.put(103, "A");
		System.out.println(m);

		System.out.println(m.get(101));//101 is key
		
		System.out.println(m.getOrDefault(104, "newkey"));

		System.out.println(m.remove(102));//102 is key
		System.out.println(m);
		
		System.out.println(m.containsKey(101)); //return true or false
		
		System.out.println(m.containsValue("Mary"));
		
		System.out.println(m.isEmpty());
		
		System.out.println(m.keySet());//return all the Key as Set
		
		System.out.println(m.values());//return value as collection
		
		System.out.println(m.entrySet());//return a set Object with key and value pair
		
		for(Object i:m.keySet()) {
			System.out.println(i);
		}
		
		for(Object i:m.values()) {
			System.out.println(i);
		}
	
		for(Object i:m.keySet()) {
			System.out.println(i+"   "+m.get(i));//here i is Key
		}
		
		//Entry methods
		//************
		for(Map.Entry entry:m.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		//iterator()
		Set s=m.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry entry=(Entry) i.next();//type casted to Entry Object
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}

}
