// Most imp note :- 1
// 1. If Hashcodes are different then objects are different ( in below example we are overriding hashcode and returning 1 so all objects have same hashcode)
//2. if hashcodes are same and objects are equal by equals method then objects are equal )

// set is Data structure with unique elements 

// we can not create object of interface 

// hash code :- evrery object has a number hashcode(): a method provided by java. lang. Object that returns an integer representation of the object memory address.02-Jan-2018
// evry obj has different hash code 

package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;



public class SetExample {

	
	public static void main (String[] args) {
		
		Set s = new HashSet();
		Set s1 = new LinkedHashSet(); // set is interface so can't create object so create object of class which implements set
		boolean b1 = s.add(1);
		s.add(2);
		boolean b2 = s.add(1);
		s.add(3);
		s.add(1);
		System.out.println(s.size());
		
		
		Iterator itr =s.iterator();// this is iterator method of collection interface .. as set is interface which is implimenting collection & hasset implements sets so hasset can also use iterator method 
		// 1 2 3 4 5 
		
		while (itr.hasNext()) { // hasnext is method which returns boolean true /false & check current element is null or not 
			System.out.println(itr.next());//itr.next prints current elemtn& moves pointor to next
	
		}
		System.out.println(b1);
		System.out.println(b2);
		
		
		
		Set s3 = new HashSet(); //upcasting 
		Employee e = new Employee(1,"naveen", "java");
		Employee e1 = new Employee(1,"naveen k", "java champ");
		Employee e2 = new Employee(2,"gayatri", "QA");
		s3.add(e);
		s3.add(e1);
		s3.add(e2);
		System.out.println(s3.size());
		System.out.println(e.equals(e1)); // if pointing to same object in heap then true else false 
	
	}
	}
class Employee {
	int id ;
	String name ;
	String divison;
	
	Employee(int id1, String name1 , String divison1){
		id = id1;
		name = name1;
		divison = divison1;
	}
	@Override
	public boolean equals (Object o) {
		Employee e5 = (Employee) o; //downcasting 
		if (e5.id == this.id) {
			return true;
		}
		else {
			return false;
		}
		
	}
	@Override 
	public int hashCode () {
		return id;
	}
	
}

// INTERVIEW QUESTION :- 
//1 . Internal working of HashSet
//2. 	

