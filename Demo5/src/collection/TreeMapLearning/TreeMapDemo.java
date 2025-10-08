package collection.TreeMapLearning;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(101, "muthu");
		tm.put(102, "gokul");
		tm.put(103, "rahul");

		TreeMap tm2 = new TreeMap();
		tm2.putAll(tm);
		System.out.println(tm2);
		
		
		 // Create a TreeMap instance
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(4, "Cherry");
        treeMap.put(2, "Date");

        // Display the TreeMap (will be in sorted order by key)
        System.out.println("TreeMap: " + treeMap);

        // Accessing elements
        System.out.println("Value for key 1: " + treeMap.get(1));

        // Removing an element
        treeMap.remove(2);
        System.out.println("After removing key 2: " + treeMap);

        // Iterating through the TreeMap
        System.out.println("Iterating through the TreeMap:");
        for (Integer key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }

        // Checking if a key or value exists
        System.out.println("Contains key 3: " + treeMap.containsKey(3));
        System.out.println("Contains value 'Cherry': " + treeMap.containsValue("Cherry"));
		
	}
}
