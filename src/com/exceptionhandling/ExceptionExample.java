package com.exceptionhandling;

public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println("First line");
		int i = 10;
		int j = 0;
		int k;
		
		try{
		//	System.out.println("First line");
			int a = 5/0;
			k = i/j;
			
		//	System.out.println("Last line");
		}
		catch(Exception e) {
			System.out.println("Exception caught");
			System.out.println(i/(j+2));
		}
		System.out.println("Last line");
		
	}

}
