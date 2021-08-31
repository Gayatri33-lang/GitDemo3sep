// find sum of prime no's and if it is even print even , if odd print odd 
//7 // 2-6 if any num div by 7 then not prime 

package com.test;

public class SumPrimeArray {

	public static void main(String[] args) {
	int [] array = {6,7,8,9,9,};
	SumPrimeArray sp = new SumPrimeArray();
	String result =sp.SearchPrime1(array);
	System.out.println(result);
	}
	
	public String  SearchPrime1 (int[] array2) {
		SumPrimeArray sp = new SumPrimeArray();
		int sum = 0;
		for (int i =0; i <array2.length; i=i+1) {
			boolean isprime = sp.SearchPrime2(array2[i]);
			if (isprime ==true) {
				sum = sum +array2[i];
			}
			
			
			}
		if (sum % 2 ==0) {
			return "even";
		}
		return "odd";
	}
		//2-(a-1)
	public boolean SearchPrime2 (int a) {
		for ( int i = 2; i <=a-1; i=i+1) {
			if (a % i==0) {
				return false;
			}
		}
		return true ;
	}

}
