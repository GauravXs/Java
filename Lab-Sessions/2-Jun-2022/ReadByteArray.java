package LabSessions;
//Java pgm to read content form a file into a byte array
import java.io.ByteArrayInputStream;

public class ReadByteArray {
	
	public static void main(String[] args) throws Exception {
//		File fil = new File("D:\\Java\byte.txt");
		byte[] buf = {12,23,34,23};  
	    // Create the new byte array input stream  
	    ByteArrayInputStream byt = new ByteArrayInputStream(buf);  
	    int k = 0;  
	    while ((k = byt.read()) != -1) {  
	      //Conversion of a byte into character  
	      char ch = (char) k;  
	      System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
	    }

}
}