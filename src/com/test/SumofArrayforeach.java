// O(n)

package com.test;

public class SumofArrayforeach {

	public static void main(String[] args) {
		int[] array = new int[3];
		int j =0;
		int sum = 0;
		int count = 0;
		//for (int i : array) {
			//System.out.println(array[j]);
			//j=j+1;
			//sum = sum+array[j];
		//}
		for (int i =0; i<array.length; i=i+1) {
		//	System.out.println(array[i]);
		}
		for (int i : array) {
			count = count+1;
			
		}
		System.out.println(count);

	}

}
