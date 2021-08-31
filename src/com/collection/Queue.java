package com.collection;

public class Queue {
	int size;
	int a[];
	int start = -1;
	int end = 0;
	Queue (int s){
		this.size = s;
		a = new int[size];
	}
	public void enqueue (int i) {
		if (start == size) {
			System.out.println("Queue is full");
			return;
		}
		start = start +1;
		a[start] = i;
	}
	public int dequeue() {
		if (end == start +1) {
			System.out.println("Queue is empty");
			throw new RuntimeException("queue is empty");
		}
		int k = a[end];
		end = end +1;
		return k;
		
	}
	public boolean isempty() {
		if(end == start+1) {
			return true;	
		}
			return false;
		
	}
	public void print() {
		for ( int i = end  ; i <= start; i = i+1) {
			System.out.println(a[i]);
		}
	}
	public int sizeofqueue() {
		return (start-end)+1;
	}
	
	
}
