//Chcek how many times c is coming in string in any particular string string = "gayatri" ,g
// gayatri 
//a
package com.test;
import java.util.Scanner;
public class StringTest {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine(); //"gayatri"
		System.out.println("Enter a character");
		char c1 = s.nextLine().charAt(0); // to input any character "a" 
		StringTest st = new StringTest();
		int b =st.method(s1, c1);
		System.out.println(b);

	}
	public int method (String s, char c) {
		int count = 0; 
		for (int i = 0 ; i<s.length(); i = i+1) { //i =0 ; i<=7
			if (s.charAt(i) == c) { //0=
				count = count+1; //0+1 =1 2.1 3.2

			}
			}
		return count;
		}
	}

