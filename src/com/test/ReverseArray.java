package com.test;

public class ReverseArray {

	public static void main(String[] args) {
		int [] array = new int[4];
		int j = array.length-1;
		for (int i =array.length-1; i>=0; i=i-1) { // i=4; i>0; i=i-1
			System.out.println(array[i]);
			
		}
		for (int i : array) {
			System.out.println(array[j]); //3rd element 
			j=j-1;
		}

	}

}
