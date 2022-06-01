package assignments;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputRead {
	public static void main(String args[])throws Exception{
		  //creating object of class
	      FileOutputStream fout1=new FileOutputStream("D:\\f1.txt");    
	      //creating object of class with other reference var
	      FileOutputStream fout2=new FileOutputStream("D:\\f2.txt");    
	      
	     //creating object of class
	      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
	      bout.write(65);    	  //calling write with the reference of ByteArrayOutputStream
	      bout.writeTo(fout1);    //using writeTo method of ByteArrayOutputStream to write in specified file
	      bout.writeTo(fout2);    
	        
	      bout.flush(); //rapidly write the value/data in specified file  
	      bout.close();	//has no effect    
	      System.out.println("Success...");    
	     }    
	    }  



