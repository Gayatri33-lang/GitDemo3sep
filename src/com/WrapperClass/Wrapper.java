

package com.WrapperClass;

public class Wrapper {
	static int age; //belongs to class
	String name;// belongs to obj
	
	public void change(WrapperTest3 input) {
		input.location = "india";
	}
	
	public static Integer valueof(int a) {
		Integer b = new Integer(a);
		return b;
		
	}
	public static void main(String[] args) {
		int i = 10; // i is primitive & does not holds anything other than its value that is 10
		Integer i1 = new Integer(10); // i1 is refrence of object i1 holds all the methods& vars Integer class have.
		boolean b = false; //b is primitive
		Boolean b1 = new Boolean(true);// b1 is refrence of object Boolean 
		//System.out.println(i);
		//System.out.println(i1);
		Integer i2 = 10; // autoboxing : converts primitive to object 
		int i3 = new Integer(5); //unboxing
		int i4 = 5;
		int i5 = 5;
		Integer i6 = 10;
		Wrapper w = new Wrapper();
		w.changevalue(i5);
		w.changevalue(i6);
		//System.out.println(i5);
		//System.out.println(i6);
		
		WrapperTest3 w3 = new WrapperTest3();
		w3.name = "gayatri";
		w3.location = "snp";
		System.out.println(w3.location);
		w.change(w3);
		System.out.println(w3.location);
	}
	public void changevalue (Integer i) {
		i = 50;
	}
	public static void calculation() { // no need to create objects 
		//name = "gayatri"; // this var is for objects as its non static 
	}
}

class WrapperTest {
	public static int StaticMethod() {
		Wrapper.calculation();
		return 0;
		
	}
	public int NonStaticMethod() {
		return 0;
	}
}

class WrapperTest3 {
	String name;
	String location;
	
}
