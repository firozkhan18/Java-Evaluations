package com.java.prgr.v1.java8.map;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Java program to collect student names from Student objects using stream map()
 * function.
 * 
 * @author Firoz Khan
 *
 */
public class StreamMapExample7 {

	public static void main(String[] args) {

		Function<String, Integer> indexFinder = (input) -> input.indexOf("com");

		int index = indexFinder.apply("Firoz Khan");
		System.out.println("index: " + index);

		// Creating string stream using Stream.of() method.
		Stream<Student> intValues = Stream.of(new Student(1, "Ganesh", 'B'), new Student(2, "Sachin", 'A'),
				new Student(3, "Bill", 'B'), new Student(4, "Vikram", 'C'));

		// list of Student objects
		List<String> emailList = intValues.map(user -> user.getName()).collect(Collectors.toList());

		// iterating final Student list
		emailList.forEach(output -> System.out.println(output));

	}

}
