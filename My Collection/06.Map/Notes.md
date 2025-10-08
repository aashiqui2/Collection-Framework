Map:
Interface in Collection Framework
Not a sub interface of Collection Interface

-Representing the group of Object --> Key : value pair

-No duplicate key are allowded
-Duplicate values are permitted
--.Key- value pair is known as `Entry`

Rollno  name
1        raja
2        raja


Map(I)                     SortedMap(I)-->NavigablSortedMap(I)--TreeMap(c)


HASHMAP

LinkedHashMap


-identityhashMap

-weakHashMap


Interface Map<K,V>
Type Parameters:
K - the type of keys maintained by this map
V - the type of mapped values

* An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
* This interface takes the place of the Dictionary class, which was a totally abstract class rather than an interface.

Key --Group--KeySet

Values -List,set(Collection of values).

The Map interface provides three collection views, which allow a map's contents to be viewed as a set of keys, collection of values, or set of key-value mappings. 

Some map implementations, like the TreeMap class, make specific guarantees as to their order; others, like the HashMap class, do not.

Nested class --inner class

Nested Interface--inner interface


Map.Entry

# Methods in Map
* Object put(object Key,Object value)
* void putAll(Map M)
* Object get(Object key)
* Object getAll(Object key)
* boolean containsKey(Object key)
* Object getorDefault(key,0);
* boolean containsValue(Object value)
* int size()
* boolean isEmpty()
* void clear() 

# Collection views of Map:
Set keySet()
Collection values
Set entrySet()

Entry:(I)
-Each key-value pair is known as Entry

Interface Map.Entry<K,V>

Enclosing interface:
Map<K,V>

`The Map.entrySet method returns a collection-view of the map, `

Entry-->getKey(),getValues(),setValues()

HashMap
DS.HashTable
No Insertion order
Null key is allowded once
Null value are multiple 

LinkedHashMap
LinkedList + HashTable
Insertion order is maintained

TreeMap:
DS:Red-Black-Tree
No insertion order
Sorting -Based on Keys
Heterogenous Objects

TreeSet ts= new TreeSet();
==>classCastException


hashMap DS is HashTable


map(I)-->hashMap(c),HashTable(C)


hashTABLE

1.KEY,VALUE
2.UNDERLYING DS (hashtable,hascode)

hashmap
1.non synchronized
2.multithread allowded
3.not thread safe
4.performance fatser
5.(key,value)-null will be allowed once as key and null will be accepted multiple times as value 


hashtable(legacy class)
1.synchronized(at a time one thread is alowded)
2.thread safe
3.performance poor
4.null cannot be accepted as key or value




