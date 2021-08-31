// find a particular character how many times coming 

package com.test;

import java.util.Scanner;

public class charactercount {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine(); // "gayatri"
		System.out.println("Enter a character");
		char c1 = s.nextLine().charAt(0);
		charactercount cc = new charactercount();
		int result = cc.method(s1, c1);
		System.out.println(result);
	}

	public int method ( String s , char c) {
		int i = 0;
		int count = 0;
		while (i < s.length()) {
			if (s.charAt(i)==c) {
				count = count+1;
				
			}
			i = i+1;
		}
		return count;
	}
}
