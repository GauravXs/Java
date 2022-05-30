package LabSessions;
//Java program that reads a set of integers, and 
//then prints the sum of the even and odd integers
import java.util.Scanner;

public class EvenOddSum {
	//main method
	public static void main(String args[]){
		//Creating scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the numbers want to calculate sum of: ");
		int len=sc.nextInt();		//Declaring variable and taking user input
		System.out.println("Enter the sequence of odd & even number to calculate sum: ");
		int arr[]=new int[len];		//Declaring and Instantiating arr
		for(int i=0;i<len;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		int oddSum=0,evenSum=0;		//Declaring and initializing variable
		for(int i=0; i<len; i++){
			if(arr[i]%2==0){		//for checking whether its even
				evenSum=evenSum+arr[i];		//for calculating sum of even numbers
			}
			else{
				oddSum=oddSum+arr[i];		//for calculating sum of odd numbers
			}
		}
		System.out.println("\nSum of even is: "+evenSum);		//for printing sum of even numbers
		System.out.println("\nSum of odd is: "+oddSum);			//for printing sum of odd numbers
	}
}	
