package collection.LinkedHashSetLearning;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		// HashSet hs=new HashSet();  //no order is maintained,heretogenous allowed
		
        LinkedHashSet lhs=new LinkedHashSet();  //insertion order is maintained
        lhs.add("5");
        lhs.add("10");
        lhs.add("Welcome");
        lhs.add(100);
        lhs.add("105");
        lhs.add(true);
        System.out.println(lhs);
        System.out.println(lhs.add("105")); //duplicates not allowded
	}

}
