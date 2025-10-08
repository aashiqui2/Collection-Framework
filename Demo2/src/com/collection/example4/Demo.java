package com.collection.example4;

import java.util.LinkedList;
import java.util.Queue;


public class Demo {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		System.out.println("Contents of queue are: " + queue);

		// queue.remove(2)
        // In Queue interface, there is no remove(int index)
        // So primitive int 2 is autoboxed to Integer object
        // Calls remove(Object o) → removes the first occurrence of value 2
		queue.remove(2);
		System.out.println("Contents of queue are: " + queue);

		// queue.remove(Integer.valueOf(1))
        // Explicitly passing Integer object 1
        // remove(Object o) removes the first occurrence of value 1
		queue.remove(Integer.valueOf(1));
		System.out.println("Contents of queue are: " + queue);
	}
}
