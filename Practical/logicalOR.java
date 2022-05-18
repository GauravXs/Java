package corejava;

public class logicalOR {

	public static void main(String[] args) {
		//Initializing variable
				int a=10,b=20,c=20,d=0;
				
				//displaying abc
				System.out.println("Value of a "+ a);
				System.out.println("Value of b "+ b);
				System.out.println("Value of c "+ c);
				System.out.println("Value of d "+ d);
				
				//Using logical OR to verify two constraints
				System.out.println();
				if(a>b || c<d)
					System.out.println("One or both" + " the conditions are true");
				else
					System.out.println("Both the" + " conditions are false");
	}

}
