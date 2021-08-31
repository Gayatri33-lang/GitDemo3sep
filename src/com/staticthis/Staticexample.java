// if any variable is declared as static then it needs to initialize only once and rest of the object use same name which was initialized once & later if 
//anyone change the value then again for all objects it will be changed 

// static variables are class level and other are object level
// static can access only static variables/methods

//def :- static is class level variable

// for static var. (in method area) no need of object initialization.& for non static object creation is must
package com.staticthis;

public class Staticexample {

	public static void main(String[] args) {
		object o = new object();
		o.housename = "Sai Niwas";
		//o.societyname = "Sunworld Grand Arista";
		object.societyname = "Sunworld Grand Arista"; // class.variable name (set for whole class)
		
		object o1 = new object();
		o1.housename = "Naveen Niwas";
		//o1.societyname = "Sunworld Grand Arista Gurgoan"; //if changed at this point then both o,o1 will have same society name latest updated 
		object.societyname = "Sunworld Grand Arista Ggn";
		System.out.println(o.housename+" "+object.societyname);
		System.out.println(o1.housename+" "+object.societyname);
		
	}
}
class object {
	String housename;
	static String societyname;
	
}