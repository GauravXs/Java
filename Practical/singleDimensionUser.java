package corejava;

import java.util.Scanner;

public class singleDimensionUser {

	public static void main(String[] args) 
	 {
	   int len;  //it will define the length if array
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Array length: ");
	   len = sc.nextInt();
	   
	   int a[]= new int[len];
	   System.out.println("Enter"+ len + "Element to store in Array\n" );
	   
	   for(int i=0; i<len; i++) 
	   {
	     a[i]=sc.nextInt();
	   }
	   System.out.println("Elements in Array are: \n");
	   for(int i=0; i<len; i++) 
	   {
	     System.out.print(a[i]+" ");
	   }
	 }
	}