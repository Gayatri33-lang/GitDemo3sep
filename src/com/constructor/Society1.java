// Society name is Shree Ganesha , 2 towers 1 tower 2bhk, another 3bhk , 1 tower name - siddhi ,2 - vinayanka, each tower 14, house ground floor 

package com.constructor;

public class Society1 {
	String name;
	Address address;
	Tower[] towers;
	

	Society1(String sn, Address a, int nooftowers) {
		name = sn;
		address = a;
		towers = new Tower[nooftowers];
		
	}
}

class Tower {
	
	int towernum;
	String towertype;
	String towername;
	floor[] floors1;

	
	Tower( int tno, String ttype, String tname, int n) {
		
		towernum = tno;
		towertype = ttype;
		towername = tname;
		floors1 = new floor[n];

	}

	Tower() {
		

	}
}

class floor {
	
	int house;

	floor( int h) {
		
		house =h;
	}

}

/*class house {
	int hfloor;
	int housenum;
	double size;

	String housename;
	int nooffamilymembers;
	Room[] rooms;

	house(int f, int n, double s, String hn, int fn, int r) {
		hfloor = f;
		housenum = n;
		size = s;
		housename = hn;
		nooffamilymembers = r;
	}

}

class Room {
	double size;
	boolean washroomattached;
	boolean balconyattached;
	boolean eastfacing;

	Room(double s, boolean w, boolean b, boolean ef) {
		size = s;
		washroomattached = w;
		balconyattached = b;
		eastfacing = ef;

	}
}*/

class Address {
	String city;
	int zipcode;
	String country;
	String addressline1;

	Address(String c, int z, String count, String addr) {
		city = c;
		zipcode = z;
		country = count;
		addressline1 = addr;
	}

}
/*class maintest {

public static void main(String[] args) {
	Address a = new Address ("Noida",201305,"india", "PS 1401 T6");
	
	
	Society1 s = new Society1 ("ShreeGanesha", a,2);
	
	
	
	Tower t = new Tower ();
	t.towernum = 1;
	t.towertype = "2bhk";
	t.towername = "Sidhi";
	t.floors1 = new floor [3];

	
	
	floor f = new floor(6);
	floor f1 = new floor(6);
	floor f2 = new floor(6);
	
	t.floors1[0] = f;
	t.floors1[1] =f1;
	t.floors1[2] = f2;
	
	//house h = new house(1,)
	
	
	Tower t1 = new Tower ();
	t1.towernum = 2;
	t1.towertype = "3bhk";
	t1.towername = "Vinayaka";
	t1.floors1 = new floor [2];
	
	floor f3 = new floor(2);
	floor f4 = new floor(2);
	t1.floors1[0] = f3;
	t1.floors1[1] =f4;
	
	s.towers[0] = t;
	s.towers[1] = t1;
}

}*/
