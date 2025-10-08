import java.util.ArrayList;
import java.util.ListIterator;

public class CursorsDemo2 {
    public static void main(String[] args) {
        ArrayList names=new ArrayList();
        names.add("vishal");
        names.add("suriyan");
        names.add("nithya");
        names.add("suresh");
        names.add(5);
        // Laptop l=new Laptop();
        // names.add(l);
        Laptop l=new Laptop("Dell",123,345,true);
        names.add(l);
        Laptop l1=new Laptop("Dell",123,345,true);
        names.add(l1);

        System.out.println(names);

        // Bidirectional cursor
        // can move forwrd and backward
        ListIterator li= names.listIterator();
        // li.hasPrevious()
        // li.previous()
        
       li.add("arun");//the cursor is standing at first so this will add first

       while(li.hasNext()){
        // if(li.next().equals(5)){
        //     li.set(100);
        // }
        if(li.next().equals(l1)){
            li.set(100);
        }
       }
       System.out.println(names);

    }
}
