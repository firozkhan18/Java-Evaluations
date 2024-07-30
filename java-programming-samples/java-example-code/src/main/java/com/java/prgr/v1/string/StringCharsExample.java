package com.java.prgr.v1.string;

import java.util.stream.IntStream;

public class StringCharsExample {
	public static void main(String[] args) {

		IntStream stream = "world".chars();
		stream.mapToObj(i -> (char) i).forEach(System.out::println);

	}
}
