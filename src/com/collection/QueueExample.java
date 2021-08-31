// user input = size of queue 
// - show menu to user - add element, remove , isempty, print queue , size of queue , exit
// 


package com.collection;

import java.util.Scanner;

public class QueueExample {

	public static void main(String[] args) {
/*		Queue q = new Queue(50);
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(5);
		q.enqueue(7); // 4,3,5,7
		q.print();
		System.out.println("===============");
		q.dequeue();
		q.dequeue(); // 5,7,8,1,3
		q.enqueue(8); //
		q.enqueue(1);
		q.enqueue(3);
		q.dequeue(); 
		q.print();// 7,8,1,3
		System.out.println("===============");
		System.out.println(q.isempty());*/
		
		System.out.println(" please enter size of queue");
		Scanner s = new Scanner(System.in);
		int b=s.nextInt();
		Queue q = new Queue(b);
		boolean running = true;
		while (running ==true) {
			System.out.println("-------- Please select ------------");
			System.out.println("1. Add");
			System.out.println("2. Remove");
			System.out.println("3. Is empty");
			System.out.println("4. Print queue");
			System.out.println("5. Size of queue");
			System.out.println("6. Exit");
			Scanner s1 = new Scanner(System.in);
			int d =s1.nextInt();
			switch(d) {
				case 1: 
					System.out.println("please enter data to be inserted in queue");					
					Scanner s3 = new Scanner(System.in);
					int e=s3.nextInt();
					q.enqueue(e);
					break;
				case 2:
					int f =q.dequeue();
					System.out.println(f+" is removed ");
					break;
				case 3:
					boolean b3 = q.isempty();
					System.out.println(b3);
					break;
				case 4:
					q.print();
					break;
				case 5:
					int g =q.sizeofqueue();
					System.out.println(g);
					break;
				case 6:
					running = false;
					break;
			}
		}

	}

}
