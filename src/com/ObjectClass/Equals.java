package com.ObjectClass;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Object{
	public boolean equals(Object o){
		//logic
	}
}

class Employee {

	int id;
	String name;

	@Override
	public boolean equals(Object o){
		return this.id == o.id;
	}
	
}


Employee e = new Employee();
Employee e1 = new Employee();


if(e.equals(e1)){ //Default implementation
	print(equal);
}else{
	print(not equal); --true
}