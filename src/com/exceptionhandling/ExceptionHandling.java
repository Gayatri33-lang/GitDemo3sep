// Exception is Bad Condition on java programme 
// JVM stops execution at the line where it finds exception and do not run remaining code
// to handle exception so remaning part execute is known as exception handlimg and it is performed using try catch block

// there are many types of exception , JDK has .java file of all such exceptions eg. arithmaticexception.java
// based on type of exception JDK prepare object of exception class & throws it 

package com.exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int[] a = new int[5];
			System.out.println(a[7]); //exception : array index out of bound
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound");
		}
			
		
		
		try {
		int a1 = 5;
		int b = 0;
		int c = a1/b; // no num can be divisible by 0 as it goes into infinity : arithmatic exception
		System.out.println(c);
		}
		catch(ArithmeticException e1){
			System.out.println("Arithmaticxception caugth");
		}
		try {
		Emp e = new Emp();
		e = null;
		System.out.println(e.toString());// Null pointer exception e is null can not perform any operation on null
		}
		catch (NullPointerException n) {
			System.out.println("Null pointer exception caught ");
			
		}
		
	
	}
	

}
class Emp{
	
}
