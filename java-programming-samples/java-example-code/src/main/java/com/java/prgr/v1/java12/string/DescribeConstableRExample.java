package com.java.prgr.v1.java12.string;

import java.util.Optional;

public class DescribeConstableRExample {
	public static void main(String[] args) {
		String status = "SUCCESS";
		Optional<String> optional = status.describeConstable();
		System.out.println(optional);
		System.out.println(optional.get());
		System.out.println(optional.isPresent());
	}
}
