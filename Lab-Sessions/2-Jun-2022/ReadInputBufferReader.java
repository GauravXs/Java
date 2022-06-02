package LabSessions;
//Java program to read input using BufferReader
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadInputBufferReader {

	public static void main(String[] args) throws Exception {
		//Creating FileReader object
		FileReader reader = new FileReader("D:/Java/byte.txt");
		//Creating BufferedReader object which takes FileReader reference
		BufferedReader buff = new BufferedReader(reader);
		
		int i;
		//to print data present in the file
		while ((i=buff.read())!=-1){
			System.out.print((char)i);
			}
		buff.close();
		reader.close();
						
	}
}
