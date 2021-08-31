// Exception Handling in Inheritance
// Arithmatic, nullpointer, array index - unchecked ,..... i/o , file not found - checked exception
// if parent class method is throwing unchecked exception then child class method can only throw unchecked exception
//if parent class method is throwing checked exception , child class method can throw same or subtype of the parent checked exception or Runtime exception
// if parent class is not throwing any exception then child class can only throw unchecked exception
// if parent class method is throwing an exception then child class method can throw either parent's one exception or child of the exception of parent's exception4
//Parent throws any type of exception child may or may not throw any exception
package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionInInheritance {

	
}

class Superclass {
	public void method() throws IOException {
		
		}
		
	}

class Subclass extends Superclass{
	@Override
	public void method() {
		
	}
}


// CASE 1 : Parent - checked Exception , child - No exception  : VALID 
//CASE 2 : Parent - unchecked exception , child - No exception : VALID
//CASE 3 : Parent - No Exception , child - Checked Exception :INVALID 
//CASE 4 : Parent - No exception , child - unchecked Exception  : VALID 
//CASE 5 : Parent - Exception , child - same exception or child of parent's exception': VALID 
//CASE 6 : Parent - Exception , child - same exception or parent of parent's exception :INAVLID "  - exception is not compatible