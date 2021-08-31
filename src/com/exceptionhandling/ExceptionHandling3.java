package com.exceptionhandling;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		try {
			int a = 5/0;
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
			System.out.println("gayatri");
			
		}

	}

}
