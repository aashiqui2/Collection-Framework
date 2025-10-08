No duplicates

No order maintained

Set(Interface)               Sorted set(I)
 --HashSet                     NavigableSet
 --LinkedHashSet              -->TreeSet
               


---DS: HashTable
HashCode -Hashing Algorithm

int a=10;
Auto Boxing:
Converting primitive datatype variable into corresponding wrapper class Object
Integer i=a;

Auto unBoxing:
Converting wrapper class Object into corresponding primitive datatype variable 
int b=i;

when we want to maintain order in set we can move to sortedset(interface) which is subinterface of set.

searching of element is faster

no index concept is here

hascode concept will be used.
searching will be faster
initial size of hashset is 16.


load factor///fill ratio  0.75

when it reaches 75% of the hashSet it will create an new hashset with default size of 16 and move it to the new hash set.
