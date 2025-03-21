package lambda;


/*
 * A functional interface for string operations.
 * 
 */
interface StringFunc {
	String func(String n);
}


/*
 * This class defines a static method called strReverse()
 * 
 */

class MyStringOps {
	static String strReverse(String str) {
		
		String result = "";
		int i;
		
		for (i =  str.length() -1 ; i >= 0; i--) {
			result += str.charAt(i);
		}
		
		return result;
	};
}

/*
 * Demonstrate a method reference for a static method.
 */
public class MethodReferenceDemo {

	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}
	public static void main(String[] args) {
		
		String inStr = "Lambdas add power to Java";
		String outStr;
		
		outStr = stringOp(MyStringOps::strReverse, inStr);
		
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
