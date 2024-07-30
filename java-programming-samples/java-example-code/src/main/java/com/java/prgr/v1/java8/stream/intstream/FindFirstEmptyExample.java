package com.java.prgr.v1.java8.stream.intstream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * 
 * Java 8 empyt IntStream findFirst() Method Example
 * 
 * @author Firoz Khann
 *
 */

public class FindFirstEmptyExample {

	public static void main(String[] args) {
		IntStream emptyStream = IntStream.empty();
		OptionalInt emptyOptionalInt = emptyStream.findFirst();

		if (emptyOptionalInt.isPresent()) {
			System.out.println("Value is present");
		} else {
			System.out.println("First value is not present because stream is blank.");
		}

	}
}
