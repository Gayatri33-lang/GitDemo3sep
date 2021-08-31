package com.test;

public class BreakExample {

	public static void main(String[] args) {
		
			for (int i = 0; i<=3; i= i+1) {
			for (int j = 0 ; j<=3; j = j+1) {
				if ( i ==2 && j ==2) {
					break;
				}
				else if ( i ==3) {
					break ;
				}
		
				System.out.println(i+" "+j);
			}
			
		}

	}

}
