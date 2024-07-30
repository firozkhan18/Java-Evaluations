package com.java.prgr.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Example to ArrayList indexOf() exception examples.
 * 
 * @author Firoz Khan
 *
 */
public class ArrayListIndexOfExceptionExamples {

	public static void main(String[] args) {

		List<Employee1> list = new ArrayList<Employee1>();

		list.add(new Employee1());
		list.add(new Employee1());

		int indexCast = list.indexOf(new Address());

		int index = list.indexOf(null);

		System.out.println("Address indexOf : " + indexCast);
		System.out.println("null indexOf : " + index);

		List<Integer> numbersList = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			numbersList.add(null);

			numbersList.add(null);

			numbersList.add(null);

			numbersList.add(null);

			numbersList.add(null);
		}

		System.out.println("null values list size : " + numbersList.size());

		int nullIndexValue = numbersList.indexOf(null);
		System.out.println("null index value : " + nullIndexValue);

	}

}

class Employee1 {

}

class Address {

}