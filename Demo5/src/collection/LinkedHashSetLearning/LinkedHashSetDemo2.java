package collection.LinkedHashSetLearning;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetDemo2 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(10);
        ll.add(40);
        ll.add(20);
        ll.add(true);
        ll.add('c');
        ll.add("hi");
        LinkedHashSetDemo1 sd1 = new LinkedHashSetDemo1 ();
        ll.add(sd1);
        System.out.println("At first " + ll);
        LinkedHashSet lhs = new LinkedHashSet(ll);
        System.out.println("After Removing Duplicates");
        System.out.println(lhs);

        //  to convert collection(linkedlist) to array
        // its is converted to Object class array because we need to mention the array
        // type before initialization
        System.out.println();
        Object[] ob = ll.toArray();// Object class array
        for (Object o : ob) {
            System.out.print(o + " ");
        }


	}

}
