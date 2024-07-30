package com.java.prgr.string.methods;

public class StringCopyValueOfExample {
	public static void main(String[] args) {

		char[] c = { 'j', 'a', 'v', 'a' };
		String str = String.copyValueOf(null);

		System.out.println("Copy of array as String : " + str);
	}
}
