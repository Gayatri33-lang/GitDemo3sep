// syntax of for each loop : for (datatype var : array){}


package com.test;

public class Foreachloopexample {

	public static void main(String[] args) {
		int[] array = new int[4];
		array[0] = 20;
		for (int i=0; i<array.length; i=i+1) {
			System.out.println(array[i]);
		}
		for(int var : array) {
			System.out.println("This is using for each loop"+ " "+ var);
		}
	}

}
