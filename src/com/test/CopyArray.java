
// copy one array from another using simple method and for loop 
package com.test;

public class CopyArray {

	public static void main(String[] args) {
		int[] array1 = {2,3,4,5};
		CopyArray ca = new CopyArray();
		int[] resultedarray =ca.CopyArray1(array1);
		for (int i = 0 ; i <array1.length;i=i+1) {
			System.out.print(resultedarray[i]+" ");
			//System.out.print(" ");
		}
		
		
	}
	
	public int[] CopyArray1 (int[] array2) {
		int[] array3 = new int [array2.length]; 
		for (int i =0; i<array2.length; i=i+1) {
			array3[i]=array2[i];
		}
		return array3;
	}

}

// copy one array from another using utility method of system class  :-
//we can user arraycopy method to copy elements from one array to another 

//Syntax :- public static void arraycopy( objecr src, int srcpos, object dest, int dest post , int lerngth)

 class CopyArray1
{
public static void main( String[] args) {
	char[] array1 = {'g','a','y','a','t','r','i'}; // source array
	char[] array2 = new char[7]; // destination array 
	System.arraycopy(array1, 0, array2, 0, 7);
	System.out.println(String.valueOf(array2)); // method valueof is in String class which takes array as input and return string 
}
}
 
 
// copy integr array using arraycopy method of system class
 
 class CopyArray2
 {
	 public static void main (String[]args) {
		 int[] array1 = {5,6,7,8,9,0};
		 int[] array2 = new int[6];
		 System.arraycopy(array1, 0, array2, 0, 6);
		 for (int i =0; i<array2.length; i=i+1) {
		 System.out.print(array2[i]+" ");
	 }
 }
 }
