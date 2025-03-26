package thread;

public class NewThread2 extends Thread{
	
	NewThread2() {
		super("Demo Thread");
		System.out.println("Child thread: " + this);
	}


	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
			
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		
		System.out.println("Exiting child thread.");
		
	}
}
