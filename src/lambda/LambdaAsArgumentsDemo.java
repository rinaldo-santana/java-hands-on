package lambda;

public class LambdaAsArgumentsDemo {

	
	// Use lambda expressions as an argument to a method.
	
	interface StringFunc{
		String func(String s);
	}
	
	
	
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}
	
	
	public static void main(String[] args) {
		
		String inStr = "Lambdas add power to Java";
		String outStr;
		
		System.out.println("Here is input string: " + inStr);
		
		outStr = stringOp((str) -> str.toUpperCase(), inStr);
		System.out.println("The string in uppercase: " + outStr);
		
		outStr = stringOp(str -> {
			String result = "";
			int i;
			
			for (i = 0; i < str.length(); i++) {
				if (str.charAt(i) != ' ') {
					result += str.charAt(i);
				}
			}
			
			return result;
		} , inStr);
		
		System.out.println("The string with spaces removed: " + outStr);
		
		
		/* Output: 
		 * Here is input string: Lambdas add power to Java
		 * The string in uppercase: LAMBDAS ADD POWER TO JAVA
		 * The string with spaces removed: LambdasaddpowertoJava
		 * 
		 */

	}

}
