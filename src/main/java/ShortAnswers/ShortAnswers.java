package ShortAnswers;

public class ShortAnswers {
    /*
    1. Describe the Collections Type Hierarchy. What are the main interfaces and what are the differences between them?
        Collection Type Hierarchy: The collection framework is made up of interfaces and classes. Each class and
        interface are extended/implimented from another class or interface. The Iterable interface is at the highest level
        and all classes and interfaces derive from the iterable interface.
        What are the main interfaces and what are the differences between them: There are five main interfaces:
            1. Iterable: Contains the iterator() method, which in turn instantiates the iterator object. This object
                allows us to iterate over the elements of the collection
            2. Collection: Extends the Iterable interface. "It provides the basic operations for adding and
                removing elements in the collection"
            3. List: Extends the Collection interface. Represents a collection of elements whose elements are arranged
                sequentially ordered. It retains the order the elements were added, and the same sequence we will get
                while retrieving elements. Is able to insert elements into the list at any location.
            4. Set: Extends the Collection interface. Represents a collection of elements that contains unique elements.
                Which means no two elements are the same object type. Since each element is unique, it does not maintain
                any order. It searches via object type instead of element number.
            5. Queue: Extends the Collection interface. When new elements are added, they are added at the end. So no
                inserting elements in the middle. It uses the FIFO order (first in first out). So new elements are added
                at the end, and it only removes elements at the front.
     2. What are List inteface implementations and what are the differences between them and when to use what?
        The list implimentations are: ArrayList, LinkedList, Vector
            1. ArrayList: A resizable array that can grow or shrink in  the memory based on what is needed.
            2. LinkedList: A linear data structure. It has a group of nodes (its elements are called nodes).
                Each node has a sequence, and elements are stored in the sequence. Each node has three fields: a data
                field and two pointers to point to the next and previous nodes on the list. Does not need consecutive
                memory to store its data.
            3. Vector: Similar to the arrayList, it is sychronized and cannot have two threads access the objects at
                the same time. This is perfect for multi-threaded applications.
     3. What are Queue interface implementations and what are the differences and when to use what?
        The Queue implimentations are PriorityQueue and LinkedList:
            1. PriorityQueue: Instead of FIFO, a priority queue allows you to assign a priority number to each element
                in the queue. You can insert an element in the queue in whatever order, and when you remove from the
                que, it will remove the element with the highest priority.
            2. LinkedList: Implements the Deque interface. See linkedList above.
     4. What are Set interface implementations and what are the differences and when to use what?
        https://www.geeksforgeeks.org/difference-and-similarities-between-hashset-linkedhashset-and-treeset-in-java/
        The Set implimentations are the HashSet, LInkedHashSet and TreeSet.
            1. This implements the set interface and is backed by a hash table (internally uses a hash map)
                Use when we need to access elements randomly. Don't care about insertion order.
            2. LinkedHashSet: Uses a linked hashmap internally to store objects. Use it when if you want to keep track
                of insertion order. Slower than Hashset
            3. TreeSet: Similar to linkedhashset. But is has comparitive  methods/elements. Use it if you need some
                Comparator requirements.
     5. Explain the structure of the Deque implementation of LinkedList and its usage.
        The Deque is similar to a queue, but instead of first in first out. You can add AND remove from both the front
        of the line and the back of the line. Implementing the LinkedList allows you to add/remove from the front and
        back of the line.
     6. What are the differences between HashMap, HashTable, LinkedHashMap and TreeMap
        The hash map stores data. Specifically, it maps a key (like an instance of a catagory) to a value. The main
        difference between the two is hashmap is not threadsafe whereas hashtable is threadsafe.
        The LinkedHashmap keeps track of insertion order. Whereas Hashmap/Hashtable doesn't keep track of insertion
        order.
        The Treemap is like the LinkedHashMap but it also has a comparator method.
     7. What is the hashCode() and equals() function
        The hashCode methode is an function that can convert a string, or even an object into a number. In Theory, if two
        objects/strings or items are exactly the same, then the hashcodes will be the same. The equal function compares
        the hashcode number to determine if two objects are the same. Using this methode is quicker for comparison
        reasons.
     8. How is hashmap implemented in Java? How does its implemenetation use hashcode and equals methods of objects?
        What is the time completexity of putting and getting an element from such structure?
            1. The hashmap impliments the map interface.
            2. The map doesn't store strings (or other types) in its Keys. It stores the hashcode instead. When searching
                for a specific object/string in the hashmap, it will use the equals() and compare all hashcodes to find
                it.
            3. The time complexity is O(1)... whatever the hell that means.
     9. What is Comparable and Comparator Interface? What are differences between them and how to use them.
        1. Comparable: Capable of comparing itself with another object. It can take a property of list of objects, and
            sort them by the property. The method for sorint is inside the object.
        2. Comparator: Is its own class. The collection object has its own sort methode for using with the comparator.
     10. What is Iterator? Why do we need iterator?
        It is used to cycle through arguments or elements  in a collection. It loops through collections. We need it to
        find anything in a collection.
     11. What is a functional interface? How do you create your own Functional Interface?
        Its an interface with only one abstract method to represent a function. You can create one by writting a single
        methode interface.
     12. What is lambda expression? They express instances of functional interfaces
     13. What is the Stream API in Java 8?

     */

}
