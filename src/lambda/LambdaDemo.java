package lambda;

public class LambdaDemo {

	public static void main(String[] args) {
		
		NumericTest isEven = n -> (n % 2) == 0;
		
		if (isEven.test(10)) {
			System.out.println("10 is even");
		}
		
		if (!isEven.test(9)) {
			System.out.println("9 is not even");
		}
		
		
		
		NumericTest isNonNegative = (n) -> n >= 0;
		
		if (isNonNegative.test(1)) {
			System.out.println("1 is non-negative");
		}
		
		if (!isNonNegative.test(-1)) {
			System.out.println("-1 is negative");
		}
		
		
		/*output
		10 is even
		9 is not even
		1 is non-negative
		-1 is negative
		*/

	}

}



interface NumericTest {
	boolean test(int n);
}