package com.exceptionhandling;

public class MultiCatchExample1 {

	public static void main(String[] args) {
	try {
		int a = 5;
		int b = 0;
		int c = a/b;
		MultiCatchExample1 me = new MultiCatchExample1();
	//	me = null;
		me.toString();
		int a1[] = new int [6];
		a1[6] = 10;
	}
	catch (ArithmeticException ae) {
		System.out.println(ae);
		System.out.println("airthmatci exception caught");
	}
	catch (ArrayIndexOutOfBoundsException aio) {
		System.out.println(aio);
		System.out.println("Array exception caught");
		
	}
	catch (NullPointerException np) {
		System.out.println(np);
		System.out.println("NullpointerException caught");
	}
	}

}
