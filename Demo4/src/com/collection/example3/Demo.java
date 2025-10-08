package com.collection.example3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import com.collection.entity.CustomEmployeeComparator;
import com.collection.entity.Employee;


public class Demo {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(30, "Thirty");
		hashMap.put(80, "Eighty");
		hashMap.put(17, "Seventeen");
		hashMap.put(56, "Fifty Six");
		hashMap.put(34, "Thirty Four");
		hashMap.put(90, "Ninety");
		hashMap.put(2, "Two");
		hashMap.put(null, "a");
		hashMap.put(null, "b");
		System.out.println("Contents of HashMap are: " + hashMap);

		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(30, "Thirty");
		linkedHashMap.put(80, "Eighty");
		linkedHashMap.put(17, "Seventeen");
		linkedHashMap.put(56, "Fifty Six");
		linkedHashMap.put(34, "Thirty Four");
		linkedHashMap.put(90, "Ninety");
		linkedHashMap.put(2, "Two");
		linkedHashMap.put(null, "a");
		linkedHashMap.put(null, "b");
		System.out.println("Contents of LinkedHashMap are: " + linkedHashMap);

		Map<Integer, String> treeMap = new TreeMap<>();// using Red-Black Tree data structure
		treeMap.put(30, "Thirty");
		treeMap.put(80, "Eighty");
		treeMap.put(17, "Seventeen");
		treeMap.put(56, "Fifty Six");
		treeMap.put(34, "Thirty Four");
		treeMap.put(90, "Ninety");
		treeMap.put(2, "Two");
		//treeMap.put(null, "a");
		//treeMap.put(null, "b");
		System.out.println("Contents of TreeMap are: " + treeMap);//Natural Ordering of Keys
		
		
		System.out.println("Comparator By Id: ");
		TreeMap<Employee, String> map = new TreeMap<>();
        map.put(new Employee(3, "Alice"), "HR");
        map.put(new Employee(1, "Bob"), "IT");
        map.put(new Employee(2, "Charlie"), "Finance");
        System.out.println(map);
        
        
        System.out.println("Custom Comparetd By Name:");
        TreeMap<Employee, String> customMap = new TreeMap<>(new CustomEmployeeComparator());
        customMap.put(new Employee(3, "Charlie"), "Finance");
        customMap.put(new Employee(1, "Alice"), "HR");
        customMap.put(new Employee(2, "Bob"), "IT");

        System.out.println(customMap);
	}
}
