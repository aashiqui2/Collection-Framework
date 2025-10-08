package collection.QueueLearning;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		
		//Adding element add() offer()
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");
//		q.offer(100); //Heterogeneous data are not allowed(ClassCastException)
		System.out.println(q);//Insertion order is preserved duplicate allowed
		
		//get head element  element(),peek()
		
//		System.out.println(q.element()); //if present return head element or return exception(NoSuchElementException)
//		System.out.println(q.peek());//if present return head element or null
		
		//Return & Remove element from queue
		//remove() and poll()
//		System.out.println(q.remove());//if empty it will return exception(NoSuchElementException)
//		System.out.println(q);
		
//		System.out.println(q.poll());//if empty it will return null
//		System.out.println(q);
		
		Iterator i=q.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(Object o:q) {
			System.out.println(o);
		}
		

	}

}
