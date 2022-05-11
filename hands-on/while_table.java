package corejava;

import java.util.Scanner;

public class while_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to print table: ");
		int num=sc.nextInt();
		int i=1;
		
		//while loop incrementing value from 1 to 10
		while(i<=10) {
			System.out.println(num+" x "+i+" = "+i*num);
			i++;
		}
	}

}
