package thread;

public class ThreadDemo {

	public static void main(String[] args) {

		NewThread nt = new NewThread();
		
		nt.t.start();
		
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(500);
			}
			
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		
		System.out.println("Main thread exiting.");
		
	}
}

/*
 * Output:
 * Child thread: Thread[#21,Demo Thread,5,main]
 * Main Thread: 5
 * Child Thread: 5
 * Main Thread: 4
 * Child Thread: 4
 * Main Thread: 3
 * Child Thread: 3
 * Child Thread: 2
 * Main Thread: 2
 * Child Thread: 1
 * Main Thread: 1
 * Exiting child thread.
 * Main thread exiting.
 * 
 */

