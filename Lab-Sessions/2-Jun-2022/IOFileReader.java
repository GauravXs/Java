package LabSessions;
//Java program to show the usage of IOFileReader class
import java.io.File;
import java.io.FileReader;

public class IOFileReader {

	public static void main(String[] args)throws Exception{
		//Creating FileReader object
	      File file = new File("D:/Java/byte.txt");
 	      //To read from the created file
	      FileReader reader = new FileReader(file);
	      char chars[] = new char[(int) file.length()];
	      //Reading data from the file
	      int a=reader.read(chars);
	      System.out.println("Length of the characters present in file:"+a);
	      
	}

}
