package com.collection;

public class DoubleLinkedListMain {

	public static void main(String[] args) {
		DoubleLinkedList dl = new DoubleLinkedList();
		dl.addNode(67);
		dl.addNode(78);
		dl.addNode(3);
		dl.printNode();
		dl.deletenode(78);
		dl.printNode();
		
	}

}
