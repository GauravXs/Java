package test;

import java.util.Scanner;

public class TestQ3 {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the numbers want to calculate sum of: ");
		int len=sc.nextInt();
		System.out.println("Enter the sequence of odd & even number to calculate sum: ");
		int arr[]=new int[len];
		for(int i=0;i<len;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		int oddSum=0,evenSum=0;
		for(int i=0; i<len; i++){
			if(arr[i]%2==0){
				evenSum=evenSum+arr[i];		//for calculating sum of even numbers
			}
			else{
				oddSum=oddSum+arr[i];		//for calculating sum of odd numbers
			}
		}
		System.out.println("\nSum of even is: "+evenSum);
		System.out.println("\nSum of odd is: "+oddSum);
	}
}	
		