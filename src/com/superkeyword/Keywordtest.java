// imp note "- whenever we create object of child .. parent default constructor is always called in parent class there must be a default construvctor 
// super should be the first statement of every constructor if super is not written java compiler calls default construcotr by default 
//child has default , parent -permaterized  - error 

// 2 solution - either make default in parent or in child use super keyword to call constructor 

// Super:- Parent class method or constructor , variable can be called using super keyword 
// super will be used in method overriding because 
package com.superkeyword;

public class Keywordtest {
	public static void main (String [] args) {
		keywordtest2 k2 = new keywordtest2(3); 
		//Keywordtest1 k1 = new Keywordtest1("gayatri");
		k2.method1(4);
	}
	
}

class Keywordtest1  {
Keywordtest1(String s ){
//	System.out.println("parent");
	}
//Keywordtest1(){
//	System.out.println("parent default ");
//	}

int method1(int i) {
	System.out.println("parent method");
	return i;
	
}
}

class keywordtest2 extends Keywordtest1{
	keywordtest2 (int i){
//		super(); // invalid as no default const in parent class and if we do not write this java itself create this 
		super("gayatri"); //valid
		
//	System.out.println("child")	;
	}
	
int method1(int i) {
	super.method1(5);
	System.out.println("child method");
	return i;
}
}