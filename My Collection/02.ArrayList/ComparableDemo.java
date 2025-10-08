import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Mobile> mobiles = new ArrayList<>();

        mobiles.add(new Mobile("Samsung S21", 69999, 128, true));
        mobiles.add(new Mobile("iPhone 13", 79999, 128, true));
        mobiles.add(new Mobile("OnePlus Nord", 29999, 256, true));
        mobiles.add(new Mobile("Redmi Note", 15999, 64, false));

        // Sort using compareTo() defined in Mobile
        //! sort() internally calls compareTo() inside Comparable but we have overrided the method in Mobile class
        Collections.sort(mobiles);

        for (Mobile m : mobiles) {
            System.out.println(m);
        }
    }

}
