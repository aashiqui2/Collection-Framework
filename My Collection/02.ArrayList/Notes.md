(advance java)
framework: spring, springboot, hibernate

(core java)
collections:
framework:
interfaces  -->classes
methods

programming efficiency
performace good


# Example 
GEOMETRY BOX--> PENCIL,PEN,SCALE,RUBBER
BUREAU --> Dress,shirt,pants

box,bag,purse

# collection :
* A collection is an object that represents a group of objects.
* A collections framework is a unified architecture for representing and manipulating collections, enabling collections to be manipulated independently of implementation details.

* `Reduces programming effort` by providing data structures and algorithms so you don't have to write them yourself.

* `Increases performance` by providing high-performance implementations of data structures and algorithms. Because the various implementations of each interface are interchangeable, programs can be tuned by switching implementations.

* `Fosters software reuse` by providing a standard interface for collections and algorithms with which to manipulate them.

* `Collection interfaces.` Represent different types of collections, such as sets, lists, and maps. These interfaces form the basis of the framework.

* `General-purpose implementations.` Primary implementations of the collection interfaces.

* `Legacy implementations.` The collection classes from earlier releases, Vector and Hashtable, were retrofitted to implement the collection interfaces.

* `Special-purpose implementations.` Implementations designed for use in special situations. These implementations display nonstandard performance characteristics, usage restrictions, or behavior.

* `Concurrent implementations.` Implementations designed for highly concurrent use.

* `Wrapper implementations.` Add functionality, such as synchronization, to other implementations.

* `Convenience implementations.` High-performance "mini-implementations" of the collection interfaces.

* `Abstract implementations.` Partial implementations of the collection interfaces to facilitate custom implementations.

* `Algorithms.` Static methods that perform useful functions on collections, such as sorting a list.

* `Infrastructure.` Interfaces that provide essential support for the collection interfaces.

* `Array Utilities.` Utility functions for arrays of primitive types and reference objects. Not, strictly speaking, a part of the collections framework, this feature was added to the Java platform at the same time as the collections framework and relies on some of the same infrastructure.

package : java.util.*;

# Collection Interfaces
The collection interfaces are divided into two groups. The most basic interface, `java.util.Collection,` has the following descendants:

* java.util.Set
* java.util.SortedSet
* java.util.NavigableSet
* java.util.Queue
* java.util.concurrent.BlockingQueue
* java.util.concurrent.TransferQueue
* java.util.Deque
* java.util.concurrent.BlockingDeque

these are all interfaces but sub interfaces

# The other collection interfaces are based on `java.util.Map `
* java.util.SortedMap
* java.util.NavigableMap
* java.util.concurrent.ConcurrentMap
* java.util.concurrent.ConcurrentNavigableMap

# collection superinterface is `Iterable<E>` -looping
`public interface Collection<E> extends Iterable<E>`

# Collection:
# Set
* No duplicate elements allowed
* No order is maintained

# List:Grosery List
* Duplicate elements are allowed
* insertion order is maintained

A collection represents a group of objects, known as its elements. Some collections `allow duplicate` elements and `others do not`. Some are `ordered` and others `unordered`.

-Grocery Items-->duplicates
-Hotel-->Order
-Dress -->unordered

ABC implments Collection(nope)

ABC implments Set
ABC implments List


# The JDK does not provide any `direct implementations of this interface`: 
# It provides implementations of more specific `subinterfaces` like Set and List.


# List
`public interface List<E> extends Collection<E>`
* An ordered collection (also known as a sequence). 
* The user of this interface has precise control over where in the list each element is inserted.
* The user can access elements by their integer index (position in the list), and search for elements in the list.
* Unlike sets, lists typically allow duplicate elements.

# ArrayList:
Resizable-array implementation of the List interface. Implements all optional list operations, and permits all elements, including null. In addition to implementing the List interface, this class provides methods to manipulate the size of the array that is used internally to store the list. (This class is roughly equivalent to Vector, except that it is unsynchronized.)

# Method in ArrayList
* add(Object e)
* add(index i,Object e)
* size()
* contains(Object e)
* hashCode(Object e)
* remove(index i)
* remove(Object e)
* get(index)
* indexOf(Object e)
* lastIndexOf(Object e)
* isEmpty()
* addAll(Object l)
* removeAll(Object l)
* set(index i,Object e)
* subList(startIndex i,endIndex i)
* clear()
* clone()


# Object -->java.lang.Object class

java -->Object -->Base class --> static,non-static,local,object,method,method-overloading,sub classes,extends.

Arun S/o gopal

Arun extends AdamEve

we cannot go upto some generation like father grandfather,great grandfather,greatgreatgrandfather.

Inheritance??
An object class one class act as object of another class.

private method methodand properties cannot accessibale by child

we can acces the `Object` class method by doing like this:
```java
Abc abc=new Abc();
abc.(mehods)
```

`By default` the every class in java are `subclass of Object class` in java.

ArrayList:
1) Data Retrival is faster(Advantage)
2) Insertion and deletion of elements at first and middle position need more shift operation.(Disadvantage)

LinkedList:
1) Element Insertion/Deletion is faster.
2) Element retrival is not faster.

`The default size of array list is 10`

when we exceed the default size
A new object is created with size 10 and all the array element are copied to the new obejct and the 11th element is copied to the new object as well.




