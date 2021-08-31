package com.test;

public class ReverseofArray {

	public static void main(String[] args) {
		int [] data1 = {10,20,30,40,50};
		
		ReverseofArray ra = new ReverseofArray ();
		int [] result =ra.reversefor2(data1);
				for ( int i = 0 ; i <data1.length; i = i+1) {
					System.out.println(result[i]);
				}
		

	}
	// 10,20,30,40 ,50,60  // i = 10 , j = 60
	// i = 0 , j = 5  -> // i = 20 , j =50   : 
	
	// 60,20,30,40,50,10// i = 20 , j= 50
	//60,50,30,40,20,10 // i =30 , j=40
	//60,50,40,30,20,10
	
	public int[] reverse (int[] data) { // using while loop
		int i = 0;
		int j = data.length -1;
		while (i<j) { //
			
				int temp = data[i]; // temp = 60
				data[i] = data[j]; // data[5] = 10 
				data[j]=temp; // data[0]=
			
			i = i+1;
			j= j-1;
		}
		return data;
	}
	// 10,20,30,40,50,60
	public int[] reversefor (int[] data) { // using for loop
		int j = data.length-1;
		for (int i = 0; i <j ; i = i +1) {
			int temp = data[i]; 
			data[i]=data[j];  
			data[j] = temp;
			j=j-1;
		}
		return data;
	}
	//10,20,30,40,50
	public int[] reversefor2(int[] data) { // using empty array 
		int [] data2 = new int[data.length];
		int j = 0; // same size given by user 
		for (int i = data.length-1; i>=0; i = i-1) {// i = 4 ; i >=0; i =i-1
			 
			
				data2[j]=data[i];
			
			j = j+1;
		}
		return data2;
	}
}
