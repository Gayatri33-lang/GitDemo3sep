//Null - empty 
// Array :- Array is collection of elements of similar data types , first element start with 0th index , 
// default value is 0 eg if data[0] is numm it will give 0
// length of array is find by variable data.length 

package com.test;

public class ArrayExample1 {

	public static void main(String[] args) {

		int[] data = new int[5];// data array
		int[] data1 = { 10, 20, 30, 0 }; // data1 array
		// System.out.println(data[0]);
		data[0] = 5;
		data1[1] = -100;
		data[2] = 30;
		data[3] = 300;
		data[4] = 3000;
		// System.out.println(data[3]);
		int num = data[2];
		ArrayExample1 ae = new ArrayExample1();
		// int resultedsum=ae.SumArray(data1);
		// System.out.println(resultedsum);
		/*
		 * for ( int i = 0; i<data1.length; i = i +1) { //loop with array
		 * System.out.println(data1[i]);
		 * 
		 * }
		 */
		// int resultcount=ae.Oddevencount(data1);
		// System.out.println(resultcount);
		//int resultmin = ae.minnum1(data1);
		//System.out.println(resultmin);
		int [] result =ae.array(data1);
		//System.out.println(result[0]);
		//System.out.println(result[1]);
		for ( int i = 0; i<data1.length; i = i +1) {
			System.out.println(result[i]);	
		}
		
	}

	public int SumArray(int[] data) { // method to print sum of all numbers in array
		int sum = 0;
		for (int i = 0; i < data.length; i = i + 1) {
			sum = sum + data[i];

		}
		return sum;
	}

	// find no of even numbers in array
	public int Oddevencount(int[] data) {
		int count = 0;
		for (int i = 0; i < data.length; i = i + 1) {
			if (data[i] % 2 == 0) {
				count = count + 1;
			}
		}
		return count;
	}

	// find minimum number of array 10,3,30,2
	public int minnum(int[] data) {
		int minnum = data[0];
		for ( int i = 1; i<data.length; i = i+1) {
		if ( data[i]<minnum) {
			minnum = data[i];
		}
		}
		return minnum;
	}
		//int result = -1; 

	//10 , -100 , 30 , 0 
	// - 100 , 10 , 30 , 0 
	// -100 , 0 , 30 , 10
	// -100 , 0 , 10 , 30   - will learn below program with array sorting
	/*public int minnum1(int[] data) {   //10 , -100 ,30 ,0
		int result = 1;
			for (int i = 0 ; i<data.length; i= i+1) {
				for ( int j =0; j<data.length; j = j+1) {
					if (data[i]<=data[j]) {    // 10<3 . 10<30 , 10 < 2
						//System.out.println(data[i]+" "+data[j]);
						result = data[i]; // result = 10 
					}
					else 	{
						//System.out.println("else " +data[i]+" "+data[j]);
						break;
					}
				}
				//System.out.println("result is:"+result);
				
			}
			return result;
		}*/
	
	// method to swap the no's 10,20 : 20,10
	

	public int[] array (int [] data) {
		int temp = data[0];
		data[0] = data[1]; // 20,20
		data[1]= temp;
		return data;
	}

}
