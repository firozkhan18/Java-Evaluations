package com.java.prgr.staticex;

public class PerformAction {

	static int retryCounter = Incrementor.incrementByOne();
	
	public static int performCountInc() {
	
		return retryCounter;
	}
}
