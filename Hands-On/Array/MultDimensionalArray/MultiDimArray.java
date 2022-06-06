//WAP in java to take the input from the user for  multidimensional array with int datatype.
package corejava;

import java.util.Scanner;

public class MultiDimArray {

	 public static void main(String args[]){
	        
	       System.out.println("Enter 2D array size : ");
	       Scanner sc=new Scanner(System.in);	//Created Scanner class object
	       System.out.println("Number of rows:");
	       int rows=sc.nextInt();	
	       System.out.println("Number of columns:");
	       int columns=sc.nextInt();
	       
	       System.out.println("Enter array elements : ");    
	        
	       int arr2[][]=new int[rows][columns];
	        
	        
	        for(int i=0; i<rows;i++)
	         {            
	            for(int j=0; j<columns;j++)
	            {
	                arr2[i][j]=sc.nextInt();	//For taking input 	
	            }
	         }
	        System.out.println("Array you entered: \n");
	        
	        // printing and traversing array
	        for (int i=0; i<rows ; i++)
	        {
	            for (int j=0; j <columns; j++) {
	                System.out.print(arr2[i][j] + " ");
	            }
	      
	            System.out.println();
	        }
	        
	    }  
	    
}
