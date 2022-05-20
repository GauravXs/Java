//WAP in java to take the input from the user for  multimensional array with int datatype.
package corejava;

import java.util.Scanner;

public class twoDimArray {

	 public static void main(String args[]){
	        
	       System.out.println("Enter 2D array size : ");
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Number of rows:");
	       int rows=sc.nextInt();	
	       System.out.println("Number of columns:");
	       int columns=sc.nextInt();
	       
	       System.out.println("Enter array elements : ");    
	        
	       int arr2[][]=new int[rows][columns];
	        
	        //For taking input 
	        for(int i=0; i<rows;i++)
	         {            
	            for(int j=0; j<columns;j++)
	            {
	                arr2[i][j]=sc.nextInt();
	            }
	         }
	        System.out.println("Array you entered: \n");
	        
	        // printing  array
	        for (int i=0; i<rows ; i++)
	        {
	            for (int j=0; j <columns; j++) {
	                System.out.print(arr2[i][j] + " ");
	            }
	      
	            System.out.println();
	        }
	        
	    }  
	    
}
