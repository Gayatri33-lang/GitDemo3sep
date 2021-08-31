// byte < short <int <long 
//float <double 

//. if match found then execute that method else it follow type type promotion

// type promotion means short can be contained in bigger data type but bigger not into small.
// type promotion will throw compile time error in case of ambiguity

package com.Polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		short a = 10;
		byte b = 20;
		byte c = 2;
		a= c;
		
		MethodOverloading mo = new MethodOverloading();
		long result1 =mo.add(a,b);
		int result2 = mo.add(10, 15, 10);
		System.out.println(result1+" "+ result2);
	}
	public long add(int a, short b) {
		return a+b;
	}
	public int add(int a, int b, int c) { //method overloading
		return a+b+c;
	}
	public double add(int a , double b) {
		double sum = a+b;
		return sum;
	}
	public double add(double a , int b) {
		return a*b;
	}
	

}
