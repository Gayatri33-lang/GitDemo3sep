// continue :- if continue encountered it will not run next statement and jump to next immidiate statement 



package com.test;

public class ContinueExample {

	public static void main(String[] args) {
		for ( int i = 0; i <=20; i = i+1) {
			if(i%2==0) {
				break; 	
			}
			System.out.println(i);
		}
		
	}

}
