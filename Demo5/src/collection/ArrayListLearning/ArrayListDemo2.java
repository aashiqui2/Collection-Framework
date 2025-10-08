package collection.ArrayListLearning;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		ArrayList al1=new ArrayList();
		al1.addAll(al);
		System.out.println(al1);
		al1.removeAll(al);
		System.out.println("After Removing "+ al1);
		
		// Sort -- Collections.sort()
		System.out.println("Element Before sorting "+al);
		Collections.sort(al);
		System.out.println("Element After sorting "+al);
		
		//Sort in Descending order
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("After reversing "+ al);
		
		//Shuffling- Collections.shuffle()
		//Collections.shuffle(al);
		//System.out.println("Elements in array list After Shuffling :"+ al);
		
		//BinarySearch- Collections.BinarySearch()
		// Collections.binarySearch(List, key);
		System.out.println(Collections.binarySearch(al, "Y")); //Return Index
		
		

	}

}
