package com.java.prgr.v1.java8.functional;

import java.util.function.Consumer;

/**
 * Consumer Interface in Java with Examples
 * 
 * @author Firoz Khan
 *
 */
public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = (String value) -> {
			System.out.println(value.toUpperCase());
		};
		consumer.accept("Welcome to Java W3schools blog");
	}
}
