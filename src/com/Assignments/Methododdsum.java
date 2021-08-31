package com.Assignments;

import java.util.Scanner;

public class Methododdsum {

	public static void main(String[] args) {
		System.out.println("enter a no");
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		Methododdsum ms = new Methododdsum();
		int resultsum =ms.oddsum(a);
		System.out.println(resultsum);
		
		

	}
	public int oddsum( int n) {
		int sum = 0;
		for (int i = 0; i<=n; i=i+1) {
			if(i%2!=0) {
				sum = sum+i;
			}
		}
		return sum;
	}
}
