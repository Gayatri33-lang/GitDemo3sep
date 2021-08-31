package com.collection;

public class Stackexample {

	public static void main(String[] args) {
		Stack s = new Stack(100);
		s.push(3);
		s.push(28);
		s.print(); // 28 ., 3
		System.out.println("-----------------");
		s.pop(); // 3
		s.print();//3
		System.out.println("-----------------");
		System.out.println(s.top()); //3
		s.pop();
		s.pop();
		
	}

}
