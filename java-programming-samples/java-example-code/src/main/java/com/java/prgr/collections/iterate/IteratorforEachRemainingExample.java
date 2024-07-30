package com.java.prgr.collections.iterate;

import java.util.ArrayList;

/**
 * 
 * ArrayList Iterate forEachRemaining Example
 * 
 * @author Firoz Khan
 *
 */

public class IteratorforEachRemainingExample {

	public static void main(String[] args) {

		ArrayList<String> countries = new ArrayList<String>();

		countries.add("Candada");
		countries.add("UK");
		countries.add("India");
		countries.add("USA");

		countries.iterator().forEachRemaining( country -> System.out.println(country));
	}

}
