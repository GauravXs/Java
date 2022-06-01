package corejava;

import java.io.FileInputStream;

public class FileInputStrim {
	public static void main(String args[]){    
		try{ 
		  // creating instance of FileInputStream
		  FileInputStream fin=new FileInputStream("D:\\testout.txt");    
		  int i=0;    
		  while((i=fin.read())!=-1)
		  {    
		  System.out.print((char)i);    
		  }    
		  fin.close();    
		 }
		catch(Exception e){System.out.println(e);}         }   
}
