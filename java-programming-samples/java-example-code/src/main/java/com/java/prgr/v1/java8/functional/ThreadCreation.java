package com.java.prgr.v1.java8.functional;

public class ThreadCreation {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread execution started.");
			}
		});

	}
}