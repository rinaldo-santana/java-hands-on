package lambda;

public class LambdaExecptionDemo {

	/*
	 * Throw an exception from a lambda expression.
	 */
	static class EmptyArrayException extends Exception {
		EmptyArrayException() {
			super("Array Empty");
		}
	}
		

	interface DoubleNumericArrayFunc {
		double func(double[] n) throws EmptyArrayException;
	}
	
	
	public static void main(String[] args) throws EmptyArrayException {
		
		double[] values = { 1.0, 2.0, 3.0, 4.0 };
		
		DoubleNumericArrayFunc average = (n) /*(double[] n)*/  -> {
			double sum = 0;
			
			if (n.length == 0) {
				throw new EmptyArrayException();
			}
			
			for (int i = 0; i < n.length; i++) {
				sum += n[i];
			}
			
			return sum / n.length;
		};
		
		System.out.println("The average is " + average.func(values));
	
		/*
		 * double[] empty = {};
		 * 
		 * System.out.println("The average is " + average.func(empty));
		 * 
		 */
		
		/* Output: 
		 * The average is 2.5
		 * 
		 */

	}

	

}
