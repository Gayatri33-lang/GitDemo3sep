// meaning of a final method is method can never be overrideen.


package com.Final;

public class FinalMethod {

}
final class Animal{
	final void eat() {
		System.out.println("Animal eats food");
	}
}
/*class Dog extends Animal{ // final class can not extended
	void eat(int i) {
		System.out.println("Dogs eat");
	}
}*/