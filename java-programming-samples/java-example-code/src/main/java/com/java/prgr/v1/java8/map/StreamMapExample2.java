package com.java.prgr.v1.java8.map;

import java.util.stream.Stream;

/**
 * Java program to find each string length using stream map() function.
 * 
 * @author Firoz Khan
 *
 */
public class StreamMapExample2 {

	public static void main(String[] args) {

		// Creating string stream using Stream.of() method.
		Stream<String> intValues = Stream.of("java", "program", "to", "com", "Firoz Khan", "blog", "");

		// multiplication of 5
		Stream<Integer> lengthStream = intValues.map(string -> string.length());

		// iterating final stream
		lengthStream.forEach(output -> System.out.println(output));

	}

}
