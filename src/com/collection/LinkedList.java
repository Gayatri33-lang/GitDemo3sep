package com.collection;

public class LinkedList {
	Node root;
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	public void add(int a) {
		Node data = new Node(); // new node nedds to be added 
		data.setData(a);
		if (root != null) {
			System.out.println("Root is " + root.getData());
		}
		
		if (root == null) { // means it is the first node 
			root = data;
		}
		else {
			Node n = root; // refrence n is created which is pointing to root because link list have refrence only
			while (n.getNext()!=null ) { //getNext is method 
				n = n.getNext(); // n will have latest next
			}
			
			n.setNext(data);
		
		}
		
		
		
	}
	
	public void addafter(int a1, int a) {// add a1 after node a  // a1 - new node , a - already existing node 
		Node n = new Node();
		n.setData(a1);
		Node m = search(a);
		if ( m == null) {
			throw new RuntimeException("Node not found");
		}
		Node m2 =m.getNext(); // node next to new node 
		m.setNext(n);
		n.setNext(m2);
		
	}
	public void addbefore(int a1, int a) {
		Node n = new Node();
		n.setData(a1);
		Node m = root;
		Node m3 = null;
		while ( m.getNext()!=null) {
			Node m1 =m.getNext();
			if (m1.getData()==a) {
				m3 = m;
			}
			m=m.getNext();
			
		}
		Node m4 = m3.getNext();
		m3.setNext(n);
		
		n.setNext(m4);
	}
	public Node search (int a) { // used to search a node which is having data a 
		Node n1 = root;
		while (n1.getNext()!=null) {
			if(n1.getData()==a) {
				return n1;
				
			}
			n1 = n1.getNext();
			
			
		}
		if ( n1.getData() ==a) { // to check last node 
			return n1;
		}
		return null;
		
	}
	
	public void delete(int data) {
		Node n = root;
		Node n1 = null;
		Node prev = null;
		do {
		
			if (n.getData() == data) {
				n1 = n; // now n1 is 8 instead of null
				break;
			}
			prev = n; // prev is 3 node - first iteration  ...... prev = 9 - second iteration
			n = n.getNext(); // n is 9 node  - first iteration ........ n = 8 - second itewration
			
		}
		 while (n.getNext() != null) ; // jab tak while condition is true do will work 
		if ( prev == null && n == root) {
			root = n.getNext();
		}
		else {
			
		
		
			if (n1 == null ) { // data needs to be deleted is not found & n1 will reach to last node
				if (n.getData() == data) {
					n1 = n;
					
				}
			}
		
		if ( n1 != null) {// prev = 9 , n1 = 8
			if (n1.getNext() == null) {
				prev.setNext(null); 
			}
			else {
				prev.setNext(n1.getNext());
			}
			
			
		}
		else{
			System.out.println("not found in ll");
			throw new RuntimeException();
		}
		}
		
	}
	public void print() {
		Node n = root; // root is initially 3
		while (n.getNext()!=null ) {
			System.out.print(n.getData()+" -> ");
			n = n.getNext();
		}
		System.out.println(n.getData());
	}
	
	public int getMiddle() {
		int length = 0; 
		Node m = root;
		while ( m.getNext() != null) {
			length = length +1;
			m = m.getNext();
		}
		length = length +1;
		int middle = length /2;
		Node m1 = root;
		for (int i= 0; i <middle ; i = i+1) { // 0-3
			m1= m1.getNext(); // 0th - m1 = 3 , 1th - m1 = 4 , 2nd m1 = 
			
		}
		return m1.getData();
		
		
		
	}
	public void deleteMiddle() {
		int length = 0;
		Node n = root;
		while (n.getNext()!=null){
			length = length +1;
			n = n.getNext();
		}
		length = length+1;
		int middle = length/2;
		Node m = root;
		for ( int i = 0 ; i < middle ; i = i+1) {
			m = m.getNext();
		}
		delete(m.getData());
		
	}
	
// Find nth node from end of the linked list
	public int nelementfromlast( int a) { // example a = 3 means 3rd element from last
		int length = 0;
		Node n = root;
		while (n.getNext()!= null){
			length = length+1;
			n = n.getNext();
		}
		length = length+1;
		int a1 =length - a; // 5 -4 = 4 
	//	System.out.println("Length is " + length);
	//	System.out.println("a1 is :" + a1);
		Node m = root;
		for ( int i = 0; i <a1 ; i=i+1) {
			m = m.getNext(); // m = 67
			
		}
		return m.getData();
	}
	
	
	
}

class Node {
	int data;
	Node next;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}