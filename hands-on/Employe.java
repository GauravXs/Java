package corejava;


class Employe {
	
	public void methodEmp(){
		System.out.println("I am the method of Employ");
	}
	
	public String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Department extends Employe{

	public int dep;
	public int getDep() {
		return dep;
	}

	public void setDep(int dep) {
		this.dep = dep;
	}	                                                                
}

class State extends Department{
	public String st;

	public String getSt() {
		return st;
	}

	public void setSt(String st) {
		this.st = st;
	}
	
	
}

class Run{                                     
	public static void main(String[] args) {
		State obj = new State();
		obj.methodEmp();	//calling void method of super class
		obj.setName("Surya");
		System.out.println("Name:" +obj.getName()); 
		obj.setDep(101);
		System.out.println("Department: "+obj.getDep());
		obj.setSt("Maharashtra");
		System.out.println("State: "+obj.getSt());
	}
	
}
