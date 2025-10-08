import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put("Suriyan",100);
        hm.put("Nithya",102);
        hm.put("arun",103);
        System.out.println(hm.containsKey("arun"));
        System.out.println(hm.containsValue(100));
        System.out.println(hm);
        Set s=hm.keySet();
        System.out.println("Key are "+s);
        Collection c=hm.values();
        System.out.println("Values are "+ c);
        Set s2=hm.entrySet();
        System.out.println("Entrys are "+ s2);
        Iterator i=s2.iterator();
        while(i.hasNext()){
            // System.out.println(i.next());//print Object class Object
            Map.Entry me=(Map.Entry)i.next(); //typecasted to Map.Entry Object
            if(me.getKey().equals("arun")){
                me.setValue(2000);
                System.out.println(me.getKey()+" : "+me.getValue());
            }
            System.out.println(me);
        }

    }
}
