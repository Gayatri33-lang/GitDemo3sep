//finalise method of obj class  calls just before whenever object is removed from memory
// if we want some logic to be executed before object deletes or garbage collected we write it inside finalize 
//main progrm is running so fast so gc cycle not able to remove object & main thread terminates before gc cyelc.
// java finalise method is untrustworthy 
package com.ObjectClass;

public class Finalize {
	public static void main (String[] args) throws InterruptedException {
		Student10 s = new Student10(); //object is created here , this obj will be removed from heap once programe terminates 
		s.name = "gayatri";
		s = null;//remove refrence so object free .. now obj is eleigible for garbage collection.
		System.out.println("before sleeping");
		System.gc(); //to call garbage collector manually 
		//Thread.sleep(500);
		System.out.println("main mehtod ends here");
		
	}
}

class Student10{
	String name;
	@Override
	public  void finalize()throws Throwable{
		System.out.println("must code");
	}
}
