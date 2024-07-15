# Java Stream

A Stream in Java can be defined as a sequence of elements from a source, such as arrays, List, Set or any other collection.

Streams are lazily operated, opposite to collections that must store all the values before it starts processing. Stream is conceptually a pipeline, in which elements are computed on demand.

This page lists down the related to Stream API and its related concepts.

<details>
<summary><b>1. Stream Basics</b></summary>
  
<details><summary><b>Introduction to Streams API</b></summary>

# Java Stream API

A Stream in Java can be defined as a sequence of elements from a source. The source of elements here refers to a Collection or Array that provides data to the Stream.

Java streams are designed in such a way that most of the stream operations (called intermediate operations) return a Stream. This helps to create a chain of stream operations. This is called a stream pipeline.
Java streams also support the aggregate or terminal operations on the elements. The aggregate operations are operations that allow us to express common manipulations on stream elements quickly and clearly, for example, finding the max or min element, finding the first element matching giving criteria, and so on.
Not that a stream maintains the same ordering of the elements as the ordering in the stream source.
### 1. What is a Stream?
All of us have watched online videos on YouTube. When we start watching a video, a small portion of the video file is first loaded into our computer and starts playing. we don’t need to download the complete video before we start watching it. This is called video streaming. At a very high level, we can think of the small portions of the video file as a stream and the whole video as a Collection.

At the granular level, the difference between a Collection and a Stream is when the things are computed. A Collection is an in-memory data structure that holds all the data structure’s values. Every element in the Collection has to be computed before it can be added to the Collection. While a Stream is conceptually a pipeline in which elements are computed on demand.
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Using a Stream to filter even numbers and then double them
List<Integer> evenNumber = numbers.stream()
    .filter(n -> n % 2 == 0)   // Filter even numbers
    .toList(); // Collect the results into a new list

System.out.println("Even Numbers List: " + evenNumber); // [2, 4, 6, 8, 10]
```
This concept gives rise to significant programming benefits. The idea is that a user will extract only the values they require from a Stream, and these elements are produced invisibly to the user, as and when required. This is a form of a producer-consumer relationship.

In Java, java.util.Stream interface represents a stream on which one or more operations can be performed.

Stream operations are either intermediate or terminal. The terminal operations return a result of a certain type, and intermediate operations return the stream itself so we can chain multiple methods in a row to perform the operation in multiple steps.
Streams are created on a source, e.g. a java.util.Collection like List or Set. The Map is not supported directly, we can create a stream of map keys, values or entries.
Stream operations can either be executed sequentially or in parallel. when performed parallelly, it is called a parallel stream.
Based on the above points, we can say that a Stream is:

Designed for lambdas or functional programming
Not a data structure to store objects
Do not support indexed access
Can easily be aggregated as arrays or lists
Lazy access supported
Parallelizable
### 2. Creating Streams
The given below ways are the most popular different ways to build streams from collections.

#### 2.1. Stream.of()
In the given example, we are creating a stream of a fixed number of integers.
```java
Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
stream.forEach(p -> System.out.println(p));
```
#### 2.2. Stream.of(array)
In the given example, we are creating a stream from the array. The elements in the stream are taken from the array.
```java
Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
stream.forEach(p -> System.out.println(p));
```
#### 2.3. List.stream()
In the given example, we are creating a stream from the List. The elements in the stream are taken from the List.
```java
List<Integer> list = new ArrayList<Integer>();

for(int i = 1; i< 10; i++){
      list.add(i);
}

Stream<Integer> stream = list.stream();
stream.forEach(p -> System.out.println(p));
```
#### 2.4. Stream.generate() or Stream.iterate()
In the given example, we are creating a stream from generated elements. This will produce a stream of 20 random numbers. We have restricted the elements count using limit() function.
```java
Stream<Integer> randomNumbers = Stream
      .generate(() -> (new Random()).nextInt(100));

randomNumbers.limit(20).forEach(System.out::println);
```
#### 2.5. Stream of String chars or tokens
In the given example, first, we create a stream from the characters of a given string. In the second part, we are creating the stream of tokens received from splitting from a string.
```java
IntStream stream = "12345_abcdefg".chars();
stream.forEach(p -> System.out.println(p));

//OR

Stream<String> stream = Stream.of("A$B$C".split("\\$"));
stream.forEach(p -> System.out.println(p));
```
There are some more ways also such as using Stream.Buider or using intermediate operations. We will learn about them in separate posts from time to time.

### 3. Stream Collectors
After performing the intermediate operations on elements in the stream, we can collect the processed elements again into a Collection using the stream Collector methods.

#### 3.1. Collect Stream Elements to a List
In the given example, first, we create a stream on integers 1 to 10. Then we process the stream elements to find all even numbers.

At last, we are collecting all even numbers into a List.
```java
List<Integer> list = new ArrayList<Integer>();
 
for(int i = 1; i< 10; i++){
      list.add(i);
}

Stream<Integer> stream = list.stream();
List<Integer> evenNumbersList = stream.filter(i -> i%2 == 0)
                                    .collect(Collectors.toList());
System.out.print(evenNumbersList);
```
#### 3.2. Collect Stream Elements to an Array
The given example is similar to the first example shown above. The only difference is that we are collecting even numbers in an Array.
```java
List<Integer> list = new ArrayList<Integer>();
 
for(int i = 1; i< 10; i++){
      list.add(i);
}

Stream<Integer> stream = list.stream();
Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
System.out.print(evenNumbersArr);
```
There are plenty of other ways also to collect stream into a Set, Map or into multiple ways. Just go through Collectors class and try to keep them in mind.

### 4. Stream Operations
Stream abstraction has a long list of useful functions. Let us look at a few of them.

Before moving ahead, let us build a List of strings beforehand. We will build our examples on this list so that it is easy to relate and understand.
```java
List<String> memberNames = new ArrayList<>();
memberNames.add("Amitabh");
memberNames.add("Shekhar");
memberNames.add("Aman");
memberNames.add("Rahul");
memberNames.add("Shahrukh");
memberNames.add("Salman");
memberNames.add("Yana");
memberNames.add("Lokesh");
```
These core methods have been divided into 2 parts given below:

#### 4.1. Intermediate Operations
Intermediate operations return the stream itself so you can chain multiple methods calls in a row. Let’s learn important ones.

#### 4.1.1. Stream.filter()
The filter() method accepts a Predicate to filter all elements of the stream. This operation is intermediate, enabling us to call another stream operation (e.g. forEach()) on the result.
```java
memberNames.stream().filter((s) -> s.startsWith("A"))
                    .forEach(System.out::println);
```
Program Output:
```
Amitabh
Aman
```
#### 4.1.2. Stream.map()
The map() intermediate operation converts each element in the stream into another object via the given function.

The following example converts each string into an UPPERCASE string. But we can use map() to transform an object into another type as well.
```java
memberNames.stream().filter((s) -> s.startsWith("A"))
                  .map(String::toUpperCase)
                  .forEach(System.out::println);
```
Program Output:
```
AMITABH
AMAN
```
#### 4.1.2. Stream.sorted()
The sorted() method is an intermediate operation that returns a sorted view of the stream. The elements in the stream are sorted in natural order unless we pass a custom Comparator.
```java
memberNames.stream().sorted()
                    .map(String::toUpperCase)
                    .forEach(System.out::println);
```
Program Output:
```
AMAN
AMITABH
LOKESH
RAHUL
SALMAN
SHAHRUKH
SHEKHAR
YANA
```
Please note that the sorted() method only creates a sorted view of the stream without manipulating the ordering of the source Collection. In this example, the ordering of string in the memberNames is untouched.

#### 4.2. Terminal operations
Terminal operations return a result of a certain type after processing all the stream elements.

Once the terminal operation is invoked on a Stream, the iteration of the Stream and any of the chained streams will get started. Once the iteration is done, the result of the terminal operation is returned.

#### 4.2.1. Stream.forEach()
The forEach() method helps iterate over all stream elements and perform some operation on each of them. The operation to be performed is passed as the lambda expression.

memberNames.forEach(System.out::println);

#### 4.2.2. Stream.collect()
The collect() method is used to receive elements from steam and store them in a collection.
```java
List<String> memNamesInUppercase = memberNames.stream().sorted()
                            .map(String::toUpperCase)
                            .collect(Collectors.toList());

System.out.print(memNamesInUppercase);
```
Program Output:

[AMAN, AMITABH, LOKESH, RAHUL, SALMAN, SHAHRUKH, SHEKHAR, YANA]

#### 4.2.3. Stream.match()
Various matching operations can be used to check whether a given predicate matches the stream elements. All of these matching operations are terminal and return a boolean result.
```java
boolean matchedResult = memberNames.stream()
        .anyMatch((s) -> s.startsWith("A"));
 
System.out.println(matchedResult);     //true
 
matchedResult = memberNames.stream()
        .allMatch((s) -> s.startsWith("A"));
 
System.out.println(matchedResult);     //false
 
matchedResult = memberNames.stream()
        .noneMatch((s) -> s.startsWith("A"));
 
System.out.println(matchedResult);     //false
```
#### 4.2.4. Stream.count()
The count() is a terminal operation returning the number of elements in the stream as a long value.
```java
long totalMatched = memberNames.stream()
    .filter((s) -> s.startsWith("A"))
    .count();
 
System.out.println(totalMatched);     //2
```
#### 4.2.5. Stream.reduce()
The reduce() method performs a reduction on the elements of the stream with the given function. The result is an Optional holding the reduced value.

In the given example, we are reducing all the strings by concatenating them using a separator #.
```java
Optional<String> reduced = memberNames.stream()
        .reduce((s1,s2) -> s1 + "#" + s2);
 
reduced.ifPresent(System.out::println);
```
Program Output:

Amitabh#Shekhar#Aman#Rahul#Shahrukh#Salman#Yana#Lokesh

### 5. Short-circuit Operations
Though stream operations are performed on all elements inside a collection satisfying a Predicate, it is often desired to break the operation whenever a matching element is encountered during iteration.

In external iteration, we will do with the if-else block. In the internal iterations such as in streams, there are certain methods we can use for this purpose.

#### 5.1. Stream.anyMatch()
The anyMatch() will return true once a condition passed as predicate satisfies. Once a matching value is found, no more elements will be processed in the stream.

In the given example, as soon as a String is found starting with the letter 'A', the stream will end and the result will be returned.
```java
boolean matched = memberNames.stream()
        .anyMatch((s) -> s.startsWith("A"));
 
System.out.println(matched);    //true
```
#### 5.2. Stream.findFirst()
The findFirst() method will return the first element from the stream and then it will not process any more elements.
```java
String firstMatchedName = memberNames.stream()
            .filter((s) -> s.startsWith("L"))
            .findFirst()
                        .get();
 
System.out.println(firstMatchedName);    //Lokesh
```
### 6. Parallel Streams
With the Fork/Join framework added in Java SE 7, we have efficient machinery for implementing parallel operations in our applications.

But implementing a fork/join framework is a complex task, and if not done right; it is a source of complex multi-threading bugs that have the potential to crash the application. With the introduction of internal iterations, we got the possibility of operations to be done in parallel more efficiently.

To enable parallelism, all we have to do is to create a parallel stream, instead of a sequential stream. And to our surprise, this is really very easy.

In any of the above-listed stream examples, anytime we want to do a particular job using multiple threads in parallel cores, all we have to call parallelStream() method instead of stream() method.
```java
List<Integer> list = new ArrayList<Integer>();
for(int i = 1; i< 10; i++){
 list.add(i);
}

//Here creating a parallel stream
Stream<Integer> stream = list.parallelStream();  

Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
System.out.print(evenNumbersArr);
```
A key driver for Stream APIs is making parallelism more accessible to developers. While the Java platform provides strong support for concurrency and parallelism already, developers face unnecessary impediments in migrating their code from sequential to parallel as needed.

Therefore, it is important to encourage idioms that are both sequential- and parallel-friendly. This is facilitated by shifting the focus towards describing what computation should be performed rather than how it should be performed.

It is also important to strike the balance between making parallelism easier and not going so far as to make it invisible. Making parallelism transparent would introduce non-determinism and the possibility of data races where users might not expect it.

### 7. Stream Methods
#### 7.1 Creating Streams
- concat()
- empty()
- generate()
- iterate()
- of()
#### 7.2 Intermediate Operations
- filter()
- map()
- flatMap()
- distinct()
- sorted()
- peek()
- limit()
- skip()
#### 7.3. Terminal Operations
- forEach()
- forEachOrdered()
- toArray()
- reduce()
- collect()
- min()
- max()
- count()
- anyMatch()
- allMatch()
- noneMatch()
- findFirst()
- findAny()

</details>
<details><summary><b>Java 9 Stream API Improvements</b></summary>

# Java 9 Stream API Improvements

Learn new java 9 improvements in Stream API i.e. takeWhile / dropWhile methods, ofNullable and iterate methods with examples.

Table of Contents

Limiting Stream with takeWhile() and dropWhile() methods
Overloaded Stream iterate method
New Stream ofNullable() method

- Limiting Stream with takeWhile() and dropWhile() methods
The new methods takeWhile and dropWhile allow you to get portions of a stream based on a predicate. Here a stream can be either ordered or unordered, so :

On an ordered stream, takeWhile returns the “longest prefix” of elements taken from the stream that match the given predicate, starting at the beginning of the stream.

On an un-ordered stream, takeWhile returns a subset of the stream’s elements that match the given predicate (but not all), starting at the beginning of the stream.

The dropWhile method does the opposite of takeWhile method.

On an ordered stream, dropWhile returns remaining items after the “longest prefix” that match the given predicate.
On an un-ordered stream, dropWhile returns remaining stream elements after dropping subset of elements that match the given predicate.
takeWhile and dropWhile Example

In this example, we have list of chars from ‘a’ to ‘i’. I want all chars which may appear before char ‘d’ in iteration.
```java
List<String> alphabets = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i");

List<String> subset1 = alphabets
        .stream()
        .takeWhile(s -> !s.equals("d"))
        .collect(Collectors.toList());

System.out.println(subset1);
```
> Output:

> [a, b, c]

As stated before, dropWhile acts opposite to takeWhile method so in above example, if used, it will return all characters which were left by takeWhile predicate.
> 
```java
List<String> alphabets = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i");

List<String> subset2 = alphabets
        .stream()
        .dropWhile(s -> !s.equals("d"))
        .collect(Collectors.toList());

System.out.println(subset2);
```
> Output:

> [d, e, f, g, h, i]

- Overloaded Stream iterate method

iterate() methods used for creating a stream which starts with a single element (the seed), and subsequent elements are produced by successively applying the unary operator. The result is an infinite stream. To terminate the stream, a limit or some other short-circuiting function, like findFirst or findAny is used.

- The iterate method in Java 8 has the signature:

> static Stream iterate(final T seed, final UnaryOperator f)
In Java 9, new overloaded version of iterate takes a Predicate as the second argument:

> static Stream iterate(T seed, Predicate hasNext, UnaryOperator next)

Let’s see the difference is use of iterate method from java 8 to java 9.

```java
iterate method in Java 8
List<Integer> numbers = Stream.iterate(1, i -> i+1)
                            .limit(10)
                            .collect(Collectors.toList());
        
System.out.println(numbers);
```
> Output:

> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
- iterate method in Java 9
```java
List<Integer> numbers = Stream.iterate(1, i -> i <= 10 ,i -> i+1)
                                .collect(Collectors.toList());

System.out.println(numbers);
```
> Output:

> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
In above examples, the first stream is the Java 8 way of using iterate with a limit. The second one uses a Predicate as the second argument.

- New Stream ofNullable() method
Until Java 8, you cannot have null value in a stream. It would have caused NullPointerException.

In Java 9, the ofNullable method lets you create a single-element stream which wraps a value if not null, or is an empty stream otherwise.
```java
Stream<String> stream = Stream.ofNullable("123");
System.out.println(stream.count());

stream = Stream.ofNullable(null);
System.out.println(stream.count());
```
> Output:

> 1
> 0
Here, the count method returns the number of non-empty elements in a stream.

Technically, Stream.ofNullable() is very similar to null condition check, when talking in context of stream API.
</details>
<details><summary><b>Creating Streams</b></summary>

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
<details><summary><b>Functional Interfaces</b></summary>

# Functional Interfaces in Java

Introduced in Java 8, a functional interface is simply an interface that has exactly one abstract method. Learn more about functional interfaces in this tutorial.

### 1. What is a Functional Interface?
#### 1.1. Only one abstract method is allowed
Functional interfaces are new additions in Java 8. As a rule, a functional interface can contain exactly one abstract method. These functional interfaces are also called Single Abstract Method interfaces (SAM Interfaces).

Apart from one abstract method, a functional interface can also have the following methods that do not count for defining it as a functional interface.

- Default methods
- Static methods
Public methods inherited from the Object class
#### 1.2. Implemented by Lambda Expressions
In Java, lambda expressions can be used to represent an instance of a functional interface. For example, Comparator interface is a functional interface.
```java
@FunctionalInterface
public interface Comparator<T> {
	int compare(T o1, T o2);
	boolean equals(Object obj);

	//and multiple default methods...
}
```
Comparator interface has only two abstract methods compare() and equals(). But equals() has been inherited from the Object class, so it is not counted. Other than these two methods, all other methods are default methods. So Comparator is qualified to be declared as a functional interface.

Java program to implement Comparator using a lambda expression.
```java
//Compare by Id
Comparator<Employee> compareById = Comparator.comparing(e -> e.getId());

Comparator<Employee> compareByFirstName = Comparator.comparing(e -> e.getFirstName());
```
### 2. @FunctionalInterface Annotation
Java 8 introduced the annotation @FunctionalInterface to mark an interface as a functional interface. The primary use of this annotation is for compiler-level errors when the interface violates the contracts of precisely one abstract method.

Note that using the annotation @FunctionalInterface is optional.

If the interface has one abstract method and does not have @FunctionalInterface annotation, the interface is still a functional interface, and it can be the target type for lambda expressions.

The presence of the annotation protects us from inadvertently changing a functional interface into a non-functional interface, as the compiler will catch it.

Let’s build our first functional interface. Note that methods in an interface are, by default, abstract.
```java
@FunctionalInterface
public interface MyFirstFunctionalInterface 
{
    public void firstWork();
}

Let’s try to add another abstract method:

@FunctionalInterface
public interface MyFirstFunctionalInterface 
{
    public void firstWork();
    public void doSomeMoreWork();   //error
}
```
The above code will result in a compiler error:

Unexpected @FunctionalInterface annotation
@FunctionalInterface ^ MyFirstFunctionalInterface is not a functional interface
multiple non-overriding abstract methods found in interface MyFirstFunctionalInterface
Functional-Interface-Error


### 3. Functional Interfaces in JDK
The following is a list of Java’s most commonly used functional interfaces.

- Runnable: contains only the run() method.
- Comparable: contains only the compareTo() method.
- ActionListener: contains only the actionPerformed() method.
- Callable: contains only the call() method.
- Predicate: a boolean-valued function that takes an argument and returns true or false.
- BiPredicate: a predicate with two arguments.
- Consumer: an operation that takes an argument, operates on it, and returns no result.
- BiConsumer: a consumer with two arguments.
- Supplier: a supplier that returns a value.
- Function<T, R>:  takes an argument of type T and returns a result of type R.
- BiFunction<T, U, R>: takes two arguments of types T and U and returns a result of type R.
  
### 4. Demo
Let’s see a quick example of creating and using functional interfaces in Java.

We are using a functional interface Function to create the formula for mathematical squares.

> Function<Integer, Integer> square = x -> x * x;

The Function interface has one abstract method apply() that we have implemented above. we can execute the above method as follows:

> System.out.println( square.apply(5) );  //Prints 25
</details>
<details><summary><b>Generic Functional Interfaces</b></summary>
	
# Generic Functional Interfaces in Java

Learn to create generic functional interfaces with and without type restrictions in Java 8 and later. Note that functional interfaces permit exactly one abstract method. These interfaces are also called Single Abstract Method interfaces (SAM Interfaces).

### 1. Without Type Restrictions
#### 1.1. Interface Definition
A functional interface can be defined that is generic for type X and has a functional method that accepts two arguments of type X and returns a value of type X.
```java
@FunctionalInterface
public interface ArgumentsProcessor<X>
{
    X process(X arg1, X arg2);
}
```
This interface can be used for any type i.e. ArgumentsProcessor<Integer>, ArgumentsProcessor<String> or ArgumentsProcessor<Employee>.

#### 1.2. Example
Java example to use generic functional interface with type Integer.
```java
ArgumentsProcessor<Integer> multiplyProcessor = new ArgumentsProcessor<Integer>() {
    @Override
    public Integer process(Integer arg1, Integer arg2)
    {
        return arg1 * arg2;
    }
};

System.out.println(multiplyProcessor.process(2,3));  	//6
```
Java example to use generic functional interface with type String.
```java
ArgumentsProcessor<String> appendProcessor = new ArgumentsProcessor<String>() {
    @Override
    public String process(String str1, String str2)
    {
        return str1  + " " + str2;
    }
};

System.out.println(appendProcessor.process("Hello", "World !!"));	//Hello World !!
```
### 2. With Type Restrictions
#### 2.1. Interface Definition
A functional interface can be defined that is restricted to certain types using extends keyword i.e. X extends Number.
```java
@FunctionalInterface
public interface ArgumentsProcesso<X extends Number>
{
    X process(X arg1, X arg2);
}
```
This interface can be used for any type i.e. ArgumentsProcessor<Integer>, ArgumentsProcessor<Double> but not for ArgumentsProcessor<String> or ArgumentsProcessor<Employee>.

In the above example, the permitted type must extend the Number class.

#### 2.2. Example
Java example to use generic functional interface with type Integer.
```java
ArgumentsProcessor<Double> doubleMultiplier = new ArgumentsProcessor<Double>() {
	@Override
	public Double process(Double arg1, Double arg2)
	{
	    return arg1 * arg2;
	} 
};

System.out.println(doubleMultiplier.process(4d, 6d));	//24.0
```
### 3. Specialized Functional Interfaces
Specialization is accomplished by extending or implementing the generic functional interface of one type. The resulting interface or class is not generic for that type.
```java
@FunctionalInterface
public interface ArgumentsProcessor<Integer>
{
    Integer process(Integer arg1, Integer arg2);
}

ArgumentsProcessor<Integer> intMultiplier = (i1, i2) -> i1 * i2;

System.out.println(intMultiplier.process(4, 5));	//20
```
</details>
<details><summary><b>Primitive Type Streams</b></summary>

# Primitive Type Streams in Java

Learn to create and operate on the streams of primitive types in Java with examples.

### 1. Primitives and Wrapper Classes
Java is not a true object-oriented programming language and supports primitive types that are not objects. We have 7 primitives in Java that are byte, short, int, long, double, float, char.

Java allows to wrap them in objects (wrapper classes) so these types can be represented as objects when required. The corresponding wrapper classes are Byte, Short, Integer, Long, Double, Float and Char.

The process of converting a primitive to an object is called auto-boxing and converting an object to a primitive is called unboxing.

### 2. Support for Primitive Streams
Java Stream API, similar to Collections API, has been designed to work upon objects and not primitive types.

The stream API has inbuilt support for representing primitive streams using the following specialized classes. All these classes support the sequential and parallel aggregate operations on stream items.

- IntStream : represents sequence of primitive int-valued elements.
- LongStream : represents sequence of primitive long-valued elements.
- DoubleStream : represents sequence of primitive double-valued elements.
These classes help in avoiding a lot of unnecessary object creation, auto-boxing and unboxing operations if we decide to do these operations on our own.

For other primitive types, Java does not provide similar stream support classes as it was not found useful to have so many classes. The int, long and double are very highly used types so support was added for them.

### 3. Creating Streams of Primitives
#### 3.1. Creating Stream of Specified Values
If we have a few specified values of int, long or double then we can create the stream using the of() factory method.
```java
IntStream stream = IntStream.of(1, 2, 3, 4, 5);
LongStream stream = LongStream.of(1, 2, 3, 4, 5);
DoubleStream stream = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0);
```
#### 3.2. Stream.range() Fatory Method
The range() method returns a sequential ordered IntStream or LongStream from startInclusive (inclusive) to endExclusive (exclusive) by an incremental step of 1.
```java
IntStream stream = IntStream.range(1, 10);  //1,2,3,4,5,6,7,8,9
LongStream stream = LongStream.range(10, 100);
```
A similar method rangeClosed() also returns a sequential ordered stream but the end item is inclusive in the stream.
```java
IntStream stream = IntStream.rangeClosed(1, 10);  //1,2,3,4,5,6,7,8,9,10
```
#### 3.3. Arrays.stream()
We can directly call the stream() method on an array that will return an instance of Stream class corresponding to the type of array.

For example, if we call array.stream() on an int[] then it will return an instance of IntStream.
```java
// int[] -> Stream
int[] array = new int[]{1, 2, 3, 4, 5};
IntStream stream = Arrays.stream(array);

// long[] -> Stream
long[] array = new long[]{1, 2, 3, 4, 5};
LongStream stream = Arrays.stream(array);

// double[] -> Stream
double[] array = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};
DoubleStream stream = Arrays.stream(array);
```
#### 3.4. Stream mapToInt(), mapToLong() and mapToDouble()
Another technique to get the primitive stream is using the mapTo() function for the corresponding type.

For example, if we have a stream of Integer or any other type of object with a field of Integer type such as person’s age) then we can get the stream of all such values as a stream of int values.
```java
List<Integer> integerList = List.of(1, 2, 3, 4, 5);
IntStream stream = integerList.stream().mapToInt(i -> i);

Stream<Employee> streamOfEmployees = getEmployeeStream();
DoubleStream stream = streamOfEmployees.mapToDouble(e -> e.getSalary());
```
### 4. Finding Sum, Average, Max and Min
#### 4.1. Built-in Methods
All three classes, IntStream, LongStream and DoubleStream, consist of numerical values and it makes sense to provide built-in support for common aggregate operations on items of the stream.

These classes provide the following methods for these operations. The return types are corresponding to the type of the stream. The following methods are from IntStream class:

- sum() – returns the sum of items in the stream.
- average() – returns an OptionalDouble describing the arithmetic mean of items of the stream.
- max() – returns an OptionalInt describing the maximum item of the stream.
- min() – returns an OptionalInt describing the mimimum item of the stream.
- count() – returns the count of items in the stream.

Let’s see a few examples of how to use these methods.
```java
int max = IntStream.of(10, 18, 12, 70, 5)
  .max()
  .getAsInt();

double avg = IntStream.of(1, 2, 3, 4, 5)
  .average()
  .getAsDouble();

int sum = IntStream.range(1, 10)
  .sum();
```
#### 4.2. Summary Statistics
Another way to find the above statistical data is by using the summaryStatistics() method that returns one of the following classes:

- IntSummaryStatistics
- LongSummaryStatistics
- DoubleSummaryStatistics
  
Now we can use its methods to get the required value.

- getAverage()
- getCount()
- getMax()
- getMin()
- getSum()
```java
IntSummaryStatistics summary = IntStream.of(10, 18, 12, 70, 5)
    .summaryStatistics();

int max = summary.getMax();
```
### 5. Primitive Stream to Object Stream
Using the boxed() method, we can convert a primitive stream to an object stream of the corresponding type.

For example, to get Stream<Long> from a LongStream, we can call the boxed() method:
```java
Stream<Integer> boxedStream1 = IntStream.of(1, 2, 3, 4, 5).boxed();
Stream<Long> boxedStream = LongStream.of(1, 2, 3, 4, 5).boxed();
Stream<Double> boxedStream2 =
    DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0).boxed();
```
</details>
<details>
<summary><b>Using ‘if-else’ Conditions with Streams</b></summary>
	
# Using ‘if-else’ Conditions with Java Streams

Learn to use the if-else conditions logic using Java Stream API to filter the items from a collection based on certain conditions.

### 1. The ‘if-else‘ Condition as Consumer Implementation
The 'if-else' condition can be applied as a lambda expression in forEach() function in form of a Consumer action.

Consumer is a functional interface whose functional method is ‘void accept(Object)‘. It represents an operation that accepts a single input argument and returns no result.

In the given example, we are checking if a number is even then print a message, else print another message for an odd number.
```java
ArrayList<Integer> numberList 
    = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

Consumer<Integer> action = i -> {
    if (i % 2 == 0) {
        System.out.println("Even number :: " + i); //Or any other user action we want to do
    } else {
        System.out.println("Odd  number :: " + i);  //Or any other user action we want to do
    }
};

numberList.stream()
    .forEach(action);
```
We can perform any kind of operation on the stream items instead of just printing the items to the console, e.g. storing the items to two separate lists or passing the items to other method calls.
We can write as many if-else statements as required.
We can also write the pass the Consumer implementation as an inline lambda expression to the forEach() function.
```java
Arrays.asList(-1, 1, -2, 3, 4, -5, 6, 0).stream()
    .forEach(
        i -> {
          if (i == 0) {
            System.out.println("Number is 0");
          } else if (i > 0) {
            System.out.println("Positive Number");
          } else {
            System.out.println("Negative Number");
          }
        }
    );
```
### 2. The ‘if' Condition with Predicates
If we intend to apply only 'if' logic then we can pass the condition directly do the filter() function as a Predicate.

In the given example, we are checking if a number is an even number then printing a message.
```java
ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));


Predicate<Integer> isEven = i -> i % 2 == 0;
         
numberList.stream()
    .filter(isEven)
    .forEach(System.out::println);
```
Using one of the above given two methods, we can apply any combination of if-else conditions in Java 8 stream elements.

</details>
<details>
<summary><b>Creating Infinite Streams</b></summary>

# How to Create Infinite Streams in Java

Learn to generate an infinite stream of elements in Java. We will use Stream.generate() and Stream.iterate() methods to get infinite streams.

### 1. Overview
This is very important to note that Java Streams are lazy by design. So:

The generate() and iterate() methods are intermediate operations, so the actual element creation doesn’t begin until a terminal operation is invoked.
Be careful and use the limit() to restrict the number of elements in the stream, before invoking the terminal operation. Else the stream generation will continue infinitely.
Use iterate() method to create ordered stream elements, and generate() method to create unordered stream elements.
### 2. Infinite Streams with iterate() Method
#### 2.1. Method Syntax
Syntax
> static <T> Stream<T> iterate(T seed, UnaryOperator<T> f)

The Stream.iterate() method returns an infinite sequential ordered stream. The first element (index 0) in the Stream will be the provided seed. For n > 0, the element at position n, will be the result of applying the function f to the element at position n - 1.

#### 2.2. Sequence of Integer Values
In the given example, we are creating an infinite stream of even numbers starting from 0. Then we collect the first 10 elements from the stream into a list.
```java
List<Integer> ints = IntStream.iterate(0, i -> i + 2)
            .mapToObj(Integer::valueOf)
            .limit(10)
            .collect(Collectors.toList());
```
### 3. Infinite Streams with generate() Method
#### 3.1. Method Syntax
static <T> Stream<T> generate(Supplier<T> s)

It returns an infinite sequential unordered stream where each element is generated by the provided Supplier. This is suitable for generating constant streams, streams of random elements, etc.

#### 3.2. Example – Stream of Random Numbers
The following example creates a stream of 10 random numbers between 0 and 99.
```java
List<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100))
                  .limit(10)
                  .collect(Collectors.toList());
```
#### 3.3. Example – Stream of Custom Objects
The following example creates an infinite stream of employees and takes the first 5 employees from the stream.
```java
List<Employee> employees = Stream.generate(Employee::create)
              .limit(5)
              .collect(Collectors.toList());
```
Where Employee class is this:
```java
import java.io.Serializable;
import java.util.Random;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final Random r = new Random(Integer.MAX_VALUE);  

	private long id;
	private String name;
	private double salary;

	//All-args constructor, getters and setters are hidden for brevity

	public static Employee create() {
		//Get the employee id in more predictable manner
		//e.g. Max id present in databse + 1

		Employee obj = new Employee(r.nextInt(), "", 0.0d);
		return obj;
	}
}
```
</details>
<details>
<summary><b>Stream of Random Numbers</b></summary>

# Stream of Random Numbers in Java

Learn to get a Stream of random numbers in Java using the Random and SecureRandom classes.

### 1. The Random API
Java 8 release has added several methods to the Random class which can return a sequential stream of random numbers (integers, longs and doubles). The most widely used methods are:

- IntStream ints()
- LongStream longs()
- DoubleStream doubles()

All of the above methods have their overloaded forms. For example, ints() method has these overloaded forms.

- IntStream ints() – Returns an effectively unlimited stream of pseudorandom int values.
- IntStream ints(long streamSize) – Returns a stream producing the given number of pseudorandom int values.
- IntStream ints(int origin, int bound) – Returns an effectively unlimited stream of int values, each conforming to the given origin (inclusive) and bound (exclusive).
- IntStream ints(long streamSize, int origin, int bound) – Returns a stream producing the given number of pseudorandom int values, each conforming to the given origin (inclusive) and bound (exclusive).
### 2. Example of Stream of Random Numbers
Let’s learn to use the above-discussed methods to create a stream of random numbers.
```java
Random random = new Random();

//1
IntStream randStream = random.ints(5);
randStream.forEach(System.out::println);

//2
DoubleStream doubleStream = random.doubles(5, 0, 0.5);
doubleStream.forEach(System.out::println);

//collect to list
List<Long> longs = random.longs(5)
    .boxed()
    .collect(Collectors.toList());
```
### 3. Stream of Secure Random Numbers
To get the stream of secure random numbers (i.e. cryptographically strong random number), use the subclass SecureRandom. By default, SecureRandom uses the SHA1PRNG algorithm. The default constructor also uses this algorithm.

CSPRNG (cryptographically strong pseudo-random number generator) uses entropy, which is nothing but an unpredictable input (true random source). It might be a hardware random number generator or possibly some unpredictable system process, such as the timings events, interrupts etc.
```java
SecureRandom secureRandomGenerator = SecureRandom.getInstanceStrong();
 
//1. Get 128 random bytes
byte[] randomBytes = new byte[128];
secureRandomGenerator.nextBytes(randomBytes);
 
//2. Get random integer
int r = secureRandomGenerator.nextInt();
 
//3. Get random integer in range
int randInRange = secureRandomGenerator.nextInt(999999);
```
Please note that all the above-discussed methods (ints(), longs(), doubles() and their overloads) also work with the SecureRandom class.
```java
SecureRandom sRand = SecureRandom.getInstanceStrong();

IntStream randStream = sRand.ints(5);

randStream.forEach(System.out::println);
```
</details>
<details>
<summary><b>Boxed Streams</b></summary>

# Boxed Streams in Java

In Java, a boxed stream is a stream of the wrapper class instances to simulate a stream of primitives.

### 1. What is a Boxed Stream?
Java Stream API has been designed to work with objects, similar to Collections API. Streams do not treat the primitive types the same as objects.

In Stream API, a stream of primitives can be represented by the following 3 classes:

- IntStream
- LongStream
- DoubleStream

To convert from a stream of primitives to a stream of objects, these classes provide boxed() method that returns a Stream consisting of the elements of the given stream, each boxed to an object of the corresponding wrapper class.
```java
Stream<Integer> stream = IntStream.of(1, 2, 3, 4, 5).boxed();

Stream<Long> stream1 = LongStream.of(1, 2, 3, 4, 5).boxed();

Stream<Double> stream2 = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0).boxed();
```
### 2. Need of Boxed Streams
Without boxing the stream items, we cannot perform the regular stream operations on them. For example, we cannot collect the int values to a list, directly.
```java
//Compilation issue
/*List<Integer> list = IntStream.of(1,2,3,4,5)
    .collect(Collectors.toList());*/
```
To make the above collecting process work, we must box the stream items first.
```java
//Works fine
List<Integer> list = IntStream.of(1,2,3,4,5)
    .boxed()
    .collect(Collectors.toList());
```    
</details>
<details>
<summary><b>Stream of Dates</b></summary>
	
# Get all Dates between Two Dates as Stream

Date and time handling has always been a pain area for Java developers. The new Date-Time API added in Java 8 changed the way, we interact with date and time in Java.

New Date API is a very powerful and much-needed improvement. The only thing missing was, getting a stream of dates having some common difference between two subsequent dates (though it was possible there was no easy way).

Java 9 has introduced a new method LocalDate.datesUntil() that can give a stream on dates. Using datesUntil() makes it easy to create dates streams with a fixed offset.

### 1. LocalDate.datesUntil() Method (Java 9)
#### 1.1. Syntax

This method has two overloaded forms:

- startDate.datesUntil(endDate) : returns a sequential ordered stream of dates that starts from startDate (inclusive) and goes to endDate (exclusive) by an incremental step of 1 day.
- startDate.datesUntil(endDate, period) : same as above with a configured incremental step period.
  
> Stream<LocalDate> datesUntil(LocalDate end)
> Stream<LocalDate> datesUntil(LocalDate end, Period step)

#### 1.2. Example of Stream of Dates
Creating a stream of dates is very simple and straightforward as demonstrated in the given examples.

In this example, we are getting the dates for the next 3 consecutive days.
```java
LocalDate today = LocalDate.now();

Stream<LocalDate> next3Days = today.datesUntil(today.plusDays(3));

next3Days.forEach(System.out::println);
```
In the next example, we are getting the same day for the next 3 weeks.
```java
Stream<LocalDate> sameDayNext3Weeks = today
    .datesUntil(today.plusDays(21), Period.ofWeeks(1));

sameDayNext3Weeks.forEach(System.out::println);
```
### 2. Get Stream of Dates using Iteration (Java 8)
If you have still not adapted Java 9, then you can use the given below method to generate date streams.

Stream<LocalDate> nextThreeDays = Stream.iterate(today, d -> d.plusDays(1));

Once we have the stream, we can use the stream operations on the items.
```java
Stream<LocalDate> nextThreeDays = Stream.iterate(today, d -> d.plusDays(1));

List<LocalDate> list = nextThreeDays
    .limit(3)
    .collect(Collectors.toList());
```
</details>

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
