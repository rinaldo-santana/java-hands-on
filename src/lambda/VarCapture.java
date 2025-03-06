package lambda;

/*
 * An example of capturing a local variable from the enclosing scope
 */

interface MyFunc {
	int func(int n);
}

public class VarCapture {

	public static void main(String[] args) {
		
		int num = 10;
		
		MyFunc myLambda = (n) -> {
			
			int v = num + n;
			
			//num++;
		
			return 0;
		};
		
		//num = 9;

	}

}
