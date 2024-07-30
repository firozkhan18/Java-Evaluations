package com.java.prgr.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Adding primitive int array to ArrayList
 * 
 * @author Firoz Khan
 *
 */
public class ArrayListAddPrimitiveIntegersArray {

	public static void main(String[] args) {

		List<Integer[]> list = new ArrayList<>();

		// int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		list.add(0, intArray);

		System.out.println("int array to arraylsit : " + list);

		for (int i = 0; i < list.size(); i++) {
			Integer[] array = list.get(i);

			for (int j : array) {
				System.out.println(j);
			}

		}

	}

}
