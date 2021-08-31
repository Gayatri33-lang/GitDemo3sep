// 5! = 5*4*3*2*1
// starting condition
//ending condition 
// i*(i-1)*(i-2)*(i-3)....(1)
package Recursion;

public class Factorial {

	public static void main(String[] args) {
		Factorial f = new Factorial();
System.out.println("Factorial of a num is:" + f.fact(5));
	}
	
	public int fact(int i) {
		if (i == 1) {
			return 1;
		}
		return i*fact(i-1); //stack frame is created on each method call 
	}

}
