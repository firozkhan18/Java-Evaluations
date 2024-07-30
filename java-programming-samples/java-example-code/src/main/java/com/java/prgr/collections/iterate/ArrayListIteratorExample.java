package com.java.prgr.collections.iterate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 
 * ArrayList Iterate Example
 * 
 * @author Firoz Khan
 *
 */

public class ArrayListIteratorExample {

	public static void main(String[] args) {

		ArrayList<String> countries = new ArrayList<String>();

		countries.add("India");
		countries.add("USA");

		System.out.println("list values : " + countries);

		Iterator<String> it = countries.iterator();

		while (it.hasNext()) {
			it.remove();
		}

	}

}
