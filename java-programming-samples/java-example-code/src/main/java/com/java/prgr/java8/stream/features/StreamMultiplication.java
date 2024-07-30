package com.java.prgr.java8.stream.features;

import java.util.Arrays;

public class StreamMultiplication {

	public static void main(String[] args) {
		int sum = Arrays.stream(new int[] { 1, 2, 3, 4, 5 }).filter(i -> i >= 3).map(i -> i * 2).sum();

		System.out.println("Stream multiplication sum : " + sum);
	}

}
