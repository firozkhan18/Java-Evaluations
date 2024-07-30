package com.java.prgr.v1.java8.optional;

import java.util.Optional;

/**
 * Java 8 Optional flatMap() Method Example
 * 
 * @author Firoz Khan
 *
 */
public class OPtionalFlatMapExample {

	public static void main(String[] args) {

		Optional<String> optional1 = Optional.of("Hello Java 8");
		Optional<Optional<String>> optional2 = Optional.of(optional1);

		System.out.println("Optional2 value : " + optional2);

		Optional<String> output = optional2.flatMap(value -> value.map(String::toLowerCase));

		System.out.println("output value : " + output);
	}
}