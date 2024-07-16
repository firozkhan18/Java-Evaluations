
# Java 8 Stream Intermediate And Terminal Operations

Java 8 Stream has many operations which can be pipe lined together to get desired result. Some operations produce another stream as a result and some operations produce non-stream values as a result. The operations which return another stream as a result are called intermediate operations and the operations which return non-stream values like primitive or object or collection or return nothing are called terminal operations. In this post, we will see the differences between Java 8 Stream intermediate and terminal operations.

Also Read : Solving Real Time Queries Using Java 8 Features – Employee Management System

## Java 8 Stream Intermediate And Terminal Operations :
1) The main difference between intermediate and terminal operations is that intermediate operations return a stream as a result and terminal operations return non-stream values like primitive or object or collection or may not return anything.
2) As intermediate operations return another stream as a result, they can be chained together to form a pipeline of operations. Terminal operations can not be chained together.
3) Pipeline of operations may contain any number of intermediate operations, but there has to be only one terminal operation, that too at the end of pipeline.
4) Intermediate operations are lazily loaded. When you call intermediate operations, they are actually not executed. They are just stored in the memory and executed when the terminal operation is called on the stream.
5) As the names suggest, intermediate operations doesn’t give end result. They just transform one stream to another stream. On the other hand, terminal operations give end result.
6) Intermediate Operations :
map(), filter(), distinct(), sorted(), limit(), skip()
7) Terminal Operations :
forEach(), toArray(), reduce(), collect(), min(), max(), count(), anyMatch(), allMatch(), noneMatch(), findFirst(), findAny()

## Below is the list of intermediate and terminal operations.


| Operation 	| Return Type 	       | Type Of Operation  |  What it does? 			| 
|---------------|----------------------|--------------------|-------------------------------------------------------------------|
| map() 		| Stream<T> 		   | Intermediate 		| Returns a stream consisting of results after applying given function to elements of the stream. 	   |
| filter() 		| Stream<T> 		   | Intermediate 		| Returns a stream of elements which satisfy the given predicate.|
| distinct()	| Stream<T> 		   | Intermediate 		| Returns a stream of unique elements.| 
| sorted() 		| Stream<T> 		   | Intermediate 		| Returns a stream consisting of elements sorted according to natural order. |
| limit() 		| Stream<T> 		   | Intermediate 		| Returns a stream containing first n elements.	| 
| skip() 		| Stream<T> 		   | Intermediate 		| Returns a stream after skipping first n elements.| 
|	|	|	|	|
| forEach() 	| void				   | Terminal 			| Performs an action on all elements of a stream.|
| toArray() 	| object[] 			   | Terminal 			| Returns an array containing elements of a stream.|
| reduce()		| type T 			   | Terminal 			| Performs reduction operation on elements of a stream using initial value and binary operation. 	   |
| collect()		| Container of type R  | Terminal 	 		| Returns mutable result container such as List or Set.| 
| min() 		| Optional<T>		   | Terminal 			| Returns minimum element in a stream wrapped in an Optional object. |
| max() 		| Optional<T>		   | Terminal 			| Returns maximum element in a stream wrapped in an Optional object.| 
| count() 		| Long 				   | Terminal			| Returns the number of elements in a stream. | 
| anyMatch() 	| Boolean 			   | Terminal 			| Returns true if any one element of a stream matches with given predicate.|
| allMatch()	| Boolean 			   | Terminal 			| Returns true if all the elements of a stream matches with given predicate.| 
| noneMatch() 	| Boolean		       | Terminal 			| Returns true only if all the elements of a stream doesn't match with given predicate.| 
| findFirst() 	| Optional<T> 		   | Terminal 			| Returns first element of a stream wrapped in an Optional object. | 
| findAny() 	| Optional<T> 		   | Terminal 			| Randomly returns any one element|


### Java 8 Stream Intermediate Vs Terminal Operations

| Intermediate Operations  | Terminal Operations |
|---------------|----------------------|
| They return stream.| They return non-stream values.|
| They can be chained together to form a pipeline of operations. | They can’t be chained together. |
| Pipeline of operations may contain any number of intermediate operations.| Pipeline of operations can have maximum one terminal operation, that too at the end. |
| Intermediate operations are lazily loaded. | Terminal operations are eagerly loaded.|
| They don’t produce end result. | They produce end result.|
| Examples :	filter(), map(), distinct(), sorted(), limit(), skip()	| Examples : forEach(), toArray(), reduce(), collect(), min(), max(), count(), anyMatch(), allMatch(), noneMatch(), findFirst(), findAny()|

	
	
|Operation|Type	|Description|
|---------------|----------------|---------------|
|filter	|Stateless|Returns a new stream consisting of elements that match the given predicate.|
|map|Stateless|Returns a new stream consisting of the results of applying the given function to the elements of this stream.|
|flatMap|Stateless|Returns a new stream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.|
|sorted|Stateful|Returns a stream consisting of the elements of this stream sorted according to the provided Comparator.|
|peek|Stateless|Returns a stream consisting of the elements of this stream additionally performing the provided action on each element as elements are consumed from the resulting stream.|
|limit|Stateless|Returns a stream consisting of the elements of this stream truncated to be no longer than the specified maximum size.|
|skip|Stateless|Returns a stream consisting of the remaining elements of this stream after discarding the first n elements of the stream.|
		
|Operation	|		Type|		Description|
|---------------|----------------------|----------------------|
|forEach|Terminal|Performs an action for each element of this stream.|
|count|Terminal|Returns the count of elements in this stream.|
|reduce|Terminal|Performs a reduction on the elements of this stream using the provided identity value and accumulation function.|
|collect|Terminal|Performs a mutable reduction operation on the elements of this stream using a Collector.|
|anyMatch|Terminal|Returns whether any elements of this stream match the provided predicate.|
|allMatch|Terminal|Returns whether all elements of this stream match the provided predicate.|
|noneMatch|Terminal|Returns whether no elements of this stream match the provided predicate.|
|findFirst|Terminal|Returns an Optional describing the first element of this stream or an empty Optional if the stream is empty.|
|findAny|Terminal|Returns an Optional describing some element of the stream or an empty Optional if the stream is empty.|
|min|Terminal|Returns the minimum element of this stream according to the provided Comparator.|
|max|Terminal|Returns the maximum element of this stream according to the provided Comparator.|
|toArray|Terminal|Returns an array containing the elements of this stream.|


## The static factory methods of the Collectors class

| Factory method    | Returned type 				     | Used to 					| 
|-------------------|------------------------------------------------|------------------------------------------|
| toList 	    | List<T> 					     | Gather all the stream’s items in a List. Example use: List<Dish> dishes = menuStream.collect(toList());|
| toSet 	    | Set<T> 					     | Gather all the stream’s items in a Set, eliminating duplicates. Example use: Set<Dish> dishes = menuStream.collect(toSet());	|
| toCollection 		| Collection<T> | Gather all the stream’s items in the collection created by the provided supplier. Example use: Collection<Dish> dishes = menuStream.collect(toCollection(), ArrayList::new);			| 
| counting 			| Long 		| Count the number of items in the stream. Example use: long howManyDishes = menuStream.collect(counting());| 
| summingInt 		| Integer | Sum the values of an Integer property of the items in the stream.  Example use: int totalCalories = menuStream.collect(summingInt(Dish::getCalories));| 
| averagingInt 		| Double 	| Calculate the average value of an Integer property of the items in the stream. Example use: double avgCalories = menuStream.collect(averagingInt(Dish::getCalories)); | 
| summarizingInt 	| IntSummary-Statistics | Collect statistics regarding an Integer property of the items in the stream,	such as the maximum, minimum, total, and average. Example use: IntSummaryStatistics menuStatistics = menuStream.collect(summarizingInt(Dish::getCalories));	| 
| joining 			| String 	| Concatenate the strings resulting from the invocation of the toString method on each item of the stream. Example use: String shortMenu = menuStream.map(Dish::getName).collect(joining(", "));        		|
| maxBy 			| Optional<T> 	| An Optional wrapping the maximal element in this stream according to 	 the given comparator or Optional.empty() if the stream is empty. Example use: Optional<Dish> fattest = menuStream.collect(maxBy(comparingInt(Dish::getCalories)));	| 
| minBy 			| Optional<T> 		| An Optional wrapping the minimal element in this stream according to the given comparator or Optional.empty() if the stream is empty. 	Example use: Optional<Dish> lightest = menuStream.collect(minBy(comparingInt(Dish::getCalories)));	| 
| reducing 			| The type produced by the reduction operation 	 | Reduce the stream to a single value starting from an initial value used as accumulator and iteratively combining it with each item of the stream using a BinaryOperator.  Example use: int totalCalories = menuStream.collect(reducing(0, Dish::getCalories, Integer::sum));	| 
| collectingAndThen | The type returned by the transforming function | Wrap another collector and apply a transformation function to its result. Example use: int howManyDishes = menuStream.collect(collectingAndThen(toList(), List::size));		| 
| groupingBy 		| Map<K, List<T>> | Group the items in the stream based on the value of one of their properties and use those    values as keys in the resulting Map. Example use: Map<Dish.Type, List<Dish>> dishesByType = menuStream.collect(groupingBy(Dish::getType));| 
| partitioningBy 	| Map<Boolean, List<T>> | Partition the items in the stream based on the result of the application of a predicate to each of them. Example use: Map<Boolean, List<Dish>> vegetarianDishes =menuStream.collect(partitioningBy(Dish::isVegetarian));|
	

### 12 Common uses of Java Streams

Java Streams API was introduced in Java 8. Its aim is to provide a less verbose and concise way to carry out common operations on collections of objects.

Although it can be hard to get used to, the Java Streams API is very powerful and can be used to implement complex algorithms.

Table of Contents
Use cases
1. Filtering
2. Preprocessing
3. Conversion
4. Reduction
5. Grouping
6. Finding
7. Sorting
8. Partitioning
9. Counting
10. Range
11. Matching
12. Joining
Advantages of Streams

Some common use cases of the Java Streams API.

For those of us not proficient with the Streams API, the goal should be to keep these use cases in mind and whenever we come across one of them, we should try to implement them using Streams rather than the traditional way.

Let's establish some basics first.

stream() - creates a stream from a collection
collect() - collects the stream into an object. The object can be a collection, primitive, or a custom class.
Collectors - a class which provides (a lot of) static methods for collecting streams. We will use some of these below. Refer to the documentation for full reference.
These are the most popular stream operations and will be used in the rest of this tutorial.

## Use cases
Let's look at some use cases of streams:

## 1. Filtering
Used for removing values from a Collection based on a condition.
filter() method is used to filter the elements of a Collection based on a condition. Only matching elements are retained.
E.g. - Remove all odd numbers from a list.
```java
List<Integer> evenNumbers = originalList.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());
```
## 2. Preprocessing
Useful when each value in the collection needs to be changed in place.
map() method is used to apply a function to each element of a Collection and return a new Collection of the computed values.
E.g. Convert each value to its square.
```java
List<Integer> squares = originalList.stream()
        .map(n -> n * n)
        .collect(Collectors.toList());
```
## 3. Conversion
Useful when we want to convert a Collection to another Collection.
There are multiple ways to achieve this and let's see them.
In general, as mentioned above, we can use map() and collect() methods to convert a Collection to another Collection.

Example 1. Create a Map from a List.

Convert a list of strings to a map of string and length.
```java
Map<String, Integer> wordLengths = words.stream()
        .collect(Collectors.toMap(
                word -> word,
                word -> word.length()));
```
Example 2. Convert list to sets.

This is a common use case for removing duplicates. Further, if we want to put the elements back to a list, we can use the stream() and collect() methods twice.

Convert a list of strings to a list of unique strings.
```java
// if we want to collect to a set
Set<String> uniqueWords = words.stream()
        .collect(Collectors.toSet());

// OR

// if we want to start and end as a list
List<String> uniqueWords = words.stream()
        .collect(Collectors.toSet()).stream().collect(Collectors.toList());
```
Example 3. Convert a list of Products to a list of their names. (Flattening)
```java
List<String> productNames = products.stream()
        .map(product -> product.getName())
        .collect(Collectors.toList());
```
## 4. Reduction
Reduce a Collection to a single value.
reduce() method is used to apply a function to each element of a Collection and return a single value.
Note that since the reduce() method returns a single value, it is not possible to use it to return a Collection.

E.g. Sum all the values in a list.
```java
int sum = numbers.stream()
        .reduce(0, (a, b) -> a + b);
```
## 5. Grouping
Group elements of a Collection based on a condition.
Collectors.groupingBy() method is used to group elements of a Collection based on a condition.
E.g. Group all products into lists of Products by their category.
```java
Map<String, List<Product>> productsByCategory = products.stream()
        .collect(Collectors.groupingBy(product -> product.getCategory()));
```
## 6. Finding
Finding the first or any element of a Collection which matches a condition.
findFirst() and findAny() methods are used to find the first or any element of a Collection which matches a condition.
This is typically similar to linear search.

E.g. Find the first word in a list which is longer than 5 characters.
```java
Optional<String> firstLongWord = words.stream()
        .filter(word -> word.length() > 5)
        .findFirst();
```
// Note that findFirst() and findAny() methods return Optional<T> objects.
## 7. Sorting
Sort elements of a Collection.
sorted() method is used to sort elements of a Collection.
In general, Collections.sort() is enough to sort a Collection. We can use sorted() specially if we want to follow it with another operation.

E.g. Sort a list of numbers in ascending order and then return the first k elements.
```java
List<Integer> topK = numbers.stream()
        .sorted()
        .limit(k)
        .collect(Collectors.toList());
```
## 8. Partitioning
Partition elements of a Collection based on a condition.
Collectors.partitioningBy() method is used to partition elements of a Collection based on a condition.
Partitioning is similar to grouping except it returns two Collections - one for elements matching the condition and one for elements not matching the condition.

E.g. Partition students into passing and failing.
```java
 Map<Boolean, List<Student>> passingFailing = students
        .stream()
        .collect(Collectors.partitioningBy(s -> s.getGrade() >= PASS_THRESHOLD));
```
## 9. Counting
Count the number of elements matching a condition.
count() method is used to count the number of elements matching a condition.
E.g. Count the number of words in a list which are longer than 5 characters.
```java
long count = words.stream()
        .filter(word -> word.length() > 5)
        .count();
```
## 10. Range
Create a range of values.
range() method is used to create a range of values.
There are special classes for creating streams of particular types - IntStream, LongStream, DoubleStream, and Stream.

These classes are useful when dealing with primitive numeric types. Internally, they use Arrays.stream() to create the stream.

E.g. Create an array of numbers from 0 to 10.
```java
int[] numbers = IntStream.range(0, 10).toArray();
```
## 11. Matching
Match elements of a Collection against a predicate(condition).
Methods such as anyMatch(), allMatch(), and noneMatch() are used to match elements of a Collection against a predicate and return a boolean value.
E.g. Check for products with a price greater than 10.
```java
// true when all elements match the predicate
boolean allMatch = products.stream()
        .allMatch(product -> product.getPrice() > 10);

// true when any element matches the predicate
boolean anyMatch = products.stream()
        .anyMatch(product -> product.getPrice() > 10);

// true when no elements match the predicate
boolean noneMatch = products.stream()
        .noneMatch(product -> product.getPrice() > 10);
```
## 12. Joining
Join elements of a Collection into a String.
Collectors.joining() method is used to join elements of a Collection into a String.
E.g. Join all the words in a list into a single string.
```java
String joinedWords = words.stream()
        .collect(Collectors.joining(" "));
```
Thats it for the common scenarios. There are other less common scenarios you can explore on your own:

- Parallel Streams
- Statistics
- Custom Collectors.
## Advantages of Streams
- Less Verbose Code - Reduces the amount of code needed to process a Collection.
- Lesser intermediate variables - Intermediate variables can be an opportunity to make mistakes. Having fewer of them can help us avoid unexpected bugs.
- Intuitive code - Some developers will disagree that streams are more intuitive than other methods. However, they are much more intuitive than other methods once we get used to them. Reading 5 lines to understand that we are filtering and removing products from a list isn't intuitive compared to reading just a filter() method.

## Java Streams By Example

In this blog, we are going to take a closer look at the Java 8 Streams API. We will mainly do so by means of examples. We will cover many operations and after reading this blog, you will have a very good basic understanding of the Streams API. Enjoy reading!

## 1. Introduction
The Streams API has been introduced in Java 8 and has been part of the Java language specification for several years by now. Nevertheless, it might be that Streams seem a bit magical to you. Therefore, we will cover the basic concepts of Streams and explain them with some examples.

It all starts with the java.util.stream package. The offical Java documentation for this package which contains some good reference documentation, can be found here. Some characteristics of Streams (taken from the official documentation) compared to Collections are:

Streams do not store data. Instead, they are a source for data.
Streams are functional in nature and this is probably why Streams are difficult to comprehend for most people. They produce a result, e.g. like a sum or a new Stream.
Streams are lazyness seeking. Operations can be intermediate or terminal. We will cover both in the next sections. Intermediate operations are always lazy. E.g. find the first occurrence of an element in the Stream. It is not necessary to inspect all elements of the Stream. Once the first occurrence has been found, the search can be ended.
Possibly unbounded. As long as the Stream produces data, the Stream will not end.
The elements of a Stream can only be visited once, just like an Iterator.
In the next sections we will cover how to create Streams, cover some intermediate operations and finally we will cover some terminal operations. The sources are available at GitHub.

## 2. Create a Stream Source
There are several ways for creating Streams. They can be created from a Collection, from an Array, from a file, etc. In this section, we will create some tests which will show you how to create Streams in varying ways. We will create the Stream and use the terminal operation collect in order to consume the Stream into a List. We do not perform any other operations on the Stream yet, we leave that for the other sections. At the end, we assert whether the List is identical to what we expect. The tests are located in the MyJavaStreams unit test.

## 2.1 Create a Stream From a Collection
Assume having a List of Strings named stringsList. We can just call the stream method of the List and then collect the results into a new List. Fairly simple and both lists are equal of course.
```java
private static final List<String> stringsList = Arrays.asList("a", "b", "c");
 
@Test
public void createStreamsFromCollection() {
    List<String> streamedStrings = stringsList.stream().collect(Collectors.toList());
    assertLinesMatch(stringsList, streamedStrings);
}
```
## 2.2 Create a Stream From Arrays
We can use Arrays.stream which takes an Array as an argument in order to create a Stream.
```java
@Test
public void createStreamsFromArrays() {
    List<String> streamedStrings = Arrays.stream(new String[]{"a", "b", "c"}).collect(Collectors.toList());
    assertLinesMatch(stringsList, streamedStrings);
}
```
## 2.3 Create a Stream From Stream.of
We can use Stream.of which takes the elements of the Stream as arguments in order to create a Stream.
```java
@Test
public void createStreamsFromStreamOf() {
    List<String> streamedStrings = Stream.of("a", "b", "c").collect(Collectors.toList());
    assertLinesMatch(stringsList, streamedStrings);
}
```
## 2.4 Create a Stream From IntStream
We can use IntStream.of which takes primitive integer values as arguments in order to create a Stream. DoubleStream.of and LongStream.of also can be used. Note that we use the terminal operation toArray in this case, this will return an array containing the elements of the Stream.
```java
@Test
public void createStreamsFromIntStream() {
    int[] streamedInts = IntStream.of(1, 2, 3).toArray();
    assertArrayEquals(new int[]{1, 2, 3}, streamedInts);
}
```
## 2.5 Create a Stream From a File
We can create a Stream from a file inputFile. The lines method of the BufferedReader class will stream the lines.
```java
@Test
public void createStreamsFromFile() {
    try {
        List<String> expectedLines = Arrays.asList("line1", "line2", "line3");
        BufferedReader reader = new BufferedReader(new FileReader(new File("test/com/mydeveloperplanet/inputfile.txt")));
        List<String> streamedLines = reader.lines().collect(Collectors.toList());
        assertLinesMatch(expectedLines, streamedLines);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}
```
## 3. Intermediate operations
Streams become interesting when we can perform operations to them. The first category are intermediate operations. These operations return a new Stream but do not return a final result. The intermediate operations can be categorized into stateless operations, retaining no information about the previously processed element, and stateful operations which may need to process all of the elements before producing an intermediate result.

The complete list of operations which can be invoked, can be found in the Streams API.

In the folowing examples, we will make use of a Car object containing four parameters: id, brand, type and color. The Car object also contains getters and implementations for equals, hashCode and toString, which we do not list here for brevity, but it should be clear what these do.
```java
public class Car {
    private int id;
    private String brand;
    private String type;
    private String color;
 
    public Car (int id, String brand, String type, String color) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
    }
    ...
}
```
In the unit test, we define four Car objects which we will use in the next examples:
```java
private static final Car volkswagenGolf = new Car(0, "Volkswagen", "Golf", "blue");
private static final Car skodaOctavia = new Car(1, "Skoda", "Octavia", "green");
private static final Car renaultKadjar = new Car(2, "Renault", "Kadjar", "red");
private static final Car volkswagenTiguan = new Car(3, "Volkswagen", "Tiguan", "red");
```
## 3.1 Stateless Operations
### 3.1.1 The Filter Operation
The filter operation allows us to create a new Stream based on a given Predicate. In the example, we first create a Stream of the 4 cars and create a new Stream with only the Volkswagen cars.
```java
@Test
public void filterStream() {
    List<Car> expectedCars = Arrays.asList(volkswagenGolf, volkswagenTiguan);
    List<Car> filteredCars = Stream.of(volkswagenGolf, skodaOctavia, renaultKadjar, volkswagenTiguan)
                                   .filter(car -> car.getBrand().equals("Volkswagen"))
                                   .collect(Collectors.toList());
    assertIterableEquals(expectedCars, filteredCars);
}
```
### 3.1.2 The map Operation
In all the previous examples, the types in the source Stream and the resulting Stream were always identical. Often, you want to apply a function on each element. E.g. if we want the resulting Stream to only contain the brands instead of the Car objects, we can use the map operation and apply the getBrand method to each element which results in a new Stream with only the brand names.
```java
@Test
public void mapStream() {
    List<String> expectedBrands = Arrays.asList("Volkswagen", "Skoda", "Renault", "Volkswagen");
    List<String> brands = Stream.of(volkswagenGolf, skodaOctavia, renaultKadjar, volkswagenTiguan)
                                .map(Car::getBrand)
                                .collect(Collectors.toList());
    assertIterableEquals(expectedBrands, brands);
}
```
### 3.1.3 Combine filter and map operation
Of course, it is perfectly valid to combine operations and chain them in a Stream pipeline. In the next example, we filter in order to retrieve the Volkswagen cars and then use the map operation in order to retrieve only the colors. This way, we end up with a list containing the colors of the Volkswagen cars.
```java
@Test
public void filterMapStream() {
    List<String> expectedColors = Arrays.asList("blue", "red");
    List<String> volkswagenColors = Stream.of(volkswagenGolf, skodaOctavia, renaultKadjar, volkswagenTiguan)
                                          .filter(car -> car.getBrand().equals("Volkswagen"))
                                          .map(Car::getColor)
                                          .collect(Collectors.toList());
    assertIterableEquals(expectedColors, volkswagenColors);
}
```
## 3.2 Stateful Operations
### 3.2.1 The distinct Operation
The distinct operation will return a Stream containing only distinct elements based on equals method implementation of the elements. In the next example, we first retrieve a Stream of the brands and then perform the distinct operation to it. This results in a list of the three distinct brands we used.
```java
@Test
public void distinctStream() {
    List<String> expectedBrands = Arrays.asList("Volkswagen", "Skoda", "Renault");
    List<String> brands = Stream.of(volkswagenGolf, skodaOctavia, renaultKadjar, volkswagenTiguan)
                                .map(Car::getBrand)
                                .distinct()
                                .collect(Collectors.toList());
    assertIterableEquals(expectedBrands, brands);
}
```
### 3.2.2 The sorted Operation
The sorted operation will sort the elements of the Stream according to their natural order. It is also possible to use a Comparator as an argument in order to have a more custom sorting. The next example will retrieve the brands from the Stream and sort them alphabetically.
```java
@Test
public void sortedStream() {
    List<String> expectedSortedBrands = Arrays.asList("Renault", "Skoda", "Volkswagen", "Volkswagen");
    List<String> brands = Stream.of(volkswagenGolf, skodaOctavia, renaultKadjar, volkswagenTiguan)
                                .map(Car::getBrand)
                                .sorted()
                                .collect(Collectors.toList());
    assertIterableEquals(expectedSortedBrands, brands);
}
```
## 3.3 Peek For Debugging Purposes
The last intermediate operation we will discuss is the peek operation. This is a special one and is mainly intended to be used for debugging purposes. Peek will execute an action on the element when it is being consumed. Let’s take the combined filter and map example and add some peek operations to it in order to print the elements being consumed.
```java
@Test
public void peekStream() {
    List<String> expectedColors = Arrays.asList("blue", "red");
    List<String> volkswagenColors = Stream.of(volkswagenGolf, skodaOctavia, renaultKadjar, volkswagenTiguan)
                                          .filter(car -> car.getBrand().equals("Volkswagen"))
                                          .peek(e -> System.out.println("Filtered value: " + e))
                                          .map(Car::getColor)
                                          .peek(e -> System.out.println("Mapped value: " + e))
                                          .collect(Collectors.toList());
    assertIterableEquals(expectedColors, volkswagenColors);
}
```
The output of this test is:

Filtered value: Car{id=0, brand='Volkswagen', type='Golf', color='blue'}
Mapped value: blue
Filtered value: Car{id=3, brand='Volkswagen', type='Tiguan', color='red'}
Mapped value: red
## 4. Terminal Operations
In this section, we will cover some terminal operations.

### 4.1 The collect Operation
We already used the collect terminal operation in all of the previous examples. We always used the Collectors.toList argument in the collect operation. There are more options to use though. We will cover some in the next examples. The complete list can be found in the JavaDoc.

With Collectors.joining, we can concatenate the elements as String separated by a delimiter.
```java
@Test
public void collectJoinStream() {
    String expectedBrands = "Volkswagen;Skoda;Renault;Volkswagen";
    String joinedBrands = Stream.of(volkswagenGolf, skodaOctavia, renaultKadjar, volkswagenTiguan)
                                .map(Car::getBrand)
                                .collect(Collectors.joining(";"));
    assertEquals(expectedBrands, joinedBrands);
}
```
With Collectors.summingInt, we can compute the sum of properties of elements. In our example, we just compute the sum of the id’s of the Cars.
```java
@Test
public void collectSummingIntStream() {
    int sumIds = Stream.of(volkswagenGolf, skodaOctavia, renaultKadjar, volkswagenTiguan)
                       .collect(Collectors.summingInt(Car::getId));
   assertEquals(6, sumIds);
}
```
With Collectors.groupingBy, we can group elements in a Map. In our example, we group the elements based on the brand.
```java
@Test
public void collectGroupingByStream() {
    Map<String, List<Car>> expectedCars = new HashMap<>();
    expectedCars.put("Skoda", Arrays.asList(skodaOctavia));
    expectedCars.put("Renault", Arrays.asList(renaultKadjar));
    expectedCars.put("Volkswagen", Arrays.asList(volkswagenGolf, volkswagenTiguan));
 
    Map<String, List<Car>> groupedCars = Stream.of(volkswagenGolf, skodaOctavia, renaultKadjar, volkswagenTiguan)
                                               .collect(Collectors.groupingBy(Car::getBrand));
    assertTrue(expectedCars.equals(groupedCars));
}
```
### 4.2 The reduce Operation
The reduce operation performs a reduction on the elements of a Stream. It uses an identity (i.e. starting value) and an accumalator function which performs the reduction. In our example, we perform a summation over the id’s of the elements, just like we did when we used the Collectors.summingInt collect operation.
```java
@Test
public void reduceStream() {
    int sumIds = Stream.of(volkswagenGolf, skodaOctavia, renaultKadjar, volkswagenTiguan)
                       .map(Car::getId)
                       .reduce(0, Integer::sum);
    assertEquals(6, sumIds);
}
```
### 4.3 The forEach Operation
The forEach operation performs a function to every element. It is quite similar to the intermediate peek operation.
```java
@Test
public void forEachStream() {
    Stream.of(volkswagenGolf, skodaOctavia, renaultKadjar, volkswagenTiguan)
          .forEach(System.out::println);
}
```
The outcome of this test is the following:
```java
Car{id=0, brand='Volkswagen', type='Golf', color='blue'}
Car{id=1, brand='Skoda', type='Octavia', color='green'}
Car{id=2, brand='Renault', type='Kadjar', color='red'}
Car{id=3, brand='Volkswagen', type='Tiguan', color='red'}
```
### 4.4 The count operation
The count operation counts the number of elements in the Stream.
```java
@Test
public void countStream() {
    long count = Stream.of(volkswagenGolf, skodaOctavia, renaultKadjar, volkswagenTiguan).count();
    assertEquals(4, count);
}
```
### 4.5 The max Operation
The max operation returns the maximum element of the Stream based on the given Comparator. In our example, we create a Stream of the id’s and retrieve the element with the highest id. Remark that this returns an Optional. We just provided an alternative value when the highest id could not be determined.
```java
@Test
public void maxStream() {
    int maxId = Stream.of(volkswagenGolf, skodaOctavia, renaultKadjar, volkswagenTiguan)
                      .map(Car::getId)
                      .max((o1, o2) -> o1.compareTo(o2))
                      .orElse(-1);
    assertEquals(3, maxId);
}
```
### 5. Conclusion
The Java Streams API is very powerful and not very difficult to learn. It is very readable and removes boiler plate code. If you are not yet acquainted with the Streams API, just play around with the provided examples and you will be up to speed in no time. 
