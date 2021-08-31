// If we need to call one method belongs to one class into another class then we need to create object of the class whose method we need to call.
// when a method is calling itself is known as recursion 
// there is stopping condition in each recursion : so next flow can not be stopped


package Recursion;

public class RecExample {

	public static void main(String[] args) {
		RecExample rec = new RecExample();
//		rec.callme();
		rec.printnum(15);

	}
	public void callme() {
		System.out.println("naveen is calling me");
		callme(); // call me is calling itself .. this method will; call again & again and stack will overflow 
		System.out.println("after call me");
	}
	public void printnum(int i) {
		if (i <= 10) {
			return;
		}
		System.out.println(i);
		i =i-1;
		printnum(i);
	}

}
