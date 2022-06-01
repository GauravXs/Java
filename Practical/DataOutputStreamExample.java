package assignments;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
	public static void main(String[] args) throws IOException {  
		//creating object of FileOutputStream class
        FileOutputStream file = new FileOutputStream("D:\\testout.txt");  
        //creating object of DataOutputStream class
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  //for writing int data in file
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  
}  



