package collection.HashSetLearning;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();// no order is maintained,heterogenous allowed
		hs.add("5");
		hs.add("10");
		hs.add("100");
		hs.add("53");
		hs.add("105");
		hs.add(true);
		hs.add("ashok");
		System.out.println(hs.add("105"));//no duplicate allowded
		System.out.println(hs);

	}

}
