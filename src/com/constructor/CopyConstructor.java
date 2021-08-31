package com.constructor;

public class CopyConstructor {
	int id;
	String name;
	
	CopyConstructor (int i , String n){
		id = i;
		name = n;
	}
	CopyConstructor (CopyConstructor c){
		id = c.id;
		name = c.name;
	}
	void display() {
		System.out.println(id + " "+name);
	}

	public static void main(String[] args) {
		CopyConstructor c1 = new CopyConstructor (10,"GAYATRI");
		CopyConstructor c2 = new CopyConstructor (c1);
		c1.display();
		c2.display();
		

	}

}
