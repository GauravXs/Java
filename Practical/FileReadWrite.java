package corejava;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String args[]) throws IOException {
	      //Creating FileReader object
	      File file = new File("D:/Java/myFile.txt");
//	      boolean kreate,kra;  
//	      kreate =  file.createNewFile();  //creates a new file  
	      //To read from the created file
	      FileReader reader = new FileReader(file);
	      char chars[] = new char[(int) file.length()];
	      //Reading data from the file
	      reader.read(chars);
	      
	      //Writing data to another file
	      File out = new File("D:/Java/CopyOfmyFile.txt");
//	      kra =  file.createNewFile();  //creates a new file  
	      FileWriter writer = new FileWriter(out);
	      //Writing data to the file
	      writer.write(chars);
	      writer.flush();		//To immediately add string to new file
	      System.out.println("Data successfully written in the specified file");
	   }
	}
