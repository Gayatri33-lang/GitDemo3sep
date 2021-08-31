// 2 D array s arary of array
// O(n*m)
// O(2*4)
package com.test;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] data = new int[2][4];  // {{0,0,1,2},{1,0,1,2}}
		int[][] data1 = { { 0, 1 },
						  { 1, 1 }, 
						  { 2, 1 } }; //3,2 : 3 rows 2 colums inner array is also considered as single array
		// data1[0][1]   {0,1} = 1
		int[][] data2 = {{0,0}};
		int[] data3 = {2,4,6};
		
		data[0][0] = 1;
		data[0][1] = 2;
		data[1][0] = 3;
		data[1][1] = 7;
		data[1][3] =13;
		// {{1,2,0,0},
		// 	{3,7,0,13}}
		int sum = 0;
		for ( int i = 0; i<data.length; i=i+1) { //data.length gives no of rows 
			int[] array = data[i]; //it will return inner array eg :{1,2,0,0} , {3,7,0,13}
			
			for (int j =0; j<array.length; j=j+1) { // array.length
				//System.out.print(data[i][j]); // 1 2 
				sum = sum+data[i][j]; // can not add array inside int // 0 + 1 +2+0+0 =3// sum = 3+3+7+0+13
				//System.out.print(" ");
			}
			
			//System.out.println();
			
		}
		
		System.out.println(sum);

	}
	//public int TwoD

}
