package com.java.prgr.coding.examples;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * Shutdown in java.
 * 
 * @author Firoz Khan
 *
 */
public class ShutdownComputer {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the time that you want to shutdown after some amount of time : ");
		Double timeInSeconds = scanner.nextDouble();

		Runtime runtime = Runtime.getRuntime();
		Process p = runtime.exec("shutdown -s -t " + timeInSeconds);

		System.exit(1);
		

	}

}
