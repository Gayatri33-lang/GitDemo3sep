package com.test;

public class Continuenested {

	public static void main(String[] args) {
		for ( int i = 0; i<=10;i = i+1) {
			for (int j = 0; j<5; j = j+1) {
				if ( i ==2 && j ==2) {
					continue;
				}
				System.out.println(i+" "+j);
			}
		}

	}

}
