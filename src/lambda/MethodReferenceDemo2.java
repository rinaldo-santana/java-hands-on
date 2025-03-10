package lambda;


/*
 * A functional interface for string operations.
 * 
 */
interface StringFunc2 {
	String func(String n);
}


/*
 * Now, this class defines an instance method called strReverse().
 */
class MyStringOps2 {
	String strReverse(String str) {
		
		String result = "";
		int i;
		
		for (i =  str.length() -1 ; i >= 0; i--) {
			result += str.charAt(i);
		}
		
		return result;

	}
}


/*
 * Demonstrate a method reference to an instance method
 */
public class MethodReferenceDemo2 {

	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}
	public static void main(String[] args) {
		
		String inStr = "Lambdas add power to Java";
		String outStr;
		
		// Create a MyStringOps object.
		MyStringOps2 strOps = new MyStringOps2();
		
		// Now, a method reference to the instance method strReverse
		// is passed to stringOp().
		outStr = stringOp(strOps::strReverse, inStr);
		
		System.out.println("Original string: " + inStr);
		System.out.println("String reversed: " + outStr);
		
	}
	
	
	/*
	 * Output:
	 * Original string: Lambdas add power to Java
	 * String reversed: avaJ ot rewop dda sadbmaL
	 * 
	 */

}
