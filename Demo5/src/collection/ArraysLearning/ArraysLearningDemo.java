package collection.ArraysLearning;

import java.util.Arrays;
import java.util.Comparator;
public class ArraysLearningDemo {
    String name;
    public ArraysLearningDemo(String name) {
       this.name=name;
    }

    public static void main(String[] args) {
        int[] a={10,20,30};
        int[] b={10,20,30};
        // int[] b=a;
        System.out.println(a.equals(b));
        // System.out.println(Arrays.equals(a, b));
        // System.out.println(a==b);

        // Real Logic Behind is
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

        // int[] arr = { 20, 10, 30 };
        // Arrays.sort(arr);
        // for (int a : arr) {
        //     System.out.println(a);
        // }

        String[] names={"vishaal","suriyakanth","arun","gopal"};
        // Arrays.sort(names);//Ascending order
        Comparator comp=new ComparatorDemo();
        Arrays.sort(names,comp);
        System.out.println("Using Comparator Interface -Sorting");
        for (String name : names) {
            System.out.println(name);
        }

//        ArraysLearningDemo a1=new ArraysLearningDemo("Arun");
//        ArraysLearningDemo a2=new ArraysLearningDemo("Suriya");
//        ArraysLearningDemo a3=new ArraysLearningDemo("Vikash");
//
//        ArraysLearningDemo[] ab={a1,a2,a3};
//        Arrays.sort(ab);//java.lang.ClassCastException:
//        for(ArraysLearningDemo e:ab){
//            System.out.println(e);
//        }
    }
}

