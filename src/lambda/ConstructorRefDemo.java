package lambda;

/*
 * 
 * Demonstrate a Constructor reference.
 * 
 */


interface MyFunc5 {
	MyClass func(int n);
}


class MyClass {
	private int val;
	
	MyClass(int v) { val = v; }
	
	MyClass() {val = 0;}
	
	int getVal() { return val;}
}





public class ConstructorRefDemo {

	public static void main(String[] args) {

		MyFunc5 myClassCons = MyClass::new;
		
		MyClass mc = myClassCons.func(100);
		
		System.out.println("val in mc is = " + mc.getVal());
	}

}
