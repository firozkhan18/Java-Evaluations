package com.java.prgr.v1.stringbuilder;

/**
 * StringBuilder Example
 * 
 * @author Firoz Khan
 *
 */
public class StringBuilderExample {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder("Hello ");
		System.out.println("Builder contents after creation: " + builder);
		builder.append(", Welcome to Java8Example blog");

		System.out.println("Builder contents after append : " + builder);
		System.out.println("Builder length : " + builder.length());

		builder.insert(5, " Saying Hai ");
		System.out.println("Builder contents after insertion : " + builder);

		builder.delete(5, 14);
		System.out.println("Builder contents after deletion : " + builder);

	}

}
