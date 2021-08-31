// OBJECT CLASS IS PARENT OF ALL THE CLASSES
// by default it comes in all the class ( except interface because interface do not have any method)
// object class has methods and variables 
// how many methods in obj class & how we can use it ?
// hash code :-hash code num of object
// hash code method in object class is Native method :we can override hascode method in hashmap
package com.ObjectClass;

public class OC {

	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = e;
		Employee ok = new Employee();// new refrence e1 is pointing to same object// it only points e1 to obj no connection b/w e1 & e e1 is not null  
		//e = null ;// it means refrence which was pointing to obj is now assigned null now obj is not reachable so garbage collector deleted the object because it is not reachable
		//e.getClass();
		System.out.println(e.hashCode());
		System.out.println(ok.hashCode());
		Class temp = e.getClass(); // returns the refrence of object or object created in Class (Class) for class employee
		//String s =temp.getSimpleName();
		System.out.println(temp);
		String name = "gayatri"; // name is refrence , gayatri is object of type string and value gayatri, string is type
		System.out.println(name); // it will print gayatri that is value of 
	}

}
class Employee  {
	public int hashCode() {
		return 5;
	}
}
