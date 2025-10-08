Collection -Collection of object
Collection --Framework
1) Interfaces
2) Classes
3) Data Structure

Array -Collection of similar datatype

# Arrays Class
------
1) Package--java.util.Arrays

`public class Arrays extends Object`

* This class contains various methods for manipulating arrays `(such as sorting and searching)`. 
* This class also contains a static factory that allows arrays to be viewed as lists.
(derived from c so static factory).

* This class is a member of the `Java Collections Framework.`

* The collections framework is a unified architecture for representing and manipulating collections.

* It reduces programming effort while increasing performance. 

* The framework is based on more than a dozen collection interfaces.

* It includes implementations of these interfaces and algorithms to manipulate them.

```java
public class test {
    public static void main(String[] args) {
        int[] a={10,20,30};
        int[] b={10,20,30};
        System.out.println(a.equals(b));
        String s1="abc";
        String s2=new String("abc");
        System.out.println(s1.equals(s2));
    }
}
```
# Summary of Differences
* `Array Comparison (a.equals(b))`: Checks if a and b are the same object (reference equality). It returns false for different objects even if they have the same contents.

* `String Comparison (s1.equals(s2))`: Compares the actual contents of the strings (value equality). It returns true if the contents are identical.

# Arrays.equals(Object o1,Object o2) --static method
```java 
import java.util.Arrays;
public class test {
    public static void main(String[] args) {
        int[] a={10,20,30};
        int[] b={10,20,30};
        System.out.println(Arrays.equals(a, b));

        // Real Logic Behind is
        int i=0;
        boolean same=true;
        while (i<a.length) {
            if(a[i]!=b[i]){
                same=false;
                System.out.println("Not same");
            }
            i++;
        }
        if(same=true){
            System.out.println("Both are same");
        }
    }
}
```
```java
ArrayBasics a1=new ArrayBasics("Arun");
ArrayBasics a2=new ArrayBasics("Suriya");
ArrayBasics a3=new ArrayBasics("Vikash");

ArrayBasics[] ab={a1,a2,a3};
Arrays.sort(ab);
for(ArrayBasics a:ab){
    System.out.println(a);
}
```
------------------------------------------------------------------------------------
Exception in thread "main" java.lang.`ClassCastException`: class ArrayBasics cannot be cast to class java.lang.Comparable (ArrayBasics is in unnamed 
module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
        at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
        at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
        at java.base/java.util.Arrays.sort(Arrays.java:1042)
        at ArrayBasics.main(ArrayBasics.java:37)
------------------------------------------------------------------------------------

`when we want to compare userdefined object we need to say to jvm that our object is comparable object by using comparator object.`

when we want to decide sorting in our own way we can use Comparator

Comparator- Interface

package--java.util.Comparator;

java.lang.Object

Object is the base class of all the classes in java.

Type Casting- Types
* upcasting -( Widening Type Casting)
* Downcasting -( Narrowing Type Casting)

To compare two object we have `equals()` method
but it return true or false(same or not same)

so, we have have `compareTo()` method

int compareTo(T o)
Compares this object with the specified object for order. 
`Returns a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.`

String[] array -Lexicographical Order(Dictonary Order)

java.util.Arrays

1) String -Descending Order
2) String -Ascending Order -length
3) String -Descending Order -length



