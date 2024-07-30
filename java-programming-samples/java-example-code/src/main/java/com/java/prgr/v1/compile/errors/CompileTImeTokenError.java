package com.java.prgr.v1.compile.errors;

/**
 * Compile time error simulation example program.
 * 
 * @author Firoz Khan
 *
 */
public class CompileTImeTokenError {

	// compile time error code. This code commented. Please uncommnet to see the
	// actual problem.

	/*
	 * String[] plaintext = new String[26]; for(int i = 0;i<26;i++) {
	 * System.out.println("Welcome to Firoz Khan blog"); }
	 */

	// Fix 1
	public static void main(String[] args) {
		String[] plaintext = new String[26];
		for (int i = 0; i < 26; i++) {
			System.out.println("Welcome to Firoz Khan blog");
		}
	}

	// Fix 2
	public boolean print() {
		String[] plaintext = new String[26];
		for (int i = 0; i < 26; i++) {
			System.out.println("Welcome to Firoz Khan blog");
		}
		return true;
	}

	// Fix 3
	{
		String[] plaintext = new String[26];
		for (int i = 0; i < 26; i++) {
			System.out.println("Welcome to Firoz Khan blog");
		}
	}
}
