package test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class TestQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedList<String> al=new LinkedList<String>();  
		int n=5;
		System.out.println("Enter values here: ");
		for(int i=1;i<n;i++) {
			al.add(sc.next());
		}
		sc.close();
		
		System.out.println("Iterating the Elements of LInked LIst:");
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}   	
	}

}
