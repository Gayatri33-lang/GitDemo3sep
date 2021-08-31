// wrapper classes given because many places we need objects 


package utility;

public class Maths {
	
	public static void main(String[] args) {
		double a = 10;
		double b = 30;
		double c;
		c=Math.sqrt(a);
		
		c= Math.max(a, b);
		System.out.println(c);
		
		int i = 5; // i is primitive variable of type int
		Integer i1 = new Integer(5); // i1 is object of type integer
		System.out.println(i);
		System.out.println(i1);


}
}
