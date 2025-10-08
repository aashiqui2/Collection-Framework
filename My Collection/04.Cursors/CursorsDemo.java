import java.util.ArrayList;

public class CursorsDemo {
    public static void main(String[] args) {
        String[] s={"vishal","suriyan","nithya"};
        // it is a example of cursor(foreach loop)
        for(String name:s){
            System.out.print(name+" ");
        }
        ArrayList names=new ArrayList();
        names.add("vishal");
        names.add("suriyan");
        names.add("nithya");
        names.add("suresh");

        //! error: incompatible types: Object cannot be converted to String
        for(Object name:names){
            System.out.print(name+" ");
        }
        //! Drawback of forEach Loops
        // 1.Only forward direction
        // 2.Cannot modify the content of the Collection
    }
}
