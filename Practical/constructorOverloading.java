package corejava;

class constructorOverloading {
	String name;
	double gpa;
	
	constructorOverloading(String name, double gpa) {
		
		this.name = name;
		this.gpa = gpa;
	}
	
	constructorOverloading(String name) {
		
		this.name = name;
	}

	public static void main(String[] args) {
		
		constructorOverloading cs= new constructorOverloading("surya",9.99);
		constructorOverloading cs1= new constructorOverloading("soldier");
		System.out.println("name:"+cs.name+"\t"+"gpa:"+cs.gpa);
		System.out.println("name:"+cs1.name);
	}

}
