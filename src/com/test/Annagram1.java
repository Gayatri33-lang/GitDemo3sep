package com.test;
import java.util.Scanner;
public class Annagram1 {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		Annagram1 am1 = new Annagram1();
		Boolean b1 =am1.Annagram(s1, s2);
		System.out.println(b1);
		

	}
   // s1 = abc , s2=def
	public boolean Annagram (String s1, String s2){
		if (s1.length()==s2.length()) {
			for ( int i = 0; i <=s1.length()-1; i = i+1) {
				for ( int j = 0 ; j <=s2.length()-1; j = j+1) {// i =0, j =1
					//System.out.println(j+" "+s2.length());
					if (s1.charAt(i)==s2.charAt(j)) {  //a==b , a==c , a==a
						break;
					}
					else if (j==s2.length()-1) {
						return false;
					}
					
				}
				
			}
		}
		return true;
		
			
		
		
	}

}
