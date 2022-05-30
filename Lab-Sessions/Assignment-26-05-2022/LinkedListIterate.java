package LabSessions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListIterate {
	public static void main(String[] args) {
		//Creating instance of Scanner class
		Scanner sc = new Scanner(System.in);
		
		LinkedList<String> al=new LinkedList<String>();  //Creating LinkedList
		int n=5;	//Declaring and Initialization of variable n 
		
		System.out.println("Enter 5 values: ");
		for(int i=0;i<n;i++) {		//here n is the length of an linkedList
			al.add(sc.next());		//Taking input from user
		}
		sc.close();
		
		System.out.println("Iterating the Elements of Linked LIst:");
		//Traversing list through iterator
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.print(" "+itr.next());  
		}   	
	}

}
