package com.collection;

public class LinkedListMain {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add(3);
		ll.add(9);
		ll.add(8);
		ll.add(16);
		ll.add(28);
		ll.print();
		ll.delete(16);
		ll.print();
		ll.delete(28);
		ll.print();
		ll.delete(3);
		ll.print();
		ll.addafter(50, 9);
		ll.add(67);
		ll.add(67);
		ll.print();
		int a =ll.getMiddle();
		System.out.println(a);
		ll.deleteMiddle();
		ll.deleteMiddle();
		ll.deleteMiddle();
		ll.print();
		ll.add(44);
		ll.add(56);
		ll.add(70);
		ll.print();
		int m =ll.nelementfromlast(2);
		System.out.println(m);
		
	}

}
