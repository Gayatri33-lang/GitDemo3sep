// Aggregation means when 1 class has obj refrence of another class . 
// 



package com.inheritance;

public class Aggregation {
	int Agid;
	Multilevel ml = new Multilevel();
	Multilevel ml1;
	//ml1 = new Multilevel(); Initialization should be either in same line or method
	public static void main (String[]args) {
		Computer c1 = new Computer("Laptop");
		System.out.println(c1.type+" "+c1.h.size+" "+c1.c.processing);
	}
}


class Computer{
	String type;
	Cpu c = new Cpu(10); //Aggregation
	Harddisk h = new Harddisk(64);
	Computer(String type){
		this.type=type;
	}
}

class Cpu {
	int processing;
	Cpu(int p){
		processing = p;
	}
}

class Harddisk{
	int size;
	Harddisk(int s){
		size = s;
	}
}

