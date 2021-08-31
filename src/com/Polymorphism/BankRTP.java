package com.Polymorphism;

import java.util.Scanner;

public class BankRTP {

	public static void main(String[] args) {
		System.out.println(".......Choose Bank HDFC or Syndicate ......");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		Bank3 b = null;
		if (s1.equals("HDFC")) {
			b = new HDFC3(); // upcasting
		}
		else if (s1.equals("Syndicate")){
			b = new Syndicate (); //upcasting 
	}
		else {
			System.out.println("Invalid bank");
			return ;
		}
		int i =b.getRateofIntrest();
		System.out.println(i);
}
}

class Bank3{
	int  getRateofIntrest() {
		return 4;
	}
}
class HDFC3 extends Bank3 {
	int getRateofIntrest() {
		return 3;
	}
}
class Syndicate extends Bank3{
	int getRateofIntrest() {
		return 7;
	}
}

