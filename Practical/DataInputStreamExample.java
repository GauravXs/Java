package assignments;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataInputStreamExample {
	  public static void main(String[] args) throws IOException { 
		    //create object of FileInputStream class
		    FileInputStream input = new FileInputStream("D:\\testout.txt");  
		    //create object of DataInputStream class
		    DataInputStream inst = new DataInputStream(input);  
		    int count = input.available();  
		    byte[] ary = new byte[count];  //converting int to byte array
		    inst.read(ary);  
		    for (byte bt : ary) {  
		      char k = (char) bt;  		  //converting byte to char
		      System.out.print(k+"-");  
		    }  
		  }  
		}  
