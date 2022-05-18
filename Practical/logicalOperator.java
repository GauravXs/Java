package corejava;

public class logicalOperator {

	public static void main(String[] args) {
		
		//Initializing variable
		int a=10,b=20,c=20,d=0;
		
		//displaying abc
		System.out.println("Value of a "+ a);
		System.out.println("Value of b "+ b);
		System.out.println("Value of c "+ c);
		System.out.println("Value of d "+ d);
		System.out.println();
		
		//Using logical AND to verify two constraints
		if((a<b)&&(b==c)) {
			d=a+b+c;
			System.out.println("Sum is "+d);
		}
		else {
			System.out.println("False condition");
		}
		
		
	}

}
