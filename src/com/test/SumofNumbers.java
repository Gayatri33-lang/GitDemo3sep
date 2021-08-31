// number = 5 given print sum of number 


package com.test;
import java.util.Scanner;

public class SumofNumbers {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int sum = 0; 
		while (a>0) {			
			
			sum = sum +a; // 1. i = 5 , sum= 0+5 , 5+4 , 9+3 , 12+2 , 14+1
			a = a-1;
		}
		System.out.println(sum);
	}

}
