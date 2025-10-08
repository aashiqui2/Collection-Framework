import java.util.Arrays;
import java.util.Comparator;

public class ArraysLearningDemo {

	public static void main(String[] args) {
		int[] arr= {5,3,10,18,92};
		// boolean[] b={true,false,true};
		System.out.println("Before Sorting");
		for(int n:arr) {
			System.out.print(n+" ");
		}
//		7 primitive types can be sorted but except boolean
		Arrays.sort(arr);
		// Arrays.sort(b);//booolean cannot be sorted
		System.out.println();
		System.out.println("After Sorting");
		for(int n:arr) {
			System.out.print(n+" ");
		}
		
//		String[] name= {"Arul","Viyan","Niraimathi","Kavini"};
		String[] name= {"Kavin","Goku","Arun","Baskar"};
		System.out.println();
		System.out.println("Before Sorting");
		for(String str:name) {
			System.out.print(str+" ");
		}
		Arrays.sort(name);//Object[] but is accept String[] (inheritance)
		System.out.println();
		System.out.println("After Sorting");
		for(String str:name) {
			System.out.print(str+" ");
		}
		System.out.println();

//		Dynamic Binding
		Comparator comp=new ComparatorDemo();
		Arrays.sort(name,comp);
		System.out.println();

		System.out.println("******After Compare method******");
		for(String str:name) {
			System.out.print(str+" ");
		}
	}

}
