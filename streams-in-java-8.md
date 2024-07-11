
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
	


12 Common uses of Java Streams

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
