package com.constructor;

public class Abstractreallife {

	public static void main(String[] args) {
		Bike b = new Honda(); // because 
		b.run();
		b.Ptrol();
		//b.gears(); // not allowed as reference is of parent class .. refrence jis class ka hua uski methods available but call uska jiske object created

	}

}
abstract class Bike {
	abstract void run();
	void Ptrol() {
		System.out.println("My Bike consumes lot of petrol so i want to buy a car");
	}
}
class Honda extends Bike{
	void Ptrol() {
		System.out.println("petrol is costly");
	}
	void run() {
		System.out.println("running safely");
	}
	void gears() {
		System.out.println("Gears do not work in this bike");
	}
}
