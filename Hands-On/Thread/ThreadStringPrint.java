
package corejava;

class ThreadStringPrint implements Runnable {

	public void run() {
		//for 
		while(true) {
			System.out.println("Good Morning");
			System.out.println("Welcome to SuryaHouse");
		}
	}
	public static void main(String[] args) {
		Runnable rn = new ThreadStringPrint();
		Thread t1 = new Thread(rn);
		// Thread object started
		t1.start();	
		t1.run();
		
	}
}

