package corejava;

import java.util.Scanner;

public class arraySum {

	public static void main(String[] args) {
		   int len;  //it will define the length if array
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter Array length: ");
		   len = sc.nextInt();
		   
		   int arr[]= new int[len];
		   System.out.println("Enter "+ len + " Element to store in Array\n" );
		   
		   for(int i=0; i<len; i++) 
		   {
		     arr[i]=sc.nextInt();
		   }
		   
		   int sum=0;   
		   //for calculating sum 
		   for(int i=0;i<len;i++) {
			   sum+=arr[i];
		   }
		   System.out.println("The sum of array :"+sum);

	}

}
