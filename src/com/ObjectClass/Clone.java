// Cloning means exact same copy of object 
// 2 types - shallow & deep cloning 
// shallow means new object refrence (clonned obj) will point to same objects
//deep cloning means 2 refrences will point to different objects 
// in case of primitive data types either its shallow cloning it will point to different object
// clone method is protected & it is available in same package only 
// com.object class , clone method - java.lang

package com.ObjectClass;

public class Clone {
	public static void main (String[] args) throws CloneNotSupportedException {
		person p = new person();
		p.age = 28;
		p.dob = 3111992;
		p.salary = 27;
		System.out.println(p.age);
		
		person p1 = p.clone();
		System.out.println(p1.age);
	}
}
class person implements Cloneable  { // clonnable is marker interface which gives metadata about class to jvm tht we ll clone objects
	int dob;
	int age;
	double salary;
	public person clone() throws CloneNotSupportedException   {
//		return (person) super.clone(); // or below code 
		person p2 = new person();
		p2.dob=this.dob;
		p2.age = this.age;
		p2.salary = this.salary;
		return p2;
	}
}