// In java no object creation of abstract class as it is only definition . extended classed/child classes of abstract class are implimentation so object of child class of abstract class created 
// why constructor in abstract class ?-because child class constructors will always call parent abstract class constructor first 
// constructor chaining -> child class const called first parent class constructor called 
// eg there are 2 properties in abstract class . we can initialise propeorties in constructor 
package com.constructor;

public class AbstractConstructor {

	public static void main(String[] args) {
	//	Abstractexample ae = new Abstractexample(); // object creation of abstract class not allowed 
		Abstractexample2 a2 = new Abstractexample2();//default const firstly called default const of parent 
	}

}
abstract class Abstractexample {
	int rollno ;
	String teachername;
	Abstractexample(int rn, String tn){ //this constructor can be used only with the help of super 
		rollno = rn;
		teachername = tn;
	}
	
}
class Abstractexample2 extends Abstractexample { //child class first call default constructor of parent class 
	Abstractexample2 (){
		super (3, "gayatri");//
	}
}
