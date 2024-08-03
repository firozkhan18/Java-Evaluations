
classDiagram
    direction LR
    classA --|> classB : Inheritance
    classB --* classC : Composition
    classC --o classD : Aggregation
    classD --> classE : Association
    classF -- classG : Link(Solid)
    classG ..> classH : Dependency
    classH ..|> classI : Realization
    classI .. classJ : Link(Dashed)
    
The Collection in Java is a framework that provides an architecture to store and manipulate a group of objects.
 
All the operations that you perform on data such as searching, sorting, insertion, manipulation, deletion, etc. can be achieved by Java Collections.
 
Collection Framework defines several classes and interfaces to represent a group of objects as a single unit. Collections are used to store, retrieve, manipulate, and communicate aggregate data. 
Java Collections Framework - Full 3Hr Course

What is a Collections Framework?
A collections framework is a unified architecture for representing and manipulating collections.
All collections frameworks contain the following:
Interfaces: These are abstract data types that represent collections. Interfaces allow collections to be manipulated independently of the details of their representation. In object-oriented languages, interfaces generally form a hierarchy.
Implementations: These are the concrete implementations of the collection interfaces. In essence, they are reusable data structures.
Algorithms: These are the methods that perform useful computations, such as searching and sorting, on objects that implement collection interfaces. The algorithms are said to be polymorphic: that is, the same method can be used on many different implementations of the appropriate collection interface. In essence, algorithms are reusable functionality.
Benefits of the Java Collections Framework
The Java Collections Framework provides the following benefits:
Reduces programming effort by providing data structures and algorithms so you don't have to write them yourself.
Increases performance by providing high-performance implementations of data structures and algorithms. Because the various implementations of each interface are interchangeable, programs can be tuned by switching implementations.
Provides interoperability between unrelated APIs by establishing a common language to pass collections back and forth.
Reduces the effort required to learn APIs by requiring you to learn multiple ad hoc collection APIs.
Reduces the effort required to design and implement APIs by not requiring you to produce ad hoc collections APIs.
Fosters software reuse by providing a standard interface for collections and algorithms with which to manipulate them.
Hierarchy of Collection Framework
Let us see the hierarchy of the Collection framework. The java.util package contains all the classes and interfaces for the Collection framework.

The collection interfaces are divided into two groups:

The most basic interface, java.util.Collection.

 The other collection interfaces are based on java.util.Map and are not true collections:


Collection Interfaces
The collection interfaces are divided into two groups. The most basic interface, java.util.Collection, has the following descendants:
java.util.Collection
java.util.List
java.util.Set
java.util.SortedSet
java.util.NavigableSet
java.util.Queue
java.util.concurrent.BlockingQueue
java.util.concurrent.TransferQueue
java.util.Deque
java.util.concurrent.BlockingDeque 
The other collection interfaces are based on java.util.Map and are not true collections. However, these interfaces contain collection-view operations, which enable them to be manipulated as collections. 
Interfaces related to Map:
java.util.Map
java.util.SortedMap
java.util.NavigableMap
java.util.concurrent.ConcurrentMap
java.util.concurrent.ConcurrentNavigableMap
Collection Implementations
The general-purpose collection interface implementations are summarized in the following table:

The AbstractCollection, AbstractSet, AbstractList, AbstractSequentialList and AbstractMapclasses provide basic implementations of the core collection interfaces, to minimize the effort required to implement them. 

The API documentation for these classes describes precisely how each method is implemented so the implementer knows which methods must be overridden, given the performance of the basic operations of a specific implementation.
Commonly used implementations
The Java Collections Framework provides several general-purpose implementations of the core interfaces:
For the Set interface, HashSet is the most commonly used implementation.
For the List interface, ArrayList is the most commonly used implementation.
For the Map interface, HashMap is the most commonly used implementation.
For the Queue interface, LinkedList is the most commonly used implementation.
For the Deque interface, ArrayDeque is the most commonly used implementation.
Interfaces
Collections Framework - The Collection Interface
Collections Framework - The Set Interface 
Collections Framework - The SortedSet Interface 
Collections Framework - The List Interface
Collections Framework - The Queue Interface
Collections Framework - The Deque Interface
Collections Framework - The Map Interface 
Collections Framework - The SortedMap Interface
List Implementations
General-Purpose List Implementations:
Collections Framework - ArrayList Class
Collections Framework - LinkedList Class
Special-Purpose List Implementations:
Collections Framework - CopyOnWriteArrayList
Set Implementations
General-Purpose Set Implementations:
Collections Framework - HashSet Class
Collections Framework - LinkedHashSet Class
Collections Framework - TreeSet Class
Special-Purpose Set Implementations:
Collections Framework - CopyOnWriteArraySet
Collections Framework - EnumSet
Map Implementations
General-purpose Map Implementations:
Collections Framework - HashMap Class
Collections Framework - LinkedHashMap Class
Collections Framework - TreeMap class
Special-Purpose Map Implementations:
Collections Framework - EnumMap
Collections Framework - WeakHashMap
Collections Framework - IdentityHashMap
Sorting
Guide to Algorithms used in Java Library
Guide to Comparable Interface
Guide to Comparator Interface
Sorting in Collections with Examples
Aggregate Operations(Streams)
Collections Aggregate Operations
Stream Reduction Operations
Collections Helper/Utility Classes
java.util.Collections Class API Guide(Development)
          - Sorting
          - Shuffling
          - Routine Data Manipulation
          - Searching
          - Composition
          - Finding Extreme Values
18 Useful Collections Utility Methods (Development)
Java CollectionUtils Class(Development)
Convert Collections Examples
Conversion Between Array and Set in Java
Conversion Between Array and List in Java
Java Convert Map to Set Example
Java Convert Map to List Example
Java Convert Map to Array Example
Convert a Map to an Array, List, and Set in Java
Java 8 Convert List to Map Example
Java 8 - Merging Two Maps Example
Java Convert Array to String [Snippet]
Collections Examples
Different Ways to Iterate over List, Set, and Map in Java
Java Comparator Interface Example
Java Comparable Interface Example
Java IdentityHashMap Example
Java WeakHashMap Example
Java EnumMap Example
Java CopyOnWriteArraySet Example
Java EnumSet Class Example
Guide to Java 8 forEach Method
Different Ways to Iterate over a List in Java [Snippet]
Different Ways to Iterate over a Set in Java [Snippet]
Different Ways to Iterate over a Map in Java [Snippet]
Iterate over TreeSet in Java Example
Iterate over LinkedHashSet in Java Example
Remove First and Last Elements of LinkedList in Java
Iterate over LinkedList using an Iterator in Java
Search an Element in an ArrayList in Java
Iterate over ArrayList using Iterator in Java
Remove Element from HashSet in Java
Iterating over a HashSet using Iterator
Collections Differences
Collections vs Streams in Java
Difference between Array vs ArrayList in Java
Difference between LinkedList vs ArrayList in Java
Difference between List and Set in Java Collection
Difference between Stack and Queue Data Structure in Java
Difference between HashMap and HashSet in Java
Difference between TreeSet, LinkedHashSet, and HashSet in Java with Example
Difference between EnumMap and HashMap in Java
Difference between HashMap and HashSet in Java
Difference between ArrayList and Vector in Java
Difference between HashMap, LinkedHashMap, and TreeMap in Java
Difference between PriorityQueue and TreeSet in Java?
What is the difference between Enumeration and Iterator in Java?
What is the difference between HashMap and Hashtable in Java?
Difference between fail-fast Iterator vs fail-safe Iterator in Java 
YouTube Video Series - Java Collections Framework in Depth Series
Java Collections Framework in Depth - 1 - Need for Collections Framework
Java Collections Framework in Depth - 2 - Collections Framework Hierarchy
Java Collections Framework in Depth - 3 - Collection Interface with Coding Example
Java Collections Framework in Depth - 4 - List Interface with Coding Example
Java Collections Framework in Depth - 5 - ArrayList Class Overview
Java Collections Framework in Depth - 6 - Creating an ArrayList and Adding New Elements to It
Java Collections Framework in Depth - 7 - Creating ArrayList from Another Collection
Java Collections Framework in Depth - 8 - Accessing Elements from an ArrayList
Java Collections Framework in Depth - 9 - Removing Elements from an ArrayList
Java Collections Framework in Depth - 10 - Iterating Over an ArrayList (6 Ways)
Java Collections Framework in Depth - 11 - ListIterator Interface with Coding Example
Java Collections Framework in Depth - 12 - CopyOnWriteArrayList Class with Coding Example
Java Collections Framework in Depth - 13 - LinkedList Overview | ArrayList vs LinkedList
Java Collections Framework in Depth - 14 - Create LinkedList Example | add(), addFirst and addLast()
Java Collections Framework in Depth - 15 - Retrieving Elements from a LinkedList
Java Collections Framework in Depth - 16 - Removing Elements from a LinkedList
Java Collections Framework in Depth - 18 - HashSet Class Overview | Key Points to Note
The complete youtube playlist at https://youtube.com/playlist?list=PLGRDMO4rOGcNpAJPtuuCOPXvI39Elxa-c
Best Practices and Interviews
Java Collection Framework Best Practice  (Best Practice)
Difference between Array vs ArrayList in Java (interview)
How does the Size of the ArrayList Increases Dynamically? (interview)
How To Remove Duplicate Elements From ArrayList In Java? (interview)
