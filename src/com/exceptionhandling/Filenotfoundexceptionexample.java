// checked exception can be handled at same place or thrown to the caller method 
// either throwes or i/o exception
// throw "- manually catch the exception and throw it further to method caller 
// throws :- part of method signature which exception can be thrown by method and while method call exceptions are handled.
// 
package com.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filenotfoundexceptionexample {

	public static void main(String[] args) {
		Filenotfoundexceptionexample fe1 = new Filenotfoundexceptionexample();
		try{
			fe1.readfile();
		}
		catch(IOException io1) {
			System.out.println("well done learn exception handling weel");
		}
	}
	public void readfile() throws IOException {
		String filename = "C:\\Users\\Gayatri\\Desktop\\My Learning\\Gayatri Java learning\\Java memory mana1gment.txt"; //wrong path
		BufferedReader br = null; // buffer means large quantity data ka ek portion hold krta h which is then used by us.
		try {
			FileReader fr = new FileReader(filename);// filereader class is used by java to read file
			 br = new BufferedReader(fr); //Bufferreader & filereader constructors
		}
		catch (FileNotFoundException fe) {
			fe.printStackTrace(); // this method will print information about exception.
		//	return;
			throw fe;
		}
		
		String line = br.readLine(); //read first line of file 
		while (line!=null){
			System.out.println(line);
			line = br.readLine();// this method reads the next line in a file
			
		}
		br.close();
	}

}
