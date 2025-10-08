package collection.ArrayListLearning;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		   //Collection of objects -Heterogenous -Homogeneous
		   //1.Resizable Array
		   //2.Heterogenous Object are allowded
		   //3.Data Structure:Growable array.
		   
		
     		// ArrayList l=new ArrayList();
	        //Dynamic Binding
	        List l=new ArrayList(); 
			
	        System.out.println(l.add(5)); // Return boolean
			l.add(10);// Return boolean
			l.add(20);// Return boolean
			l.add(30);// Return boolean
			l.add(40);// Return boolean
			l.add("Ashok");// Return boolean
			l.add(true); // Return boolean //boolean-->Boolean(Wrapper class)
			l.add(5.2f);// Return boolean  //float -->Float(Wrapper class)
			l.add(null);

			// we can add our custom Object as well
			// ArrayListDemo a=new ArrayListDemo();
			// l.add(a);
			
			l.add(1,15); //return void
			l.add("Ashok");// Return boolean
			System.out.println("l1--> "+l);
			System.out.println(l.size());
			System.out.println(l.contains(5));// Return true/false
			System.out.println(l.hashCode());
			System.out.println(l.get(2));// 2 is index
			System.out.println(l.indexOf("Ashok"));// Return index or -1
			System.out.println(l.lastIndexOf("Ashok"));// Return index or -1
			System.out.println(l.remove(0));//index or object
			System.out.println(l);
			System.out.println(l.remove("Ashok"));//object Return true/false
			System.out.println(l);
//			l.clear();
			System.out.println(l);
			System.out.println(l.isEmpty());
			
			
			
			 ArrayList l2=new ArrayList();
			 System.out.println(l2);
			 l2.add(111);//boolean
			 l2.add(222);
			 l2.add(333);
			 l2.add(444);
			 // These are all object like wrapper class
			 l2.addAll(l); // Return true/false
			 l2.addAll(0,l);// Return true/false
			 System.out.println("l2--> "+l2);
			 l2.removeAll(l); // Return true/false
			 System.out.println("l2--> "+l2);
			 l2.retainAll(l);//Removes all l2 instead of l // Return true/false
			 System.out.println("l2--> "+l2);
			 l2.clear();
			
			// alternative of clear()
			// l2.removeAll(l);
			// System.out.println("l2--> "+l2);
			// l2.removeAll(l2);// alternative of clear()
			// System.out.println(l2);
			
			
			 ArrayList l3=new ArrayList();
			 l3.add(100);
			 l3.add("200");
			 l3.add(300);
			 l3.add(400);
			 l3.add(500);
			 l3.add(600);
			 System.out.println(l3.add(600));//boolean true/false
			 System.out.println("l3--> "+l3);
			 System.out.println(l3.set(1,"ABCD"));//replaces element will be print
			 System.out.println("l3--> "+l3);
			 System.out.println(l3.set(50, l3));//IndexOutOfBoundsException
			 List l4=l3.subList(3, 5); //like substring Method(n-1)
			 System.out.println("l4--> "+l4);

			 l4=l3.subList(3, 7);//IndexOutOfBoundsException
			 System.out.println("l4--> "+l4);
			 l4=l3.subList(3, 3);//IndexOutOfBoundsException
			 System.out.println("l4--> "+l4);


	}

}
