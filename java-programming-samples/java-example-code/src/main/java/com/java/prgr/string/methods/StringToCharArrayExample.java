package com.java.prgr.string.methods;

public class StringToCharArrayExample {
	public static void main(String[] args) {

		String input = "java-w3schools";
		char[] chars = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			System.out.print(chars[i] +" ");
		}

	}
}
