// why we call it Runtime polumorphism?
// Ans :- Because JVM decide at Runtime which child class  object to be created by refrence var of parent class  at runtime that is why 


package com.Polymorphism;

import java.util.Scanner;
 

public class RuntimePoly {
	
	public static void main(String[] args) {
		System.out.println(".......   Menu .........");
		System.out.println("1. Honda Bike");
		System.out.println("2. Avenger Bike");
		System.out.println("enter option");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		Bike b = null;
		if (s1.equals("1")) {
			b = new Honda(); // upcasting 
		}
		else if (s1.equals("2")) {
			b = new Avenger(); //upcasting 
		}
		else {
			System.out.println("invalid option");
			return;
		}
		b.run();

	}

}
class Bike {
	void run() {
		System.out.println("parent bike");
	}
}

class Honda extends Bike {
	@Override  // metadata : data about data 
	void run() {
		System.out.println("honda child1 bike");
	}
}
class Avenger extends Bike {
	@Override
	void run() {
		System.out.println("Avenger child2 bike");
	}
}