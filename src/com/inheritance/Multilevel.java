// vehicle class car,bicycle , electric car ,petrol car 
// Most imp point :- Constructor chaining : if you are making permterized constructor in parent class then in case of inheritance you have to make either a default constructor in parent class or permatrized in child class which is extending to parent class
// imp :- In case of inheritance parent ka always defualt constructor is called if not created obj explictly and jiska obj bn ra h uska wahi const
package com.inheritance;

public class Multilevel {
 //Petrolcar pc = new Petrolcar();
	public static void main(String[] args) {
		Multilevel ml = new Multilevel();
		//ml.pc.petrol();
		Car c = new Car(10);
		Vehicle v = new Vehicle (3);
	}
	

}
class Vehicle {
	int nooftyres;
	void speed() {
		
	}
	Vehicle (int i){
		nooftyres = i;
		System.out.println("Vehicle Permetrized const called");
	}
	Vehicle(){
		System.out.println("Vehicle Default const called");
	}
}
class Car extends Vehicle {
	void Carmethod() {
		System.out.println("Car is running");
	}
	Car (){
		System.out.println("Car Default const called");
	}
	Car (int i1){
		nooftyres =i1;
		System.out.println("car Permetrized const called");
	}
}
class Bicycle extends Vehicle {
	
}
class Electriccar extends Car{
	
}
class Petrolcar extends Car {
	void petrol() {
		System.out.println("My car is petrol car");
	}
}

