package collection.LinkedListLearning;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// List ll=new LinkedList();
		// ll.add(10);
		// ll.add(20);
		// ll.add(30);
		// ll.add(40);
		// ll.add(50);
		// ll.add("Ashok");
		// System.out.println(ll.add(60));
		// ll.add("Ashok");
		// System.out.println("ll--> "+ll);
		// System.out.println(ll.size());
		// System.out.println(ll.contains(20));
		// System.out.println(ll.contains(10));
		// System.out.println(ll.hashCode());
		// System.out.println(ll.get(2));//index
		// System.out.println(ll.indexOf("Ashok"));//object/
		// System.out.println(ll.lastIndexOf("Ashok"));
		// System.out.println(ll.remove(0));//index or object//pass index must
		// System.out.println(ll);
		// System.out.println(ll.remove("Ashok"));//object return true or false
		// System.out.println(ll);
		// ll.clear();
		// System.out.println(ll);
		// System.out.println(ll.isEmpty());

		// LinkedList l2=new LinkedList();
		// System.out.println("l2--> "+l2);
		// l2.add(111);//boolean
		// l2.add(222);
		// l2.add(333);
		// l2.add(444);
		// // These are all object like wrapper class
		// l2.addAll(ll);//void
		// System.out.println("l2--> "+l2);
		// l2.addAll(0,ll);
		// System.out.println("l2--> "+l2);
		// l2.removeAll(ll);
		// System.out.println("l2--> "+l2);
		// l2.retainAll(ll);//Removes all l2 instead of l
		// System.out.println("l2--> "+l2);
		// l2.clear();

		// alternative of clear()
		// l2.removeAll(ll);
		// System.out.println("l2--> "+l2);
		// l2.removeAll(l2);
		// System.out.println(l2);

		// LinkedList l3=new LinkedList();
		// l3.add(100);
		// l3.add("200");
		// l3.add(300);
		// l3.add(400);
		// l3.add(500);
		// l3.add(600);
		// System.out.println(l3.add(600));//boolean true/false
		// System.out.println("l3--> "+l3);
		// System.out.println(l3.set(1,"ABCD"));//replaces element will be print
		// System.out.println("l3--> "+l3);
		// System.out.println(l3.set(50, l3));//IndexOutOfBoundsException

		// List l4=l3.subList(3, 5); //like substring Method(n-1)
		// System.out.println("l4--> "+l4);

		// l4=l3.subList(3, 7);//IndexOutOfBoundsException
		// System.out.println("l4--> "+l4);

		// l4=l3.subList(3, 3);//IndexOutOfBoundsException
		// System.out.println("l4--> "+l4);

		LinkedList l5 = new LinkedList();
		l5.add(5);
		l5.add(10);
		l5.add("Kalyani");
		l5.add("Diviya");
		l5.add(true);
		System.out.println(l5);
		l5.addFirst(1);
		System.out.println(l5);
		l5.addLast(false);
		System.out.println(l5);

		// l5.removeFirst();
		// System.out.println(l5);
		// l5.removeLast();
		// System.out.println(l5);

		System.out.println(l5.poll());// same as removefirst
		System.out.println(l5);
		System.out.println(l5.pollFirst());// same as removefirst
		System.out.println(l5);
		System.out.println(l5.pollLast());// same as removelast
		System.out.println(l5);

		l5.offer(5000);// same as addlast
		System.out.println(l5);
		l5.offerFirst(6000);// same as addFirst
		System.out.println(l5);
		l5.offerLast(7000);// same as addLast
		System.out.println(l5);

		LinkedList l6 = (LinkedList) l5.clone();// return Object so type casted
		System.out.println(l6);
		l5.clear();
		System.out.println(l5);

	}

}
