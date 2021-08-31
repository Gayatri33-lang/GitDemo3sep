//Fibonacci :- 0 ,1 ,1,2,3,5,8,13,21,34 ....
// starting  n = 0 , m = 1
// i = 0 , j = 1  .. 
// i = j
// j = i+j

package Recursion;

public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		f.fib1(20);

	}

	

public void fib1 ( int i) {
	i = i-2;
	System.out.print(0+" "+1+" ");
	fib2(0,1,i);
}

/** 
 * This method prints fibonacci series 
 * returns void
 * @param n
 * @param m
 * @param count number to be printed
 */
 public void fib2(int n, int m , int count) {
	if (count <= 0) {
		return;
	}
	System.out.print(n+m+" ");
	int k = n+m;
	n = m;
	m = k;
	count = count - 1;
	fib2(n,m,count);
}
}
