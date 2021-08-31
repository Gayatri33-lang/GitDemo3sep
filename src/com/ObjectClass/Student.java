// private variables value can be fetched & store through setter , getter 
// t , t1 2 refrences pointing to object , if ther are pointing to same obj then they are equal else not = default implimentation of equals in obj class
// imp note :- Local var's are by default null but global variables have default values
// int = 0 , double = 0.0 , float = 0.0 , boolean = false , String = mnull , any obj also points to Null 
// 
package com.ObjectClass;

public class Student {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		
		t.setId(1);
		t.setName("Gayatri");
		t.setAddress("Noida");
		
		Teacher t1 = new Teacher();
		// t1 = t; //equals will print true 
		t1.setId(2);
		t1.setName("naveen");
		t1.setAddress("Gurgoan");
		System.out.println(t1.getId());
//		t.id = 1; // not possible because private 
		boolean b = t.equals(t1);//
		System.out.println(b);
		boolean b1 = t1.equals(t);
		System.out.println(b1);
		System.out.println(t1.getId() == t.getId());
		
		
		Teacher t3 = new Teacher();
		Teacher t4 = new Teacher();
		
		
		t3.setId(3);
		t4.setId(3);
		t3.setName("Gayatri");
		t4.setName("gayatri");
		System.out.println(t3.equals(t4));
		System.out.println(t4.equals(t3));
		
	}

}
class Teacher {
	private int id;
	private String name;
	private String address;
	public int getId() {
		return id;
	}
	public void  setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address= address;
	}
	public boolean equals(Teacher t2) {
	//	boolean b = this.id == t2.getId();//&& this.name == t2.getName(); //we are overriding equals method and comparing current object id with argument's id 
/*		boolean b = false; 
		if (this.id == t2.getId() && this.name == t2.getName()) {
			b = true;
		}
	
		return b;*/
		boolean b = true;
		if (this.id != t2.getId() || this.name !=t2.getName()) { // f && t = f  , t && t = t , f && f = f t&&f = f
			b = false;
		}
		//if (this.name !=t2.getName()) {
		//	b = false;
	//	}
		return b; // return true when id,name same.
			
	}
	
	
	
	
}
