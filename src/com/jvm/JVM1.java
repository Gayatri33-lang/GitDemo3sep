package com.jvm;

import java.lang.reflect.Method;

public class JVM1 {

	public static void main(String[] args) {
		JVM j = new JVM();
	
		Class obj = j.getClass(); //getclass is a method which returns object of type class
		System.out.println(obj.getName()); // to get the class name 
		Method[] array = obj.getDeclaredMethods();
		for (int i=0; i<array.length; i=i+1) {
			Method m = array[i];
			System.out.println(m.getName());
		}

	}

}

//JVM : mine

//JVM j =new JVM();
//Class: java's class

//Class obj = new Class();