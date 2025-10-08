java.util.Arrays Class

Class -System,Scanner,String

non-primitive Datatypes- Class(all classes are non primitive datatypes).

Arrays.sort(Object[] arr)

java.lang.Object-Parent class

Inheritance -An object behaving as another class Object

Parent - Child extends Parent - ch(obejct i child)

Marriage invitation -Parent - child
so if the parent cannot attend the marriage parent sent child

Method Overloading 
-sort(primitive[] ar)
-sort(Object[] o)

java.util.Arrays

1) String -Descending Order
2) String -Ascending Order -length
3) String -Descending Order -length

compare(name[0],name[1])
{

}

Comparator -Interface -set of Rules
the type ComparatorDemo must implement the inherited abstract method Comparator.compare(Object, Object)

obj1.equla(obj2)->boolean true/false
equals return true/false

 
`To sort the array by length wise Ascending`

```java
import java.util.Comparator;
public class ComparatorDemo implements Comparator {
	//The type ComparatorDemo must implement the inherited abstract method 
	//Comparator.compare(Object, Object)

	@Override
	public int compare(Object o1, Object o2) {
		// Type casting
		// String s1=(String)o1;
		// String s2=(String)o2;

		// Alternative way
		String s1 = o1.toString();
		String s2 = o2.toString();
		System.out.println(s1);
		System.out.println(s2);
		if (s1.length() > s2.length())
		{
			return +1;//we can give any postive numbers
		} else if (s1.length() < s2.length())
		{
			return -1;
		} 
		else 
		{
			return 0;	
		}
	}
}
```

`To sort the array by length wise descending`

```java
import java.util.Comparator;
public class ComparatorDemo implements Comparator {
	//The type ComparatorDemo must implement the inherited abstract method 
	//Comparator.compare(Object, Object)

	@Override
	public int compare(Object o1, Object o2) {
		// Type casting
		// String s1=(String)o1;
		// String s2=(String)o2;

		// Alternative way
		String s1 = o1.toString();
		String s2 = o2.toString();
		System.out.println(s1);
		System.out.println(s2);
		if (s1.length() > s2.length())
		{
			return -1;
		} else if (s1.length() < s2.length())
		{
			return +1;
		} 
		else 
		{
			return 0;	
		}
	}
}
```
class Mobile
{
  Mobile samsung=new Mobile("ABCD",8,32,10000,8);
  Mobile vivo=new Mobile("PQRS",6,32,11000,8);
  Mobile oppo=new Mobile("QWER",8,64,9000,10);

  Mobile[] mob={samsung,vivo,oppo};
  Arrays.sort(mob,comp);
  compare(Object o1,Object o2)
  {
    Mobile m1=(Mobile) o1;
    Mobile m2=(Mobile) o2;
    if(m1.price>m2.price)
    {
        return +10;
    }
    else if(m1.price<m2.price)
    {
        return -50;
    }
    else{
        return 0;
    }
  }
}






