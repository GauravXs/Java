package corejava;

public class encapsulate {
	public static void main(String[] args) { 
		
		//creating object of encapsulation 
		encapsulation e=new encapsulation(); 
		//setting value of variable 
		e.setName("Yogita");
		e.setRollno(10); e.setAge(21); 
		
		//displaying value of the variable 
		System.out.println("Name:" +e.getName()); 
		System.out.println("Rollno:" +e.getRollno()); 
		System.out.println("Age:" +e.getAge()); 
		}
	}
	