// stack has some methods

package com.collection;

import javax.management.RuntimeErrorException;

public class Stack {
	int size;
	int a[];
	int pointor = -1;// pointor is at the top of the stack (place upto where it is filled) & 0 means above that place
	Stack(int size){
		this.size = size;
		a= new int[size];
	}
	public void push(int i) {
		if (pointor ==size) {
			System.out.println("stack is full");
			return;
		}
		pointor = pointor+1;
		a[pointor] = i; //a[0] = 50;
		
	}
	public int pop() {
		if (pointor == -1) { 
			System.out.println("stop pop");
			//return -1; it is not possible because user will think -1 is coming from stack sp use throw
			throw new RuntimeException("stack is empty");
		}
		int k;
		k = a[pointor];
		pointor = pointor -1;
		return k;
	}
	public int top() {
		if (pointor == -1) { 
			System.out.println("stop top");
			return -1;
		}
		return a[pointor];
	}
	public boolean search(int data) {
		if (pointor == -1) { 
			System.out.println("stop search");
			return false;
		}
		for (int i = pointor ; i >=0; i = i-1) {
			if (a[i]==data) {
				return true;
			}
			
		}
		return false;
	}
	public boolean isempty() {
		if (pointor == -1) {
			return true;
		}
		return false;
		
	}
	public void print() {
		for (int i = pointor ; i>=0  ; i=i-1) {
			System.out.println(a[i]);
		}
	}
	

}

