package execption.handling;

public class Exc2 {

	public static void main(String[] args) {

		int d, a;
		try {
			d = 0;
			a = 42 / d;
			System.out.println("This will no be printed.");
		} catch (ArithmeticException e) {
			System.out.println("Division by zero.");
		}
		
		System.out.println("After catch statement.");
	}

	/*
	 * Output:
	 * Division by zero.
	 * After catch statement.
	 */
}
