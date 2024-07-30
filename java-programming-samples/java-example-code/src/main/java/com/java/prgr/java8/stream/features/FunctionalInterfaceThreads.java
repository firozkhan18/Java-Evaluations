package com.java.prgr.java8.stream.features;

public class FunctionalInterfaceThreads {

	public static void main(String[] args) {

		// without functional interface
		Thread thread = new Thread(new Runnable() {
			public void run() {
				System.out.println("New thread running.");
			}
		});
		thread.start();

		// with functional interface
		Thread thread2 = new Thread(() -> System.out.println("With functiona interface New thread running."));
		thread2.start();

	}

}
