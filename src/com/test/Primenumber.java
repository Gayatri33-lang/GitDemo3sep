// user input 1 no tell no is prime or not eg 1500 check 2-1499 if % is != 0 then it is prime 
// 1. condition -> if n % 2 - n-1 ==0 then not prime else it is prime
package com.test;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		System.out.println("Enter a no");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		Primenumber pn = new Primenumber();
		String result = pn.isprime(a);
		System.out.println(result);

	}

	// 11
	// 2 to 10 2,3,4,5,6,7,8,9,10
	public String isprime (int a) {
		int i = 2;
		while ( i <a) {
			if (a%i == 0) {
				return "Not Prime";
			}
			i = i +1;
			
		}
		
		return " prime";
	}
}
