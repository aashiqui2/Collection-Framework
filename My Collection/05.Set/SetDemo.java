import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {
    public static void main(String[] args) {
        // HashSet hs=new HashSet();//no order is maintained
        LinkedHashSet hs=new LinkedHashSet();//insertion order is maintained
        hs.add("5");
        hs.add("10");
        hs.add("100");
        hs.add("53");
        hs.add("105");
        System.out.println(hs.add("105"));
        System.out.println(hs);
    }
}
