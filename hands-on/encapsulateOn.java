package corejava;

public class encapsulateOn {

	public static void main(String[] args) {
		
		//Creating objects of encapsOn
		encapsOn en = new encapsOn();
		
		en.setId(101);
		en.setName("Rocky");
		en.setAddress("LosAngels,3 street,McMcoy field");
		
		System.out.println("Id: "+en.getId());
		System.out.println("Name: "+en.getName());
		System.out.println("Adress: "+en.getAddress());
		
		
	}

}
