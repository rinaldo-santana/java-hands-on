package execption.handling;

/*
 * Demonstrate throw.
 */
public class ThrowDemo {

	static void demoproc() {
		try {
			throw new NullPointerException("demo");
		} catch(NullPointerException e) {
			System.out.println("Caught indise demoproc.");
			throw e;
		}
	}
	
	public static void main(String[] args) {

		try {
			demoproc();
		} catch(NullPointerException e) {
			System.out.println("Recaught: " + e);
		}
	}

}
