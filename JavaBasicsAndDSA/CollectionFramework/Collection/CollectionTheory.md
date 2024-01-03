 **1.Data Structures** : It is the way of storing data in most efficient (Time an space) way possible.

 **2.Collection framework** is a predefined api that contains classes and methods which is used to store multiple data.


 **3.Array vs collection framework**. why we needed collection framework if we already had array? 
  -Array can store both primitve(int,float,char etc) and non-primitive(objects) datatypes.                                                  int [] arr = new int[4];    //primitive                               ```java
  Class Test{                                                          
    //block of code
  }
  ```

 ```java
 Test t= new Test();     //non-primitive
 -Collection framework only stores the non-primitive(object) datatypes.
 ArrayList arr = new ArrayList();
 arr.add(obj);
 arr.add(10);             //these are not primitve data types actually
 arr.add('d');        //these are objects of INTEGER and CHARACTERS.
 ```                 
 -Array can't have heterogeneous(different) data types.
 Collection can have heterogeneous data types.
 -Array have a fixed size and we cannot increase or decrease the size during run time.
 Collection doesn't have a fixed size and we can increase or decrease the size during run time.

 **3.List vs Set**
 **list**
 1.It works on indexed based data structure.
 2.It accepts duplicate values.
 3.It can accept more than one null values.
 4.we can fetch data from list using both Iterator and ListIterator.
 5.It follows insertion order. i.e it gives output as we inserted values
    for ex- List li = new ArrayList();
    li.add(10);
    li.add(20);
    li.add(30);
    li.add(40);
    sout(li);                   //output= [10,20,30,40]

    //fetching data using iterator and ListIterator
    Iterator it = li.Iterator();
    while(it.hasNext()){
        sout(it.next());
    }
                  

    ListIterator lit =  li.ListIterator();
    while(lit.hasNext()){
        sout(lit.next());
    }

  **set**
  1.It works on hascode(object unique integer value) value.
  2.It doesn't accept duplicate values.
  3.It can't accept more than one null values.
  4.we can fetch item only using Iterator.
  5.It doesn't follow insertion order.i.e output could be unordered.
    for ex- Set se= HashSet();
     se.add(10);
     se.add(20);
     se.add(30);
     se.add(40);
     sout(se);                         //output= [30,10,40,20]

     //fetching data using iterator in set is same as list.

  **4.Iterator vs ListIterator vs Enumeration (Cursors to retrieve items)**

   **Iterator**
   1.we can get Iterator cursoe by iterator() method.
     Iterator it = li.iterator();
   1.Iterator can be used in all the collection object.
   2.It has following methods like hasNext(),next(),remove().

   **ListIterator**
   1.we can get ListIterator cursor by ListIterator() method.
      ListIterator lit =  li.ListIterator();
   2.ListIterator can only be used by those which implements the list interface.
   3.It has following methods like hasNext(),next(),previous(),hasPrevious(),remove().

   **Enumeration**
   1.We can get Enumeration cursor by element() method.
   2.We can Enumeration only in the legacy classes i.e vector and stack.
   3.It has following methods like hasMoreElements(),nextElement().

   **5.List**
   **a.ArrayList**
  1.ArrayList is a class which implements List Interface.
    Class ArrayList implements list{
        //block of code
    }
    ArrayList al = new ArrayList();      //initial capacity is 10.
    ArrayList al = new ArrayList(6);     //we fixed the initial capacity to 6.

  2.Array are of fixed size whereas ArrayList are resizable.i.e we can add items during runtime.  //only difference is this
  3.ArrayList supports duplicate items.    //these are similar to list
  4.ArrayList supports more than one null values.
  5.Arraylist follows insertion order.
  6.ArrayList can store heterogeneous data types.
  7.ArrayList doesn't follow sorting order.
  8.ArrayList are non-synchronized collection. i.e Multiple threads accessing the same methods.
  9.Indexed Based Data Structures.


  **b.LinkedList**
  1.LinkedList is a class which implements List Interface and Deque Interface.
    Class LinkedList implements list{
        //block of code
    }
  2.The underlying data structures of linkedlist is "circular linked list" or "doubly linked list" i.e *it is briefly shown in figure workingoflinkedlist*
  3.|previous node address | element | next node address|
  4.LinkedList supports more than one null values.
  5.LinkedList follows insertion order.
  6.LinkedList can store heterogeneous data types.
  7.LinkedList doesn't follow sorting order.
  8.LinkedList are non-synchronized collection. i.e Multiple threads accessing the same methods.
  9.Indexed Based Data Structures.
  10.It definitly has all the methods of collection and list interface and Deque Interface. Besides it has addFirst(),addLast(),removeFirst(),removeLast(),getFirst(),getLast().


  **ArrayList vs LinkedList**
  1.Array are good for retrieval operations whereas LinkedList are good for insertion and deletion operation.

  **c.Legacy Classes**
   Are those classes which were introduced in java 1.0,and were re-engineered to adapt to the collection framework whixh were introduced in java 1.2 

  **1.Vector**
  Vector is all similar to ArrayList.The only point is vectors are *synchornized*.so we can say vectors are thread safe.
  In ArrayList we can get the new capacity vy using formula
   New Capacity = (Old Capacity * 3)/2 +1;
  But in Vector,
   New Capacity= (Old Capacity *2); 

  **-Stack**
  1.Also a indexed based data structure.
  2.Stack is a legacy class which extends vector class.
   class Stack extends Vector{
    //block of code
   }
  3.Stack follows the LIFO (Last In First Out) rule.
  4.It has only one constructor Stack(); and different methods like pop()(it retrieves the last element and removes it),push(),peek()(it retrieves the last element and doesn't remove it),search().


  **6.set**
   **a.HashSet**
   1.HashSet is a implemented class of set interface.
   class HashSet implements Set{
    //block of code
   }
   2.HashSet underlying data structure is "### HashTable" and backed by ### map.
   //All other properties are similar to set.

   **-LinkedHashSet**
   1.When iterating through a HashSet the order is unpredictable, while a LinkedHashSet lets us iterate through the elements in the order in which they were inserted.
   2.class LinkedHashSet extends HashSet{
    //block of code
   }
   3.Contains unique elements only like HashSet. It extends the HashSet class and implements the Set interface.
   4.Maintains insertion order.

   **b.SortedSet**
    Set<------SortedSet<-----NavigableSet<-----TreeSet
        extends         extends           implements
    1.This interface contains the methods inherited from the Set interface and adds a feature that stores all the elements in this interface to be stored in a sorted manner. 
    2.interface SoretdSet extends Ser{
      //block of code
    }
   **-NavigableSet**
    1.It behaves like a SortedSet with the exception that we have   navigation methods available in addition to the sorting mechanisms of the SortedSet. 
    2.the NavigableSet interface can navigate the set in reverse order compared to the order defined in SortedSet. A NavigableSet may be accessed and traversed in either ascending or descending order
    3.interface NavigableSet extends SortedSet{
      //block of code
    }   
    
   **TreeSet**
   1.TreeSet implements Navigable Set.
   2.class TreeSet implements NavigableSet{
      //block of code
    }
   3.TreeSet has a underlying data structures called "Balance Tree"
   4.TreeSet doesn't accept null values.
   5.TreeSet datatypes are homogeneous.(Same type)
   6.TreeSet doesn't accept duplicate values.
   7.It follows the sortig order.
   8.It is non-synchronized.


   **7.Queue**
   

    


    


    

  
   
    

    




     






   










     



 
 

  

