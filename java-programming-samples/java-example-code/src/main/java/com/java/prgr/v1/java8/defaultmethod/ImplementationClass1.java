package com.java.prgr.v1.java8.defaultmethod;

public class ImplementationClass1 implements InterfacePriorJava8 {

	@Override
	public int method1() {
		System.out.println("class 1: method 1");
		return 0;
	}

	@Override
	public int method2() {
		System.out.println("class 1: method 2");
		return 0;
	}

	public static void main(String[] args) {
		ImplementationClass1 class1 = new ImplementationClass1();
	}
}
