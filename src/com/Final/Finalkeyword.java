package com.Final;

public class Finalkeyword {

}
class Child {
	final int a ; // imp note :- if a final variable is blank/uninitialised then its value can be assigned through construvtor only not method
	void method() {
//		a = 20; // can not assign value to a final var in method 
	}
	Child(int a1){
//		a = a1; // value already assigned final var is no more blank and only  blank final variable can be initialised in a constructor
	}
	{
		a = 10; // blank/uninitialised final var value initialise in instance initialiser block
	}
}