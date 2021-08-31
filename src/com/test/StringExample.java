// User will enter 2 strings check child string exist in parent string or not //parent string -gayaakriyatabc //check child string -yata exist in gayatri or not
// hint : Nested for loop check first 2 characters s2.length()
package com.test;
import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		StringExample se = new StringExample();
		Boolean b1 =se.method(s1, s2);
		System.out.println(b1);
		

	}
	//gayaakriyatabc
	//yata
	public boolean method (String parent,String child) {
		
			for ( int i = 0 ;i<parent.length();i=i+1) {
				if(child.charAt(0)==parent.charAt(i)) {
			
					int temp = i; //i is stored in a temporary variable // i =2
					for(int j =0; j<child.length();j=j+1) {
						if (child.charAt(j)!=parent.charAt(temp)) {
							break;
						
						}
						else if(child.length()-1==j) {
							return true;
						}
						temp = temp+1; //temp=3
					}
			
					
				
			}
		}
			return false;
	}
}
