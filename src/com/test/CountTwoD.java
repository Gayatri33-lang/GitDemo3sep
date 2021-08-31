// find how many no's are -ve in 2 D array 

package com.test;

public class CountTwoD {

	public static void main(String[] args) {
		int[][] array1 = new int[2][3]; // means this array has 3 rows 4 columns  {{0,0,1),{1,0,1}
		array1[0][0] = -1;
		array1 [0][1] = 2;
		array1 [0][2] = -30;
		array1 [1][0] = 60;
		array1 [1][1] = -90;
		array1 [1][2] = 100;
		//{{-1,2,30},{60,-90,100}}
		int count = 0;
		for (int i = 0; i<array1.length; i=i+1) { // i= 0<2
			int[] array2 = array1[i]; // {-1,2,30} & in second iteration {60,-90,100} 
					for ( int j =0; j<array2.length; j=j+1) { // j = 0<2
						//System.out.println(array1[i][j]);
						if (array1[i][j]<0) {
							count = count +1;
						}
						
					}
		}
		System.out.println(count);
}
}
