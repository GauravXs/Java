package corejava;

public class parameterizedConstructor {
	//Default constructor
	   parameterizedConstructor(){
	      System.out.println("Default constructor");
	   }
	   /* Parameterized constructor with 
	    * two integer arguments
	    */
	   parameterizedConstructor(int i, int j){
	      System.out.println("constructor with Two parameters");
	   }
	   /* Parameterized constructor with 
	    * three integer arguments
	    */
	   parameterizedConstructor(int i, int j, int k){
	      System.out.println("constructor with Three parameters");	      
	   }
		   
	   /* Parameterized constructor with 
	    * two arguments, int and String
	    */
	   parameterizedConstructor(int i, String name){
	      System.out.println("constructor with int and String param");
	   }
	   public static void main(String args[]){
	      //This will invoke default constructor
	      parameterizedConstructor obj = new parameterizedConstructor();
	      /* This will invoke the constructor 
	       * with two int parameters
	       */
	      parameterizedConstructor obj2= new parameterizedConstructor(12, 12);
	      /* This will invoke the constructor 
	       * with three int parameters
	       */
	      parameterizedConstructor obj3 = new parameterizedConstructor(1, 2, 13);
		
	      /* This will invoke the constructor 
	       * with int and String parameters
	       */
	      parameterizedConstructor obj4 = new parameterizedConstructor(1,"BeginnersBook");
	   }
}
