import java.util.ArrayList;

import java.util.Iterator;

public class CursorsDemo1 {
    public static void main(String[] args) {
        ArrayList names=new ArrayList();
        names.add("vishal");
        names.add("suriyan");
        names.add("nithya");
        names.add("suresh");
        names.add(5);
        System.out.println(names);
        Iterator i=names.iterator();//returns Iterator

        // single directional cursor(has next())
        while(i.hasNext()){        
            System.out.println(i.next());
            // i.remove();//remove all Object after printing using i.next()
            // if(i.next().equals(5)){
            //     i.remove();
            // }
        }
        i.remove();//remove an element from last
        System.out.println(names);
    }
}
