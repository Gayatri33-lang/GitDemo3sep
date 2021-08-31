package com.Polymorphism;

public class Instanceof {

	public static void main(String[] args) {
		Women w = new Women();
		Women w1 = new Girl();
		Girl g = new Girl();
		Man m = new Man(); // man not extending to anyone no upcasting/downcasting possible 
		boolean b = w instanceof Girl; // false parent is not type of child but child is type of parent
		
		
		
		
		boolean b1 = w instanceof Women;
		//boolean b2 = w instanceof Man; // Copiler found instanceof can only be used when a class is extending (inheritance)
		boolean b3 = g instanceof Women;
		boolean b4 = g instanceof Girl;
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b3);
		System.out.println(b4);
		
		Women w2 = new Girl(); //upcasting parent refrence can point either to itself or its parent  
		//Girl g1 =  new Women(); // not allowed child refrence can not point to parent object  , if u want to do use downcasting // child always has extra method 
		Girl g1 = (Girl) new Women(); //downcasting
	//	Man m2 = (Girl) new Man(); // Girl should be parent 
	}

}
class Women {
	
}
class Girl extends Women{
	
}

class Man  {
	
}