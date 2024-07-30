package com.java.prgr.v1.java8.defaultmethod;

public interface InterfacePriorJava8 {

	int method1();

	int method2();

	default int method3() {
		System.out.println("method3 is a default method.");

		return 1;
	}
}
