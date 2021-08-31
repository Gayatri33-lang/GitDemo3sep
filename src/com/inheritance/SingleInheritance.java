// Human , animal  , homo eructus 

// make class cat , bird (peigon) - given propeorty to each common in class specialisation in class



package com.inheritance;

public class SingleInheritance {
	Living l = new Living();
	Animal a = new Animal();
	Peigon p = new Peigon();
	
	public static void main (String [] args) {
		
		SingleInheritance si = new SingleInheritance();
		si.p.height = 3;
		si.p.fly();
		si.a.cantspeak();
		si.a.eat();
		System.out.println(si.p.height);
	}
	

}

class Living {
	int height;
	boolean makenoice;
	int noofeyes;
	void eat() {
		System.out.println("Every living eat");
	}
}
class Human extends Living {
	int nooflegs;
	void mind() {
		System.out.println("Humans have mind");
	}
	void spirituality() {
		System.out.println("Be spiritual & Conncet with God");
	}

}
class Animal extends Living  {
	
	void cantspeak() {
	System.out.println("Animals cant speak");
	}
}

class Peigon extends Living {
	void fly() {
	System.out.println("Flying bird");
	}
}
	

