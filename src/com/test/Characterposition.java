// user give 2 inputs string , 1 character find out character is in which position ??


package com.test;
import java.util.Scanner;
public class Characterposition {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		char c1 = s.nextLine().charAt(0);
		Characterposition cp = new Characterposition();
		int result =cp.method(s1, c1);
				System.out.println(result);

	}
	// gayatri //k //o/p - 4
	public int method(String s ,char c) {
		int i = 0;
		while (i < s.length()) {
			if(s.charAt(i)==c) {
			return i;
			}
		
			 i = i+1;
			 
				 
			 
		}
		return -1;
	}

}
