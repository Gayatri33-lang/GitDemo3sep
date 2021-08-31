package com.Polymorphism;

public class Covariant {
public static void main(String[] args) {
		
		B1 b = new B1();
		b.get().message();
}
}
class A1 {
	A1 get() {
		return this;
	}
}
class B1 extends A1 {
	B1 get() {
		return this;
	}
	void message () {
		System.out.println("covariant");
	}
}

