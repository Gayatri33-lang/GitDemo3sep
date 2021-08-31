//Constructor :- used to initialize the object propeorties 

package com.constructor;

public class Teacher {
	String name;
	String subject;
	int teachid;
	
	Teacher (String n, int t){
		name =n;
		teachid = t;
		System.out.println("new constructor called");
	
	}

	Teacher(String n, String s, int t) { // constructor - name is same as class name and no return type instead method
											// has return type : there casn be n no of constructor
		name = n;
		subject = s;
		teachid = t;
		System.out.println("perametrized constructor called");
	}

	Teacher() { // default constructor : no argument is passed
		System.out.println("defualt constructor called");
	}
	Teacher (int t , String n){
		System.out.println("wrong window");
	}
	public static void main (String[] args) {
		Principal p = new Principal();
		p.school("");
		method(); // called directly without creating objects 
	}
	public static void method () { //when method is in same class then it can be called without creating objects
		
	}
	public void Teacher() { // method may or may not have same as class name
		
	}
}

class Principal {
	public void school(String name) {
		Teacher t = new Teacher("naveen", "java", 1);// at the time of obj construction set its propeorty instead of
														// next 3 lines.
		Teacher t1 = new Teacher("gayatri", "testing", 2);
		Teacher t2 = new Teacher(); // no argument constructor not allowing because constructor is written
		Teacher t3 = new Teacher ("naveen1",3);
		System.out.println(t1.name + "&"+ t2.name);
		System.out.println("abc"+null);
		/*
		 * t.name = "Naveen"; now this code is not required t.subject = "java";
		 * t.teachid = 1;
		 */
	}
}