package com.java.prgr.access.modifiers;

class SuperClass {
	protected void process() {

		// processing generic logic
	}
}

class SubClass extends SuperClass {
	protected void processSubClass() {
		process();
		// processing sub class logic with generic logic from parent class.
	}
}