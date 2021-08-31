
// in method overriding if any method has same name & perameter list then its return type should be same 


package com.Polymorphism;

public class MethodOverriding {
	static Dog dd;
	

	public static void main(String[] args) {
		MethodOverriding mo = new MethodOverriding();
		Animal a = new Animal();
		Dog d = new Dog();
		dd.eat();//null pointer exception
		d.eat();
		a.eat();
		
		
	}


}
class Animal {
	void eat () {
		System.out.println("All animals can eat");
	}
}
class Dog extends Animal {
	void eat() {
		System.out.println("Dog is eating");
	}
}
