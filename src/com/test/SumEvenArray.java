// O(n) - O(4)

package com.test;

public class SumEvenArray {

	public static void main(String[] args) {
		int[] array = {1,6,3,4};
		SumEvenArray sea = new SumEvenArray();
		int sumresult =sea.Sumeven(array);
		System.out.println(sumresult);

	}
	public int Sumeven(int[] array2) {
		int sum= 0;
		for (int i = 0; i<array2.length; i=i+1) {
			if (array2[i]%2==0) {
				sum = sum+array2[i];
			}
		}
		return sum;
	}

}
