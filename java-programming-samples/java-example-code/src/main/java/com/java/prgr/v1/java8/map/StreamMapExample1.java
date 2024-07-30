package com.java.prgr.v1.java8.map;

import java.util.stream.Stream;

/**
 * Java program to find the multiplications of 5 using stream map() function.
 * 
 * @author Firoz Khan
 *
 */
public class StreamMapExample1 {

	public static void main(String[] args) {

		// Creating int stream using Stream.of() method.
		Stream<Integer> intValues = Stream.of(1, 2, 3, 4, 5, 6, 7);

		// multiplication of 5
		Stream fifthTableStream = intValues.map(value -> value * 5);

		// iterating final stream
		fifthTableStream.forEach(output -> System.out.println(output));

	}

}
