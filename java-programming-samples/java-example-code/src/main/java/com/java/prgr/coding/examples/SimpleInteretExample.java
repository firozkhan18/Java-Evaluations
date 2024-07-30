package com.java.prgr.coding.examples;

import java.util.Scanner;

/**
 * 
 * Java Program to Calculate Simple Interest
 * 
 * @author Firoz Khan
 *
 */
public class SimpleInteretExample {

	public static void main(String[] args) {

		System.out.println("Enter the total principle: ");
		Scanner scanner = new Scanner(System.in);
		float p = scanner.nextFloat();

		System.out.println("Enter the number of years: ");
		float n = scanner.nextFloat();

		System.out.println("Enter the interest: ");
		float r = scanner.nextFloat();

		float si = (p * n * r) / 100;

		System.out.println("Calculated simple interest is : " + si);

	}

}
