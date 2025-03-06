package lambda;


/**
 * A block lambda that computes the factorial of an int value.
 */
public class BlockLambdaDemo {

	interface NumericFunc{
		int func(int n);
	}
	
	public static void main(String[] args) {
		
		NumericFunc factorial = (n) -> {
			int result = 1;
			
			for(int i=1; i <= n; i++)
			result = i * result;
			
			return result;
			};
			
			System.out.println("The factoral of 3 is " + factorial.func(3));
			System.out.println("The factoral of 5 is " + factorial.func(5));

			
			/* Output:
			 * The factoral of 3 is 6
			 * The factoral of 5 is 120
			 */
	}

}
