import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        Laptop dell = new Laptop("Inspiron",50000, 6, false);
        Laptop lenova = new Laptop("Ideapad",50000, 8, false);
        Laptop hp = new Laptop("Pavilion",55000, 10, true);

        ArrayList laptopList=new ArrayList();
        laptopList.add(lenova);
        laptopList.add(dell);
        laptopList.add(hp);
        //! This will call compareTo()internally from Comparable interface
        Collections.sort(laptopList);
        System.out.println("Before sorting "+ laptopList);


        ComparatorDemo comp=new ComparatorDemo();
        //! This will call compare() internally from Comparator interface
        Collections.sort(laptopList, comp);
        System.out.println("After sorting "+ laptopList);
        Collections.reverse(laptopList);
        System.out.println(laptopList);
        Collections.shuffle(laptopList);
        System.out.println("Shuffled list");
        System.out.println(laptopList);
        
    }
}

//! this is a example of flikart shorting(filtering) the object byt it properties