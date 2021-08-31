package com.exceptionhandling;

public class NestedTry {

	public static void main(String[] args) {
	NestedTry nt = new NestedTry();
	nt.method();
	System.out.println("naveen is the best teacher");
		
}
	public void method() {
		try {
			int i = 10/0;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
			//return; // as return is the last statement of a method but finally block is there so finally block is always executed whatever the situation is
			System.exit(-1); // exit is a method which exit the flow JVM , Main thread evrything is closed ... this method stops JVM so finally stops
		}
		finally {
			System.out.println("From finally block");
		}
	}
}
