package com.collection.example3;

import java.util.ArrayList;
import java.util.List;


public class Demo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("Contents of list are: " + list);
		
		// remove(int index) → here 1 is treated as index (position)
        // Removes element at index 1 (second element = 2)
		list.remove(1);
		System.out.println("Contents of list are: " + list);

		// remove(Object o) → here we pass Integer.valueOf(1), so it matches remove(Object)
        // Removes the first occurrence of the Integer object 1
		list.remove(Integer.valueOf(1));
		System.out.println("Contents of list are: " + list);
	}
}
