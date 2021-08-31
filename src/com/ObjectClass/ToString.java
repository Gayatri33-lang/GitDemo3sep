// purpose of to string method is to print value of objects while creating logs 



package com.ObjectClass;

public class ToString {

	public static void main(String[] args) {
		Naveen n = new Naveen ();
	//	Address a = new Address(); //- imppp...
		n.addr = new Address();
		n.id = 1;
		n.name = "Naveen";
		n.loc = "Gurgoan";
		n.addr.city = "sonepat";
		n.addr.state = "hryana";
		
		System.out.println(n); // by default tostring method is called 
		System.out.println(n.toString());
		System.out.println(n.addr.toString());//by default tostring method prinsts memory address of object both 10,11 print same
	}

}
class Naveen {
	String name;
	int id;
	String loc;
	Address addr;
	@Override
	public String toString() {
		return "Naveen [name=" + name + ", id=" + id + ", loc=" + loc + ", addr=" + addr + "]";
	}
	
//	public String toString() {
		//return "this is object";
		//return this.id+" "+this.name+" " +this.loc;
//	}
}
class Address {
	String city;
	String state;
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	
}
