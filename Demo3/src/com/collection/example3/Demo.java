package com.collection.example3;

import java.util.HashSet;
import java.util.Set;


public class Demo {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println("Contents of set are: " + set);
		
		// set.remove(1)
        // HashSet only has remove(Object o), there is no remove by index
        // Primitive int 1 is autoboxed to Integer object
        // Removes the value 1 from the set
		set.remove(1);
		System.out.println("Contents of set are: " + set);
		
		// set.remove(Integer.valueOf(1))
        // Explicitly passing Integer object 1
        // Same as above, removes the value 1 from the set
        // Since 1 is already removed, no effect this time
		set.remove(Integer.valueOf(1));
		System.out.println("Contents of set are: " + set);
	}
}
