package thread;

public class CurrentThreadDemo {


	public static void main(String[] args) {

		Thread t = Thread.currentThread();
		
		System.out.println("Current thread: " + t);
		
		t.setName("My thread");
		
		System.out.println("After name change: " + t);
		
		try {
			for (int n = 5; n > 0; n--) {
				System.out.println(n);
				Thread.sleep(1000);
			}
			
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
	}

}


/*
 * Output:
 * Current thread: Thread[#1,main,5,main]
 * After name change: Thread[#1,My thread,5,main]
 * 5
 * 4
 * 3
 * 2
 * 1
 * 
 */
