//Java Program to remove a particular element in a an array

package LabSessions;

import java.util.Arrays;
import java.util.Scanner;

class RemoveArrayElement {
	//main method
	public static void main(String[] args) {
		//Creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		
		 int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}; //Declaring and initializing an array
		 System.out.print("Original Array: ");
		 //For printing all the array elements
		 for(int i=0;i<my_array.length;i++) {
			 System.out.print(" "+my_array[i]);
		 }
		 
		 System.out.println("\n Enter Index of an element you want to remove: ");
		 int removeIndex = sc.nextInt();	//Taking input from the user 
		 int j=0;				//Declared and Initialized variable j
		 for(int i = 0; i < my_array.length -1; i++)
		 {
			//Value of i is the index we want to remove i.e removeIndex value
			if(i==removeIndex)
		    {
		    	continue;
		    }
		    else
		     {
		        my_array[j] = my_array[i];
		        j++;
		     }
		    
		    }
		     System.out.println("New Array : "+Arrays.toString(my_array)); 	 //for converting Array toString & printing new array 
		    }
		  }


