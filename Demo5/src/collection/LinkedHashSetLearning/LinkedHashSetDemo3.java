package collection.LinkedHashSetLearning;

import java.util.LinkedList;
import java.util.TreeSet;

public class LinkedHashSetDemo3 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(5);
		ll.add(5);
		ll.add(20);
		ll.add(3);
		ll.add(100);
		ll.add(38);
		System.out.println("Linked list Elements "+ll);

		TreeSet ts1 = new TreeSet(ll);//only homogeneous allowed
		System.out.println("Treeset elements "+ts1);// sorted and without duplicated elements
		ComparatorDemo comp = new ComparatorDemo();
		
		TreeSet ts2 = new TreeSet(comp);// descending order
		ts2.add(3);
		ts2.add(2);
		ts2.add(1);
		ts2.add(13);
		ts2.add(18);
		ts2.add(5);
//		ts2.add("hi"); //only homogeneous allowed
		System.out.println("Treeset Using comparator(Descending Order) "+ts2);

		TreeSet ts = new TreeSet();
		// ! this implements Sortable set
		ts.add(5);
		ts.add(20);
		// Heterogeneous elements not allowed
		//ts.add('c'); //.ClassCastException; Integer cannot be cast to class
		// java.lang.Character
		ts.add(8);
		ts.add(13);
		ts.add(2);
		 ts.add(null); //no null value is allowed
		System.out.println(ts);

	}

}
