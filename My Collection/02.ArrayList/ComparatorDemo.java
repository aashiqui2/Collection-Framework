import java.util.Comparator;
public class ComparatorDemo implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Laptop l1=(Laptop)o1;
        Laptop l2=(Laptop)o2;
        //! for comparing price and gb
        // if(l1.price>l2.price){
        //     return +1;
        // }
        // else if(l1.price<l2.price){
        //     return -1;
        // }
        // else{
        //     if(l1.gb>l2.gb){
        //         return +1;
        //     }
        //     else if(l1.gb<l2.gb){
        //         return -1;
        //     }
        // }

        int  result =l1.brand.compareTo(l2.brand);
        if(result>0){
            return +400;

        }
        else if(result<0){
            return -300;
        }

       return 0;
    }
    
}