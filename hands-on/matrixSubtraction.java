package corejava;

import java.util.Scanner;

public class matrixSubtraction {
	 public static void main(String[] args) {
	       
	       //Initializing array
	         int i, j;
	         int[][] a = new int[2][2];
	         int[][] b = new int[2][2];
	         int[][] c = new int[2][2];
	         
	         //creating scanner class object
	         Scanner s = new Scanner(System.in);
	         
	         //input for 1st matrix
	         System.out.println("Enter 4 elements for first matrix: ");
	         for(i=0; i<2; i++)
	         {
	            for(j=0; j<2; j++)
	            {
	               a[i][j]=s.nextInt();
	            }
	         }
	         
	         //input for 2nd matrix
	         System.out.println("Enter 4 elements for second matrix: ");
	         for(i=0; i<2; i++)
	         {
	            for(j=0; j<2; j++)
	            {
	               b[i][j] = s.nextInt();
	            }
	         }
	         
	         for(i=0; i<2; i++)
	         {
	            for(j=0; j<2; j++)
	            {
	               c[i][j] = a[i][j] - b[i][j];
	            }
	         }
	         
	         //Subtraction result
	         System.out.println("\n----Subtraction Result----");
	         for(i=0; i<2; i++)
	         {
	            for(j=0; j<2; j++)
	            {
	               System.out.print(c[i][j]+ " ");
	            }
	            System.out.print("\n");
	         }
	      }
	   }