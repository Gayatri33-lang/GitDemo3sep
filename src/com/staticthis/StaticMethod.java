// static methods are loaded when class is loaded
// why static method can only use static variables ? :-
//  Ans :- when class loads name - method area , no is not in picture as of now & no obj is created 
// when need to work on obj property tehn it is non static else static 
package com.staticthis;

public class StaticMethod {
static String name; // declared & initialized as null at time of class loading 
int no; // only declared and it will be initialized at the time of object creation only 
	public static void main(String[] args) {
		//System.out.println(no); // non static can not be accessed 
		System.out.println(name);// static can be accessible as it is initialized as null at time of class loading 

	}

}
