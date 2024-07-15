# Java Stream

A Stream in Java can be defined as a sequence of elements from a source, such as arrays, List, Set or any other collection.

Streams are lazily operated, opposite to collections that must store all the values before it starts processing. Stream is conceptually a pipeline, in which elements are computed on demand.

This page lists down the related to Stream API and its related concepts.

<details>
<summary><b>1. Stream Basics</b></summary>
  
- [Introduction to Streams API](https://howtodoinjava.com/java/stream/java-streams-by-examples)
- [Java 9 Stream API Improvements](https://howtodoinjava.com/java9/stream-api-improvements)
- [Creating Streams](https://howtodoinjava.com/java/stream/create-streams)

<details><summary><b>Creating Streams in Java</b></summary>

## Creating Streams in Java

Learn to create streams of primitives and objects in Java using some most popular ways. We will learn to create finite as well as infinite streams.

### 1. Creating Finite Streams
#### 1.1. Empty Stream
We can use Stream.empty() method to create an empty stream.

> Stream<String> emptyStream = Stream.empty();

#### 1.2. From Values
In Java, the Stream.of() creates a stream of the supplied values as var-args, array or list.

> static <T> Stream<T> of(T... values);

Let us see a few examples to create a stream of values.
```java
Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);  //from var args

Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );  //from array

Employee[] arrayOfEmps = {
    new Employee(1, "A", LocalDate.of(1991, 1, 1), 10000d),
    new Employee(2, "B", LocalDate.of(1992, 1, 1), 20000d),
    new Employee(3, "C", LocalDate.of(1993, 1, 1), 30000d)
};

Stream<Employee> employeeStream = Stream.of(arrayOfEmps);
```
#### 1.3. From Collections
We can also get the stream from Java collection classes such as List, Map and Set.
```java
List<String> list = Arrays.asList("A", "B", "C", "D");
Stream<String> stream = list.stream();

Similarly, get a stream from Map.

Map<String, Integer> map = new HashMap<>();
map.put("A", 1);

Stream<String> keyStream = map.keySet().stream();
Stream<Integer> valStream = map.values().stream();
Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();
```
We can also get the stream using utility classes such as Arrays and Collections.
```java
String[] arr = { "A", "B", "C", "D" };

Stream<String> stream = Arrays.stream(arr);
```
#### 1.4. Stream.Builder
The Stream.Builder class follows the builder pattern where we add items to the stream in steps, and finally call the method build() to get the stream.
```java
Stream<String> streamBuilder = Stream.<String>builder()
                                            .add("A")
                                            .add("B")
                                            .build();

```
### 2. Creating Infinite Streams
Use the following methods to create infinite streams in Java.

- iterate(seed, function) – accepts two parameters – a seed which is the first term in the stream, and a function  to produce the value of the next item in the stream. We can limit the stream using the limit() method.
- generate(supplier) – accepts a Supplier that provides an infinite series of elements which are placed in the stream. The limit() method can then be called in the stream chain to stop the series after a certain number of elements. This is suitable for generating constant streams, streams of random elements, etc.
#### 2.1. Stream.iterate()
An example is to generate an infinite stream of even numbers starting from 0 using the iterate() function.
```java
Stream<Integer> infiniteEvenNumbers = Stream.iterate(0, n -> n + 2).limit(10);
```
#### 2.2. Stream.generate()
A similar example creates a stream of 10 random numbers between 0 and 99 using generate() function.
```java
Random rand = new Random();

Stream<Integer> stream =
    Stream.generate(() -> rand.nextInt(100)).limit(20);
```
</details>
- [Functional Interfaces](https://howtodoinjava.com/java/stream/functional-interface-tutorial)
- [Generic Functional Interfaces](https://howtodoinjava.com/java/stream/generic-functional-interfaces)
- [Primitive Type Streams](https://howtodoinjava.com/java/stream/primitive-type-streams)
- [Using ‘if-else’ Conditions with Streams](https://howtodoinjava.com/java8/stream-if-else-logic)
- [Creating Infinite Streams](https://howtodoinjava.com/java8/java-infinite-stream)
- [Stream of Random Numbers](https://howtodoinjava.com/java8/stream-random-numbers-range)
- [Boxed Streams](https://howtodoinjava.com/java8/java8-boxed-intstream)
- [Stream of Dates](https://howtodoinjava.com/java9/stream-dates-datesuntil)
- [Remove/Update Elements From List using Stream](https://howtodoinjava.com/java/stream/remove-update-stream-elements)
- [Iterate with Indices](https://howtodoinjava.com/java/stream/iterate-over-stream-with-indices)
- [Stream has already been operated upon or closed Exception](https://howtodoinjava.com/java/stream/stream-has-already-been-operated-upon-or-closed)
</details>

<details>
<summary><b>2. Stream Searching, Filtering and Sorting</b></summary>
  
- [Getting Distinct Stream Items by Comparing Multiple Fields](https://howtodoinjava.com/java8/stream-distinct-by-multiple-fields)
- [Getting the Last Item of a Stream](https://howtodoinjava.com/java8/java-stream-get-last-element)
- [Get Object with Max Date From a List](https://howtodoinjava.com/java8/stream-get-object-with-max-date)
- [Find, Count and Remove Duplicates](https://howtodoinjava.com/java8/stream-find-remove-duplicates)
- [Applying Multiple Conditions on Java Streams](https://howtodoinjava.com/java8/stream-multiple-filters-example)
- [Sorting a Stream by Multiple Fields](https://howtodoinjava.com/java8/sort-stream-multiple-fields)
- [Sorting Streams in Java](https://howtodoinjava.com/java8/stream-sorting)
- [Chaining Multiple Predicates in Java](https://howtodoinjava.com/java8/predicates-logical-operations)
- [Negating a Predicate](https://howtodoinjava.com/java8/predicate-negate-example)
- [Finding Max and Min from List using Streams](https://howtodoinjava.com/java8/stream-max-min-examples)
- [Java Stream count() Matches with filter()](https://howtodoinjava.com/java8/stream-count-elements-example)
- [Filter a Map by List of Keys](https://howtodoinjava.com/java/stream/filter-map-by-list-of-keys)
</details>

<details>
<summary><b>3. Stream Collectors</b></summary>
  
- [Collecting Stream Items into List](https://howtodoinjava.com/java8/convert-stream-to-list)
- [Collecting Stream Items into Map](https://howtodoinjava.com/java8/collect-stream-to-map)
- [Collect a Java Stream to an Immutable Collection](https://howtodoinjava.com/java/collections/collect-stream-into-immutable-collection)
- [Collectors groupingBy](https://howtodoinjava.com/java/stream/collectors-groupingby)
</details>

<details>
<summary><b>4. Stream Conversions</b></summary>
  
- [Converting Between Stream and Array](https://howtodoinjava.com/java/array/convert-between-stream-and-array)
- [Convert Iterable or Iterator to Stream](https://howtodoinjava.com/java8/iterable-iterator-to-stream)
- [Collecting Stream of Primitives into Collection or Array](https://howtodoinjava.com/java8/convert-intstream-collection-array)
</details> 

<details>
<summary><b>5. Stream Operations</b></summary>
  
- [Append or Prepend Items to a Stream](https://howtodoinjava.com/java8/adding-items-to-stream)
- [Merging Streams](https://howtodoinjava.com/java8/stream-concat-example)
- [Java Stream reuse – Traverse stream multiple times?](https://howtodoinjava.com/java8/java-stream-reuse)
</details>  


<details>
<summary><b>6. Stream API and Methods</b></summary>
  
- [Guide to IntStream in Java](https://howtodoinjava.com/java8/intstream-examples)
- [Streams peek() API](https://howtodoinjava.com/java8/java-stream-peek-example)
- [Difference Between map() and flatMap()](https://howtodoinjava.com/java8/stream-map-vs-flatmap)
- [Stream findFirst() vs. findAny()](https://howtodoinjava.com/java8/stream-findfirst-findany)
- [Java Stream findAny()](https://howtodoinjava.com/java8/stream-findany)
- [Java Stream findFirst()](https://howtodoinjava.com/java8/java-stream-findfirst)
- [Java Collectors teeing()](https://howtodoinjava.com/java12/collectors-teeing-example)
- [Java Stream concat()](https://howtodoinjava.com/java8/stream-concat-example)
- [Java Stream toArray()](https://howtodoinjava.com/java8/convert-stream-to-array)
- [Java Stream noneMatch()](https://howtodoinjava.com/java8/stream-nonematch-example)
- [Java Stream allMatch()](https://howtodoinjava.com/java8/stream-allmatch-example)
- [Java Stream anyMatch()](https://howtodoinjava.com/java8/stream-anymatch-example)
- [Java Stream skip()](https://howtodoinjava.com/java8/stream-skip-example)
- [Java Stream limit()](https://howtodoinjava.com/java8/java-stream-limit-method-example)
- [Java Stream peek()](https://howtodoinjava.com/java8/java-stream-peek-example)
- [Java Stream flatMap()](https://howtodoinjava.com/java8/stream-flatmap-example)
- [Java Stream map()](https://howtodoinjava.com/java8/stream-map-example)
- [Java Stream min()](https://howtodoinjava.com/java8/java-stream-min)
- [Java Stream max()](https://howtodoinjava.com/java8/java-stream-max)
- [Java Stream sorted()](https://howtodoinjava.com/java8/stream-sorted-method)
- [Java Stream filter()](https://howtodoinjava.com/java8/java-stream-filter-example)
- [Java Stream forEachOrdered()](https://howtodoinjava.com/java8/java-stream-foreachordered)
- [Java Stream forEach()](https://howtodoinjava.com/java8/java-stream-foreach)
- [Java Stream distinct()](https://howtodoinjava.com/java8/java-stream-distinct-examples)
</details>  

<details>
<summary><b>7. Advance Topics</b></summary>
  
- [How To Debug Java Streams](https://howtodoinjava.com/java/stream/debugging-java-streams)
</details>   
