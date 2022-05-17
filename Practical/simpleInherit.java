package corejava;

public class simpleInherit {

	public void print() {
		System.out.println("I am method of parent class(simpleInheit)");
	}
}

class simpleOne extends simpleInherit{
	public void dis() {
		System.out.println("I am method of simpleOne");
}
}

class Main{
	public static void main(String[] args) {
		simpleOne obj = new simpleOne();
		obj.print();
		obj.dis();
	}
}
