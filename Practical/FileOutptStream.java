package corejava;

import java.io.FileOutputStream;

public class FileOutptStream {
	public static void main(String args[]){    
		  try{ 
			  //Creating instance of FileOutputStream 
		      FileOutputStream fout=new FileOutputStream("D:\\testout.txt");   
		      
		      //with String data type
		      String s =" Rocky";
		      byte a[]=s.getBytes();
		      fout.write(a);
		      
		      //with integer data type
		      fout.write(65);
		      fout.flush();
		      fout.close();       
		      System.out.println("success...");         }
		  
		  catch(Exception e){System.out.println(e);}        }
}
