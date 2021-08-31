
//  create a java programme for society builder info , how manyu towers, how many floors ,which floor your home and how many bhk.

package com.constructor;

public class Society {
	String Address;
	String Name;
	Society (String a , String n){
		Address= a;
		Name = n;
	}
	void display () {
		System.out.println("Society information is" + Address +" "+Name);
}
}
class Builder{
	Double revenue;
	String Name;
	Builder (double r , String n){
		revenue = r;
		Name = n;
	}
	void display () {
		System.out.println("Builder information is" +revenue +" "+Name);
}
}

class Towers {
	int num;
	Towers (int n){
		num = n;
	}
	void display () {
		System.out.println("Tower num is" +num);
}
}
class floors {
	int n;
	floors (int n1){
		n = n1;
	}
	void display () {
		System.out.println("floor num is" +n);
}
}

class MyHomefloorandsize {
	int floor;
	double size;
	MyHomefloorandsize(int f , double s){
		floor = f;
		size = s;
	}
	void display () {
		System.out.println("My home floor num is" + floor +" "+"and size is"+size);
}


public static void main(String[] args) {
	Society s = new Society("Noida","Paras Seasons");
	Builder b = new Builder(14.20, "Paras");
	Towers t = new Towers(6);
	floors f = new floors(14);
	MyHomefloorandsize mfz = new MyHomefloorandsize(1,2500.00);
	s.display();
	b.display();
	t.display();
	f.display();
}

}

