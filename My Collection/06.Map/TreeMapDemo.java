import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();
        tm.put(101,"muthu");
        tm.put(102,"gokul");
        tm.put(103,"rahul");

        TreeMap tm2=new TreeMap();
        tm2.putAll(tm);
        System.out.println(tm2);
    }
}
