package collection.ArrayListLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		Laptop dell = new Laptop("Inspiron", 50000, 6, false);
		Laptop lenova = new Laptop("Ideapad", 50000, 8, false);
		Laptop hp = new Laptop("Pavilion", 55000, 10, true);
		ArrayList laptopList = new ArrayList();
		laptopList.add(hp);
		laptopList.add(lenova);
		laptopList.add(dell);
		
		//For Sorting in Ascending order
		// Collections.sort(laptopList);
		
		//For Sorting in custom order
		System.out.println("Before sorting " + laptopList);
		ComparatorDemo comp = new ComparatorDemo();
		Collections.sort(laptopList, comp);
		System.out.println("After sorting " + laptopList);
		
		Collections.reverse(laptopList);
		System.out.println("After Reverse "+laptopList);
		
		Collections.shuffle(laptopList);
		System.out.println("Shuffled list "+laptopList );

	}

}




