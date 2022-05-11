package corejava;

import java.util.Scanner;

public class if_age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter your age: ");
		//Creating object of scanner class
		Scanner sc= new Scanner(System.in);
		
		//Taking input form the user
		int age=sc.nextInt();
		
		//Applying if condition for age greater than 18
		if(age>=18) {
			System.out.println("You are Eligible to vote for election");
		}
		else {
			System.out.println("Sorry you are not eligible for voting");
		}
	}

}
