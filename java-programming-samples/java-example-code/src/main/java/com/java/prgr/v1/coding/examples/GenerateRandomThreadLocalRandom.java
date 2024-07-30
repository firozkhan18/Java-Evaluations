package com.java.prgr.v1.coding.examples;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 * java program to generate a integer random number using random.nextInt().
 * 
 * @author Firoz Khann
 *
 */
public class GenerateRandomThreadLocalRandom {

	public static void main(String[] args) {

		// creating a Random instance
		ThreadLocalRandom localThreadRandom = ThreadLocalRandom.current();

		// Generating random int values
		int randomTheadLocalValue1 = localThreadRandom.nextInt();
		int randomTheadLocalValue2 = localThreadRandom.nextInt();

		System.out.println("local thread int value 1 : " + randomTheadLocalValue1);
		System.out.println("local thread int value 2 : " + randomTheadLocalValue2);

		// Generating a random double values
		double localThreadDoubleValue1 = ThreadLocalRandom.current().nextDouble();
		double localThreadDoubleValue2 = ThreadLocalRandom.current().nextDouble();

		System.out.println("Local thead double value 1 : " + localThreadDoubleValue1);
		System.out.println("Local thead double value 2 : " + localThreadDoubleValue2);

		// Generating a random long values
		double localThreadLongValue1 = ThreadLocalRandom.current().nextDouble();
		double localThreadLongValue2 = ThreadLocalRandom.current().nextDouble();

		System.out.println("Local thead long value 1 : " + localThreadLongValue1);
		System.out.println("Local thead long value 2 : " + localThreadLongValue2);

		// Generating a random boolean values
		double localThreadBooleanValue1 = ThreadLocalRandom.current().nextDouble();
		double localThreadBooleanValue2 = ThreadLocalRandom.current().nextDouble();

		System.out.println("Local thead boolean value 1 : " + localThreadBooleanValue1);
		System.out.println("Local thead boolean value 2 : " + localThreadBooleanValue2);

	}

}
