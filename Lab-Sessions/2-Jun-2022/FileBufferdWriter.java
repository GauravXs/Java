package LabSessions;
//Java program buffer writer to write data to a file
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class FileBufferdWriter {

	public static void main(String[] args)throws Exception {
		//Creating FileWriter object
		String str ="D:/Java/byte.txt";
	    FileWriter writer = new FileWriter(str);  
	    //To read from the created file
	    BufferedWriter buffer = new BufferedWriter(writer);  
		
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter text you need to enter in file: ");
	    String input =sc.next();		//for taking user input
	    buffer.write(input);  
	     	    
	    //Call close() Method
	    buffer.flush();
	    buffer.close();  
	    
		
	    System.out.println("Successfully written in " +str);  
		
	}

}
