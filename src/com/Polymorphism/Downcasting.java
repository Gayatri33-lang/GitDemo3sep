package com.Polymorphism;

public class Downcasting {

	public static void main(String[] args) {
	

	}

}

class A3 {
	
}
class B3 extends A3 {
	A3 a = new B3(); //UPCASTING
	B3 b = (B3)new A3(); //Downcasting 
}
