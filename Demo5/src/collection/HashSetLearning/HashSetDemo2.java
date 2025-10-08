package collection.HashSetLearning;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(2);
		hs.add(4);
		hs.add(6);
		
		System.out.println("HashSet: "+  hs);
		
		//addAll()
		HashSet<Integer> numbers=new HashSet<Integer>();
		numbers.addAll(hs);
		numbers.add(8);
		System.out.println("New HashSet "+numbers);
		
		//retailAll()
		numbers.retainAll(hs);
		System.out.println(numbers);
		
		//removeAll()
		numbers.removeAll(hs);
		System.out.println(numbers);
		
		//isEmpty()
		System.out.println(numbers.isEmpty());
		
		

	}

}
