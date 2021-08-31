//Exception Propagation :- An exception is first thrown from the 
//top of the stack and if it is not caught, it drops down the call stack to 
//the previous method,If not caught there, the exception again drops down to the 
//previous method, and so on until they are caught or until they reach the very bottom of the call stack.This is called exception propagation.
// stack : LIFO or FILO
// NOTE :- Checked exception are not propagated


package com.exceptionhandling;

public class ExceptionPropex {

	public static void main(String[] args) {
		TestExceptionPropagation ob = new TestExceptionPropagation();
		ob.method3();
		System.out.println("done");
	}

}
class TestExceptionPropagation{
	public void method1 () {
		int a[] = new int[5];
		a[6]=9;
	}
	void method2() {
		method1();
	}
	void method3() {
		try {
			method2();
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Exception handled");
		}
	}
}
