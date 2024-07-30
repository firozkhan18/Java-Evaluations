package com.java.prgr.v1.java8.functional;

import java.util.function.Supplier;

/**
 * Supplier Interface in Java with Examples
 * 
 * @author Firoz Khan
 *
 */
public class SupplierExample {

	public static void main(String[] args) {

// This Supper always return a random value
		Supplier<Double> randomValue = () -> Math.random();
		System.out.println(randomValue.get());
	}
}