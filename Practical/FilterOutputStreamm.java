package assignments;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStreamm {
	public static void main(String[] args) throws IOException {  
		//creating object of File class
        File data = new File("D:\\testout.txt");  
        //creating object of FileOuputStream class
        FileOutputStream file = new FileOutputStream(data);  
        //creating object of FilterOutputStream class
        FilterOutputStream filter = new FilterOutputStream(file);  
        String s="Welcome to Mumbai.";      
        byte b[]=s.getBytes();  //converting string into byte array    
        filter.write(b);     
        filter.flush();  
        filter.close();  
        file.close();  
        System.out.println("Success...");  
    }  
}


