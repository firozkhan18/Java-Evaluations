
#Java 8 Stream Intermediate And Terminal Operations

Java 8 Stream has many operations which can be pipe lined together to get desired result. Some operations produce another stream as a result and some operations produce non-stream values as a result. The operations which return another stream as a result are called intermediate operations and the operations which return non-stream values like primitive or object or collection or return nothing are called terminal operations. In this post, we will see the differences between Java 8 Stream intermediate and terminal operations.

Also Read : Solving Real Time Queries Using Java 8 Features – Employee Management System

##Java 8 Stream Intermediate And Terminal Operations :
1) The main difference between intermediate and terminal operations is that intermediate operations return a stream as a result and terminal operations return non-stream values like primitive or object or collection or may not return anything.
2) As intermediate operations return another stream as a result, they can be chained together to form a pipeline of operations. Terminal operations can not be chained together.
3) Pipeline of operations may contain any number of intermediate operations, but there has to be only one terminal operation, that too at the end of pipeline.
4) Intermediate operations are lazily loaded. When you call intermediate operations, they are actually not executed. They are just stored in the memory and executed when the terminal operation is called on the stream.
5) As the names suggest, intermediate operations doesn’t give end result. They just transform one stream to another stream. On the other hand, terminal operations give end result.
6) Intermediate Operations :
map(), filter(), distinct(), sorted(), limit(), skip()
7) Terminal Operations :
forEach(), toArray(), reduce(), collect(), min(), max(), count(), anyMatch(), allMatch(), noneMatch(), findFirst(), findAny()

Below is the list of intermediate and terminal operations.


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
|forEach|			|	Terminal|	Performs an action for each element of this stream.|
|count	|			|Terminal|	Returns the count of elements in this stream.|
|reduce	|			|Terminal|	Performs a reduction on the elements of this stream using the provided identity value and accumulation function.|
|collect|				|Terminal|	Performs a mutable reduction operation on the elements of this stream using a Collector.|
|anyMatch|			|Terminal|	Returns whether any elements of this stream match the provided predicate.|
|allMatch|			|Terminal|	Returns whether all elements of this stream match the provided predicate.|
|noneMatch|			|Terminal|	Returns whether no elements of this stream match the provided predicate.|
|findFirst|			|Terminal|	Returns an Optional describing the first element of this stream or an empty Optional if the stream is empty.|
|findAny|				|Terminal|	Returns an Optional describing some element of the stream or an empty Optional if the stream is empty.|
|min	|				|Terminal|	Returns the minimum element of this stream according to the provided Comparator.|
|max|					|Terminal|	Returns the maximum element of this stream according to the provided Comparator.|
|toArray|				|Terminal|	Returns an array containing the elements of this stream.|


The static factory methods of the Collectors class

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
	
