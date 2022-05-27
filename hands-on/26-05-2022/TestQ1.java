package test;

import java.util.Arrays;
import java.util.Scanner;

public class TestQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		 for(int i=0;i<my_array.length;i++) {
			 
			 System.out.print(" "+my_array[i]);
		 }
		 
		 System.out.println("\n Enter Index of an element you want to rmeove");
		 int removeIndex = sc.nextInt();
		 int j=0;
		  for(int i = 0; i < my_array.length -1; i++)
		  {
			//i is the of that index we want to remove
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
		     System.out.println("Original Array : "+Arrays.toString(my_array));   
		    }
		  }


