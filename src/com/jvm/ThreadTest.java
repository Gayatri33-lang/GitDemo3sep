//Note:- Package java.lang is autoamtically imported and do not need to import its classes

package com.jvm;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		ThreadTest t = new ThreadTest();
		int result = t.method(10);
		System.out.println(result);
	
	}
	public int method (int a) {
		System.out.println(Thread.currentThread().getName());
		return 10;
	}

}
