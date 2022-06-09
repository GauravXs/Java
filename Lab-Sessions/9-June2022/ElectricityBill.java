package LabSessions;

import java.util.Scanner;

public class ElectricityBill {
	
	//creating static method claulateElectricityBill
	static double calculateElectricityBill(int units) {		 
		int u;
		double amt =0,uni;		//initializing amt 
		uni= units;
		
		if(units<=0) {
			return units;
		}
		else {
			
			//Calculation for bill unit greater than 30
			if(units>30) {
				u=units-30;
				amt=30.0*3.5;
				//Calculation for units greater than equals to 70
				if(u>30 && u>=70) {
				u=u-70;
				amt=amt+(70*4);
			
				}
				amt=amt+(u*5);
			}
			//for unit value between 1-30 
			else {
				amt=uni*3.5;
				
			}
		}
		return amt;
		
	}
	public static void main(String[] args) {

		int units;
		double amount ;
		//creating object of Scanner class 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter units of your electricity consumption: ");
		units=sc.nextInt();			//taking unit value from the user
		amount = calculateElectricityBill(units); 	//calling static method calculateElectricityBill & storing in amount
		if(amount<0) {
			System.out.println("INVALID INPUT");
		}
		else if (amount==0) {
			System.out.println(0.0);
		}
		else {
			System.out.println(amount);
		}
	}

}