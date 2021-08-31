// covariant return type means  a subclass can have different return type as of its parents but condition is return type should be either same as parent method return type or parent return type's subclass
// child class can return same retyrnbtpe as parent class or its subtyepe 






package com.Polymorphism;

public class Methodoverridingexample {

}

class Bank {	// bank is not subclass of A
	A getrateofintrest(){
		return new A();
	}

}
class HDFC extends Bank {
	C getrateofintrest(){
		return new C ();
	}
}

class A {
	HDFC getrateofintrest() {
		return new HDFC();
	}
}
class B extends A{
	HDFC getrateofintrest() { // eill gove error =- either parent class return type or its subtype 
		return new HDFC();
	}
}
class C extends B{
	
}