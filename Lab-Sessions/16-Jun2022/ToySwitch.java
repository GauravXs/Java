package LabSessions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ToySwitch
{
    //creating static String method getToy which takes single int parameter
    public static String getToy(int price)
    {
        String name;
        //using switch case statement to iterate/check the multiple cases
        switch(price)
        {
            //here case value 350 is price of a toy
            case 350: 
                name = "Tarzan The Wonder Car";
                return name;
            
            case 450:
                name = "Robot Dog";
                return name;
                
            case 300:
                name = "Magic 8 Ball";
                return name;
                
            case 550:
                name = "Mikey Mouses";
                return name;
                
            case 750:
                name = "Infinity";
                return name;
            //if the enter value doesn't match to any case it will then come into default case
            default:
                name = "No Toys Available in this Range";
                return name;
        }
    }
    public static void main(String[] args) {
    	System.out.println("Enter Price to get the Toy ");
    	Scanner sc = new Scanner (System.in); 
    	int price;
    	//using while loop for taking multiple input
    	while((price =sc.nextInt())!=0) {	//loop terminates only if price is 0
    		System.out.println(getToy(price));		//For printing toy name
    	}
    	System.out.println("------Thank YOU-----");
    }
}
