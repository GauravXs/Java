package corejava;

public class ThreadSleep implements Runnable {

	public void run() {
		int i=0;
		while(i<5) {
			System.out.println("Good Morning");
			try {
				Thread.sleep(200);		//setting delay of 200
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Welcome to SuryaHouse");
			i++;
		}
	}
	public static void main(String[] args) {
		Runnable rn = new ThreadSleep();
		Thread t1 = new Thread(rn);
		// Thread object started
		t1.start();	
//		t1.run();
		
	}	
}