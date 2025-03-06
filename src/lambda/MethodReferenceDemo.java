package lambda;


/*
 * Demonstrate a method reference for a static method.
 */


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
		
		for (i = 0; i < str.length(); i++) {
			result += str.charAt(i);
		}
		
		return result;
	};
}

public class MethodReferenceDemo {

	public static void main(String[] args) {

		
	}

}
