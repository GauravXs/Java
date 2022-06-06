package corejava;

public class TestGarbage {
	//Creating finalize method of void return type
	public void finalize() {
		System.out.println("garbage collected object");
	}
	//main method
	public static void main(String[] args) {
		//Creating object1 of the TestGarbage class
		TestGarbage s1 = new TestGarbage();
		//Creating object2 of the TestGarbage class
		TestGarbage s2 = new TestGarbage();
		
		//Assigning null object value
		s1=null;
		//Assigning null object value
		s2=null;
		//calling garbage collector
		System.gc();
	}

}
