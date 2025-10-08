package collection.LinkedListLearning;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		
		LinkedList al1=new LinkedList();
		al1.addAll(l);
		System.out.println(al1);
		al1.removeAll(l);
		System.out.println("After Removing "+ al1);
		
		// Sort -- Collections.sort()
		System.out.println("Element Before sorting "+l);
		Collections.sort(l);
		System.out.println("Element After sorting "+l);
		
		//Sort in Descending order
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("After reversing "+ l);
		
		//Shuffling- Collections.shuffle()
		//Collections.shuffle(al);
		//System.out.println("Elements in array list After Shuffling :"+ al);
		
		//BinarySearch- Collections.BinarySearch()
		// Collections.binarySearch(List, key);
		System.out.println(Collections.binarySearch(l, "Y")); //Return Index

	}

}
