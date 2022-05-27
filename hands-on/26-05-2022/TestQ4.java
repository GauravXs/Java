package test;

public class TestQ4 {
	public static void main(String[] args) {
		int row = 1;
		int n=5;
		
	    while(row <= n) {

	        //Print (1st triangle)
	        int space = n - row ;	 
	        while(space>0) {
	            System.out.print(" ");
	            space = space -1;
	        }

	        //print 2nd triangle 
	        int j = 1;
	        while(j <= row ) {
	            System.out.print("*");
	            j = j + 1;
	        }

	        //print 3rd triangle
	        int start = row - 1;	
	        while(start>0) {
	            System.out.print("*");      
	            start = start - 1;
	      
	        }

	       System.out.println();
	        row = row + 1;
	        
	        
	   
	    }
	}
}
