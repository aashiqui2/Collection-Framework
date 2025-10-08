package collection.HashSetLearning;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// HashSet hs=new HashSet() //default capacity 16 load factor 0.75 
        //	HashSet hs=new HashMap<>(16, 0.75f); both are same	
		// HashSet hs=new HashSet(100); //initial capacity will be 100
		// HashSet hs=new HashSet(100,(float)0.90); //load factor is 0.90

		// HashSet<Integer> hs=new HashSet<Integer>();

		HashSet hs = new HashSet();
		hs.add(100);
		hs.add("welcome");
		hs.add(12.3);
		hs.add('A');
		hs.add(true);
		hs.add(true);// false no duplicates allowded
		hs.add(null);
		System.out.println(hs);

		// remove()
		hs.remove(12.3); // pass only value/Object, no index is allowed
		System.out.println("After Removing " + hs);

		// contains()
		System.out.println(hs.contains(12.3));

		System.out.println(hs.isEmpty());

		// 1.For Loop-not applicable because it doesn't has index concept
		System.out.println("Reading Element using For Loop");
//		for (int i = 0; i < hs.size(); i++) {
//			System.out.println(hs.get(i));
//		}

		// 2. ForEach Loop
		for (Object o : hs) {
			System.out.println(o);
		}

		// 3.iterator()
		Iterator i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
