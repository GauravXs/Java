//Program to show the concept of constructor overloading
package corejava;

class constOverloading {
	int id;
	String std;
	public constOverloading(int id, String std) {
		super();
		this.id = id;
		this.std = std;
	}

	constOverloading() {
		System.out.println("Content null parameter");
	}
	
	constOverloading(int Id){
		this.id=Id;
	}
	
	public static void main(String[] args) {
		constOverloading co = new constOverloading(101);
		System.out.println("Id: "+co.id);
		constOverloading co1 = new constOverloading(101,"FY.Bcom");
		System.out.println("Id:"+co1.id+"\t"+"Class:"+co.std);
		
	}

}
