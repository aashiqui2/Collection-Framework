import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add('y');
        al.add('c');
        al.add('b');
        al.add('t');
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        //! Syntax
        // Collections.binarySearch(List, key);
        // Collections.binarySearch(List, Key, c);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);

        System.out.println(Collections.binarySearch(al,'c'));//return index

        // !if unsucessfull means return the position to be inserted c after d so 3rd position
        // System.out.println(Collections.binarySearch(al, 'd'));
    }
}
