package com.InstanceInitializer;

public class InstanceInitializer1 {
	public static void main(String[]args) {
		Child c = new Child(); // parent instance intance perma child 
		Child c1 = new Child(3);// parent instance instance child child pera
		Teacher t1 = new Teacher("Naveen","gurgoan");
		Teacher t2 = new Teacher ("gayatri", "noida");
	}
	
}
class Parent{
	Parent(){
		System.out.println("parent class");
	}
}
class Child extends Parent {
	Child(){
		super();
		System.out.println("child class");
	
}
	{
		System.out.println("insitance");
	}
	Child(int a){
		super();
		System.out.println("child perametrized");
	}
	{
		System.out.println("instance child permaterized");
	}
}
class Teacher{
	String tname;
	String Location;
	//String schoolname = "Rishikul"; instead of this just declare because what if school name is derived from a logic so write it in intsance initialiser block
	String schoolname;
	Teacher(String tchname, String loc){
		tname = tchname;
		Location = loc;
		//schoolname = "G.v.m"; Instead of this write in block because if there are multiple constructors no need to inistalize common var everytime in all constructrs
	}
	{
		schoolname = "G.v.m";//no code repetition
	}
}
