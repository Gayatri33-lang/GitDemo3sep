
// Note :- Logic can be written only in method or instance initializer block 
//Note :- In order to call a method we need to create object and call it explicitly but in case of instance initializer block.


package com.InstanceInitializer;

public class InstanceInitializer {
	public static void main (String[] args) {
//		Employee e = new Employee("Gayatri", 1);
//		System.out.println("Name is"+" "+e.name);
		Employee e1 = new Employee();
		System.out.println("name is"+" "+e1.name);
	}
}
class Employee{
	String name ;
	int ecode =2 ;
	{
	name = "naveen";	// Instance initialiser block : note we can write logic in instance initialiser block.. we can initia;ise variable on basis of a logic
	if (ecode ==3) {
		name = "gayatri";
		
	}
	
	}
//	for (int i = 0; i <20; i= i+1) {  //can only be written inside method not in class
		
//	}
/*	Employee(String n , int ec){
		name =n;
		ecode=ec;
	}*/
	
}

class B {
	B(){
		super(); // if we dont write this java write itself " object class is parent of all class so java is calling object class 
		System.out.println("Constructor");
	}
}
