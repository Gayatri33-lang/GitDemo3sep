// in abstract class common methods are implimented and specific fucntionality remains abstract 
//
//

package com.Abstract;

public class Abstractexample {

	public static void main(String[] args) {
		System.out.println("Test4");
	}

}
abstract class Animal { // to enforce rules 
	abstract void run ();
	void eat() {
		System.out.println("Animals eating");
	}
}
class Cat extends Animal { // this class must impliment inherited abstract method 
	void run () {
		System.out.println("cat is running ");
	}
}
class Dog extends Animal {
	void run () {
		System.out.println("Dog is running ");
	}
}

class cat1 {
	void run() {
		System.out.println("cat1 is running");
	}
}

class Dog1 {
	//void run() {
	//	System.out.println("Dog1 is running");
	//}
}