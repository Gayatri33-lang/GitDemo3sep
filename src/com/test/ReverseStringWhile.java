// reverse of a string using while loop

package com.test;
import java.util.Scanner;
public class ReverseStringWhile {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		ReverseStringWhile rsw = new ReverseStringWhile();
		//String result =rsw.reverse(s1);
		//System.out.println(result);
		//Boolean result1=rsw.palindrome(s1);
		//System.out.println(result1);
		String result =rsw.evencharacter(s1);
		System.out.println(result);
		

	}
	public String reverse ( String s) {
		int i = s.length()-1;
		String s2 = "";
		while ( i >=0) {
			s2 = s2+s.charAt(i);
			i = i -1;
		}
		return s2;
	}
	// abctgba starting end same 
	public boolean palindrome (String s1) {
		int i = 0;
		int j = s1.length()-1;
		while ( i <s1.length()/2) {
			if (s1.charAt(i)==s1.charAt(j)) {
				i = i +1;
				j = j-1;
			  
			  
			}
			else {
				return false;
			}
			
		}
		return true;
	}
	// gayatri return even characters position
	public String evencharacter(String s1) {
		int i = 0;
		String s2 = "";
		while ( i <s1.length ()) {
			if (i%2==0) {
				s2 = s2+s1.charAt(i);
			
			}
			i = i+1;
			
		}
		return s2;
	}

}
