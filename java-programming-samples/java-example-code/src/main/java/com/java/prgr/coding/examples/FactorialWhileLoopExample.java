package com.java.prgr.coding.examples;

import java.util.Scanner;

/**
 * 
 * Iterative java program to find the factorial using while loop
 * 
 * @author Firoz Khan
 *
 */
public class FactorialWhileLoopExample {

	public static void main(String[] args) {

		System.out.println("Enter a number : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int factorialResult = 1;

		// using while loop
		int i = 1;
		while (i <= n) {

			factorialResult = factorialResult * i;
			i++;
		}

		System.out.println("Factorial value for " + n + " using while loop is : " + factorialResult);

	}

}
