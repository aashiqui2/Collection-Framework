package collection.ArrayListLearning;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		String[] str= {"dog","Cat","Elephant"};
		for(String s:str) {
			System.out.println(s);
		}
		
		//To convert array to arrayList  -Arrays(Class)
		ArrayList al=new ArrayList(Arrays.asList(str));
		System.out.println(al);
		
		

	}

}
