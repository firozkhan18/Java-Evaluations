package com.java.prgr.v1.staticex;

public class PerformAction {

	static int retryCounter = Incrementor.incrementByOne();
	
	public static int performCountInc() {
	
		return retryCounter;
	}
}
