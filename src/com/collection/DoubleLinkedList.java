package com.collection;

public class DoubleLinkedList {
	Node1 root;
	
	public void addNode(int a) {
		Node1 m = new Node1();
		m.setData(a);
		if ( root == null) {
			root = m;
		}
		else { // m = new node , m1 = last node 
			Node1 m1 = root;
			while (m1.getNext()!=null) {
				m1 = m1.getNext();
			}
			
			m.setPrev(m1);
			m1.setNext(m);
			m.setNext(null);
		}
		
		
	}
	
	public void deletenode(int a) {
		Node1 m =searchNode(a);
		if (m.getPrev()==null) {
			Node1 m2 = m.getNext();
			m2.setPrev(null);
			root =m2;
		}
		else if (m.getNext()==null) {
			Node1 m1 = m.getPrev();
			m1.setNext(null);
		// in 1 lin1 - // 	m.getPrev().setNext(null);
		}
		else {
			Node1 m2=m.getNext(); // node to be deleted its next stored in m2 now m2 ==5
			Node1 m3 = m.getPrev(); // previous of node to be deleted 
			m3.setNext(m2);
			m2.setPrev(m3);
			
			
		}
		
	}
	// 2 ->3->4->5->6 eg : 8 
	public Node1 searchNode(int a1) {
		Node1 m1 = root; // m1 = 2
		while (m1.getNext()!=null) { // 2!= null - true 
			if (m1.getData() ==a1) { //  2==8 , 3==8 ,4==8,5==8,6==8
				break;
				
			}
			m1 = m1.getNext();
			
			
			
		}
		if (m1.getData()==a1) {
			return m1;
		}
		else {
			throw new RuntimeException("not found");
		}
		
		
	}
	public void printNode() {
		
		Node1 m = root;
	 while (m.getNext()!=null) {
		 System.out.print(m.getData()+ " -> ");
		 m = m.getNext();
		 
	 }
	 System.out.println(m.getData());
	 
	}

}

class Node1 {
	int data;
	Node1 next;
	Node1 prev;
	
	public int getData() {
		return data;
	}
	public void setData(int d) {
		this.data = d;
	}
	public Node1 getNext() {
		return next;
	}
	public void setNext(Node1 n) {
		this.next = n;
		
	}
	public Node1 getPrev() {
		return prev;
	}
	public void setPrev(Node1 n1) {
		this.prev = n1;
	}
}
