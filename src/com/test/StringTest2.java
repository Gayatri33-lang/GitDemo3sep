// enter a string print length of string is even of odd
package com.test;
import java.util.Scanner;

public class StringTest2 {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		StringTest2 st2 = new StringTest2();
		String s2 =st2.method(s1);
		System.out.println(s2);

	}
	public String method (String s){
		if(s.length()%2 ==0) {
			return "even";
		}
	       return "odd";
	}
}
