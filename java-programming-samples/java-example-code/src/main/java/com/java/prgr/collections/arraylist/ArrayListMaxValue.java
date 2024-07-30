package com.java.prgr.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Finding max value from list.
 * 
 * @author Firoz Khan
 *
 */
public class ArrayListMaxValue {

	public static void main(String[] args) {

		// creating list.
		List<Integer> intValues = new ArrayList<>();

		// adding values
		intValues.add(6);
		intValues.add(64);
		intValues.add(45);
		intValues.add(60);
		intValues.add(9);
		intValues.add(2);

		// calling max() method.
		Integer max = Collections.max(intValues);
		System.out.println("ArrayList values : " + intValues);
		System.out.println("ArrayList max value : " + max);
	}
}
