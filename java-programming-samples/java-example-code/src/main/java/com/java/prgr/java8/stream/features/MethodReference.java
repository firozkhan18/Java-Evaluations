package com.java.prgr.java8.stream.features;

import java.util.function.Consumer;

public class MethodReference {

	public static void main(String[] args) {

		Consumer<String> methodRef = (o) -> o.toString();

		// rewritten above as below.
		Consumer<String> objConcumer = Object::toString;

		// constructor
		Consumer<String> constrConsumer = String::new;

		// Static method reference:
		Consumer<String> staticConsumer = String::toString;

		// Unbound instance method reference:		
		Consumer<String> value2 = String::toString;

	}

}
