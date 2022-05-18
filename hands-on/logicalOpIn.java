package corejava;

import java.util.Scanner;

public class logicalOpIn {

	public static void main(String[] args) {
		
		
		//creating object of scanner class
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter value of a: ");
		//taking input from the user
		int a=sc.nextInt();
		
		System.out.println("Enter value of b: ");
		int b=sc.nextInt();
		
		System.out.println("Enter value of c: ");
		int c=sc.nextInt();
		
		 // Using logical NOT operator
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));
        
		//Logical AND
		if((a==b)&&(b<c)) {
			System.out.println("True AND condition");
		}
		//Logical OR
		else if (a<b || b==c) {
			System.out.println("True OR condition");
		}
		else
			System.out.println("condition unsatisfied and False for AND,OR ");
	}

}
