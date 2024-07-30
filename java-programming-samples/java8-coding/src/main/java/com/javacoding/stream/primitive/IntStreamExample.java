package com.javacoding.stream.primitive;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        // Creating IntStream from an array
        int[] numbers = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(numbers);
        
        // Print elements
        intStream.forEach(System.out::println);

        // Creating IntStream using range
        IntStream rangeStream = IntStream.range(1, 6); // 1 to 5
        System.out.println("Range Stream:");
        rangeStream.forEach(System.out::println);

        // Creating IntStream using rangeClosed
        IntStream rangeClosedStream = IntStream.rangeClosed(1, 5); // 1 to 5 inclusive
        System.out.println("Range Closed Stream:");
        rangeClosedStream.forEach(System.out::println);

        // Performing operations: sum, average, max, min
        IntStream statsStream = Arrays.stream(numbers);
        int sum = statsStream.sum();
        double average = Arrays.stream(numbers).average().orElse(Double.NaN);
        OptionalInt max = Arrays.stream(numbers).max();
        OptionalInt min = Arrays.stream(numbers).min();

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max.orElseThrow());
        System.out.println("Min: " + min.orElseThrow());
    }
}