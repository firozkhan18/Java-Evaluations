package com.java.prgr.v1.java8.functional.intpredicate;

import java.util.function.IntPredicate;

public class IntPredicateExample {

	public static void main(String[] args) {

		IntPredicate agePredicate = age -> age > 18;

		boolean isMajor = agePredicate.test(20);
		System.out.println("Age 20 is major : " + isMajor);

		isMajor = agePredicate.test(10);
		System.out.println("Age 10 is major : " + isMajor);
	}

}
