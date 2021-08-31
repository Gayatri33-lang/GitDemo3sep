package com.Interface;

 interface C11 {
	void draw(); // in interface all methods are by default public , abstract 
	
}
class A implements C11 {
	public void draw(){ // parent method is by default public so must to make this method public
		System.out.println("why y drawing is not good");
	}
}
public class C10{
	public static void main (String[]args) {
		C11 ie = new A();
		ie.draw();
	}
}
