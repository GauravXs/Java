package corejava;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;



public class arraySortReverse {

	public static void main(String[] args) {
		
		Integer len;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		len = sc.nextInt();
		
		Integer arr[]=new Integer[len];
		System.out.printf("Enter your %o numbers here \n",len);
		
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println("The sorted ascending array: "+Arrays.toString(arr));

		// Sorts arr[] in descending order
		
		 Arrays.sort(arr, Collections.reverseOrder());
	     System.out.println("The sorted descending array:"+Arrays.toString(arr));

		
	}

}
