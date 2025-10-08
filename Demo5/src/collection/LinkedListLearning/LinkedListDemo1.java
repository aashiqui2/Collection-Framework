package collection.LinkedListLearning;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {

		// Declare LinkedList
		// LinkedList ll=new LinkedList();

		// Homogenous Elements
		// LinkedList<String> ll=new LinkedList<String>();
		// LinkedList<Integer> ll=new LinkedList<Integer>();

		LinkedList ll = new LinkedList();

		// Add elements into the Linked list
		ll.add(100);
		ll.add("welcome");
		ll.add(13.4);
		ll.add('A');
		ll.add(true);
		ll.add(true);
		ll.add(null);
		ll.add(false);

		System.out.println(ll);

		// size()
		System.out.println(ll.size());

		// remove
		ll.remove(3);// 3 is index
		System.out.println("After removing " + ll);
		ll.remove("welcome");
		System.out.println("After removing " + ll);

		// insert/ adding at the middle of the linked list
		ll.add(3, 50);
		System.out.println("After inserting " + ll);

		// inserting at First and last
		ll.addFirst(25);
		System.out.println("After inserting " + ll);
		ll.addLast(true);
		System.out.println("After Inserting " + ll);

		// Retrieving Elements
		System.out.println(ll.get(3));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		//Removing first and last
		System.out.println("Removed Element from first "+	ll.removeFirst());
		ll.removeFirstOccurrence(true);
		System.out.println("After Removing first Ocurence of  an element "+ ll);
		ll.removeLastOccurrence(true);
		System.out.println("After Removing Last Ocurence of  an element "+ ll);
	

		// Replacing or changing value
		ll.set(2, "Arun");
		System.out.println("After Replacing " + ll);

		// contains()
		System.out.println(ll.contains("Arun"));
		System.out.println(ll.contains("Gokul"));

		// isEmpty()
		System.out.println(ll.isEmpty());

		// 1.For Loop
		System.out.println("Reading Element using For Loop");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		// 2. ForEach Loop

		for (Object o : ll) {
			System.out.println(o);
		}

		// 3.iterator()
		Iterator i = ll.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
