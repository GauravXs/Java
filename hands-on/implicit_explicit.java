package corejava;

public class implicit_explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//implicit int to double conversion
		int a=123;
		double d=a;
		System.out.println("int value:"+a);
		System.out.println("double value:"+d);
		
		System.out.println();
		System.out.println();
		
		//explicit double to int conversion
		double k=123.55;
		int j=(int)k;
		System.out.println("double value is:"+k);
		System.out.println("int value is:"+j);
	}

}
