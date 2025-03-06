package lambda;

public class LambdaDemo3 {
	
	interface NumericTest2 {
		boolean test(int n, int d);
	}

	public static void main(String[] args) {
		
		NumericTest2 isFactor = (n, d) -> (n % d) == 0;
		
		if (isFactor.test(10, 2)) {
			System.out.println("2 is a factor of 10");
		}
		
		if (!isFactor.test(10, 3)) {
			System.out.println("3 is not a factor of 10");
		}
		
		/* Output
		 * 	2 is a factor of 10
		 *	3 is not a factor of 10
		 */

	}

}
