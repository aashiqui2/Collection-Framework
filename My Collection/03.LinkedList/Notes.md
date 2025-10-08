ArrayList:
1) Data Retrival is faster(Advantage)
2) Insertion and deletion of elements at first and middle position need more shift operation.(Disadvantage)

LinkedList:
1) Element Insertion/Deletion is faster.
2) Element retrival is not faster.

# Method in ArrayList
* add(Object e)
* add(index i,Object e)
* addFirst(Object e)
* addLast(Object e)
* size()
* contains(Object e)
* hasCode(Object e)
* remove(index i)
* remove(Object e)
* removeFirst(Object e)
* removeLast(Object e)
* get(index)
* indexOf(Object e)
* lastIndexOf(Object e)
* isEmpty()
* addAll(Object l)
* removeAll(Object l)
* set(index i,Object e)
* subList(startIndex i,endIndex i)
* clone(Object e)
* poll() (same as removefirst)
* pollFirst() (same as removeFist)
* pollLast() (same as removeLast)
* offer(Object e) (same as addFirst)
* offerFirst(Object e) (same as addFirst)
* offerLast(Object e) (same as addLast)
* clear()


Collection(I)---->List(I)
Collection(I)---->Set(I)
Collection(I)---->Queue(I)--->Deque(I),Blocking quue(I),Blockingdeque(I)

Queue(I)-->Priorityqueue(C),Linkedlist(C)

List(I)-->ArrayList(C)
List(I)-->LinkedList(C)<-----Deque(I)


public class LinkedList<E>
extends AbstractSequentialList<E>
implements List<E>, Deque<E>, Cloneable, Serializable


