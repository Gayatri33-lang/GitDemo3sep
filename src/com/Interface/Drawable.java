package com.Interface;

public class Drawable {

	public static void main(String[] args) {
	PlanetBody p = new Earth();
	PlanetBody p1 = new Mars();
	p.haswater = true;
	p1.haswater = true;
	System.out.println(p);
	System.out.println(p1);

	}

}

interface Planet { //marker/tagged interface
	
	abstract void rotate();
	
}

abstract class PlanetBody implements Planet{
	String name;
	boolean haswater; //mercury , venus 
	double sunrotationtime;
	double gravity; //9.8 m/s
	int noofmoons;
	
	PlanetBody(String n){  // we can initialise properties of abstrract class using construvctor although we can not craete its object 
		name = n;
	}
	
}
class Earth extends PlanetBody {
	
	public  void rotate () { // can not reduce visibility mendatory to make it public
	System.out.println("earth is rotating");
	}
	 Earth(){
		super("Earth"); 
		gravity = 9.8; // inherited variables can be accessible in method only or constructor 
	 }
	@Override
	public String toString() {
		return "Earth [name=" + name + ", haswater=" + haswater + ", sunrotationtime=" + sunrotationtime + ", gravity="
				+ gravity + ", noofmoons=" + noofmoons + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	 
	 
}
class Mars extends PlanetBody {
	public void rotate () {
		System.out.println("Mars is rotating");
	}
	Mars(){
		super ("Mars");
		gravity = 3;
	}
}




