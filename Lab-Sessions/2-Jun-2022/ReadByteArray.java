package LabSessions;
import java.io.BufferedInputStream;
//Java pgm to read content form a file into a byte array

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadByteArray {
	
	public static void main(String[] args) throws IOException {
		//Creating object of File class which takes path of the file to read
		File file=new File("D:\\Java\\byte.txt");
		//Creating object of FileInputStream class
		FileInputStream fi=new FileInputStream(file);
		//Creating object of BufferedInputStream class
		BufferedInputStream bis=new BufferedInputStream(fi);
		//Declaring and instantiating array
		byte[] b=new byte[(int)file.length()];
		//calling read() method of BufferedInputStream class
		bis.read(b);
		//Looping through byte array b
		for(byte bf:b)
		{
			System.out.print((char)bf);
		}
		

	}

}