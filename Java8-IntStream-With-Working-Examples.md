Here's the content you provided formatted into a proper Markdown file:

```markdown
# Java 8 `IntStream` With Working Examples

A quick guide to understanding the primitive `int` representation of `Stream` as interface `IntStream` to support integer operations, along with useful examples.

## 1. Overview

In this tutorial, we’ll learn how to use `IntStream` in Java 8 with example programs.

For `int` primitives, the Java `IntStream` class is a specialization of the `Stream` interface. It’s a stream of primitive `int`-valued items that can be used in both sequential and parallel aggregate operations.

`AutoCloseable` and `BaseStream` interfaces are implemented by `IntStream`, which is part of the `java.util.stream` package.

We will cover the following topics:

- IntStream Creation
- ForEach Loop
- IntStream Ranges
- IntStream Min and Max
- IntStream Find
- IntStream Map
- IntStream Filter
- IntStream Distinct
- IntStream to Array
- IntStream to List

## 2. Creating `IntStream`

An `IntStream` can be generated in a variety of ways, but it cannot be created using the `new` keyword.

The `IntStream` objects are created using the methods listed below:

- `IntStream.of()`
- `IntStream.range()`
- `IntStream.rangeClosed()`
- `IntStream.generate()`
- `IntStream.iterate()`

Let us explore these methods with example programs to create an instance of `IntStream` with primitive `int` values.

### 2.1 `IntStream.of()`

This method returns a sequentially ordered stream with the provided values as its elements.

It is available in two forms: single element stream and multiple values stream.

- `IntStream of(int t)` – Returns a stream consisting of a single supplied element.
- `IntStream of(int… values)` – Returns a stream with all the components supplied.

```java
package com.javaprogramto.java8.intstream;

import java.util.stream.IntStream;

public class IntStreamOf {
    public static void main(String[] args) {
        IntStream singleValue = IntStream.of(10);
        IntStream multipleValues = IntStream.of(1, 5, 10, 20, 30);
    }
}
```

### 2.2 `IntStream.range()`

`range()` is used to generate numbers in the order with incremental by one.

```java
static IntStream range(int startInclusive, int endExclusive)
IntStream range10to30 = IntStream.range(10, 20);
```

### 2.3 `IntStream.rangeClosed()`

`rangeClosed()` is similar to `range()` but includes the end index of this method.

```java
static IntStream rangeClosed(int startInclusive, int endInclusive)
IntStream range10to15closed = IntStream.rangeClosed(10, 15);
```

### 2.4 `IntStream.generate()`

Use the `generate()` method if you wish to generate random numbers with custom logic.

```java
IntStream random = IntStream.generate(() -> (int) (Math.random() * 5000));
```

### 2.5 `IntStream.iterate()`

The `iterate()` method generates an infinite stream of integers using incremental or decremental custom logic.

```java
IntStream iterate = IntStream.iterate(1000, i -> i + 4000).limit(5);
```

## 3. `IntStream.forEach()`

Typically, we use a traditional `for` loop for certain ranges. However, the same task can be accomplished using the `IntStream.forEach()` function instead.

```java
package com.javaprogramto.java8.intstream;

import java.util.stream.IntStream;

public class IntStreamForEach {
    public static void main(String[] args) {
        System.out.println("for loop");
        for(int i = 1000; i < 20000; i += 4000) {
            print(i);
        }

        System.out.println("IntStream forEach loop");
        IntStream iterate = IntStream.iterate(1000, i -> i + 4000).limit(5);
        iterate.forEach(n -> print(n));
    }

    private static void print(int n) {
        System.out.println(n);
    }
}
```

## 4. `IntStream` Ranges

Two methods are offered by the `IntStream` API to work with numbers generated in a defined range:

- `range(start, endExclusive)`: Excludes the end index from the output range.
- `rangeClosed(start, endInclusive)`: Includes the end index in the output range.

```java
IntStream range10to15range = IntStream.range(10, 15);
IntStream range10to15closed = IntStream.rangeClosed(10, 15);

System.out.println("range(10, 15) : " + Arrays.toString(range10to15range.toArray()));
System.out.println("rangeClosed(10, 15) : " + Arrays.toString(range10to15closed.toArray()));
```

**Output:**

```
range(10, 15) : [10, 11, 12, 13, 14]
rangeClosed(10, 15) : [10, 11, 12, 13, 14, 15]
```

## 5. `IntStream` Min and Max

`IntStream` has utility methods for determining the minimum and maximum values from a series of numbers.

- Use `min()` to retrieve the lowest value.
- Use `max()` to retrieve the highest value.

```java
System.out.println("range(10, 15) min value : " + IntStream.range(10, 15).min().getAsInt());
System.out.println("range(10, 15) max value : " + IntStream.range(10, 15).max().getAsInt());
```

**Output:**

```
range(10, 15) min value : 10
range(10, 15) max value : 14
```

## 6. `IntStream` Find Value

Use `findFirst()` or `findAny()` methods on the `IntStream` object to get the first or any value.

`findFirst()` vs `findAny()`: By default, `IntStream` is created as a sequential stream unless you call `parallel()` on the `IntStream`. For sequential streams, `findFirst()` and `findAny()` return the same result. In parallel streams, however, `findAny()` gives a random value.

```java
System.out.println("findFirst value : " + IntStream.iterate(10, i -> i + 2).limit(100).findFirst().getAsInt());
System.out.println("findAny value : " + IntStream.iterate(10, i -> i + 2).limit(100).findAny().getAsInt());
System.out.println("parallel findAny value : " + IntStream.iterate(10, i -> i + 2).limit(100).parallel().findAny().getAsInt());
```

**Output:**

```
findFirst value : 10
findAny value : 10
parallel findAny value : 160
```

## 7. `IntStream` `map()` or `flatMap()`

We can transform the `IntStream` into a new form using `map()` method, but `flatMap()` method flattens the `IntStream` into primitives.

```java
IntStream mapInput = IntStream.iterate(10, i -> i + 1).limit(10);
System.out.println("map input stream : " + Arrays.toString(mapInput.toArray()));

IntStream mapOutput = mapInput.map(i -> i * 2);
System.out.println("map Output stream : " + Arrays.toString(mapOutput.toArray()));

IntStream input1 = IntStream.iterate(10, i -> i + 1).limit(10);
System.out.println("flat map : " + Arrays.toString(input1.flatMap(i -> IntStream.of(i)).toArray()));
```

**Output:**

```
map input stream : [10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
map Output stream : [20, 22, 24, 26, 28, 30, 32, 34, 36, 38]
flat map : [10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
```

## 8. `IntStream` Filter

Use the `filter()` method to filter integer values based on a given `IntPredicate` condition.

After applying the `filter()` method, you can call `forEach()` or `collect()` to convert it into a `List` or `Set`.

```java
IntStream stream = IntStream.range(100, 200);
System.out.println("numbers divisible by 5 and 7 are : ");
stream.filter(i -> (i % 5 == 0 && i % 7 == 0)).forEach(System.out::println);

IntStream stream2 = IntStream.range(100, 200);
List<Integer> primes = stream2.filter(IntStreamOf::checkPrime).boxed().collect(Collectors.toList());
System.out.println("Prime numbers (100, 200) are " + primes);
```

**Output:**

```
numbers divisible by 5 and 7 are :
105
140
175

Prime numbers (100, 200) are [101, 103, 107,

 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199]
```

## 9. `IntStream` `distinct()`

Use `distinct()` method to remove duplicate values from `IntStream`.

```java
Arrays.toString(IntStream.of(1, 2, 3, 1, 2, 3).distinct().toArray());
```

**Output:**

```
[1, 2, 3]
```

## 10. `IntStream` to Array and List or Set

Use `toArray()` method to collect the output of `IntStream` into an array.

Use `collect()` method to collect the output of `IntStream` into a `List` or `Set`.

To remove duplicates from `IntStream`, you can collect the results into a `Set` rather than using the `distinct()` method. However, `distinct()` is recommended.

```java
int[] intArray = IntStream.of(1, 2, 3, 1, 2, 3).toArray();
System.out.println("int array : " + Arrays.toString(intArray));

List<Integer> list = IntStream.of(1, 2, 3, 1, 2, 3).boxed().collect(Collectors.toList());
System.out.println("IntStream to List : " + list);

Set<Integer> set = IntStream.of(1, 2, 3, 1, 2, 3).boxed().collect(Collectors.toSet());
System.out.println("IntStream to Set : " + set);
```
```

Feel free to adjust or add any additional content as needed!
