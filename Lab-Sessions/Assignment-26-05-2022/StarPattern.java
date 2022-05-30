package LabSessions;

//Java program to print * pattern

public class StarPattern {
	//main method
	public static void main(String[] args) {
		int col = 1;	//Declaring and initializing variable
		int n=5;		//Declaring and initializing variable 
		
	    while(col <= n) {	//Decides how many columns do u want to print
	    	
	    	//Inner Loops for row printing
	        //Print (1st triangle)
	        int space = n - col ;	 		//Declaring and initializing variable
	        while(space>0) {
	        	System.out.print(" ");		//for printing blank-spaces
	            space = space -1;			//for decrementing space by 1
	        }

	        //print 2nd triangle 
	        int j = 1;				//Declaring and initializing variable
	        while(j <= col ) {
	            System.out.print("*");		//for printing star
	            j = j + 1;				//for incrementing j by 1
	        }

	        //print 3rd triangle
	        int start = col - 1;			//Declaring and initializing variable
	        while(start>0) {
	            System.out.print("*");      	//for printing star
	            start = start - 1;			//for decrementing start by 1`
	      
	        }

	       System.out.println();
	        col = col + 1;				//for incrementing col by 1
	        
	        
	   
	    }
	}
}
