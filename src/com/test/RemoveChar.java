//string , character return new string after removing given character 

package com.test;
import java.util.Scanner;
public class RemoveChar {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		char c1 = s.nextLine().charAt(0);
		RemoveChar rc = new RemoveChar();
		String result =rc.Removecharacter(s1, c1);
		System.out.println(result);
		char dupresult = rc.duplicate(s1);
		System.out.println(dupresult);

	}
	//abab // a
	public String Removecharacter( String s, char c) {
		String s1 = "";
		for ( int i = 0 ; i <=s.length()-1 ; i = i+1) {
			if (s.charAt(i)==c) {
				
			}
			else {
				s1 =s1+s.charAt(i);
			}
			
		}
		return s1;
	}
//abcbda  then it shud return b- first repeating character 
	public Character duplicate(String s) {
		for (int i = 0 ; i<=s.length()-1; i = i+1 ) {
			for ( int j =0; j<=s.length()-1; j = j+1) {  // 0 - 5
				if (s.charAt(i)==s.charAt(j) && i!=j) {
					return s.charAt(i);
				}
			}
		}
		return null;	
		}
	}