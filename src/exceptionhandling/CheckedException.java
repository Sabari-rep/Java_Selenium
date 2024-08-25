package exceptionhandling;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Program started");
		System.out.println("Program inprogress");
		
		//Approach1
		/*
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Desktop\\file.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//Approach2  
		
		FileInputStream file = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Desktop\\file.txt");
		System.out.println(file.read());
				
		
		System.out.println("Program finished");
		
	}

}
