import java.util.ArrayList;
import java.util.TreeSet;

public class GenericDemo {
    public static void main(String[] args) {
        int[] ar=new int[4];
        ar[0]=5;
        ar[1]=10;
        // ar[2]=1.4;
        ar[3]=4;
        //There is no type satety in collection
        TreeSet ts=new TreeSet();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add((int)1.5);
        System.out.println(ts);

        // TreeSet ts1=new TreeSet();
        TreeSet<Integer> ts1=new TreeSet<Integer>();
        ts1.add(1);
        ts1.add(2);
        ts1.add(3);
        // ts1.add((int)1.5);
        ts1.add((int)1.5);
        System.out.println(ts1);

        ArrayList<String> al=new ArrayList<String>();
        al.add("Muthu");
        // al.add(10); //cannot add other object becaue the arraylist type of String

        GenericDemo gd=new GenericDemo();
        gd.add(al);

    }
    public void add(ArrayList<String> al){
        // al.add(10);
    }
}
