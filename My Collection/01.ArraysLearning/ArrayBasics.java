import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayBasics {
    String name;

    public ArrayBasics(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // ? Comparing array Element using equals and ==
        // int[] a={10,20,30};
        // // int[] b=a;
        // int[] b={10,20,30};
        // System.out.println(a.equals(b));
        // System.out.println(Arrays.equals(a, b));
        // System.out.println(a==b);

        // ? Real Logic Behind is
        // int i=0;
        // boolean same=true;
        // while (i<a.length) {
        // if(a[i]!=b[i]){
        // same=false;
        // System.out.println("Not same");
        // }
        // i++;
        // }
        // if(same=true){
        // System.out.println("Both are same");
        // }

        // ! sort using Arrays class (.sort method()) in Ascending order
        // int[] arr = { 20, 10, 30 };
        // Arrays.sort(arr);
        // for (int a : arr) {
        // System.out.println(a);
        // }

        // ! To sort in descending order using Collections class
        // Integer arr1[]={1,2,6,7};
        // Arrays.sort(arr1,Collections.reverseOrder());
        // System.out.println(Arrays.toString(arr1));

        // ! sort in descending order using Comparator
        Integer[] arr = { 1, 2, 3, 4, 5 };

        // ! You can create an instance of an interface using an anonymous class
        // Comparator<Integer> comp = new Comparator<Integer>() {
        // @Override
        // public int compare(Integer a, Integer b) {
        // return b.compareTo(a);
        // }
        // };
        // Arrays.sort(arr, comp);
        // System.out.println(Arrays.toString(arr));

        //! only for external class Implementing Comparator Interface
        Comparator<Object> comp = new ComparatorDemo();
        Arrays.sort(arr, comp);
        System.out.println(Arrays.toString(arr));

        // String[] names={"vishaal","suriyakanth","arun","gopal"};
        // Arrays.sort(names);
        // for (String a : names) {
        // System.out.print(a+" ");
        // }

        //! using Comparator sorting
        // String[] names={"vishaal","suriyakanth","arun","gopal"};
        // Comparator comp=new ComparatorDemo();
        // Arrays.sort(names,comp);
        // System.out.println("Using Comparator Interface -Sorting");
        // for(String name : names) {
        // System.out.print(name+" ");
        // }

        // ArrayBasics a1=new ArrayBasics("Arun");
        // ArrayBasics a2=new ArrayBasics("Suriya");
        // ArrayBasics a3=new ArrayBasics("Vikash");

        // ArrayBasics[] ab={a1,a2,a3};
        // Arrays.sort(ab);//java.lang.ClassCastException:
        // for(ArrayBasics e:ab){
        // System.out.println(e);
        // }
    }
}
