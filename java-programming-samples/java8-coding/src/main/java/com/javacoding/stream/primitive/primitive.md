In Java, you can create an `IntStream` from an array in several ways. Here are the most common methods:

1. **Using `Arrays.stream` Method:**
   This is the most straightforward way. If you have an array of `int`, you can use `Arrays.stream` directly to create an `IntStream`.

```java
   
   int[] array = {1, 2, 3, 4, 5};
   IntStream intStream = Arrays.stream(array);
```

2. **Using `Stream.of` and `mapToInt`:**
   If you have an array of `Integer` objects (not `int` primitives), you can use `Stream.of` and then convert it to an `IntStream` using `mapToInt`.

```java
   
   Integer[] integerArray = {1, 2, 3, 4, 5};
   IntStream intStream = Stream.of(integerArray)
                               .mapToInt(Integer::intValue);
```

3. **Using `IntStream.of` Method:**
   This is a direct method to create an `IntStream` from individual `int` values, but it’s not directly from an array. It’s more useful if you’re creating the stream inline.

```java
   
   IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
```

4. **Using `IntStream.builder`:**
   This is useful when you want to build an `IntStream` in a more controlled manner, especially when the elements are not known at compile time.

```java
   
	IntStream intStream = IntStream.builder()
	                                  .add(1)
	                                  .add(2)
	                                  .add(3)
	                                  .build();
```

5. **Using `IntStream.range` and `IntStream.rangeClosed`:**
   If you need a range of integers, you can use these methods. `range` is exclusive of the end, while `rangeClosed` is inclusive.

```java
   
   IntStream intStreamRange = IntStream.range(1, 6); // 1 to 5
   IntStream intStreamRangeClosed = IntStream.rangeClosed(1, 5); // 1 to 5
```

Each of these methods has its specific use case, depending on whether you’re starting with a primitive `int` array or an array of `Integer` objects, or need to generate values on the fly.

`IntStream` is a part of the Java Streams API, specifically designed for handling streams of primitive `int` values. It provides a variety of methods to perform operations like filtering, mapping, reducing, and more. Here’s a rundown of some commonly used `IntStream` methods with examples:

### 1. **Creating an `IntStream`:**

```java
int[] array = {1, 2, 3, 4, 5};

// From an array
IntStream intStreamFromArray = Arrays.stream(array);

// From individual int values
IntStream intStreamOf = IntStream.of(1, 2, 3, 4, 5);

// Range of integers
IntStream intStreamRange = IntStream.range(1, 6); // 1 to 5
IntStream intStreamRangeClosed = IntStream.rangeClosed(1, 5); // 1 to 5
```

### 2. **Filtering:**

```java
IntStream intStream = Arrays.stream(array);

// Filter even numbers
IntStream evenNumbers = intStream.filter(n -> n % 2 == 0);
evenNumbers.forEach(System.out::println); // Output: 2, 4
```

### 3. **Mapping:**

```java
IntStream intStream = Arrays.stream(array);

// Convert each int to its square
IntStream squared = intStream.map(n -> n * n);
squared.forEach(System.out::println); // Output: 1, 4, 9, 16, 25
```

### 4. **FlatMapping:**

```java
IntStream intStream = IntStream.of(1, 2, 3);

// Convert each number to a stream of that number repeated
IntStream flatMapped = intStream.flatMap(n -> IntStream.of(n, n * 2));
flatMapped.forEach(System.out::println); // Output: 1, 2, 2, 4, 3, 6
```

### 5. **Reduction:**

```java
IntStream intStream = Arrays.stream(array);

// Sum of all elements
int sum = intStream.sum();
System.out.println("Sum: " + sum); // Output: 15

// Find the maximum value
int max = Arrays.stream(array).max().orElseThrow();
System.out.println("Max: " + max); // Output: 5

// Compute the average
OptionalDouble average = Arrays.stream(array).average();
average.ifPresent(avg -> System.out.println("Average: " + avg)); // Output: 3.0
```

### 6. **Distinct and Sorted:**

```java
IntStream intStream = IntStream.of(5, 1, 2, 2, 4, 4, 3);

// Distinct values
IntStream distinctStream = intStream.distinct();
distinctStream.forEach(System.out::println); // Output: 5, 1, 2, 4, 3

// Sorted values
IntStream sortedStream = IntStream.of(5, 1, 2, 4, 3).sorted();
sortedStream.forEach(System.out::println); // Output: 1, 2, 3, 4, 5
```

### 7. **Primitive Specializations:**

```java
// Using special methods for primitive types
IntStream intStream = IntStream.range(1, 6);

// Collect to an array
int[] arrayResult = intStream.toArray();
System.out.println(Arrays.toString(arrayResult)); // Output: [1, 2, 3, 4, 5]

// Iterate using forEach
IntStream.range(1, 4).forEach(n -> System.out.println("Value: " + n)); // Output: Value: 1, Value: 2, Value: 3
```

### 8. **Peeking:**

```java
IntStream intStream = Arrays.stream(array);

// Peek into the stream
IntStream peekedStream = intStream.peek(n -> System.out.println("Processing: " + n));
peekedStream.forEach(System.out::println); // Output: Processing: 1, 1, 2, 2, 3, 3, 4, 4, 5, 5
```

### 9. **Iteration:**

```java
IntStream.range(1, 4).forEachOrdered(n -> System.out.println("Ordered: " + n)); // Output: Ordered: 1, Ordered: 2, Ordered: 3
```

These examples cover some of the essential functionalities of `IntStream` in Java. The Streams API provides a powerful way to process sequences of `int` values with ease and flexibility.

Certainly! Here’s an example of an interview question related to `IntStream`, along with a detailed explanation and example code.

### Interview Question:

**Q: Given an array of integers, write a Java function that returns the sum of the squares of the even numbers in the array. Use `IntStream` to accomplish this task.**

### Solution:

To solve this problem, you need to perform the following steps:

1. **Convert the array to an `IntStream`.**
2. **Filter the stream to keep only even numbers.**
3. **Map each even number to its square.**
4. **Sum the squared values.**

Here is how you can achieve this using `IntStream` in Java:

```java
import java.util.Arrays;
import java.util.OptionalInt;

public class IntStreamExample {

    public static int sumOfSquaresOfEvens(int[] array) {
        return Arrays.stream(array)             // Step 1: Convert array to IntStream
                     .filter(n -> n % 2 == 0)  // Step 2: Filter even numbers
                     .map(n -> n * n)          // Step 3: Square each number
                     .sum();                  // Step 4: Sum the squared values
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        // Call the function and print the result
        int result = sumOfSquaresOfEvens(array);
        System.out.println("Sum of squares of even numbers: " + result); // Output: 56
    }
}
```

### Explanation:

1. **`Arrays.stream(array)`**: Converts the integer array into an `IntStream`.
2. **`.filter(n -> n % 2 == 0)`**: Filters the stream to include only even numbers.
3. **`.map(n -> n * n)`**: Maps each even number to its square.
4. **`.sum()`**: Computes the sum of the squared values.

### Additional Information:

- **Performance Consideration**: This approach is efficient as it leverages lazy operations provided by the Streams API. Each operation (`filter`, `map`, `sum`) is performed in a single pass over the data.

- **Alternative Methods**: Instead of `.sum()`, you could also use `.reduce()` for more complex scenarios or if you need additional processing, like finding the maximum value.

```java
int result = Arrays.stream(array)
                    .filter(n -> n % 2 == 0)
                    .map(n -> n * n)
                    .reduce(0, Integer::sum); // Using reduce to accumulate the sum
```

This question tests the candidate's understanding of functional programming with streams, including filtering, mapping, and reduction operations.

`DoubleStream` is part of the Java Streams API and is specifically designed for handling streams of primitive `double` values. It provides methods similar to `IntStream` but tailored for double-precision floating-point numbers. Here’s a rundown of some commonly used `DoubleStream` methods with examples:

### 1. **Creating a `DoubleStream`:**

```java
import java.util.Arrays;
import java.util.stream.DoubleStream;

public class DoubleStreamExample {
    public static void main(String[] args) {
        // From an array of doubles
        double[] array = {1.1, 2.2, 3.3, 4.4, 5.5};
        DoubleStream doubleStreamFromArray = Arrays.stream(array);

        // From individual double values
        DoubleStream doubleStreamOf = DoubleStream.of(1.1, 2.2, 3.3);

        // Range of doubles (requires explicit range specification as DoubleStream doesn't have range methods like IntStream)
        DoubleStream doubleStreamRange = DoubleStream.iterate(1.0, n -> n + 1.0).limit(5);
    }
}
```

### 2. **Filtering:**

```java
import java.util.stream.DoubleStream;

public class DoubleStreamFiltering {
    public static void main(String[] args) {
        double[] array = {1.1, 2.2, 3.3, 4.4, 5.5};

        // Filter to get only values greater than 3
        DoubleStream filteredStream = DoubleStream.of(array).filter(n -> n > 3);
        filteredStream.forEach(System.out::println); // Output: 4.4, 5.5
    }
}
```

### 3. **Mapping:**

```java
import java.util.stream.DoubleStream;

public class DoubleStreamMapping {
    public static void main(String[] args) {
        double[] array = {1.1, 2.2, 3.3, 4.4};

        // Map each value to its square
        DoubleStream mappedStream = DoubleStream.of(array).map(n -> n * n);
        mappedStream.forEach(System.out::println); // Output: 1.21, 4.84, 10.89, 19.36
    }
}
```

### 4. **FlatMapping:**

```java
import java.util.stream.DoubleStream;

public class DoubleStreamFlatMapping {
    public static void main(String[] args) {
        // Create a stream of double arrays
        DoubleStream flatMappedStream = DoubleStream.of(1.0, 2.0, 3.0)
                                                   .flatMap(n -> DoubleStream.of(n, n + 0.5));
        flatMappedStream.forEach(System.out::println); // Output: 1.0, 1.5, 2.0, 2.5, 3.0, 3.5
    }
}
```

### 5. **Reduction:**

```java
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class DoubleStreamReduction {
    public static void main(String[] args) {
        double[] array = {1.1, 2.2, 3.3, 4.4, 5.5};

        // Sum of all elements
        double sum = DoubleStream.of(array).sum();
        System.out.println("Sum: " + sum); // Output: 16.5

        // Find the maximum value
        OptionalDouble max = DoubleStream.of(array).max();
        max.ifPresent(value -> System.out.println("Max: " + value)); // Output: 5.5

        // Compute the average
        OptionalDouble average = DoubleStream.of(array).average();
        average.ifPresent(avg -> System.out.println("Average: " + avg)); // Output: 3.3
    }
}
```

### 6. **Distinct and Sorted:**

```java
import java.util.stream.DoubleStream;

public class DoubleStreamDistinctSorted {
    public static void main(String[] args) {
        double[] array = {5.5, 1.1, 2.2, 2.2, 4.4, 3.3};

        // Distinct values
        DoubleStream distinctStream = DoubleStream.of(array).distinct();
        distinctStream.forEach(System.out::println); // Output: 5.5, 1.1, 2.2, 4.4, 3.3

        // Sorted values
        DoubleStream sortedStream = DoubleStream.of(5.5, 1.1, 2.2, 4.4, 3.3).sorted();
        sortedStream.forEach(System.out::println); // Output: 1.1, 2.2, 3.3, 4.4, 5.5
    }
}
```

### 7. **Primitive Specializations:**

```java
import java.util.stream.DoubleStream;

public class DoubleStreamSpecializations {
    public static void main(String[] args) {
        // Collect to an array
        double[] array = DoubleStream.of(1.1, 2.2, 3.3).toArray();
        System.out.println(Arrays.toString(array)); // Output: [1.1, 2.2, 3.3]

        // Iterate using forEach
        DoubleStream.of(1.1, 2.2, 3.3).forEach(n -> System.out.println("Value: " + n));
        // Output: Value: 1.1, Value: 2.2, Value: 3.3
    }
}
```

### 8. **Peeking:**

```java
import java.util.stream.DoubleStream;

public class DoubleStreamPeeking {
    public static void main(String[] args) {
        double[] array = {1.1, 2.2, 3.3};

        // Peek into the stream
        DoubleStream peekedStream = DoubleStream.of(array).peek(n -> System.out.println("Processing: " + n));
        peekedStream.forEach(System.out::println); // Output: Processing: 1.1, 1.1, Processing: 2.2, 2.2, Processing: 3.3, 3.3
    }
}
```

### 9. **Iteration:**

```java
import java.util.stream.DoubleStream;

public class DoubleStreamIteration {
    public static void main(String[] args) {
        DoubleStream.iterate(1.0, n -> n + 1.0)  // Start from 1.0, increment by 1.0
                    .limit(5)                   // Limit to 5 elements
                    .forEach(n -> System.out.println("Value: " + n)); // Output: Value: 1.0, Value: 2.0, Value: 3.0, Value: 4.0, Value: 5.0
    }
}
```

### Additional Notes:

- **Primitive Type Efficiency**: `DoubleStream` is designed for handling `double` values efficiently, avoiding the overhead of boxing/unboxing compared to using `Stream<Double>`.

- **No Direct `range` Methods**: Unlike `IntStream`, `DoubleStream` does not have direct `range` methods. However, you can generate streams of doubles using methods like `iterate`.

These examples cover a range of `DoubleStream` functionalities, from creation and basic operations to more complex transformations and reductions.

`LongStream` is a part of the Java Streams API designed for handling streams of primitive `long` values. It provides various methods for operations such as filtering, mapping, reducing, and more. Here’s a comprehensive overview of commonly used `LongStream` methods with example code.

### 1. **Creating a `LongStream`:**

```java
import java.util.Arrays;
import java.util.stream.LongStream;

public class LongStreamExample {
    public static void main(String[] args) {
        // From an array of long values
        long[] array = {1L, 2L, 3L, 4L, 5L};
        LongStream longStreamFromArray = Arrays.stream(array);

        // From individual long values
        LongStream longStreamOf = LongStream.of(1L, 2L, 3L);

        // Range of longs
        LongStream longStreamRange = LongStream.range(1, 6); // 1 to 5
        LongStream longStreamRangeClosed = LongStream.rangeClosed(1, 5); // 1 to 5
    }
}
```

### 2. **Filtering:**

```java
import java.util.stream.LongStream;

public class LongStreamFiltering {
    public static void main(String[] args) {
        long[] array = {1L, 2L, 3L, 4L, 5L};

        // Filter to get only values greater than 3
        LongStream filteredStream = LongStream.of(array).filter(n -> n > 3);
        filteredStream.forEach(System.out::println); // Output: 4, 5
    }
}
```

### 3. **Mapping:**

```java
import java.util.stream.LongStream;

public class LongStreamMapping {
    public static void main(String[] args) {
        long[] array = {1L, 2L, 3L, 4L};

        // Map each value to its square
        LongStream mappedStream = LongStream.of(array).map(n -> n * n);
        mappedStream.forEach(System.out::println); // Output: 1, 4, 9, 16
    }
}
```

### 4. **FlatMapping:**

```java
import java.util.stream.LongStream;

public class LongStreamFlatMapping {
    public static void main(String[] args) {
        // Create a stream of long values and flatMap to create a stream of sequences
        LongStream flatMappedStream = LongStream.of(1L, 2L, 3L)
                                                .flatMap(n -> LongStream.of(n, n + 1));
        flatMappedStream.forEach(System.out::println); // Output: 1, 2, 2, 3, 3, 4
    }
}
```

### 5. **Reduction:**

```java
import java.util.OptionalLong;
import java.util.stream.LongStream;

public class LongStreamReduction {
    public static void main(String[] args) {
        long[] array = {1L, 2L, 3L, 4L, 5L};

        // Sum of all elements
        long sum = LongStream.of(array).sum();
        System.out.println("Sum: " + sum); // Output: 15

        // Find the maximum value
        OptionalLong max = LongStream.of(array).max();
        max.ifPresent(value -> System.out.println("Max: " + value)); // Output: 5

        // Compute the average
        OptionalLong average = LongStream.of(array).average();
        average.ifPresent(avg -> System.out.println("Average: " + avg)); // Output: 3
    }
}
```

### 6. **Distinct and Sorted:**

```java
import java.util.stream.LongStream;

public class LongStreamDistinctSorted {
    public static void main(String[] args) {
        long[] array = {5L, 1L, 2L, 2L, 4L, 3L};

        // Distinct values
        LongStream distinctStream = LongStream.of(array).distinct();
        distinctStream.forEach(System.out::println); // Output: 5, 1, 2, 4, 3

        // Sorted values
        LongStream sortedStream = LongStream.of(5L, 1L, 2L, 4L, 3L).sorted();
        sortedStream.forEach(System.out::println); // Output: 1, 2, 3, 4, 5
    }
}
```

### 7. **Primitive Specializations:**

```java
import java.util.Arrays;
import java.util.stream.LongStream;

public class LongStreamSpecializations {
    public static void main(String[] args) {
        // Collect to an array
        long[] array = LongStream.of(1L, 2L, 3L).toArray();
        System.out.println(Arrays.toString(array)); // Output: [1, 2, 3]

        // Iterate using forEach
        LongStream.of(1L, 2L, 3L).forEach(n -> System.out.println("Value: " + n));
        // Output: Value: 1, Value: 2, Value: 3
    }
}
```

### 8. **Peeking:**

```java
import java.util.stream.LongStream;

public class LongStreamPeeking {
    public static void main(String[] args) {
        long[] array = {1L, 2L, 3L};

        // Peek into the stream
        LongStream peekedStream = LongStream.of(array).peek(n -> System.out.println("Processing: " + n));
        peekedStream.forEach(System.out::println); // Output: Processing: 1, 1, Processing: 2, 2, Processing: 3, 3
    }
}
```

### 9. **Iteration:**

```java
import java.util.stream.LongStream;

public class LongStreamIteration {
    public static void main(String[] args) {
        LongStream.iterate(1L, n -> n + 1)  // Start from 1L, increment by 1L
                  .limit(5)                // Limit to 5 elements
                  .forEach(n -> System.out.println("Value: " + n)); // Output: Value: 1, Value: 2, Value: 3, Value: 4, Value: 5
    }
}
```

### Additional Notes:

- **Primitive Type Efficiency**: `LongStream` provides efficient handling of `long` values, avoiding the overhead of boxing/unboxing compared to using `Stream<Long>`.

- **No Direct `rangeClosed` Method**: Similar to `DoubleStream`, `LongStream` does have `range` and `rangeClosed` methods to generate streams of long values.

These examples cover various functionalities of `LongStream`, demonstrating its use for basic operations, transformations, and reductions in Java.


In Java, `IntStream`, `LongStream`, and `DoubleStream` are specialized streams for primitive `int`, `long`, and `double` values, respectively. Each type of stream has several methods for creation from various sources. Here’s a detailed guide on how to create these streams:

### **Creating `IntStream`**

1. **From an Array of `int`:**

```java
   int[] intArray = {1, 2, 3, 4, 5};
   IntStream intStreamFromArray = Arrays.stream(intArray);
```

2. **From Individual `int` Values:**

```java
   IntStream intStreamOf = IntStream.of(1, 2, 3, 4, 5);
```

3. **From a Range of Integers:**

```java
   IntStream intStreamRange = IntStream.range(1, 6); // 1 to 5 (exclusive of 6)
   IntStream intStreamRangeClosed = IntStream.rangeClosed(1, 5); // 1 to 5 (inclusive)
```

4. **From a `Supplier` or Other Source:**

```java
   IntStream generatedStream = IntStream.generate(() -> 42)
                                       .limit(5);
   // Generates a stream of 5 elements, each being 42
```

5. **From a `Stream` of `Integer` Objects:**

```java
   Stream<Integer> integerStream = Stream.of(1, 2, 3);
   IntStream intStreamFromIntegerStream = integerStream.mapToInt(Integer::intValue);
```

### **Creating `LongStream`**

1. **From an Array of `long`:**

```java
   long[] longArray = {1L, 2L, 3L, 4L, 5L};
   LongStream longStreamFromArray = Arrays.stream(longArray);
```

2. **From Individual `long` Values:**

```java
   LongStream longStreamOf = LongStream.of(1L, 2L, 3L, 4L, 5L);
```

3. **From a Range of Longs:**

```java
   LongStream longStreamRange = LongStream.range(1, 6); // 1 to 5 (exclusive of 6)
   LongStream longStreamRangeClosed = LongStream.rangeClosed(1, 5); // 1 to 5 (inclusive)
```

4. **From a `Supplier` or Other Source:**

```java
   LongStream generatedStream = LongStream.generate(() -> 42L)
                                         .limit(5);
   // Generates a stream of 5 elements, each being 42
```

5. **From a `Stream` of `Long` Objects:**

```java
   Stream<Long> longObjectStream = Stream.of(1L, 2L, 3L);
   LongStream longStreamFromLongObjectStream = longObjectStream.mapToLong(Long::longValue);
```

### **Creating `DoubleStream`**

1. **From an Array of `double`:**

```java
   double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
   DoubleStream doubleStreamFromArray = Arrays.stream(doubleArray);
```

2. **From Individual `double` Values:**

```java
   DoubleStream doubleStreamOf = DoubleStream.of(1.1, 2.2, 3.3, 4.4, 5.5);
```

3. **From a Range of Doubles (using `iterate`):**

```java
   DoubleStream doubleStreamRange = DoubleStream.iterate(1.0, n -> n + 1.0)
                                               .limit(5);
   // Generates: 1.0, 2.0, 3.0, 4.0, 5.0
```

4. **From a `Supplier` or Other Source:**

```java
   DoubleStream generatedStream = DoubleStream.generate(Math::random)
                                             .limit(5);
   // Generates 5 random double values
```

5. **From a `Stream` of `Double` Objects:**

```java
   Stream<Double> doubleObjectStream = Stream.of(1.1, 2.2, 3.3);
   DoubleStream doubleStreamFromObjectStream = doubleObjectStream.mapToDouble(Double::doubleValue);
```

### Summary

**`IntStream` Creation:**

- `Arrays.stream(int[])`
- `IntStream.of(int...)`
- `IntStream.range(start, end)` (exclusive of end)
- `IntStream.rangeClosed(start, end)` (inclusive of end)
- `IntStream.generate(Supplier<Integer>)`
- `Stream<Integer>.mapToInt(Integer::intValue)`

**`LongStream` Creation:**

- `Arrays.stream(long[])`
- `LongStream.of(long...)`
- `LongStream.range(start, end)` (exclusive of end)
- `LongStream.rangeClosed(start, end)` (inclusive of end)
- `LongStream.generate(Supplier<Long>)`
- `Stream<Long>.mapToLong(Long::longValue)`

**`DoubleStream` Creation:**

- `Arrays.stream(double[])`
- `DoubleStream.of(double...)`
- `DoubleStream.iterate(start, incrementer).limit(size)`
- `DoubleStream.generate(Supplier<Double>)`
- `Stream<Double>.mapToDouble(Double::doubleValue)`

These methods provide various ways to create `IntStream`, `LongStream`, and `DoubleStream` from different sources, making it easier to work with streams of primitive types in a functional programming style.

Here's a detailed overview of commonly used methods for `IntStream`, `LongStream`, and `DoubleStream`, including explanations and example usages for each type.

### **Common Methods for `IntStream`, `LongStream`, and `DoubleStream`**

#### **Creation Methods**

1. **From Arrays**

   - **`IntStream.of(int... values)`**
   - **`LongStream.of(long... values)`**
   - **`DoubleStream.of(double... values)`**
   
```java

   int[] intArray = {1, 2, 3};
   IntStream intStream = IntStream.of(intArray);

   long[] longArray = {1L, 2L, 3L};
   LongStream longStream = LongStream.of(longArray);

   double[] doubleArray = {1.1, 2.2, 3.3};
   DoubleStream doubleStream = DoubleStream.of(doubleArray);
```

2. **From Ranges**

   - **`IntStream.range(int startInclusive, int endExclusive)`**
   - **`LongStream.range(long startInclusive, long endExclusive)`**
   - **`IntStream.rangeClosed(int startInclusive, int endInclusive)`**
   - **`LongStream.rangeClosed(long startInclusive, long endInclusive)`**
   
```java

   IntStream rangeStream = IntStream.range(1, 5); // 1, 2, 3, 4
   LongStream longRangeStream = LongStream.range(1L, 5L); // 1, 2, 3, 4
   IntStream rangeClosedStream = IntStream.rangeClosed(1, 5); // 1, 2, 3, 4, 5
   LongStream longRangeClosedStream = LongStream.rangeClosed(1L, 5L); // 1, 2, 3, 4, 5
```

3. **From Generators**

   - **`IntStream.generate(IntSupplier s)`**
   - **`LongStream.generate(LongSupplier s)`**
   - **`DoubleStream.generate(DoubleSupplier s)`**
   
```java

   IntStream generatedInts = IntStream.generate(() -> 1).limit(5); // 1, 1, 1, 1, 1
   LongStream generatedLongs = LongStream.generate(() -> 2L).limit(5); // 2, 2, 2, 2, 2
   DoubleStream generatedDoubles = DoubleStream.generate(Math::random).limit(5); // 5 random doubles
```

4. **From Iterations**

   - **`IntStream.iterate(int seed, IntUnaryOperator f)`**
   - **`LongStream.iterate(long seed, LongUnaryOperator f)`**
   - **`DoubleStream.iterate(double seed, DoubleUnaryOperator f)`**
   
```java

   IntStream iteratedInts = IntStream.iterate(1, n -> n + 1).limit(5); // 1, 2, 3, 4, 5
   LongStream iteratedLongs = LongStream.iterate(1L, n -> n + 1).limit(5); // 1, 2, 3, 4, 5
   DoubleStream iteratedDoubles = DoubleStream.iterate(1.0, n -> n + 1.0).limit(5); // 1.0, 2.0, 3.0, 4.0, 5.0
```

#### **Intermediate Operations**

1. **Filtering**

   - **`filter(IntPredicate predicate)`**
   - **`filter(LongPredicate predicate)`**
   - **`filter(DoublePredicate predicate)`**
   
```java

   IntStream filteredInts = IntStream.of(1, 2, 3, 4, 5).filter(n -> n % 2 == 0); // 2, 4
   LongStream filteredLongs = LongStream.of(1L, 2L, 3L, 4L).filter(n -> n > 2); // 3, 4
   DoubleStream filteredDoubles = DoubleStream.of(1.1, 2.2, 3.3).filter(n -> n > 2.0); // 2.2, 3.3
```

2. **Mapping**

   - **`map(IntUnaryOperator mapper)`**
   - **`map(LongUnaryOperator mapper)`**
   - **`map(DoubleUnaryOperator mapper)`**
   - **`mapToObj(IntFunction<? extends R> mapper)`**
   - **`mapToObj(LongFunction<? extends R> mapper)`**
   - **`mapToObj(DoubleFunction<? extends R> mapper)`**
   
```java

   IntStream squaredInts = IntStream.of(1, 2, 3).map(n -> n * n); // 1, 4, 9
   LongStream longMapped = LongStream.of(1L, 2L, 3L).map(n -> n * 2); // 2, 4, 6
   DoubleStream doubleMapped = DoubleStream.of(1.1, 2.2, 3.3).map(n -> n + 1.0); // 2.1, 3.2, 4.3
   Stream<String> intToString = IntStream.of(1, 2, 3).mapToObj(String::valueOf); // "1", "2", "3"
```

3. **Flat Mapping**

   - **`flatMap(IntFunction<? extends IntStream> mapper)`**
   - **`flatMap(LongFunction<? extends LongStream> mapper)`**
   - **`flatMap(DoubleFunction<? extends DoubleStream> mapper)`**
   
```java

   IntStream flatMappedInts = IntStream.of(1, 2, 3).flatMap(n -> IntStream.of(n, -n)); // 1, -1, 2, -2, 3, -3
   LongStream flatMappedLongs = LongStream.of(1L, 2L).flatMap(n -> LongStream.of(n, n + 1)); // 1, 2, 2, 3
   DoubleStream flatMappedDoubles = DoubleStream.of(1.1, 2.2).flatMap(n -> DoubleStream.of(n, n + 0.1)); // 1.1, 1.2, 2.2, 2.3
```

4. **Distinct**

   - **`distinct()`**
   
```java

   IntStream distinctInts = IntStream.of(1, 1, 2, 3, 3).distinct(); // 1, 2, 3
   LongStream distinctLongs = LongStream.of(1L, 1L, 2L, 3L, 3L).distinct(); // 1, 2, 3
   DoubleStream distinctDoubles = DoubleStream.of(1.1, 1.1, 2.2, 3.3).distinct(); // 1.1, 2.2, 3.3
```

5. **Sorted**

   - **`sorted()`**
   
```java

   IntStream sortedInts = IntStream.of(3, 1, 2).sorted(); // 1, 2, 3
   LongStream sortedLongs = LongStream.of(3L, 1L, 2L).sorted(); // 1, 2, 3
   DoubleStream sortedDoubles = DoubleStream.of(3.3, 1.1, 2.2).sorted(); // 1.1, 2.2, 3.3
```

6. **Peek**

   - **`peek(IntConsumer action)`**
   - **`peek(LongConsumer action)`**
   - **`peek(DoubleConsumer action)`**
   
```java

   IntStream peekedInts = IntStream.of(1, 2, 3).peek(n -> System.out.println("Value: " + n)); // prints values
   LongStream peekedLongs = LongStream.of(1L, 2L, 3L).peek(n -> System.out.println("Value: " + n)); // prints values
   DoubleStream peekedDoubles = DoubleStream.of(1.1, 2.2, 3.3).peek(n -> System.out.println("Value: " + n)); // prints values
```

#### **Terminal Operations**

1. **Reduction**

   - **`reduce(T identity, BinaryOperator<T> accumulator)`**
   - **`reduce(BinaryOperator<T> accumulator)`**
   - **`count()`**
   - **`sum()`**
   - **`average()`**
   - **`min()`**
   - **`max()`**
   
```java

   int sum = IntStream.of(1, 2, 3, 4).sum(); // 10
   OptionalLong max = LongStream.of(1L, 2L, 3L, 4L).max(); // OptionalLong[4]
   double average = DoubleStream.of(1.1, 2.2, 3.3).average().orElse(0.0); // 2.2
```

2. **Collecting**

   - **`toArray()`**
   - **`toList()`** (available via `Collectors.toList()` for `Stream`)
   - **`forEach`**
   
```java

   int[] intArray = IntStream.of(1, 2, 3).toArray(); // [1, 2, 3]
   List<Integer> intList = IntStream.of(1, 2, 3).boxed().collect(Collectors.toList()); // [1, 2, 3]
   IntStream.of(1, 2, 3).forEach(n -> System.out.println("Value: " + n)); // prints values
```

3. **Iteration**

   - **`forEachOrdered`** (to maintain order)
   
```java
   IntStream.of(1, 2, 3).forEachOrdered(n -> System.out.println("Value: " + n)); // prints values in order
```

### Summary

- **Creation Methods:**

  - **Arrays**: `IntStream.of(int[])`, `LongStream.of(long[])`, `DoubleStream.of(double[])`
  - **Individual Values**: `IntStream.of(int...)`, `LongStream.of(long...)`, `DoubleStream.of(double...)`
  - **Ranges**: `IntStream.range(start, end)`, `LongStream.range(start, end)`
  - **Generators**: `IntStream.generate(Supplier)`, `LongStream.generate(Supplier)`, `DoubleStream.generate(Supplier)`
  - **Iterations**: `IntStream.iterate(seed, UnaryOperator)`, `LongStream.iterate(seed, UnaryOperator)`, `DoubleStream.iterate(seed, UnaryOperator)`

- **Intermediate Operations:**

  - **Filtering**: `filter`
  - **Mapping**: `map`, `mapToObj`
  - **Flat Mapping**: `flatMap`
  - **Distinct**: `distinct`
  - **Sorted**: `sorted`
  - **Peek**: `peek`

- **Terminal Operations:**

  - **Reduction**: `reduce`, `count`, `sum`, `average`, `min`, `max`
  - **Collecting**: `toArray`, `toList`
  - **Iteration**: `forEach`, `forEachOrdered`

These methods provide a wide range of functionalities to work with primitive data streams efficiently in Java.


Interview questions related to `IntStream` in Java, along with example code to illustrate the concepts:

### **1. Filtering and Summing Values**

**Question:**
How can you use `IntStream` to filter out even numbers from an array, square each remaining number, and then calculate the sum of these squared numbers?

**Example Code:**
```java
import java.util.Arrays;

public class IntStreamFilterSumExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        int sumOfSquares = Arrays.stream(numbers)
                                  .filter(n -> n % 2 == 0) // Keep only even numbers
                                  .map(n -> n * n)          // Square each number
                                  .sum();                   // Calculate the sum

        System.out.println("Sum of squares of even numbers: " + sumOfSquares);
    }
}
```

**Explanation:**
1. **`Arrays.stream(numbers)`**: Creates an `IntStream` from the array.
2. **`filter(n -> n % 2 == 0)`**: Filters out odd numbers, keeping only even numbers.
3. **`map(n -> n * n)`**: Squares each of the remaining even numbers.
4. **`sum()`**: Computes the sum of these squared numbers.

### **2. Finding the Maximum and Minimum Value**

**Question:**
How can you find the maximum and minimum value from an `IntStream` of integers?

**Example Code:**
```java
import java.util.Arrays;
import java.util.OptionalInt;

public class IntStreamMinMaxExample {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 9, 7};

        OptionalInt max = Arrays.stream(numbers).max();
        OptionalInt min = Arrays.stream(numbers).min();

        max.ifPresent(maxValue -> System.out.println("Maximum value: " + maxValue));
        min.ifPresent(minValue -> System.out.println("Minimum value: " + minValue));
    }
}
```

**Explanation:**
1. **`Arrays.stream(numbers).max()`**: Finds the maximum value in the stream.
2. **`Arrays.stream(numbers).min()`**: Finds the minimum value in the stream.
3. **`ifPresent(...)`**: Checks if a value is present and prints it.

### **3. Generating an Infinite Stream and Limiting Results**

**Question:**
How can you generate an infinite stream of numbers starting from 1, and limit the stream to the first 10 numbers?

**Example Code:**
```java
import java.util.stream.IntStream;

public class IntStreamGenerateExample {
    public static void main(String[] args) {
        IntStream infiniteStream = IntStream.iterate(1, n -> n + 1);
        
        infiniteStream.limit(10) // Limit to first 10 numbers
                      .forEach(System.out::println); // Print each number
    }
}
```

**Explanation:**
1. **`IntStream.iterate(1, n -> n + 1)`**: Generates an infinite stream of integers starting from 1, incrementing by 1.
2. **`limit(10)`**: Limits the stream to the first 10 elements.
3. **`forEach(System.out::println)`**: Prints each number.

### **4. Converting to a Different Type**

**Question:**
How can you convert a `Stream<Integer>` to an `IntStream` and then calculate the average?

**Example Code:**
```java
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamConversionExample {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        double average = integerStream.mapToInt(Integer::intValue) // Convert to IntStream
                                      .average()                 // Calculate average
                                      .orElse(0.0);              // Default value if empty

        System.out.println("Average: " + average);
    }
}
```

**Explanation:**
1. **`integerStream.mapToInt(Integer::intValue)`**: Converts `Stream<Integer>` to `IntStream`.
2. **`average()`**: Computes the average of the values.
3. **`orElse(0.0)`**: Provides a default value if the stream is empty.

### **5. Using `IntStream` for Range Operations**

**Question:**
How can you create an `IntStream` of numbers from 1 to 10 (inclusive), and then find the sum of these numbers?

**Example Code:**
```java
import java.util.stream.IntStream;

public class IntStreamRangeExample {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 10) // Inclusive range from 1 to 10
                           .sum();             // Calculate the sum

        System.out.println("Sum of numbers from 1 to 10: " + sum);
    }
}
```

**Explanation:**
1. **`IntStream.rangeClosed(1, 10)`**: Creates an `IntStream` that includes numbers from 1 to 10 (inclusive).
2. **`sum()`**: Computes the sum of the numbers in the stream.

### **6. Peeking into a Stream**

**Question:**
How can you use `IntStream` to print each number, and then filter out numbers greater than 5?

**Example Code:**
```java
import java.util.Arrays;

public class IntStreamPeekExample {
    public static void main(String[] args) {
        Arrays.stream(new int[]{1, 2, 3, 6, 7, 8})
              .peek(n -> System.out.println("Processing number: " + n)) // Print each number
              .filter(n -> n > 5) // Filter out numbers greater than 5
              .forEach(System.out::println); // Print the filtered numbers
    }
}
```

**Explanation:**
1. **`peek(n -> System.out.println("Processing number: " + n))`**: Allows you to perform an action (e.g., print) on each element as it is processed.
2. **`filter(n -> n > 5)`**: Filters the stream to include only numbers greater than 5.
3. **`forEach(System.out::println)`**: Prints each remaining number.

### **Summary**

These examples cover a variety of common tasks with `IntStream`:
- Filtering and aggregating values
- Finding maximum and minimum values
- Generating and limiting infinite streams
- Converting between different stream types
- Working with ranges and peeking into the stream

Understanding these operations will help you effectively utilize `IntStream` in real-world scenarios and perform well in interviews.

Interview questions related to `LongStream` in Java, along with example code and explanations:

### **1. Filtering, Mapping, and Summing Long Values**

**Question:**
How can you use `LongStream` to filter out numbers less than 100, square each remaining number, and then calculate the sum of these squared values?

**Example Code:**
```java
import java.util.Arrays;

public class LongStreamFilterMapSumExample {
    public static void main(String[] args) {
        long[] numbers = {50L, 150L, 200L, 75L, 120L};

        long sumOfSquares = Arrays.stream(numbers)
                                   .filter(n -> n < 100) // Keep only numbers less than 100
                                   .map(n -> n * n)      // Square each number
                                   .sum();               // Calculate the sum

        System.out.println("Sum of squares of numbers less than 100: " + sumOfSquares);
    }
}
```

**Explanation:**
1. **`Arrays.stream(numbers)`**: Creates a `LongStream` from an array of `long` values.
2. **`filter(n -> n < 100)`**: Filters the stream to include only numbers less than 100.
3. **`map(n -> n * n)`**: Squares each of the remaining numbers.
4. **`sum()`**: Computes the sum of these squared numbers.

### **2. Finding the Maximum and Minimum Value**

**Question:**
How can you find the maximum and minimum value from a `LongStream`?

**Example Code:**
```java
import java.util.Arrays;
import java.util.OptionalLong;

public class LongStreamMinMaxExample {
    public static void main(String[] args) {
        long[] numbers = {10L, 25L, 35L, 5L, 50L};

        OptionalLong max = Arrays.stream(numbers).max();
        OptionalLong min = Arrays.stream(numbers).min();

        max.ifPresent(maxValue -> System.out.println("Maximum value: " + maxValue));
        min.ifPresent(minValue -> System.out.println("Minimum value: " + minValue));
    }
}
```

**Explanation:**
1. **`Arrays.stream(numbers).max()`**: Finds the maximum value in the stream.
2. **`Arrays.stream(numbers).min()`**: Finds the minimum value in the stream.
3. **`ifPresent(...)`**: Checks if a value is present and prints it.

### **3. Generating an Infinite Stream and Limiting Results**

**Question:**
How can you generate an infinite `LongStream` starting from 1, and limit it to the first 10 values?

**Example Code:**
```java
import java.util.stream.LongStream;

public class LongStreamGenerateExample {
    public static void main(String[] args) {
        LongStream infiniteStream = LongStream.iterate(1L, n -> n + 1);

        infiniteStream.limit(10) // Limit to first 10 values
                      .forEach(System.out::println); // Print each number
    }
}
```

**Explanation:**
1. **`LongStream.iterate(1L, n -> n + 1)`**: Generates an infinite stream of long values starting from 1, incrementing by 1.
2. **`limit(10)`**: Limits the stream to the first 10 elements.
3. **`forEach(System.out::println)`**: Prints each number.

### **4. Converting to Other Types**

**Question:**
How can you convert a `Stream<Long>` to a `LongStream` and then calculate the average?

**Example Code:**
```java
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class LongStreamConversionExample {
    public static void main(String[] args) {
        Stream<Long> longStream = Stream.of(1L, 2L, 3L, 4L, 5L);

        double average = longStream.mapToLong(Long::longValue) // Convert to LongStream
                                   .average()                 // Calculate average
                                   .orElse(0.0);              // Default value if empty

        System.out.println("Average: " + average);
    }
}
```

**Explanation:**
1. **`longStream.mapToLong(Long::longValue)`**: Converts `Stream<Long>` to `LongStream`.
2. **`average()`**: Computes the average of the values.
3. **`orElse(0.0)`**: Provides a default value if the stream is empty.

### **5. Using `LongStream` for Range Operations**

**Question:**
How can you create a `LongStream` of numbers from 1 to 10 (inclusive), and then find the sum of these numbers?

**Example Code:**
```java
import java.util.stream.LongStream;

public class LongStreamRangeExample {
    public static void main(String[] args) {
        long sum = LongStream.rangeClosed(1L, 10L) // Inclusive range from 1 to 10
                            .sum();             // Calculate the sum

        System.out.println("Sum of numbers from 1 to 10: " + sum);
    }
}
```

**Explanation:**
1. **`LongStream.rangeClosed(1L, 10L)`**: Creates a `LongStream` that includes numbers from 1 to 10 (inclusive).
2. **`sum()`**: Computes the sum of the numbers in the stream.

### **6. Peeking into a Stream**

**Question:**
How can you use `LongStream` to print each number, and then filter out numbers greater than 50?

**Example Code:**
```java
import java.util.Arrays;

public class LongStreamPeekExample {
    public static void main(String[] args) {
        Arrays.stream(new long[]{30L, 40L, 50L, 60L, 70L})
              .peek(n -> System.out.println("Processing number: " + n)) // Print each number
              .filter(n -> n <= 50) // Filter out numbers greater than 50
              .forEach(System.out::println); // Print the filtered numbers
    }
}
```

**Explanation:**
1. **`peek(n -> System.out.println("Processing number: " + n))`**: Allows you to perform an action (e.g., print) on each element as it is processed.
2. **`filter(n -> n <= 50)`**: Filters the stream to include only numbers less than or equal to 50.
3. **`forEach(System.out::println)`**: Prints each remaining number.

### **Summary**

These examples cover a variety of common tasks with `LongStream`:
- Filtering, mapping, and aggregating values
- Finding maximum and minimum values
- Generating and limiting infinite streams
- Converting between different stream types
- Working with ranges and peeking into the stream

Mastery of these concepts will help you efficiently use `LongStream` in various scenarios and perform well in interviews.

Interview questions related to `DoubleStream` often focus on how to effectively use and manipulate streams of `double` values in Java. Here are some example questions, explanations, and code snippets that might come up in an interview:

### **1. **Filtering and Aggregating `DoubleStream` Values**

**Question:**
How can you use `DoubleStream` to filter out values less than 5.0, compute their square roots, and then calculate the average of these transformed values?

**Example Code:**
```java
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class DoubleStreamExample {
    public static void main(String[] args) {
        double[] numbers = {3.5, 6.0, 8.0, 2.0, 7.0};

        OptionalDouble average = DoubleStream.of(numbers)
                                             .filter(n -> n < 5.0)
                                             .map(Math::sqrt)
                                             .average();

        average.ifPresent(avg -> System.out.println("Average: " + avg));
    }
}
```

**Explanation:**
1. **`DoubleStream.of(numbers)`**: Creates a `DoubleStream` from an array of `double` values.
2. **`filter(n -> n < 5.0)`**: Filters the stream to include only values less than 5.0.
3. **`map(Math::sqrt)`**: Applies the square root function to each value.
4. **`average()`**: Computes the average of the transformed values. `OptionalDouble` is used to handle the case where no elements match the filter criteria.

### **2.** Handling Infinite Streams and Limits

**Question:**
How can you generate an infinite `DoubleStream` of random numbers and limit it to the first 5 values?

**Example Code:**
```java
import java.util.stream.DoubleStream;

public class InfiniteDoubleStreamExample {
    public static void main(String[] args) {
        DoubleStream randomNumbers = DoubleStream.generate(Math::random)
                                                .limit(5);

        randomNumbers.forEach(System.out::println);
    }
}
```

**Explanation:**
1. **`DoubleStream.generate(Math::random)`**: Creates an infinite stream of random `double` values.
2. **`limit(5)`**: Limits the stream to the first 5 values.
3. **`forEach(System.out::println)`**: Prints each of the limited values.

### **3.** Combining Operations with `DoubleStream`

**Question:**
How would you use `DoubleStream` to find the maximum value after squaring each value from an array of doubles?

**Example Code:**
```java
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class MaxValueExample {
    public static void main(String[] args) {
        double[] numbers = {1.5, 2.5, 3.5, 4.5, 5.5};

        OptionalDouble max = DoubleStream.of(numbers)
                                         .map(n -> n * n)
                                         .max();

        max.ifPresent(maxValue -> System.out.println("Max value: " + maxValue));
    }
}
```

**Explanation:**
1. **`DoubleStream.of(numbers)`**: Creates a `DoubleStream` from an array of `double` values.
2. **`map(n -> n * n)`**: Squares each value in the stream.
3. **`max()`**: Finds the maximum value in the stream. `OptionalDouble` is used to handle cases where the stream might be empty.

### **4.** Using `DoubleStream` for Statistical Analysis

**Question:**
Write code to compute the sum, count, and standard deviation of a `DoubleStream` of temperatures.

**Example Code:**
```java
import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;

public class StatisticalAnalysisExample {
    public static void main(String[] args) {
        double[] temperatures = {15.5, 20.0, 18.7, 22.3, 16.8};

        DoubleSummaryStatistics stats = DoubleStream.of(temperatures)
                                                   .summaryStatistics();

        double sum = stats.getSum();
        long count = stats.getCount();
        double average = stats.getAverage();
        double variance = DoubleStream.of(temperatures)
                                      .map(temp -> Math.pow(temp - average, 2))
                                      .average()
                                      .orElse(0.0);
        double stdDeviation = Math.sqrt(variance);

        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        System.out.println("Average: " + average);
        System.out.println("Standard Deviation: " + stdDeviation);
    }
}
```

**Explanation:**
1. **`DoubleStream.of(temperatures).summaryStatistics()`**: Computes basic statistics (sum, count, average) for the stream.
2. **`DoubleStream.of(temperatures).map(temp -> Math.pow(temp - average, 2)).average()`**: Calculates the variance.
3. **`Math.sqrt(variance)`**: Computes the standard deviation from the variance.

### **5.** Converting to Other Types

**Question:**
How can you convert a `DoubleStream` to a `Stream<Double>` and back to a `DoubleStream`?

**Example Code:**
```java
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ConversionExample {
    public static void main(String[] args) {
        DoubleStream doubleStream = DoubleStream.of(1.1, 2.2, 3.3);

        // Convert DoubleStream to Stream<Double>
        Stream<Double> doubleObjectStream = doubleStream.boxed();

        // Convert Stream<Double> back to DoubleStream
        DoubleStream backToDoubleStream = doubleObjectStream.mapToDouble(Double::doubleValue);

        backToDoubleStream.forEach(System.out::println);
    }
}
```

**Explanation:**
1. **`doubleStream.boxed()`**: Converts `DoubleStream` to `Stream<Double>`.
2. **`doubleObjectStream.mapToDouble(Double::doubleValue)`**: Converts `Stream<Double>` back to `DoubleStream`.

### **Summary**

These example questions cover a range of `DoubleStream` functionalities, including filtering, generating values, combining operations, statistical analysis, and conversions. Mastery of these topics will help in effectively using `DoubleStream` in real-world scenarios and interviews.

Java 8 IntStream With Working Examples

A quick guide to understand primitive int representation of Stream as interface IntStream to support integer operations and with the useful examples.

1. Overview

In this tutorial, We’ll learn how to use the IntStream in java 8 and it uses with example programs.

For int primitives, the Java IntStream class is a specialization of the Stream interface. It’s a stream of primitive int-valued items that can be used in both sequential and parallel aggregate operations.

AutoCloseable and BaseStream interfaces are implemented by IntStream, which is part of the java.util.stream package.

We will learn the following topics in this course.

·         IntStream Creation

·         ForEach loop

·         IntStream ranges

·         IntStream min and max

·         IntStream find

·         IntStrem map

·         IntStream filter

·         IntStream distinct

·         IntStream to Array

·         IntStream to List

2. Creating IntStream

An IntStream can be generated in a variety of ways, but it cannot be created using a new keyword.

The IntStream objects are created using the methods listed below.

·         IntStream.of()

·         IntStream.range()

·         IntStream.rangeclosed()

·         IntStream.generate()

·         IntStream.iterate()

Let us explore the ways to use these methods with example programs. to create an instance for IntStream with primitive int values.

2.1 IntStream.of()

This function returns a sequentially ordered stream with the provided values as its elements.

It is available in two forms: single element stream and multiple values stream.

IntStream of(int t) – Returns a stream consisting of a single supplied element.

IntStream of(int… values) – Returns a stream with all the components supplied.

 

 

 

 

 

 

 

 

 

 

 

 

 

 

package com.javaprogramto.java8.intstream;

 

import java.util.stream.IntStream;

 

public class IntStreamOf {

 

    public static void main(String[] args) {

 

        IntStream singleValue = IntStream.of(10);

 

        IntStream multipleValeus = IntStream.of(1, 5, 10, 20, 30);

 

    }

 

}

2.2 IntStream.range()

range() is used to generate the numbers in the order with incremental by one.

static IntStream range(int startInclusive, int endExclusive) — here the end range is exclusive.

IntStream range10to30 = IntStream.range(10, 20);

2.3 IntStream.rangeclosed()

rangeClosed() is also used to generate the numbers in the order with incremental by one but it includes the end index of this method.

static IntStream rangeClosed(int startInclusive, int endInclusive)

IntStream range10to15closed = IntStream.range(10, 15);

2.4 IntStream.generate()

Use the generate() method if you wish to generate random numbers with custom logic.

IntStream random = IntStream.generate( () -> { return (int) Math.random() * 5000;});

2.5 IntStream.iterate()

The iterate() method is identical to the generate() method, except instead of random values, it uses incremental or decrement custom logic for large values.

Due to the fact that the iterate() method generates an infinite stream of integers, you must use the limit() function to get the first n numbers.

IntStream iterate = IntStream.iterate(1000, i -> i + 4000).limit(5);

3. IntStream forEach()

Typically we can use the traditional for loop for certain range. However, the same thing may be accomplished by using the IntStream.forEach() function instead.

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

package com.javaprogramto.java8.intstream;

 

import java.util.stream.IntStream;

 

public class IntStreamOf {

 

    public static void main(String[] args) {

         

        System.out.println("for loop");

        for(int i = 1000; i < 20000 ; i = i + 4000) {

            print(i);

        }

         

        System.out.println("intstream foreach loop");

        IntStream iterate = IntStream.iterate(1000, i -> i + 4000).limit(5);

         

        iterate.forEach(n -> print(n));         

         

    }

     

    private static void print(int n) {

        System.out.println(n);

    }

 

}

4. IntStream ranges 

Two methods are offered by the IntStream API to work with numbers generated in a defined range.

range(start, endExclusive): excludes the end index from the output range.

rangeClosed(start, endInclusive): this method includes the end index from the output range.

The below program output gives you clear understanding between range() and rangeClosed() methods.

 

 

 

 

IntStream range10to15range = IntStream.range(10, 15);

IntStream range10to15closed = IntStream.rangeClosed(10, 15);

     

System.out.println("range(10, 15) : "+Arrays.toString(range10to15range.toArray()));

System.out.println("rangeClosed(10, 15) : "+Arrays.toString(range10to15closed.toArray()));

Output:

 

range(10, 15) : [10, 11, 12, 13, 14]

rangeClosed(10, 15) : [10, 11, 12, 13, 14, 15]

5. IntStream min and max

IntStream has utility methods for determining the minimum and maximum values from a series of numbers or random numbers.

Use min() method to retrieve the lowest value from int stream.

Use max() method to retrieve the highest value from int stream.

 

System.out.println("range(10, 15) min value : "+IntStream.range(10, 15)

.min().getAsInt());

System.out.println("range(10, 15) max value : "+IntStream.range(10, 15)

.max().getAsInt());

Output:

 

range(10, 15) min value : 10

range(10, 15) max value : 14

6. IntStream find value

Use findFirst() or findAny() methods on the InstStream object to get the first or any value.

findFirst() vs findAny() indepth

By default, IntStream is created as sequential stream unless call the parallel() on the IntStream.

For sequential streams, the findFirst() and findAny() methods return the same result. If the stream is parallel, however, the findAny() method gives a random value.

 

 

 

System.out.println("findFirst value : "+IntStream.iterate(10, i -> i + 2)

.limit(100).findFirst().getAsInt());

System.out.println("findAny value : "+IntStream.iterate(10, i -> i + 2)

.limit(100).findAny().getAsInt()); 

System.out.println("parallel findAny value : "+IntStream.iterate(10, i -> i + 2)

.limit(100).parallel().findAny().getAsInt());

Output:

 

 

findFirst value : 10

findAny value : 10

parallel findAny value : 160

7. IntStream map() or flatMap()

We can transform the IntStream into the new form using map() method but flatMap() method does the flatten the IntStreams into primitives.

Usage of map() and flatMap() does not give much difference with IntStream usage.

 

 

 

 

 

 

 

 

 

 

 

IntStream mapInput = IntStream.iterate(10, i -> i + 1).limit(10);

 

System.out.println("map input stream : "+Arrays.toString(mapInput.toArray()));

 

IntStream mapOutput = mapInput.map( i -> i * 2);

 

System.out.println("map Output stream : "+Arrays.toString(mapOutput.toArray()));

 

 

IntStream input1 = IntStream.iterate(10, i -> i + 1).limit(10);

 

System.out.println("flat map : "+Arrays

.toString(input1.flatMap( i -> IntStream.of(i)).toArray()));

Output:

 

map input stream : [10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

map Output stream : [20, 22, 24, 26, 28, 30, 32, 34, 36, 38]

flat map : [10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

8. IntStream filter

Use filter() method to filter the integer values based on the given IntPredicate condition.

After applying the filter() method then next you can call forEach() or collect() method to convert it into List or Set.

 

 

 

 

 

 

 

 

 

 

IntStream stream = IntStream.range(100, 200);

 

// filter by number divisible by 5 and 7

System.out.println("numbers divisible by 5 and 7 are : ");

stream.filter(i -> (i % 5 == 0 && i % 7 == 0)).forEach(System.out::println);

 

IntStream stream2 = IntStream.range(100, 200);

 

List<Integer> primes = stream2.filter(IntStreamOf::checkPrime).boxed().collect(Collectors.toList());

 

System.out.println("Prime numbers (100, 200) are "+primes);

Output:

 

 

 

 

numbers divisible by 5 and 7 are :

105

140

175

Prime numbers (100, 200) are [101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199]

9. IntStream distinct()

Use distinct() method to remove the duplicate values from IntStream.

Arrays.toString(IntStream.of(1, 2, 3, 1, 2, 3).distinct().toArray());

Output:

[1, 2, 3]

10. IntStream to Array and List or Set

Use toArray() method to collect the output of IntStream into Array.

Use collect() method to collect the output of IntStream into List or Set.

To remove the duplicates from int stream, you can collect the results into Set rather than using distinct() method. But distinct() is recommended.

 

 

 

 

 

 

 

 

int[] intArray = IntStream.of(1, 2, 3, 1, 2, 3).toArray();

System.out.println("int array : "+Arrays.toString(intArray));

 

 

List<Integer> list = IntStream.of(1, 2, 3, 1, 2, 3).boxed().collect(Collectors.toList());

System.out.println("IntStream to List : "+list);

 

Set<Integer> set = IntStream.of(1, 2, 3, 1, 2, 3).boxed().collect(Collectors.toSet());

System.out.println("IntStream to Set : "+set);

 