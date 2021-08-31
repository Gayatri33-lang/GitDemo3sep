// Difference between Throw & Throws :
//Throw :- Throw is used to mannualy throw exception caught in catch block 
// Throws is used with method signature to define that method is throwing exception
// Throws keyword is added to method because code can throw an exception
// it is mendatory to use throws if throw is used but it is not mendatory to use throw if throws is used
package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsvsThrow {

	public static void main(String[] args) {
		

	}
	public void method ()  {
		String line = "";
		try {
			FileReader fr = new FileReader(line);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} 
		
	}
	

}
